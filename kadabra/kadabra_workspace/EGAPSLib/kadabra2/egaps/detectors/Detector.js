laraImport("weaver.Query");
laraImport("lara.Io");
laraImport("kadabra2.egaps.detectors.Utils");

const sameVarRef = (var1, var2) => var1.ast === var2.ast;

class Detector {
  constructor(name, debugEnabled = false) {
    this.name = name;
    this.results = [];
    this.debugEnabled = debugEnabled;
  }

  analyse(packageFilter = (_) => true) {
    println(`Running ${this.name}...`);

    let classes = Query.search("class", {
      isTopLevel: true,
      package: packageFilter,
    }).get();

    classes.forEach((c) => this.analyseClass(c));

    return this;
  }

  analyseClass(jpClass) {
    if (
      !jpClass ||
      !("instanceOf" in jpClass) ||
      !jpClass.instanceOf("class")
    ) {
      println("Argument is not a joinpoint of type 'class'");
    }
  }

  print() {
    throw new Error(
      `Method 'print()' was not implemented for detector '${this.name}'`
    );
  }

  save() {
    return this.results.map((r) => {
      return {
      "line": r.line,
      "name": r.name,
      "file": r.ancestor("file").path.toString(),
      };
    });
  }
}
