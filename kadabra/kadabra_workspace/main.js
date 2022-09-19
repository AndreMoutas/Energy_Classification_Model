laraImport("kadabra2.egaps.Detector");

let packagesStartingWith = (p) => p.startsWith("com.example");

const start = Date.now();
new EGAPDetector(debugEnabled = false)
    .analyse(/*packageFilter = packagesStartingWith*/)
    //.print()
    .save("results.json");
const end = Date.now();
println(`Execution time: ${end - start} ms`);

// new ExcessiveMethodCallsDetector(debugEnabled = true).analyse().print();
// new HashMapUsageDetector().analyse().print();
// new MemberIgnoringMethodDetector().analyse(/*packagedFilter = (p) => p.startsWith("com.example")*/).print();
// new InternalGetterDetector().analyse().print();
