laraImport("kadabra2.egaps.detectors.Detector");

class HashMapUsageDetector extends Detector {
  constructor() {
    super("HashMap Usage Detector");
  }

  analyseClass(jpClass) {
    super.analyseClass(jpClass);

    // TODO: refactor to use chain()
    let hashMapRefs = Query.searchFrom(jpClass, "new", { type: "HashMap" })
      .get()
      .filter(
        (jp) =>
          jp.typeReference !== undefined &&
          jp.typeReference.package === "java.util"
      );

    this.results.push(...hashMapRefs);
  }

  print() {
    println(`${this.name}:`);
    let data = this.results.map((r) => [
      r.line.toString(),
      r.ancestor("file").path,
    ]);
    printTable(["Line", "File"], data, [40, 100]);
    println();
  }
}
