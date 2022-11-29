import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        int int0 = javassist.compiler.TokenId.IF;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 320 + "'", int0 == 320);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = javassist.compiler.TokenId.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 326 + "'", int0 == 326);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        javassist.compiler.ast.ASTList aSTList0 = null;
        javassist.compiler.ast.ASTList aSTList1 = null;
        javassist.compiler.ast.ASTList aSTList2 = javassist.compiler.ast.ASTList.concat(aSTList0, aSTList1);
        org.junit.Assert.assertNull(aSTList2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int0 = javassist.compiler.TokenId.GOTO;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 319 + "'", int0 == 319);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int int0 = javassist.compiler.TokenId.VOID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 344 + "'", int0 == 344);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int0 = javassist.compiler.TokenId.CLASS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 307 + "'", int0 == 307);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        int int0 = javassist.compiler.TokenId.CASE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 304 + "'", int0 == 304);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int0 = javassist.compiler.TokenId.INTERFACE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 325 + "'", int0 == 325);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        int int0 = javassist.compiler.TokenId.MINUS_E;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 355 + "'", int0 == 355);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        int int0 = javassist.compiler.TokenId.LABEL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 76 + "'", int0 == 76);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        int int0 = javassist.compiler.TokenId.WHILE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 346 + "'", int0 == 346);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        int int0 = javassist.compiler.TokenId.RSHIFT_E;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 367 + "'", int0 == 367);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        int int0 = javassist.compiler.TokenId.NATIVE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 327 + "'", int0 == 327);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        int int0 = javassist.compiler.TokenId.THIS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 339 + "'", int0 == 339);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        int int0 = javassist.compiler.TokenId.FloatConstant;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 404 + "'", int0 == 404);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        int int0 = javassist.compiler.TokenId.FINALLY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 316 + "'", int0 == 316);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        int int0 = javassist.compiler.TokenId.FLOAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 317 + "'", int0 == 317);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        int int0 = javassist.compiler.TokenId.ELSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 313 + "'", int0 == 313);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        int int0 = javassist.compiler.TokenId.CHAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 306 + "'", int0 == 306);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        int int0 = javassist.compiler.TokenId.CONTINUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 309 + "'", int0 == 309);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        javassist.compiler.ast.ASTList aSTList1 = null;
        javassist.compiler.ast.ASTree aSTree2 = null;
        javassist.compiler.ast.ASTList aSTList3 = javassist.compiler.ast.ASTList.append(aSTList1, aSTree2);
        javassist.compiler.ast.ASTList aSTList4 = null;
        javassist.compiler.ast.ASTree aSTree5 = null;
        javassist.compiler.ast.ASTList aSTList6 = javassist.compiler.ast.ASTList.append(aSTList4, aSTree5);
        javassist.compiler.ast.Expr expr7 = javassist.compiler.ast.Expr.make(326, (javassist.compiler.ast.ASTree) aSTList3, aSTree5);
        javassist.compiler.ast.ASTree aSTree8 = aSTList3.getLeft();
        org.junit.Assert.assertNotNull(aSTList3);
        org.junit.Assert.assertNotNull(aSTList6);
        org.junit.Assert.assertNotNull(expr7);
        org.junit.Assert.assertNull(aSTree8);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        javassist.compiler.ast.ASTList aSTList1 = null;
        javassist.compiler.ast.ASTree aSTree2 = null;
        javassist.compiler.ast.ASTList aSTList3 = javassist.compiler.ast.ASTList.append(aSTList1, aSTree2);
        javassist.compiler.ast.ASTList aSTList4 = null;
        javassist.compiler.ast.ASTree aSTree5 = null;
        javassist.compiler.ast.ASTList aSTList6 = javassist.compiler.ast.ASTList.append(aSTList4, aSTree5);
        javassist.compiler.ast.Expr expr7 = javassist.compiler.ast.Expr.make(326, (javassist.compiler.ast.ASTree) aSTList3, aSTree5);
        javassist.compiler.ast.ASTList aSTList9 = null;
        javassist.compiler.ast.ASTree aSTree10 = null;
        javassist.compiler.ast.ASTList aSTList11 = javassist.compiler.ast.ASTList.append(aSTList9, aSTree10);
        javassist.compiler.ast.ASTList aSTList12 = null;
        javassist.compiler.ast.ASTree aSTree13 = null;
        javassist.compiler.ast.ASTList aSTList14 = javassist.compiler.ast.ASTList.append(aSTList12, aSTree13);
        javassist.compiler.ast.Expr expr15 = javassist.compiler.ast.Expr.make(326, (javassist.compiler.ast.ASTree) aSTList11, aSTree13);
        javassist.compiler.ast.ASTree aSTree16 = expr15.head();
        aSTList3.setRight((javassist.compiler.ast.ASTree) expr15);
        javassist.compiler.ast.ASTList aSTList19 = null;
        javassist.compiler.ast.ASTree aSTree20 = null;
        javassist.compiler.ast.ASTList aSTList21 = javassist.compiler.ast.ASTList.append(aSTList19, aSTree20);
        javassist.compiler.ast.ASTList aSTList22 = null;
        javassist.compiler.ast.ASTree aSTree23 = null;
        javassist.compiler.ast.ASTList aSTList24 = javassist.compiler.ast.ASTList.append(aSTList22, aSTree23);
        javassist.compiler.ast.Expr expr25 = javassist.compiler.ast.Expr.make(326, (javassist.compiler.ast.ASTree) aSTList21, aSTree23);
        javassist.compiler.ast.ASTree aSTree26 = expr25.head();
        expr15.setOprand1(aSTree26);
        org.junit.Assert.assertNotNull(aSTList3);
        org.junit.Assert.assertNotNull(aSTList6);
        org.junit.Assert.assertNotNull(expr7);
        org.junit.Assert.assertNotNull(aSTList11);
        org.junit.Assert.assertNotNull(aSTList14);
        org.junit.Assert.assertNotNull(expr15);
        org.junit.Assert.assertNotNull(aSTree16);
        org.junit.Assert.assertNotNull(aSTList21);
        org.junit.Assert.assertNotNull(aSTList24);
        org.junit.Assert.assertNotNull(expr25);
        org.junit.Assert.assertNotNull(aSTree26);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        int int0 = javassist.compiler.TokenId.EXPR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 69 + "'", int0 == 69);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        int int0 = javassist.compiler.TokenId.EXOR_E;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 360 + "'", int0 == 360);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        int int0 = javassist.compiler.TokenId.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 334 + "'", int0 == 334);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        int int0 = javassist.compiler.TokenId.MINUSMINUS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 363 + "'", int0 == 363);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        javassist.compiler.ast.ASTList aSTList1 = null;
        javassist.compiler.ast.ASTree aSTree2 = null;
        javassist.compiler.ast.ASTList aSTList3 = javassist.compiler.ast.ASTList.append(aSTList1, aSTree2);
        javassist.compiler.ast.ASTList aSTList4 = null;
        javassist.compiler.ast.ASTree aSTree5 = null;
        javassist.compiler.ast.ASTList aSTList6 = javassist.compiler.ast.ASTList.append(aSTList4, aSTree5);
        javassist.compiler.ast.Expr expr7 = javassist.compiler.ast.Expr.make(326, (javassist.compiler.ast.ASTree) aSTList3, aSTree5);
        javassist.compiler.ast.ASTList aSTList9 = null;
        javassist.compiler.ast.ASTree aSTree10 = null;
        javassist.compiler.ast.ASTList aSTList11 = javassist.compiler.ast.ASTList.append(aSTList9, aSTree10);
        javassist.compiler.ast.ASTList aSTList12 = null;
        javassist.compiler.ast.ASTree aSTree13 = null;
        javassist.compiler.ast.ASTList aSTList14 = javassist.compiler.ast.ASTList.append(aSTList12, aSTree13);
        javassist.compiler.ast.Expr expr15 = javassist.compiler.ast.Expr.make(326, (javassist.compiler.ast.ASTree) aSTList11, aSTree13);
        javassist.compiler.ast.ASTree aSTree16 = expr15.head();
        aSTList3.setRight((javassist.compiler.ast.ASTree) expr15);
        javassist.compiler.ast.ASTree aSTree18 = expr15.oprand1();
        org.junit.Assert.assertNotNull(aSTList3);
        org.junit.Assert.assertNotNull(aSTList6);
        org.junit.Assert.assertNotNull(expr7);
        org.junit.Assert.assertNotNull(aSTList11);
        org.junit.Assert.assertNotNull(aSTList14);
        org.junit.Assert.assertNotNull(expr15);
        org.junit.Assert.assertNotNull(aSTree16);
        org.junit.Assert.assertNotNull(aSTree18);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        int int0 = javassist.compiler.TokenId.PUBLIC;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 332 + "'", int0 == 332);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        javassist.compiler.ast.ASTList aSTList1 = null;
        javassist.compiler.ast.ASTree aSTree2 = null;
        javassist.compiler.ast.ASTList aSTList3 = javassist.compiler.ast.ASTList.append(aSTList1, aSTree2);
        javassist.compiler.ast.ASTList aSTList4 = null;
        javassist.compiler.ast.ASTree aSTree5 = null;
        javassist.compiler.ast.ASTList aSTList6 = javassist.compiler.ast.ASTList.append(aSTList4, aSTree5);
        javassist.compiler.ast.Expr expr7 = javassist.compiler.ast.Expr.make(326, (javassist.compiler.ast.ASTree) aSTList3, aSTree5);
        javassist.compiler.ast.ASTList aSTList9 = null;
        javassist.compiler.ast.ASTree aSTree10 = null;
        javassist.compiler.ast.ASTList aSTList11 = javassist.compiler.ast.ASTList.append(aSTList9, aSTree10);
        javassist.compiler.ast.ASTList aSTList12 = null;
        javassist.compiler.ast.ASTree aSTree13 = null;
        javassist.compiler.ast.ASTList aSTList14 = javassist.compiler.ast.ASTList.append(aSTList12, aSTree13);
        javassist.compiler.ast.Expr expr15 = javassist.compiler.ast.Expr.make(326, (javassist.compiler.ast.ASTree) aSTList11, aSTree13);
        javassist.compiler.ast.ASTree aSTree16 = expr15.head();
        aSTList3.setRight((javassist.compiler.ast.ASTree) expr15);
        javassist.compiler.ast.ASTList aSTList18 = aSTList3.tail();
        javassist.compiler.ast.ASTList aSTList20 = null;
        javassist.compiler.ast.ASTree aSTree21 = null;
        javassist.compiler.ast.ASTList aSTList22 = javassist.compiler.ast.ASTList.append(aSTList20, aSTree21);
        javassist.compiler.ast.ASTList aSTList23 = null;
        javassist.compiler.ast.ASTree aSTree24 = null;
        javassist.compiler.ast.ASTList aSTList25 = javassist.compiler.ast.ASTList.append(aSTList23, aSTree24);
        javassist.compiler.ast.Expr expr26 = javassist.compiler.ast.Expr.make(326, (javassist.compiler.ast.ASTree) aSTList22, aSTree24);
        javassist.compiler.ast.ASTList aSTList28 = null;
        javassist.compiler.ast.ASTree aSTree29 = null;
        javassist.compiler.ast.ASTList aSTList30 = javassist.compiler.ast.ASTList.append(aSTList28, aSTree29);
        javassist.compiler.ast.ASTList aSTList31 = null;
        javassist.compiler.ast.ASTree aSTree32 = null;
        javassist.compiler.ast.ASTList aSTList33 = javassist.compiler.ast.ASTList.append(aSTList31, aSTree32);
        javassist.compiler.ast.Expr expr34 = javassist.compiler.ast.Expr.make(326, (javassist.compiler.ast.ASTree) aSTList30, aSTree32);
        javassist.compiler.ast.ASTree aSTree35 = expr34.head();
        aSTList22.setRight((javassist.compiler.ast.ASTree) expr34);
        javassist.compiler.ast.ASTList aSTList37 = aSTList22.tail();
        aSTList3.setHead((javassist.compiler.ast.ASTree) aSTList22);
        org.junit.Assert.assertNotNull(aSTList3);
        org.junit.Assert.assertNotNull(aSTList6);
        org.junit.Assert.assertNotNull(expr7);
        org.junit.Assert.assertNotNull(aSTList11);
        org.junit.Assert.assertNotNull(aSTList14);
        org.junit.Assert.assertNotNull(expr15);
        org.junit.Assert.assertNotNull(aSTree16);
        org.junit.Assert.assertNotNull(aSTList18);
        org.junit.Assert.assertNotNull(aSTList22);
        org.junit.Assert.assertNotNull(aSTList25);
        org.junit.Assert.assertNotNull(expr26);
        org.junit.Assert.assertNotNull(aSTList30);
        org.junit.Assert.assertNotNull(aSTList33);
        org.junit.Assert.assertNotNull(expr34);
        org.junit.Assert.assertNotNull(aSTree35);
        org.junit.Assert.assertNotNull(aSTList37);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        int int0 = javassist.compiler.TokenId.DO;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 311 + "'", int0 == 311);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        int int0 = javassist.compiler.TokenId.PACKAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 329 + "'", int0 == 329);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        int int0 = javassist.compiler.TokenId.PLUS_E;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 354 + "'", int0 == 354);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        int int0 = javassist.compiler.TokenId.PROTECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 331 + "'", int0 == 331);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        int int0 = javassist.compiler.TokenId.VOLATILE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 345 + "'", int0 == 345);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        int int0 = javassist.compiler.TokenId.IMPORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 322 + "'", int0 == 322);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        int int0 = javassist.compiler.TokenId.IMPLEMENTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 321 + "'", int0 == 321);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        javassist.compiler.ast.ASTList aSTList1 = null;
        javassist.compiler.ast.ASTree aSTree2 = null;
        javassist.compiler.ast.ASTList aSTList3 = javassist.compiler.ast.ASTList.append(aSTList1, aSTree2);
        javassist.compiler.ast.ASTList aSTList4 = null;
        javassist.compiler.ast.ASTree aSTree5 = null;
        javassist.compiler.ast.ASTList aSTList6 = javassist.compiler.ast.ASTList.append(aSTList4, aSTree5);
        javassist.compiler.ast.Expr expr7 = javassist.compiler.ast.Expr.make(326, (javassist.compiler.ast.ASTree) aSTList3, aSTree5);
        javassist.compiler.ast.ASTList aSTList9 = null;
        javassist.compiler.ast.ASTree aSTree10 = null;
        javassist.compiler.ast.ASTList aSTList11 = javassist.compiler.ast.ASTList.append(aSTList9, aSTree10);
        javassist.compiler.ast.ASTList aSTList12 = null;
        javassist.compiler.ast.ASTree aSTree13 = null;
        javassist.compiler.ast.ASTList aSTList14 = javassist.compiler.ast.ASTList.append(aSTList12, aSTree13);
        javassist.compiler.ast.Expr expr15 = javassist.compiler.ast.Expr.make(326, (javassist.compiler.ast.ASTree) aSTList11, aSTree13);
        javassist.compiler.ast.ASTree aSTree16 = expr15.head();
        aSTList3.setRight((javassist.compiler.ast.ASTree) expr15);
        javassist.compiler.ast.ASTList aSTList19 = null;
        javassist.compiler.ast.ASTree aSTree20 = null;
        javassist.compiler.ast.ASTList aSTList21 = javassist.compiler.ast.ASTList.append(aSTList19, aSTree20);
        javassist.compiler.ast.ASTList aSTList22 = null;
        javassist.compiler.ast.ASTree aSTree23 = null;
        javassist.compiler.ast.ASTList aSTList24 = javassist.compiler.ast.ASTList.append(aSTList22, aSTree23);
        javassist.compiler.ast.Expr expr25 = javassist.compiler.ast.Expr.make(326, (javassist.compiler.ast.ASTree) aSTList21, aSTree23);
        javassist.compiler.ast.ASTList aSTList27 = null;
        javassist.compiler.ast.ASTree aSTree28 = null;
        javassist.compiler.ast.ASTList aSTList29 = javassist.compiler.ast.ASTList.append(aSTList27, aSTree28);
        javassist.compiler.ast.ASTList aSTList30 = null;
        javassist.compiler.ast.ASTree aSTree31 = null;
        javassist.compiler.ast.ASTList aSTList32 = javassist.compiler.ast.ASTList.append(aSTList30, aSTree31);
        javassist.compiler.ast.Expr expr33 = javassist.compiler.ast.Expr.make(326, (javassist.compiler.ast.ASTree) aSTList29, aSTree31);
        javassist.compiler.ast.ASTree aSTree34 = expr33.head();
        aSTList21.setRight((javassist.compiler.ast.ASTree) expr33);
        javassist.compiler.ast.ASTList aSTList37 = null;
        javassist.compiler.ast.ASTree aSTree38 = null;
        javassist.compiler.ast.ASTList aSTList39 = javassist.compiler.ast.ASTList.append(aSTList37, aSTree38);
        javassist.compiler.ast.ASTList aSTList40 = null;
        javassist.compiler.ast.ASTree aSTree41 = null;
        javassist.compiler.ast.ASTList aSTList42 = javassist.compiler.ast.ASTList.append(aSTList40, aSTree41);
        javassist.compiler.ast.Expr expr43 = javassist.compiler.ast.Expr.make(326, (javassist.compiler.ast.ASTree) aSTList39, aSTree41);
        expr33.setOprand1(aSTree41);
        expr15.setLeft(aSTree41);
        org.junit.Assert.assertNotNull(aSTList3);
        org.junit.Assert.assertNotNull(aSTList6);
        org.junit.Assert.assertNotNull(expr7);
        org.junit.Assert.assertNotNull(aSTList11);
        org.junit.Assert.assertNotNull(aSTList14);
        org.junit.Assert.assertNotNull(expr15);
        org.junit.Assert.assertNotNull(aSTree16);
        org.junit.Assert.assertNotNull(aSTList21);
        org.junit.Assert.assertNotNull(aSTList24);
        org.junit.Assert.assertNotNull(expr25);
        org.junit.Assert.assertNotNull(aSTList29);
        org.junit.Assert.assertNotNull(aSTList32);
        org.junit.Assert.assertNotNull(expr33);
        org.junit.Assert.assertNotNull(aSTree34);
        org.junit.Assert.assertNotNull(aSTList39);
        org.junit.Assert.assertNotNull(aSTList42);
        org.junit.Assert.assertNotNull(expr43);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        int int0 = javassist.compiler.TokenId.BadToken;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 500 + "'", int0 == 500);
    }
}
