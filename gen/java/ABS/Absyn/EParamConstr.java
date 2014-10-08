package ABS.Absyn; // Java Package generated by the BNF Converter.

public class EParamConstr extends PureExp {
  public final QualType qualtype_;
  public final ListPureExp listpureexp_;

  public EParamConstr(QualType p1, ListPureExp p2) { qualtype_ = p1; listpureexp_ = p2; }

  public <R,A> R accept(ABS.Absyn.PureExp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.EParamConstr) {
      ABS.Absyn.EParamConstr x = (ABS.Absyn.EParamConstr)o;
      return this.qualtype_.equals(x.qualtype_) && this.listpureexp_.equals(x.listpureexp_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.qualtype_.hashCode())+this.listpureexp_.hashCode();
  }


}
