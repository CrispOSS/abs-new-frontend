package ABS.Absyn; // Java Package generated by the BNF Converter.

public class TyRat extends Type {

  public TyRat() { }

  public <R,A> R accept(ABS.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.TyRat) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
