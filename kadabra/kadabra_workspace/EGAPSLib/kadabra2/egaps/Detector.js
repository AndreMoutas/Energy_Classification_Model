laraImport("weaver.WeaverOptions");
laraImport("kadabra2.egaps.detectors.MemberIgnoringMethodDetector");
laraImport("kadabra2.egaps.detectors.InternalGetterDetector");
laraImport("kadabra2.egaps.detectors.HashMapUsageDetector");
laraImport("kadabra2.egaps.detectors.ExcessiveMethodCallsDetector");


class EGAPDetector {
  constructor(debugEnabled = false) {
    this.debugEnabled = debugEnabled;
    this.detectors = [];
  }

  analyse(packageFilter = (_) => true) {
    this.detectors = [
      new ExcessiveMethodCallsDetector(this.debugEnabled),
      new HashMapUsageDetector(this.debugEnabled),
      new InternalGetterDetector(this.debugEnabled),
      new MemberIgnoringMethodDetector(this.debugEnabled),
    ];

    this.detectors.forEach(d => d.analyse(packageFilter));

    return this;
  }

  print() {
    this.detectors.forEach(d => d.print());
    return this;
  }

  save(path) {
    const files = WeaverOptions.getData().get("workspace").getFiles();
    let sources = [];
    for(let f of files) {
      sources.push(f.toString());
    }

    let results = {};
    results["sources"] = sources;
    results["total"] = 0;
    let data = {};

    this.detectors.forEach(d => {
      let res = d.save();
      data[`${d.name}`] = res;
      results["total"] += res.length;
    });

    results["detectors"] = data;

    Io.writeJson(path, results);
    return this;
  }
}
