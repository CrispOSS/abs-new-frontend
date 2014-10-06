package ABS;
import ABS.Absyn.*;

public class PrettyPrinter
{
  //For certain applications increasing the initial size of the buffer may improve performance.
  private static final int INITIAL_BUFFER_SIZE = 128;
  //You may wish to change the parentheses used in precedence.
  private static final String _L_PAREN = new String("(");
  private static final String _R_PAREN = new String(")");
  //You may wish to change render
  private static void render(String s)
  {
    if (s.equals("{"))
    {
       buf_.append("\n");
       indent();
       buf_.append(s);
       _n_ = _n_ + 2;
       buf_.append("\n");
       indent();
    }
    else if (s.equals("(") || s.equals("["))
       buf_.append(s);
    else if (s.equals(")") || s.equals("]"))
    {
       backup();
       buf_.append(s);
       buf_.append(" ");
    }
    else if (s.equals("}"))
    {
       _n_ = _n_ - 2;
       backup();
       backup();
       buf_.append(s);
       buf_.append("\n");
       indent();
    }
    else if (s.equals(","))
    {
       backup();
       buf_.append(s);
       buf_.append(" ");
    }
    else if (s.equals(";"))
    {
       backup();
       buf_.append(s);
       buf_.append("\n");
       indent();
    }
    else if (s.equals("")) return;
    else
    {
       buf_.append(s);
       buf_.append(" ");
    }
  }


