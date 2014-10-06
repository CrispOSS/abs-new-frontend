package ABS.Absyn; // Java Package generated by the BNF Converter.

public class ParamConstrIdent extends ConstrIdent {
  public final String typeident_;
  public final ListConstrType listconstrtype_;

  public ParamConstrIdent(String p1, ListConstrType p2) { typeident_ = p1; listconstrtype_ = p2; }

  public <R,A> R accept(ABS.Absyn.ConstrIdent.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.ParamConstrIdent) {
      ABS.Absyn.ParamConstrIdent x = (ABS.Absyn.ParamConstrIdent)o;
      return this.typeident_.equals(x.typeident_) && this.listconstrtype_.equals(x.listconstrtype_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.typeident_.hashCode())+this.listconstrtype_.hashCode();
  }


}