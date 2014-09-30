package ABS.Absyn; // Java Package generated by the BNF Converter.

public class Par extends Param {
  public final AnnType anntype_;
  public final String ident_;

  public Par(AnnType p1, String p2) { anntype_ = p1; ident_ = p2; }

  public <R,A> R accept(ABS.Absyn.Param.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.Par) {
      ABS.Absyn.Par x = (ABS.Absyn.Par)o;
      return this.anntype_.equals(x.anntype_) && this.ident_.equals(x.ident_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.anntype_.hashCode())+this.ident_.hashCode();
  }


}
