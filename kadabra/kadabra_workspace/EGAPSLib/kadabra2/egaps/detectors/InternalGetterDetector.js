laraImport("kadabra2.egaps.detectors.Detector");

class InternalGetterDetector extends Detector {
  constructor() {
    super("Internal Getter Detector");
  }

  analyseClass(jpClass) {
    super.analyseClass(jpClass);

    const notVoidFilter = (rr) => rr !== "void";

    let simpleGetters = Query.childrenFrom(jpClass, "method", {
      returnType: notVoidFilter,
      isStatic: false,
    })
      .children("body", { numChildren: 1 })
      .children("return")
      .children("var", { isField: true })
      .chain()
      .map((m) => m["method"]);

    let internalCalls = Query.searchFrom(jpClass, "call", {
      decl: (d) => d !== undefined && simpleGetters.some((sg) => sg.same(d)),
    }).get();

    this.results.push(...internalCalls);
  }

  print() {
    println(`${this.name}:`);
    let data = this.results.map((r) => [
      r.line.toString(),
      r.name,
      r.ancestor("file").path,
    ]);
    printTable(["Line", "Call", "File"], data, [10, 30, 100]);
    println();
  }
}
