package ABS.Absyn; // Java Package generated by the BNF Converter.

public class ImportStarFrom extends Import {
  public final ImportType importtype_;
  public final QualType qualtype_;

  public ImportStarFrom(ImportType p1, QualType p2) { importtype_ = p1; qualtype_ = p2; }

  public <R,A> R accept(ABS.Absyn.Import.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.ImportStarFrom) {
      ABS.Absyn.ImportStarFrom x = (ABS.Absyn.ImportStarFrom)o;
      return this.importtype_.equals(x.importtype_) && this.qualtype_.equals(x.qualtype_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.importtype_.hashCode())+this.qualtype_.hashCode();
  }


}
