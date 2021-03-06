package ABS.Absyn; // Java Package generated by the BNF Converter.

public abstract class Import implements java.io.Serializable {
  public abstract <R,A> R accept(Import.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(ABS.Absyn.AnyImport p, A arg);
    public R visit(ABS.Absyn.AnyFromImport p, A arg);
    public R visit(ABS.Absyn.StarFromImport p, A arg);

  }

}
