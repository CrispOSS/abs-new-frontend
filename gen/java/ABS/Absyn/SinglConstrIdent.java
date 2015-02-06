package ABS.Absyn; // Java Package generated by the BNF Converter.

public class SinglConstrIdent extends ConstrIdent {
  public final String uident_;

  public SinglConstrIdent(String p1) { uident_ = p1; }

  public <R,A> R accept(ABS.Absyn.ConstrIdent.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.SinglConstrIdent) {
      ABS.Absyn.SinglConstrIdent x = (ABS.Absyn.SinglConstrIdent)o;
      return this.uident_.equals(x.uident_);
    }
    return false;
  }

  public int hashCode() {
    return this.uident_.hashCode();
  }


}
