package ABS.Absyn; // Java Package generated by the BNF Converter.

public class StarFromExport extends Export {
  public final Type type_;

  public StarFromExport(Type p1) { type_ = p1; }

  public <R,A> R accept(ABS.Absyn.Export.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.StarFromExport) {
      ABS.Absyn.StarFromExport x = (ABS.Absyn.StarFromExport)o;
      return this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return this.type_.hashCode();
  }


}
