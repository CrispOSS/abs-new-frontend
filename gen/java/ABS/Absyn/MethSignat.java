package ABS.Absyn; // Java Package generated by the BNF Converter.

public abstract class MethSignat implements java.io.Serializable {
  public abstract <R,A> R accept(MethSignat.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(ABS.Absyn.MethSig p, A arg);

  }

}