  //  print and show methods are defined for each category.
  public static String print(ABS.Absyn.AnyIdent foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.AnyIdent foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListAnyIdent foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListAnyIdent foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Program foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Program foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListModule foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListModule foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Module foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Module foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Export foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Export foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListExport foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListExport foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Import foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Import foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListImport foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListImport foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ImportType foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ImportType foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Type foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Type foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListType foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListType foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.QualTypeIdent foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.QualTypeIdent foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListQualTypeIdent foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListQualTypeIdent foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListDecl foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListDecl foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Decl foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Decl foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ConstrIdent foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ConstrIdent foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ConstrType foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ConstrType foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListConstrType foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListConstrType foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListTypeIdent foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListTypeIdent foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListConstrIdent foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListConstrIdent foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.FunBody foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.FunBody foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.MethSignat foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.MethSignat foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListMethSignat foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListMethSignat foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ClassBody foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ClassBody foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListClassBody foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListClassBody foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Block foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Block foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.MaybeBlock foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.MaybeBlock foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListParam foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListParam foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Param foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Param foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListStm foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListStm foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Stm foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Stm foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Guard foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Guard foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Exp foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Exp foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListPureExp foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListPureExp foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.PureExp foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.PureExp foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.CaseBranch foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.CaseBranch foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListCaseBranch foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListCaseBranch foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListPattern foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListPattern foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Pattern foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Pattern foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Literal foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Literal foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.EffExp foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.EffExp foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  /***   You shouldn't need to change anything beyond this point.   ***/

  private static void pp(ABS.Absyn.AnyIdent foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.AnyIden)
    {
       ABS.Absyn.AnyIden _anyiden = (ABS.Absyn.AnyIden) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_anyiden.ident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.AnyTyIden)
    {
       ABS.Absyn.AnyTyIden _anytyiden = (ABS.Absyn.AnyTyIden) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_anytyiden.typeident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListAnyIdent foo, int _i_)
  {
     for (java.util.Iterator<AnyIdent> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.Program foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.Prog)
    {
       ABS.Absyn.Prog _prog = (ABS.Absyn.Prog) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_prog.listmodule_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListModule foo, int _i_)
  {
     for (java.util.Iterator<Module> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.Module foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.Modul)
    {
       ABS.Absyn.Modul _modul = (ABS.Absyn.Modul) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("module");
       pp(_modul.type_, 0);
       render(";");
       pp(_modul.listexport_, 0);
       pp(_modul.listimport_, 0);
       pp(_modul.listdecl_, 0);
       pp(_modul.maybeblock_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.Export foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.AnyExport)
    {
       ABS.Absyn.AnyExport _anyexport = (ABS.Absyn.AnyExport) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("export");
       pp(_anyexport.listanyident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.AnyFromExport)
    {
       ABS.Absyn.AnyFromExport _anyfromexport = (ABS.Absyn.AnyFromExport) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("export");
       pp(_anyfromexport.listanyident_, 0);
       render("from");
       pp(_anyfromexport.type_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.StarExport)
    {
       ABS.Absyn.StarExport _starexport = (ABS.Absyn.StarExport) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("export");
       render("*");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.StarFromExport)
    {
       ABS.Absyn.StarFromExport _starfromexport = (ABS.Absyn.StarFromExport) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("export");
       render("*");
       render("from");
       pp(_starfromexport.type_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListExport foo, int _i_)
  {
     for (java.util.Iterator<Export> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(";");
       } else {
         render(";");
       }
     }
  }

  private static void pp(ABS.Absyn.Import foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.AnyImport)
    {
       ABS.Absyn.AnyImport _anyimport = (ABS.Absyn.AnyImport) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_anyimport.importtype_, 0);
       pp(_anyimport.type_, 0);
       render(".");
       pp(_anyimport.anyident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.AnyFromImport)
    {
       ABS.Absyn.AnyFromImport _anyfromimport = (ABS.Absyn.AnyFromImport) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_anyfromimport.importtype_, 0);
       pp(_anyfromimport.listanyident_, 0);
       render("from");
       pp(_anyfromimport.type_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.StarFromImport)
    {
       ABS.Absyn.StarFromImport _starfromimport = (ABS.Absyn.StarFromImport) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_starfromimport.importtype_, 0);
       render("*");
       render("from");
       pp(_starfromimport.type_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListImport foo, int _i_)
  {
     for (java.util.Iterator<Import> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(";");
       } else {
         render(";");
       }
     }
  }

  private static void pp(ABS.Absyn.ImportType foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.ForeignImport)
    {
       ABS.Absyn.ForeignImport _foreignimport = (ABS.Absyn.ForeignImport) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("fimport");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.NormalImport)
    {
       ABS.Absyn.NormalImport _normalimport = (ABS.Absyn.NormalImport) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("import");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.Type foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.UnderscoreType)
    {
       ABS.Absyn.UnderscoreType _underscoretype = (ABS.Absyn.UnderscoreType) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("_");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SimpleType)
    {
       ABS.Absyn.SimpleType _simpletype = (ABS.Absyn.SimpleType) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_simpletype.listqualtypeident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ParType)
    {
       ABS.Absyn.ParType _partype = (ABS.Absyn.ParType) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_partype.listqualtypeident_, 0);
       render("<");
       pp(_partype.listtype_, 0);
       render(">");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListType foo, int _i_)
  {
     for (java.util.Iterator<Type> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.QualTypeIdent foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.QualTypeIden)
    {
       ABS.Absyn.QualTypeIden _qualtypeiden = (ABS.Absyn.QualTypeIden) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_qualtypeiden.typeident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListQualTypeIdent foo, int _i_)
  {
     for (java.util.Iterator<QualTypeIdent> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(".");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.ListDecl foo, int _i_)
  {
     for (java.util.Iterator<Decl> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.Decl foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.TypeDecl)
    {
       ABS.Absyn.TypeDecl _typedecl = (ABS.Absyn.TypeDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("type");
       pp(_typedecl.typeident_, 0);
       render("=");
       pp(_typedecl.type_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.DataDecl)
    {
       ABS.Absyn.DataDecl _datadecl = (ABS.Absyn.DataDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("data");
       pp(_datadecl.typeident_, 0);
       render("=");
       pp(_datadecl.listconstrident_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.DataParDecl)
    {
       ABS.Absyn.DataParDecl _datapardecl = (ABS.Absyn.DataParDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("data");
       pp(_datapardecl.typeident_, 0);
       render("<");
       pp(_datapardecl.listtypeident_, 0);
       render(">");
       render("=");
       pp(_datapardecl.listconstrident_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.FunDecl)
    {
       ABS.Absyn.FunDecl _fundecl = (ABS.Absyn.FunDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("def");
       pp(_fundecl.type_, 0);
       pp(_fundecl.ident_, 0);
       render("(");
       pp(_fundecl.listparam_, 0);
       render(")");
       render("=");
       pp(_fundecl.funbody_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.FunParDecl)
    {
       ABS.Absyn.FunParDecl _funpardecl = (ABS.Absyn.FunParDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("def");
       pp(_funpardecl.type_, 0);
       pp(_funpardecl.ident_, 0);
       render("<");
       pp(_funpardecl.listtypeident_, 0);
       render(">");
       render("(");
       pp(_funpardecl.listparam_, 0);
       render(")");
       render("=");
       pp(_funpardecl.funbody_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.InterfDecl)
    {
       ABS.Absyn.InterfDecl _interfdecl = (ABS.Absyn.InterfDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("interface");
       pp(_interfdecl.typeident_, 0);
       render("{");
       pp(_interfdecl.listmethsignat_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ExtendsDecl)
    {
       ABS.Absyn.ExtendsDecl _extendsdecl = (ABS.Absyn.ExtendsDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("interface");
       pp(_extendsdecl.typeident_, 0);
       render("extends");
       pp(_extendsdecl.listtype_, 0);
       render("{");
       pp(_extendsdecl.listmethsignat_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ClassDecl)
    {
       ABS.Absyn.ClassDecl _classdecl = (ABS.Absyn.ClassDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("class");
       pp(_classdecl.typeident_, 0);
       render("{");
       pp(_classdecl.listclassbody_1, 0);
       pp(_classdecl.maybeblock_, 0);
       pp(_classdecl.listclassbody_2, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ClassParamDecl)
    {
       ABS.Absyn.ClassParamDecl _classparamdecl = (ABS.Absyn.ClassParamDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("class");
       pp(_classparamdecl.typeident_, 0);
       render("(");
       pp(_classparamdecl.listparam_, 0);
       render(")");
       render("{");
       pp(_classparamdecl.listclassbody_1, 0);
       pp(_classparamdecl.maybeblock_, 0);
       pp(_classparamdecl.listclassbody_2, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ClassImplements)
    {
       ABS.Absyn.ClassImplements _classimplements = (ABS.Absyn.ClassImplements) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("class");
       pp(_classimplements.typeident_, 0);
       render("implements");
       pp(_classimplements.listtype_, 0);
       render("{");
       pp(_classimplements.listclassbody_1, 0);
       pp(_classimplements.maybeblock_, 0);
       pp(_classimplements.listclassbody_2, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ClassParamImplements)
    {
       ABS.Absyn.ClassParamImplements _classparamimplements = (ABS.Absyn.ClassParamImplements) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("class");
       pp(_classparamimplements.typeident_, 0);
       render("(");
       pp(_classparamimplements.listparam_, 0);
       render(")");
       render("implements");
       pp(_classparamimplements.listtype_, 0);
       render("{");
       pp(_classparamimplements.listclassbody_1, 0);
       pp(_classparamimplements.maybeblock_, 0);
       pp(_classparamimplements.listclassbody_2, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ConstrIdent foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.SinglConstrIdent)
    {
       ABS.Absyn.SinglConstrIdent _singlconstrident = (ABS.Absyn.SinglConstrIdent) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_singlconstrident.typeident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ParamConstrIdent)
    {
       ABS.Absyn.ParamConstrIdent _paramconstrident = (ABS.Absyn.ParamConstrIdent) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_paramconstrident.typeident_, 0);
       render("(");
       pp(_paramconstrident.listconstrtype_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ConstrType foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.EmptyConstrType)
    {
       ABS.Absyn.EmptyConstrType _emptyconstrtype = (ABS.Absyn.EmptyConstrType) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_emptyconstrtype.type_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.RecordConstrType)
    {
       ABS.Absyn.RecordConstrType _recordconstrtype = (ABS.Absyn.RecordConstrType) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_recordconstrtype.type_, 0);
       pp(_recordconstrtype.ident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListConstrType foo, int _i_)
  {
     for (java.util.Iterator<ConstrType> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.ListTypeIdent foo, int _i_)
  {
     for (java.util.Iterator<String> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.ListConstrIdent foo, int _i_)
  {
     for (java.util.Iterator<ConstrIdent> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render("|");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.FunBody foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.BuiltinFunBody)
    {
       ABS.Absyn.BuiltinFunBody _builtinfunbody = (ABS.Absyn.BuiltinFunBody) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("builtin");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.NormalFunBody)
    {
       ABS.Absyn.NormalFunBody _normalfunbody = (ABS.Absyn.NormalFunBody) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_normalfunbody.pureexp_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.MethSignat foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.MethSig)
    {
       ABS.Absyn.MethSig _methsig = (ABS.Absyn.MethSig) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_methsig.type_, 0);
       pp(_methsig.ident_, 0);
       render("(");
       pp(_methsig.listparam_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListMethSignat foo, int _i_)
  {
     for (java.util.Iterator<MethSignat> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(";");
       } else {
         render(";");
       }
     }
  }

  private static void pp(ABS.Absyn.ClassBody foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.FieldClassBody)
    {
       ABS.Absyn.FieldClassBody _fieldclassbody = (ABS.Absyn.FieldClassBody) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_fieldclassbody.type_, 0);
       pp(_fieldclassbody.ident_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.FieldAssignClassBody)
    {
       ABS.Absyn.FieldAssignClassBody _fieldassignclassbody = (ABS.Absyn.FieldAssignClassBody) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_fieldassignclassbody.type_, 0);
       pp(_fieldassignclassbody.ident_, 0);
       render("=");
       pp(_fieldassignclassbody.pureexp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.MethClassBody)
    {
       ABS.Absyn.MethClassBody _methclassbody = (ABS.Absyn.MethClassBody) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_methclassbody.type_, 0);
       pp(_methclassbody.ident_, 0);
       render("(");
       pp(_methclassbody.listparam_, 0);
       render(")");
       pp(_methclassbody.block_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListClassBody foo, int _i_)
  {
     for (java.util.Iterator<ClassBody> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.Block foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.Bloc)
    {
       ABS.Absyn.Bloc _bloc = (ABS.Absyn.Bloc) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("{");
       pp(_bloc.liststm_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.MaybeBlock foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.JustBlock)
    {
       ABS.Absyn.JustBlock _justblock = (ABS.Absyn.JustBlock) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_justblock.block_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.NoBlock)
    {
       ABS.Absyn.NoBlock _noblock = (ABS.Absyn.NoBlock) foo;
       if (_i_ > 0) render(_L_PAREN);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListParam foo, int _i_)
  {
     for (java.util.Iterator<Param> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.Param foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.Par)
    {
       ABS.Absyn.Par _par = (ABS.Absyn.Par) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_par.type_, 0);
       pp(_par.ident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListStm foo, int _i_)
  {
     for (java.util.Iterator<Stm> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.Stm foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.SExp)
    {
       ABS.Absyn.SExp _sexp = (ABS.Absyn.SExp) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sexp.exp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SBlock)
    {
       ABS.Absyn.SBlock _sblock = (ABS.Absyn.SBlock) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("{");
       pp(_sblock.liststm_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SWhile)
    {
       ABS.Absyn.SWhile _swhile = (ABS.Absyn.SWhile) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("while");
       render("(");
       pp(_swhile.pureexp_, 0);
       render(")");
       pp(_swhile.stm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SReturn)
    {
       ABS.Absyn.SReturn _sreturn = (ABS.Absyn.SReturn) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("return");
       pp(_sreturn.exp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SAss)
    {
       ABS.Absyn.SAss _sass = (ABS.Absyn.SAss) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sass.ident_, 0);
       render("=");
       pp(_sass.exp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SFieldAss)
    {
       ABS.Absyn.SFieldAss _sfieldass = (ABS.Absyn.SFieldAss) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("this");
       render(".");
       pp(_sfieldass.ident_, 0);
       render("=");
       pp(_sfieldass.exp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SDec)
    {
       ABS.Absyn.SDec _sdec = (ABS.Absyn.SDec) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sdec.type_, 0);
       pp(_sdec.ident_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SDecAss)
    {
       ABS.Absyn.SDecAss _sdecass = (ABS.Absyn.SDecAss) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sdecass.type_, 0);
       pp(_sdecass.ident_, 0);
       render("=");
       pp(_sdecass.exp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SIf)
    {
       ABS.Absyn.SIf _sif = (ABS.Absyn.SIf) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("if");
       render("(");
       pp(_sif.pureexp_, 0);
       render(")");
       pp(_sif.stm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SIfElse)
    {
       ABS.Absyn.SIfElse _sifelse = (ABS.Absyn.SIfElse) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("if");
       render("(");
       pp(_sifelse.pureexp_, 0);
       render(")");
       pp(_sifelse.stm_1, 0);
       render("else");
       pp(_sifelse.stm_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SSuspend)
    {
       ABS.Absyn.SSuspend _ssuspend = (ABS.Absyn.SSuspend) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("suspend");
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SSkip)
    {
       ABS.Absyn.SSkip _sskip = (ABS.Absyn.SSkip) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("skip");
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SAssert)
    {
       ABS.Absyn.SAssert _sassert = (ABS.Absyn.SAssert) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("assert");
       pp(_sassert.pureexp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SAwait)
    {
       ABS.Absyn.SAwait _sawait = (ABS.Absyn.SAwait) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("await");
       pp(_sawait.guard_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.Guard foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.VarGuard)
    {
       ABS.Absyn.VarGuard _varguard = (ABS.Absyn.VarGuard) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_varguard.ident_, 0);
       render("?");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.FieldGuard)
    {
       ABS.Absyn.FieldGuard _fieldguard = (ABS.Absyn.FieldGuard) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("this");
       render(".");
       pp(_fieldguard.ident_, 0);
       render("?");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ExpGuard)
    {
       ABS.Absyn.ExpGuard _expguard = (ABS.Absyn.ExpGuard) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_expguard.pureexp_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.AndGuard)
    {
       ABS.Absyn.AndGuard _andguard = (ABS.Absyn.AndGuard) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_andguard.guard_1, 0);
       render("&");
       pp(_andguard.guard_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.Exp foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.ExpP)
    {
       ABS.Absyn.ExpP _expp = (ABS.Absyn.ExpP) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_expp.pureexp_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ExpE)
    {
       ABS.Absyn.ExpE _expe = (ABS.Absyn.ExpE) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_expe.effexp_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListPureExp foo, int _i_)
  {
     for (java.util.Iterator<PureExp> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.PureExp foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.EOr)
    {
       ABS.Absyn.EOr _eor = (ABS.Absyn.EOr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_eor.pureexp_1, 0);
       render("||");
       pp(_eor.pureexp_2, 1);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.Let)
    {
       ABS.Absyn.Let _let = (ABS.Absyn.Let) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("let");
       render("(");
       pp(_let.param_, 0);
       render(")");
       render("=");
       pp(_let.pureexp_1, 0);
       render("in");
       pp(_let.pureexp_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.If)
    {
       ABS.Absyn.If _if = (ABS.Absyn.If) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("if");
       pp(_if.pureexp_1, 0);
       render("then");
       pp(_if.pureexp_2, 0);
       render("else");
       pp(_if.pureexp_3, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.Case)
    {
       ABS.Absyn.Case _case = (ABS.Absyn.Case) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("case");
       pp(_case.pureexp_, 0);
       render("{");
       pp(_case.listcasebranch_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EAnd)
    {
       ABS.Absyn.EAnd _eand = (ABS.Absyn.EAnd) foo;
       if (_i_ > 1) render(_L_PAREN);
       pp(_eand.pureexp_1, 1);
       render("&&");
       pp(_eand.pureexp_2, 2);
       if (_i_ > 1) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EEq)
    {
       ABS.Absyn.EEq _eeq = (ABS.Absyn.EEq) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_eeq.pureexp_1, 2);
       render("==");
       pp(_eeq.pureexp_2, 3);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ENeq)
    {
       ABS.Absyn.ENeq _eneq = (ABS.Absyn.ENeq) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_eneq.pureexp_1, 2);
       render("!=");
       pp(_eneq.pureexp_2, 3);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ELt)
    {
       ABS.Absyn.ELt _elt = (ABS.Absyn.ELt) foo;
       if (_i_ > 3) render(_L_PAREN);
       pp(_elt.pureexp_1, 3);
       render("<");
       pp(_elt.pureexp_2, 4);
       if (_i_ > 3) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ELe)
    {
       ABS.Absyn.ELe _ele = (ABS.Absyn.ELe) foo;
       if (_i_ > 3) render(_L_PAREN);
       pp(_ele.pureexp_1, 3);
       render("<=");
       pp(_ele.pureexp_2, 4);
       if (_i_ > 3) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EGt)
    {
       ABS.Absyn.EGt _egt = (ABS.Absyn.EGt) foo;
       if (_i_ > 3) render(_L_PAREN);
       pp(_egt.pureexp_1, 3);
       render(">");
       pp(_egt.pureexp_2, 4);
       if (_i_ > 3) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EGe)
    {
       ABS.Absyn.EGe _ege = (ABS.Absyn.EGe) foo;
       if (_i_ > 3) render(_L_PAREN);
       pp(_ege.pureexp_1, 3);
       render(">=");
       pp(_ege.pureexp_2, 4);
       if (_i_ > 3) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EAdd)
    {
       ABS.Absyn.EAdd _eadd = (ABS.Absyn.EAdd) foo;
       if (_i_ > 4) render(_L_PAREN);
       pp(_eadd.pureexp_1, 4);
       render("+");
       pp(_eadd.pureexp_2, 5);
       if (_i_ > 4) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ESub)
    {
       ABS.Absyn.ESub _esub = (ABS.Absyn.ESub) foo;
       if (_i_ > 4) render(_L_PAREN);
       pp(_esub.pureexp_1, 4);
       render("-");
       pp(_esub.pureexp_2, 5);
       if (_i_ > 4) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EMul)
    {
       ABS.Absyn.EMul _emul = (ABS.Absyn.EMul) foo;
       if (_i_ > 5) render(_L_PAREN);
       pp(_emul.pureexp_1, 5);
       render("*");
       pp(_emul.pureexp_2, 6);
       if (_i_ > 5) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EDiv)
    {
       ABS.Absyn.EDiv _ediv = (ABS.Absyn.EDiv) foo;
       if (_i_ > 5) render(_L_PAREN);
       pp(_ediv.pureexp_1, 5);
       render("/");
       pp(_ediv.pureexp_2, 6);
       if (_i_ > 5) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EMod)
    {
       ABS.Absyn.EMod _emod = (ABS.Absyn.EMod) foo;
       if (_i_ > 5) render(_L_PAREN);
       pp(_emod.pureexp_1, 5);
       render("%");
       pp(_emod.pureexp_2, 6);
       if (_i_ > 5) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ELogNeg)
    {
       ABS.Absyn.ELogNeg _elogneg = (ABS.Absyn.ELogNeg) foo;
       if (_i_ > 6) render(_L_PAREN);
       render("~");
       pp(_elogneg.pureexp_, 6);
       if (_i_ > 6) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EIntNeg)
    {
       ABS.Absyn.EIntNeg _eintneg = (ABS.Absyn.EIntNeg) foo;
       if (_i_ > 6) render(_L_PAREN);
       render("-");
       pp(_eintneg.pureexp_, 6);
       if (_i_ > 6) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EFunCall)
    {
       ABS.Absyn.EFunCall _efuncall = (ABS.Absyn.EFunCall) foo;
       if (_i_ > 7) render(_L_PAREN);
       pp(_efuncall.ident_, 0);
       render("(");
       pp(_efuncall.listpureexp_, 0);
       render(")");
       if (_i_ > 7) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EQualFunCall)
    {
       ABS.Absyn.EQualFunCall _equalfuncall = (ABS.Absyn.EQualFunCall) foo;
       if (_i_ > 7) render(_L_PAREN);
       pp(_equalfuncall.type_, 0);
       render(".");
       pp(_equalfuncall.ident_, 0);
       render("(");
       pp(_equalfuncall.listpureexp_, 0);
       render(")");
       if (_i_ > 7) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ENaryFunCall)
    {
       ABS.Absyn.ENaryFunCall _enaryfuncall = (ABS.Absyn.ENaryFunCall) foo;
       if (_i_ > 7) render(_L_PAREN);
       pp(_enaryfuncall.ident_, 0);
       render("[");
       pp(_enaryfuncall.listpureexp_, 0);
       render("]");
       if (_i_ > 7) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ENaryQualFunCall)
    {
       ABS.Absyn.ENaryQualFunCall _enaryqualfuncall = (ABS.Absyn.ENaryQualFunCall) foo;
       if (_i_ > 7) render(_L_PAREN);
       pp(_enaryqualfuncall.type_, 0);
       render(".");
       pp(_enaryqualfuncall.ident_, 0);
       render("[");
       pp(_enaryqualfuncall.listpureexp_, 0);
       render("]");
       if (_i_ > 7) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EVar)
    {
       ABS.Absyn.EVar _evar = (ABS.Absyn.EVar) foo;
       if (_i_ > 7) render(_L_PAREN);
       pp(_evar.ident_, 0);
       if (_i_ > 7) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EThis)
    {
       ABS.Absyn.EThis _ethis = (ABS.Absyn.EThis) foo;
       if (_i_ > 7) render(_L_PAREN);
       render("this");
       render(".");
       pp(_ethis.ident_, 0);
       if (_i_ > 7) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EQualVar)
    {
       ABS.Absyn.EQualVar _equalvar = (ABS.Absyn.EQualVar) foo;
       if (_i_ > 7) render(_L_PAREN);
       pp(_equalvar.type_, 0);
       render(".");
       pp(_equalvar.ident_, 0);
       if (_i_ > 7) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ESinglConstr)
    {
       ABS.Absyn.ESinglConstr _esinglconstr = (ABS.Absyn.ESinglConstr) foo;
       if (_i_ > 7) render(_L_PAREN);
       pp(_esinglconstr.type_, 0);
       if (_i_ > 7) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EParamConstr)
    {
       ABS.Absyn.EParamConstr _eparamconstr = (ABS.Absyn.EParamConstr) foo;
       if (_i_ > 7) render(_L_PAREN);
       pp(_eparamconstr.type_, 0);
       render("(");
       pp(_eparamconstr.listpureexp_, 0);
       render(")");
       if (_i_ > 7) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ELit)
    {
       ABS.Absyn.ELit _elit = (ABS.Absyn.ELit) foo;
       if (_i_ > 7) render(_L_PAREN);
       pp(_elit.literal_, 0);
       if (_i_ > 7) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.CaseBranch foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.CaseBranc)
    {
       ABS.Absyn.CaseBranc _casebranc = (ABS.Absyn.CaseBranc) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_casebranc.pattern_, 0);
       render("=>");
       pp(_casebranc.pureexp_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListCaseBranch foo, int _i_)
  {
     for (java.util.Iterator<CaseBranch> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(";");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.ListPattern foo, int _i_)
  {
     for (java.util.Iterator<Pattern> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.Pattern foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.IdentPat)
    {
       ABS.Absyn.IdentPat _identpat = (ABS.Absyn.IdentPat) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_identpat.ident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.LitPat)
    {
       ABS.Absyn.LitPat _litpat = (ABS.Absyn.LitPat) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_litpat.literal_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SinglConstrPat)
    {
       ABS.Absyn.SinglConstrPat _singlconstrpat = (ABS.Absyn.SinglConstrPat) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_singlconstrpat.typeident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ParamConstrPat)
    {
       ABS.Absyn.ParamConstrPat _paramconstrpat = (ABS.Absyn.ParamConstrPat) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_paramconstrpat.typeident_, 0);
       render("(");
       pp(_paramconstrpat.listpattern_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.UnderscorePat)
    {
       ABS.Absyn.UnderscorePat _underscorepat = (ABS.Absyn.UnderscorePat) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("_");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.Literal foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.LNull)
    {
       ABS.Absyn.LNull _lnull = (ABS.Absyn.LNull) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("null");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.LThis)
    {
       ABS.Absyn.LThis _lthis = (ABS.Absyn.LThis) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("this");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.LThisDC)
    {
       ABS.Absyn.LThisDC _lthisdc = (ABS.Absyn.LThisDC) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("thisDC");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.LStr)
    {
       ABS.Absyn.LStr _lstr = (ABS.Absyn.LStr) foo;
       if (_i_ > 0) render(_L_PAREN);
       printQuoted(_lstr.string_);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.LInt)
    {
       ABS.Absyn.LInt _lint = (ABS.Absyn.LInt) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_lint.integer_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.EffExp foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.New)
    {
       ABS.Absyn.New _new = (ABS.Absyn.New) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("new");
       pp(_new.type_, 0);
       render("(");
       pp(_new.listpureexp_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.NewLocal)
    {
       ABS.Absyn.NewLocal _newlocal = (ABS.Absyn.NewLocal) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("new");
       render("local");
       pp(_newlocal.type_, 0);
       render("(");
       pp(_newlocal.listpureexp_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SyncMethCall)
    {
       ABS.Absyn.SyncMethCall _syncmethcall = (ABS.Absyn.SyncMethCall) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_syncmethcall.pureexp_, 0);
       render(".");
       pp(_syncmethcall.ident_, 0);
       render("(");
       pp(_syncmethcall.listpureexp_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ThisSyncMethCall)
    {
       ABS.Absyn.ThisSyncMethCall _thissyncmethcall = (ABS.Absyn.ThisSyncMethCall) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("this");
       render(".");
       pp(_thissyncmethcall.ident_, 0);
       render("(");
       pp(_thissyncmethcall.listpureexp_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.AsyncMethCall)
    {
       ABS.Absyn.AsyncMethCall _asyncmethcall = (ABS.Absyn.AsyncMethCall) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_asyncmethcall.pureexp_, 0);
       render("!");
       pp(_asyncmethcall.ident_, 0);
       render("(");
       pp(_asyncmethcall.listpureexp_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ThisAsyncMethCall)
    {
       ABS.Absyn.ThisAsyncMethCall _thisasyncmethcall = (ABS.Absyn.ThisAsyncMethCall) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("this");
       render("!");
       pp(_thisasyncmethcall.ident_, 0);
       render("(");
       pp(_thisasyncmethcall.listpureexp_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.Get)
    {
       ABS.Absyn.Get _get = (ABS.Absyn.Get) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_get.pureexp_, 0);
       render(".");
       render("get");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.Spawns)
    {
       ABS.Absyn.Spawns _spawns = (ABS.Absyn.Spawns) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_spawns.pureexp_, 0);
       render("spawns");
       pp(_spawns.type_, 0);
       render("(");
       pp(_spawns.listpureexp_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
  }


  private static void sh(ABS.Absyn.AnyIdent foo)
  {
    if (foo instanceof ABS.Absyn.AnyIden)
    {
       ABS.Absyn.AnyIden _anyiden = (ABS.Absyn.AnyIden) foo;
       render("(");
       render("AnyIden");
       sh(_anyiden.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.AnyTyIden)
    {
       ABS.Absyn.AnyTyIden _anytyiden = (ABS.Absyn.AnyTyIden) foo;
       render("(");
       render("AnyTyIden");
       sh(_anytyiden.typeident_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListAnyIdent foo)
  {
     for (java.util.Iterator<AnyIdent> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.Program foo)
  {
    if (foo instanceof ABS.Absyn.Prog)
    {
       ABS.Absyn.Prog _prog = (ABS.Absyn.Prog) foo;
       render("(");
       render("Prog");
       render("[");
       sh(_prog.listmodule_);
       render("]");
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListModule foo)
  {
     for (java.util.Iterator<Module> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.Module foo)
  {
    if (foo instanceof ABS.Absyn.Modul)
    {
       ABS.Absyn.Modul _modul = (ABS.Absyn.Modul) foo;
       render("(");
       render("Modul");
       sh(_modul.type_);
       render("[");
       sh(_modul.listexport_);
       render("]");
       render("[");
       sh(_modul.listimport_);
       render("]");
       render("[");
       sh(_modul.listdecl_);
       render("]");
       sh(_modul.maybeblock_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.Export foo)
  {
    if (foo instanceof ABS.Absyn.AnyExport)
    {
       ABS.Absyn.AnyExport _anyexport = (ABS.Absyn.AnyExport) foo;
       render("(");
       render("AnyExport");
       render("[");
       sh(_anyexport.listanyident_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.AnyFromExport)
    {
       ABS.Absyn.AnyFromExport _anyfromexport = (ABS.Absyn.AnyFromExport) foo;
       render("(");
       render("AnyFromExport");
       render("[");
       sh(_anyfromexport.listanyident_);
       render("]");
       sh(_anyfromexport.type_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.StarExport)
    {
       ABS.Absyn.StarExport _starexport = (ABS.Absyn.StarExport) foo;
       render("StarExport");
    }
    if (foo instanceof ABS.Absyn.StarFromExport)
    {
       ABS.Absyn.StarFromExport _starfromexport = (ABS.Absyn.StarFromExport) foo;
       render("(");
       render("StarFromExport");
       sh(_starfromexport.type_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListExport foo)
  {
     for (java.util.Iterator<Export> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.Import foo)
  {
    if (foo instanceof ABS.Absyn.AnyImport)
    {
       ABS.Absyn.AnyImport _anyimport = (ABS.Absyn.AnyImport) foo;
       render("(");
       render("AnyImport");
       sh(_anyimport.importtype_);
       sh(_anyimport.type_);
       sh(_anyimport.anyident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.AnyFromImport)
    {
       ABS.Absyn.AnyFromImport _anyfromimport = (ABS.Absyn.AnyFromImport) foo;
       render("(");
       render("AnyFromImport");
       sh(_anyfromimport.importtype_);
       render("[");
       sh(_anyfromimport.listanyident_);
       render("]");
       sh(_anyfromimport.type_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.StarFromImport)
    {
       ABS.Absyn.StarFromImport _starfromimport = (ABS.Absyn.StarFromImport) foo;
       render("(");
       render("StarFromImport");
       sh(_starfromimport.importtype_);
       sh(_starfromimport.type_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListImport foo)
  {
     for (java.util.Iterator<Import> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.ImportType foo)
  {
    if (foo instanceof ABS.Absyn.ForeignImport)
    {
       ABS.Absyn.ForeignImport _foreignimport = (ABS.Absyn.ForeignImport) foo;
       render("ForeignImport");
    }
    if (foo instanceof ABS.Absyn.NormalImport)
    {
       ABS.Absyn.NormalImport _normalimport = (ABS.Absyn.NormalImport) foo;
       render("NormalImport");
    }
  }

  private static void sh(ABS.Absyn.Type foo)
  {
    if (foo instanceof ABS.Absyn.UnderscoreType)
    {
       ABS.Absyn.UnderscoreType _underscoretype = (ABS.Absyn.UnderscoreType) foo;
       render("UnderscoreType");
    }
    if (foo instanceof ABS.Absyn.SimpleType)
    {
       ABS.Absyn.SimpleType _simpletype = (ABS.Absyn.SimpleType) foo;
       render("(");
       render("SimpleType");
       render("[");
       sh(_simpletype.listqualtypeident_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ParType)
    {
       ABS.Absyn.ParType _partype = (ABS.Absyn.ParType) foo;
       render("(");
       render("ParType");
       render("[");
       sh(_partype.listqualtypeident_);
       render("]");
       render("[");
       sh(_partype.listtype_);
       render("]");
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListType foo)
  {
     for (java.util.Iterator<Type> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.QualTypeIdent foo)
  {
    if (foo instanceof ABS.Absyn.QualTypeIden)
    {
       ABS.Absyn.QualTypeIden _qualtypeiden = (ABS.Absyn.QualTypeIden) foo;
       render("(");
       render("QualTypeIden");
       sh(_qualtypeiden.typeident_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListQualTypeIdent foo)
  {
     for (java.util.Iterator<QualTypeIdent> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.ListDecl foo)
  {
     for (java.util.Iterator<Decl> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.Decl foo)
  {
    if (foo instanceof ABS.Absyn.TypeDecl)
    {
       ABS.Absyn.TypeDecl _typedecl = (ABS.Absyn.TypeDecl) foo;
       render("(");
       render("TypeDecl");
       sh(_typedecl.typeident_);
       sh(_typedecl.type_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.DataDecl)
    {
       ABS.Absyn.DataDecl _datadecl = (ABS.Absyn.DataDecl) foo;
       render("(");
       render("DataDecl");
       sh(_datadecl.typeident_);
       render("[");
       sh(_datadecl.listconstrident_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.DataParDecl)
    {
       ABS.Absyn.DataParDecl _datapardecl = (ABS.Absyn.DataParDecl) foo;
       render("(");
       render("DataParDecl");
       sh(_datapardecl.typeident_);
       render("[");
       sh(_datapardecl.listtypeident_);
       render("]");
       render("[");
       sh(_datapardecl.listconstrident_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.FunDecl)
    {
       ABS.Absyn.FunDecl _fundecl = (ABS.Absyn.FunDecl) foo;
       render("(");
       render("FunDecl");
       sh(_fundecl.type_);
       sh(_fundecl.ident_);
       render("[");
       sh(_fundecl.listparam_);
       render("]");
       sh(_fundecl.funbody_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.FunParDecl)
    {
       ABS.Absyn.FunParDecl _funpardecl = (ABS.Absyn.FunParDecl) foo;
       render("(");
       render("FunParDecl");
       sh(_funpardecl.type_);
       sh(_funpardecl.ident_);
       render("[");
       sh(_funpardecl.listtypeident_);
       render("]");
       render("[");
       sh(_funpardecl.listparam_);
       render("]");
       sh(_funpardecl.funbody_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.InterfDecl)
    {
       ABS.Absyn.InterfDecl _interfdecl = (ABS.Absyn.InterfDecl) foo;
       render("(");
       render("InterfDecl");
       sh(_interfdecl.typeident_);
       render("[");
       sh(_interfdecl.listmethsignat_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ExtendsDecl)
    {
       ABS.Absyn.ExtendsDecl _extendsdecl = (ABS.Absyn.ExtendsDecl) foo;
       render("(");
       render("ExtendsDecl");
       sh(_extendsdecl.typeident_);
       render("[");
       sh(_extendsdecl.listtype_);
       render("]");
       render("[");
       sh(_extendsdecl.listmethsignat_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ClassDecl)
    {
       ABS.Absyn.ClassDecl _classdecl = (ABS.Absyn.ClassDecl) foo;
       render("(");
       render("ClassDecl");
       sh(_classdecl.typeident_);
       render("[");
       sh(_classdecl.listclassbody_1);
       render("]");
       sh(_classdecl.maybeblock_);
       render("[");
       sh(_classdecl.listclassbody_2);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ClassParamDecl)
    {
       ABS.Absyn.ClassParamDecl _classparamdecl = (ABS.Absyn.ClassParamDecl) foo;
       render("(");
       render("ClassParamDecl");
       sh(_classparamdecl.typeident_);
       render("[");
       sh(_classparamdecl.listparam_);
       render("]");
       render("[");
       sh(_classparamdecl.listclassbody_1);
       render("]");
       sh(_classparamdecl.maybeblock_);
       render("[");
       sh(_classparamdecl.listclassbody_2);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ClassImplements)
    {
       ABS.Absyn.ClassImplements _classimplements = (ABS.Absyn.ClassImplements) foo;
       render("(");
       render("ClassImplements");
       sh(_classimplements.typeident_);
       render("[");
       sh(_classimplements.listtype_);
       render("]");
       render("[");
       sh(_classimplements.listclassbody_1);
       render("]");
       sh(_classimplements.maybeblock_);
       render("[");
       sh(_classimplements.listclassbody_2);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ClassParamImplements)
    {
       ABS.Absyn.ClassParamImplements _classparamimplements = (ABS.Absyn.ClassParamImplements) foo;
       render("(");
       render("ClassParamImplements");
       sh(_classparamimplements.typeident_);
       render("[");
       sh(_classparamimplements.listparam_);
       render("]");
       render("[");
       sh(_classparamimplements.listtype_);
       render("]");
       render("[");
       sh(_classparamimplements.listclassbody_1);
       render("]");
       sh(_classparamimplements.maybeblock_);
       render("[");
       sh(_classparamimplements.listclassbody_2);
       render("]");
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ConstrIdent foo)
  {
    if (foo instanceof ABS.Absyn.SinglConstrIdent)
    {
       ABS.Absyn.SinglConstrIdent _singlconstrident = (ABS.Absyn.SinglConstrIdent) foo;
       render("(");
       render("SinglConstrIdent");
       sh(_singlconstrident.typeident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ParamConstrIdent)
    {
       ABS.Absyn.ParamConstrIdent _paramconstrident = (ABS.Absyn.ParamConstrIdent) foo;
       render("(");
       render("ParamConstrIdent");
       sh(_paramconstrident.typeident_);
       render("[");
       sh(_paramconstrident.listconstrtype_);
       render("]");
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ConstrType foo)
  {
    if (foo instanceof ABS.Absyn.EmptyConstrType)
    {
       ABS.Absyn.EmptyConstrType _emptyconstrtype = (ABS.Absyn.EmptyConstrType) foo;
       render("(");
       render("EmptyConstrType");
       sh(_emptyconstrtype.type_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.RecordConstrType)
    {
       ABS.Absyn.RecordConstrType _recordconstrtype = (ABS.Absyn.RecordConstrType) foo;
       render("(");
       render("RecordConstrType");
       sh(_recordconstrtype.type_);
       sh(_recordconstrtype.ident_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListConstrType foo)
  {
     for (java.util.Iterator<ConstrType> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.ListTypeIdent foo)
  {
     for (java.util.Iterator<String> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.ListConstrIdent foo)
  {
     for (java.util.Iterator<ConstrIdent> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.FunBody foo)
  {
    if (foo instanceof ABS.Absyn.BuiltinFunBody)
    {
       ABS.Absyn.BuiltinFunBody _builtinfunbody = (ABS.Absyn.BuiltinFunBody) foo;
       render("BuiltinFunBody");
    }
    if (foo instanceof ABS.Absyn.NormalFunBody)
    {
       ABS.Absyn.NormalFunBody _normalfunbody = (ABS.Absyn.NormalFunBody) foo;
       render("(");
       render("NormalFunBody");
       sh(_normalfunbody.pureexp_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.MethSignat foo)
  {
    if (foo instanceof ABS.Absyn.MethSig)
    {
       ABS.Absyn.MethSig _methsig = (ABS.Absyn.MethSig) foo;
       render("(");
       render("MethSig");
       sh(_methsig.type_);
       sh(_methsig.ident_);
       render("[");
       sh(_methsig.listparam_);
       render("]");
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListMethSignat foo)
  {
     for (java.util.Iterator<MethSignat> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.ClassBody foo)
  {
    if (foo instanceof ABS.Absyn.FieldClassBody)
    {
       ABS.Absyn.FieldClassBody _fieldclassbody = (ABS.Absyn.FieldClassBody) foo;
       render("(");
       render("FieldClassBody");
       sh(_fieldclassbody.type_);
       sh(_fieldclassbody.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.FieldAssignClassBody)
    {
       ABS.Absyn.FieldAssignClassBody _fieldassignclassbody = (ABS.Absyn.FieldAssignClassBody) foo;
       render("(");
       render("FieldAssignClassBody");
       sh(_fieldassignclassbody.type_);
       sh(_fieldassignclassbody.ident_);
       sh(_fieldassignclassbody.pureexp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.MethClassBody)
    {
       ABS.Absyn.MethClassBody _methclassbody = (ABS.Absyn.MethClassBody) foo;
       render("(");
       render("MethClassBody");
       sh(_methclassbody.type_);
       sh(_methclassbody.ident_);
       render("[");
       sh(_methclassbody.listparam_);
       render("]");
       sh(_methclassbody.block_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListClassBody foo)
  {
     for (java.util.Iterator<ClassBody> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.Block foo)
  {
    if (foo instanceof ABS.Absyn.Bloc)
    {
       ABS.Absyn.Bloc _bloc = (ABS.Absyn.Bloc) foo;
       render("(");
       render("Bloc");
       render("[");
       sh(_bloc.liststm_);
       render("]");
       render(")");
    }
  }

  private static void sh(ABS.Absyn.MaybeBlock foo)
  {
    if (foo instanceof ABS.Absyn.JustBlock)
    {
       ABS.Absyn.JustBlock _justblock = (ABS.Absyn.JustBlock) foo;
       render("(");
       render("JustBlock");
       sh(_justblock.block_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.NoBlock)
    {
       ABS.Absyn.NoBlock _noblock = (ABS.Absyn.NoBlock) foo;
       render("NoBlock");
    }
  }

  private static void sh(ABS.Absyn.ListParam foo)
  {
     for (java.util.Iterator<Param> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.Param foo)
  {
    if (foo instanceof ABS.Absyn.Par)
    {
       ABS.Absyn.Par _par = (ABS.Absyn.Par) foo;
       render("(");
       render("Par");
       sh(_par.type_);
       sh(_par.ident_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListStm foo)
  {
     for (java.util.Iterator<Stm> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.Stm foo)
  {
    if (foo instanceof ABS.Absyn.SExp)
    {
       ABS.Absyn.SExp _sexp = (ABS.Absyn.SExp) foo;
       render("(");
       render("SExp");
       sh(_sexp.exp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SBlock)
    {
       ABS.Absyn.SBlock _sblock = (ABS.Absyn.SBlock) foo;
       render("(");
       render("SBlock");
       render("[");
       sh(_sblock.liststm_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.SWhile)
    {
       ABS.Absyn.SWhile _swhile = (ABS.Absyn.SWhile) foo;
       render("(");
       render("SWhile");
       sh(_swhile.pureexp_);
       sh(_swhile.stm_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SReturn)
    {
       ABS.Absyn.SReturn _sreturn = (ABS.Absyn.SReturn) foo;
       render("(");
       render("SReturn");
       sh(_sreturn.exp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SAss)
    {
       ABS.Absyn.SAss _sass = (ABS.Absyn.SAss) foo;
       render("(");
       render("SAss");
       sh(_sass.ident_);
       sh(_sass.exp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SFieldAss)
    {
       ABS.Absyn.SFieldAss _sfieldass = (ABS.Absyn.SFieldAss) foo;
       render("(");
       render("SFieldAss");
       sh(_sfieldass.ident_);
       sh(_sfieldass.exp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SDec)
    {
       ABS.Absyn.SDec _sdec = (ABS.Absyn.SDec) foo;
       render("(");
       render("SDec");
       sh(_sdec.type_);
       sh(_sdec.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SDecAss)
    {
       ABS.Absyn.SDecAss _sdecass = (ABS.Absyn.SDecAss) foo;
       render("(");
       render("SDecAss");
       sh(_sdecass.type_);
       sh(_sdecass.ident_);
       sh(_sdecass.exp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SIf)
    {
       ABS.Absyn.SIf _sif = (ABS.Absyn.SIf) foo;
       render("(");
       render("SIf");
       sh(_sif.pureexp_);
       sh(_sif.stm_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SIfElse)
    {
       ABS.Absyn.SIfElse _sifelse = (ABS.Absyn.SIfElse) foo;
       render("(");
       render("SIfElse");
       sh(_sifelse.pureexp_);
       sh(_sifelse.stm_1);
       sh(_sifelse.stm_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SSuspend)
    {
       ABS.Absyn.SSuspend _ssuspend = (ABS.Absyn.SSuspend) foo;
       render("SSuspend");
    }
    if (foo instanceof ABS.Absyn.SSkip)
    {
       ABS.Absyn.SSkip _sskip = (ABS.Absyn.SSkip) foo;
       render("SSkip");
    }
    if (foo instanceof ABS.Absyn.SAssert)
    {
       ABS.Absyn.SAssert _sassert = (ABS.Absyn.SAssert) foo;
       render("(");
       render("SAssert");
       sh(_sassert.pureexp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SAwait)
    {
       ABS.Absyn.SAwait _sawait = (ABS.Absyn.SAwait) foo;
       render("(");
       render("SAwait");
       sh(_sawait.guard_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.Guard foo)
  {
    if (foo instanceof ABS.Absyn.VarGuard)
    {
       ABS.Absyn.VarGuard _varguard = (ABS.Absyn.VarGuard) foo;
       render("(");
       render("VarGuard");
       sh(_varguard.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.FieldGuard)
    {
       ABS.Absyn.FieldGuard _fieldguard = (ABS.Absyn.FieldGuard) foo;
       render("(");
       render("FieldGuard");
       sh(_fieldguard.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ExpGuard)
    {
       ABS.Absyn.ExpGuard _expguard = (ABS.Absyn.ExpGuard) foo;
       render("(");
       render("ExpGuard");
       sh(_expguard.pureexp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.AndGuard)
    {
       ABS.Absyn.AndGuard _andguard = (ABS.Absyn.AndGuard) foo;
       render("(");
       render("AndGuard");
       sh(_andguard.guard_1);
       sh(_andguard.guard_2);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.Exp foo)
  {
    if (foo instanceof ABS.Absyn.ExpP)
    {
       ABS.Absyn.ExpP _expp = (ABS.Absyn.ExpP) foo;
       render("(");
       render("ExpP");
       sh(_expp.pureexp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ExpE)
    {
       ABS.Absyn.ExpE _expe = (ABS.Absyn.ExpE) foo;
       render("(");
       render("ExpE");
       sh(_expe.effexp_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListPureExp foo)
  {
     for (java.util.Iterator<PureExp> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.PureExp foo)
  {
    if (foo instanceof ABS.Absyn.EOr)
    {
       ABS.Absyn.EOr _eor = (ABS.Absyn.EOr) foo;
       render("(");
       render("EOr");
       sh(_eor.pureexp_1);
       sh(_eor.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.Let)
    {
       ABS.Absyn.Let _let = (ABS.Absyn.Let) foo;
       render("(");
       render("Let");
       sh(_let.param_);
       sh(_let.pureexp_1);
       sh(_let.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.If)
    {
       ABS.Absyn.If _if = (ABS.Absyn.If) foo;
       render("(");
       render("If");
       sh(_if.pureexp_1);
       sh(_if.pureexp_2);
       sh(_if.pureexp_3);
       render(")");
    }
    if (foo instanceof ABS.Absyn.Case)
    {
       ABS.Absyn.Case _case = (ABS.Absyn.Case) foo;
       render("(");
       render("Case");
       sh(_case.pureexp_);
       render("[");
       sh(_case.listcasebranch_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.EAnd)
    {
       ABS.Absyn.EAnd _eand = (ABS.Absyn.EAnd) foo;
       render("(");
       render("EAnd");
       sh(_eand.pureexp_1);
       sh(_eand.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EEq)
    {
       ABS.Absyn.EEq _eeq = (ABS.Absyn.EEq) foo;
       render("(");
       render("EEq");
       sh(_eeq.pureexp_1);
       sh(_eeq.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ENeq)
    {
       ABS.Absyn.ENeq _eneq = (ABS.Absyn.ENeq) foo;
       render("(");
       render("ENeq");
       sh(_eneq.pureexp_1);
       sh(_eneq.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ELt)
    {
       ABS.Absyn.ELt _elt = (ABS.Absyn.ELt) foo;
       render("(");
       render("ELt");
       sh(_elt.pureexp_1);
       sh(_elt.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ELe)
    {
       ABS.Absyn.ELe _ele = (ABS.Absyn.ELe) foo;
       render("(");
       render("ELe");
       sh(_ele.pureexp_1);
       sh(_ele.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EGt)
    {
       ABS.Absyn.EGt _egt = (ABS.Absyn.EGt) foo;
       render("(");
       render("EGt");
       sh(_egt.pureexp_1);
       sh(_egt.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EGe)
    {
       ABS.Absyn.EGe _ege = (ABS.Absyn.EGe) foo;
       render("(");
       render("EGe");
       sh(_ege.pureexp_1);
       sh(_ege.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EAdd)
    {
       ABS.Absyn.EAdd _eadd = (ABS.Absyn.EAdd) foo;
       render("(");
       render("EAdd");
       sh(_eadd.pureexp_1);
       sh(_eadd.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ESub)
    {
       ABS.Absyn.ESub _esub = (ABS.Absyn.ESub) foo;
       render("(");
       render("ESub");
       sh(_esub.pureexp_1);
       sh(_esub.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EMul)
    {
       ABS.Absyn.EMul _emul = (ABS.Absyn.EMul) foo;
       render("(");
       render("EMul");
       sh(_emul.pureexp_1);
       sh(_emul.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EDiv)
    {
       ABS.Absyn.EDiv _ediv = (ABS.Absyn.EDiv) foo;
       render("(");
       render("EDiv");
       sh(_ediv.pureexp_1);
       sh(_ediv.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EMod)
    {
       ABS.Absyn.EMod _emod = (ABS.Absyn.EMod) foo;
       render("(");
       render("EMod");
       sh(_emod.pureexp_1);
       sh(_emod.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ELogNeg)
    {
       ABS.Absyn.ELogNeg _elogneg = (ABS.Absyn.ELogNeg) foo;
       render("(");
       render("ELogNeg");
       sh(_elogneg.pureexp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EIntNeg)
    {
       ABS.Absyn.EIntNeg _eintneg = (ABS.Absyn.EIntNeg) foo;
       render("(");
       render("EIntNeg");
       sh(_eintneg.pureexp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EFunCall)
    {
       ABS.Absyn.EFunCall _efuncall = (ABS.Absyn.EFunCall) foo;
       render("(");
       render("EFunCall");
       sh(_efuncall.ident_);
       render("[");
       sh(_efuncall.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.EQualFunCall)
    {
       ABS.Absyn.EQualFunCall _equalfuncall = (ABS.Absyn.EQualFunCall) foo;
       render("(");
       render("EQualFunCall");
       sh(_equalfuncall.type_);
       sh(_equalfuncall.ident_);
       render("[");
       sh(_equalfuncall.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ENaryFunCall)
    {
       ABS.Absyn.ENaryFunCall _enaryfuncall = (ABS.Absyn.ENaryFunCall) foo;
       render("(");
       render("ENaryFunCall");
       sh(_enaryfuncall.ident_);
       render("[");
       sh(_enaryfuncall.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ENaryQualFunCall)
    {
       ABS.Absyn.ENaryQualFunCall _enaryqualfuncall = (ABS.Absyn.ENaryQualFunCall) foo;
       render("(");
       render("ENaryQualFunCall");
       sh(_enaryqualfuncall.type_);
       sh(_enaryqualfuncall.ident_);
       render("[");
       sh(_enaryqualfuncall.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.EVar)
    {
       ABS.Absyn.EVar _evar = (ABS.Absyn.EVar) foo;
       render("(");
       render("EVar");
       sh(_evar.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EThis)
    {
       ABS.Absyn.EThis _ethis = (ABS.Absyn.EThis) foo;
       render("(");
       render("EThis");
       sh(_ethis.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EQualVar)
    {
       ABS.Absyn.EQualVar _equalvar = (ABS.Absyn.EQualVar) foo;
       render("(");
       render("EQualVar");
       sh(_equalvar.type_);
       sh(_equalvar.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ESinglConstr)
    {
       ABS.Absyn.ESinglConstr _esinglconstr = (ABS.Absyn.ESinglConstr) foo;
       render("(");
       render("ESinglConstr");
       sh(_esinglconstr.type_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EParamConstr)
    {
       ABS.Absyn.EParamConstr _eparamconstr = (ABS.Absyn.EParamConstr) foo;
       render("(");
       render("EParamConstr");
       sh(_eparamconstr.type_);
       render("[");
       sh(_eparamconstr.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ELit)
    {
       ABS.Absyn.ELit _elit = (ABS.Absyn.ELit) foo;
       render("(");
       render("ELit");
       sh(_elit.literal_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.CaseBranch foo)
  {
    if (foo instanceof ABS.Absyn.CaseBranc)
    {
       ABS.Absyn.CaseBranc _casebranc = (ABS.Absyn.CaseBranc) foo;
       render("(");
       render("CaseBranc");
       sh(_casebranc.pattern_);
       sh(_casebranc.pureexp_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListCaseBranch foo)
  {
     for (java.util.Iterator<CaseBranch> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.ListPattern foo)
  {
     for (java.util.Iterator<Pattern> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.Pattern foo)
  {
    if (foo instanceof ABS.Absyn.IdentPat)
    {
       ABS.Absyn.IdentPat _identpat = (ABS.Absyn.IdentPat) foo;
       render("(");
       render("IdentPat");
       sh(_identpat.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.LitPat)
    {
       ABS.Absyn.LitPat _litpat = (ABS.Absyn.LitPat) foo;
       render("(");
       render("LitPat");
       sh(_litpat.literal_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SinglConstrPat)
    {
       ABS.Absyn.SinglConstrPat _singlconstrpat = (ABS.Absyn.SinglConstrPat) foo;
       render("(");
       render("SinglConstrPat");
       sh(_singlconstrpat.typeident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ParamConstrPat)
    {
       ABS.Absyn.ParamConstrPat _paramconstrpat = (ABS.Absyn.ParamConstrPat) foo;
       render("(");
       render("ParamConstrPat");
       sh(_paramconstrpat.typeident_);
       render("[");
       sh(_paramconstrpat.listpattern_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.UnderscorePat)
    {
       ABS.Absyn.UnderscorePat _underscorepat = (ABS.Absyn.UnderscorePat) foo;
       render("UnderscorePat");
    }
  }

  private static void sh(ABS.Absyn.Literal foo)
  {
    if (foo instanceof ABS.Absyn.LNull)
    {
       ABS.Absyn.LNull _lnull = (ABS.Absyn.LNull) foo;
       render("LNull");
    }
    if (foo instanceof ABS.Absyn.LThis)
    {
       ABS.Absyn.LThis _lthis = (ABS.Absyn.LThis) foo;
       render("LThis");
    }
    if (foo instanceof ABS.Absyn.LThisDC)
    {
       ABS.Absyn.LThisDC _lthisdc = (ABS.Absyn.LThisDC) foo;
       render("LThisDC");
    }
    if (foo instanceof ABS.Absyn.LStr)
    {
       ABS.Absyn.LStr _lstr = (ABS.Absyn.LStr) foo;
       render("(");
       render("LStr");
       sh(_lstr.string_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.LInt)
    {
       ABS.Absyn.LInt _lint = (ABS.Absyn.LInt) foo;
       render("(");
       render("LInt");
       sh(_lint.integer_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.EffExp foo)
  {
    if (foo instanceof ABS.Absyn.New)
    {
       ABS.Absyn.New _new = (ABS.Absyn.New) foo;
       render("(");
       render("New");
       sh(_new.type_);
       render("[");
       sh(_new.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.NewLocal)
    {
       ABS.Absyn.NewLocal _newlocal = (ABS.Absyn.NewLocal) foo;
       render("(");
       render("NewLocal");
       sh(_newlocal.type_);
       render("[");
       sh(_newlocal.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.SyncMethCall)
    {
       ABS.Absyn.SyncMethCall _syncmethcall = (ABS.Absyn.SyncMethCall) foo;
       render("(");
       render("SyncMethCall");
       sh(_syncmethcall.pureexp_);
       sh(_syncmethcall.ident_);
       render("[");
       sh(_syncmethcall.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ThisSyncMethCall)
    {
       ABS.Absyn.ThisSyncMethCall _thissyncmethcall = (ABS.Absyn.ThisSyncMethCall) foo;
       render("(");
       render("ThisSyncMethCall");
       sh(_thissyncmethcall.ident_);
       render("[");
       sh(_thissyncmethcall.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.AsyncMethCall)
    {
       ABS.Absyn.AsyncMethCall _asyncmethcall = (ABS.Absyn.AsyncMethCall) foo;
       render("(");
       render("AsyncMethCall");
       sh(_asyncmethcall.pureexp_);
       sh(_asyncmethcall.ident_);
       render("[");
       sh(_asyncmethcall.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ThisAsyncMethCall)
    {
       ABS.Absyn.ThisAsyncMethCall _thisasyncmethcall = (ABS.Absyn.ThisAsyncMethCall) foo;
       render("(");
       render("ThisAsyncMethCall");
       sh(_thisasyncmethcall.ident_);
       render("[");
       sh(_thisasyncmethcall.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.Get)
    {
       ABS.Absyn.Get _get = (ABS.Absyn.Get) foo;
       render("(");
       render("Get");
       sh(_get.pureexp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.Spawns)
    {
       ABS.Absyn.Spawns _spawns = (ABS.Absyn.Spawns) foo;
       render("(");
       render("Spawns");
       sh(_spawns.pureexp_);
       sh(_spawns.type_);
       render("[");
       sh(_spawns.listpureexp_);
       render("]");
       render(")");
    }
  }


  private static void pp(Integer n, int _i_) { buf_.append(n); buf_.append(" "); }
  private static void pp(Double d, int _i_) { buf_.append(d); buf_.append(" "); }
  private static void pp(String s, int _i_) { buf_.append(s); buf_.append(" "); }
  private static void pp(Character c, int _i_) { buf_.append("'" + c.toString() + "'"); buf_.append(" "); }
  private static void sh(Integer n) { render(n.toString()); }
  private static void sh(Double d) { render(d.toString()); }
  private static void sh(Character c) { render(c.toString()); }
  private static void sh(String s) { printQuoted(s); }
  private static void printQuoted(String s) { render("\"" + s + "\""); }
  private static void indent()
  {
    int n = _n_;
    while (n > 0)
    {
      buf_.append(" ");
      n--;
    }
  }
  private static void backup()
  {
     if (buf_.charAt(buf_.length() - 1) == ' ') {
      buf_.setLength(buf_.length() - 1);
    }
  }
  private static void trim()
  {
     while (buf_.length() > 0 && buf_.charAt(0) == ' ')
        buf_.deleteCharAt(0); 
    while (buf_.length() > 0 && buf_.charAt(buf_.length()-1) == ' ')
        buf_.deleteCharAt(buf_.length()-1);
  }
  private static int _n_ = 0;
  private static StringBuilder buf_ = new StringBuilder(INITIAL_BUFFER_SIZE);
}
