package ABS.Absyn; // Java Package generated by the BNF Converter.

public class EQualFunCall extends PureExp {
  public final QualType qualtype_;
  public final String ident_;
  public final ListPureExp listpureexp_;

  public EQualFunCall(QualType p1, String p2, ListPureExp p3) { qualtype_ = p1; ident_ = p2; listpureexp_ = p3; }

  public <R,A> R accept(ABS.Absyn.PureExp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.EQualFunCall) {
      ABS.Absyn.EQualFunCall x = (ABS.Absyn.EQualFunCall)o;
      return this.qualtype_.equals(x.qualtype_) && this.ident_.equals(x.ident_) && this.listpureexp_.equals(x.listpureexp_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.qualtype_.hashCode())+this.ident_.hashCode())+this.listpureexp_.hashCode();
  }


}
