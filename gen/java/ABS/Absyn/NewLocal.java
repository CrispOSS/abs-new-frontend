package ABS.Absyn; // Java Package generated by the BNF Converter.

public class NewLocal extends EffExp {
  public final Type type_;
  public final ListPureExp listpureexp_;

  public NewLocal(Type p1, ListPureExp p2) { type_ = p1; listpureexp_ = p2; }

  public <R,A> R accept(ABS.Absyn.EffExp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.NewLocal) {
      ABS.Absyn.NewLocal x = (ABS.Absyn.NewLocal)o;
      return this.type_.equals(x.type_) && this.listpureexp_.equals(x.listpureexp_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.type_.hashCode())+this.listpureexp_.hashCode();
  }


}
