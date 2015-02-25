package ABS.Absyn; // Java Package generated by the BNF Converter.

public abstract class Decl implements java.io.Serializable {
  public abstract <R,A> R accept(Decl.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(ABS.Absyn.TypeDecl p, A arg);
    public R visit(ABS.Absyn.TypeParDecl p, A arg);
    public R visit(ABS.Absyn.ExceptionDecl p, A arg);
    public R visit(ABS.Absyn.DataDecl p, A arg);
    public R visit(ABS.Absyn.DataParDecl p, A arg);
    public R visit(ABS.Absyn.FunDecl p, A arg);
    public R visit(ABS.Absyn.FunParDecl p, A arg);
    public R visit(ABS.Absyn.InterfDecl p, A arg);
    public R visit(ABS.Absyn.ExtendsDecl p, A arg);
    public R visit(ABS.Absyn.ClassDecl p, A arg);
    public R visit(ABS.Absyn.ClassParamDecl p, A arg);
    public R visit(ABS.Absyn.ClassImplements p, A arg);
    public R visit(ABS.Absyn.ClassParamImplements p, A arg);

  }

}
