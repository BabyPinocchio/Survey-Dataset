import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Coverage Results: 
 *     BRANCH COVERAGE: 0.000
 *     INSTRUCTION COVERAGE: 0.100
 *     LINE COVERAGE: 0.250
 * Top 2 Methods Under Test: 
 *     append
 *     make
 * Common Assertions: 
 *     1. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList6 is not null.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroupWithSummary1 {

    public static boolean debug = false;


/** Assertions: 
 *     1. Declares a new `ASTList` object by calling the method on a `ASTList` object which concatenates with parameters of two `ASTList` objects. And checks the `ASTList` object aSTList3 is null.
 */
@Test
public void test03() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test03");
    javassist.compiler.ast.ASTList aSTList1 = null;
    javassist.compiler.ast.ASTList aSTList2 = null;
    javassist.compiler.ast.ASTList aSTList3 = javassist.compiler.ast.ASTList.concat(aSTList1, aSTList2);
    javassist.compiler.ast.ASTList aSTList4 = null;
    javassist.compiler.ast.ASTree aSTree5 = null;
    javassist.compiler.ast.ASTList aSTList6 = javassist.compiler.ast.ASTList.append(aSTList4, aSTree5);
    org.junit.Assert.assertNull(aSTList3);
    org.junit.Assert.assertNotNull(aSTList6);
}

/** Assertions: 
 *     1. Declares a new `ASTree` object which gets left of a `ASTList` object. And checks the `ASTree` object aSTree8 is null.
 *     2. Declares a new `Expr` object by calling the method on a `Expr` object which makes with parameters of two `ASTree` objects, 326. And checks the `Expr` object expr7 is not null.
 *     3. Declares a new `ASTree` object which gets left of a `ASTList` object. And checks the `ASTList` object aSTList3 is not null.
 */
@Test
public void test06() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test04");
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

/** Assertions: 
 *     1. Calls the method on a `ASTList` object which gets the set right with parameter of a `ASTree` object. And checks the `ASTList` object aSTList3 is not null.
 *     2. Declares a new `ASTree` object which gets the head of a `Expr` object. And checks the `Expr` object expr25 is not null.
 *     3. Declares a new `ASTree` object which gets the head of a `Expr` object. And checks the `ASTree` object aSTree16 is not null.
 *     4. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList11 is not null.
 *     5. Calls the method on a `Expr` object which sets oprand 1 with parameter of a `ASTree` object. And checks the `Expr` object expr15 is not null.
 *     6. Declares a new `Expr` object by calling the method on a `Expr` object which makes with parameters of two `ASTree` objects, and 326. And checks the `Expr` object expr7 is not null.
 *     7. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList14 is not null.
 *     8. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList24 is not null.
 *     9. Calls the method on a `Expr` object which sets oprand 1 with parameter of a `ASTree` object. And checks the `ASTree` object aSTree26 is not null.
 *     10. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList21 is not null.
 */
@Test
public void test09() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test09");
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

/** Assertions: 
 *     1. Calls the method on a `ASTList` object which gets the set right with parameter of a `ASTree` object. And checks the `ASTList` object aSTList3 is not null.
 *     2. Declares a new `ASTree` object which gets the head of a `Expr` object. And checks the `ASTree` object aSTree16 is not null.
 *     3. Declares a new `ASTree` object which gets the oprand of a `Expr` object. And checks the `Expr` object expr15 is not null.
 *     4. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList11 is not null.
 *     5. Declares a new `Expr` object by calling the method on a `Expr` object which makes with parameters of two `ASTree` objects, and 326. And checks the `Expr` object expr7 is not null.
 *     6. Declares a new `ASTree` object which gets the oprand of a `Expr` object. And checks the `ASTree` object aSTree18 is not null.
 *     7. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList14 is not null.
 */
@Test
public void test12() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test12");
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

/** Assertions: 
 *     1. Calls the method on a `ASTList` object which gets the set right with parameter of a `ASTree` object. And checks the `Expr` object expr34 is not null.
 *     2. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList11 is not null.
 *     3. Declares a new `Expr` object by calling the method on a `Expr` object which makes with parameters of two `ASTree` objects, and 326. And checks the `Expr` object expr26 is not null.
 *     4. Declares a new `ASTList` object which gets the tail of a `ASTList` object. And checks the `ASTList` object aSTList37 is not null.
 *     5. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList14 is not null.
 *     6. Declares a new `ASTree` object which gets the head of a `Expr` object. And checks the `ASTree` object aSTree35 is not null.
 *     7. Declares a new `ASTree` object which gets the head of a `Expr` object. And checks the `ASTree` object aSTree16 is not null.
 *     8. Calls the method on a `ASTList` object which gets the set head with parameter of a `ASTree` object. And checks the `ASTList` object aSTList3 is not null.
 *     9. Declares a new `ASTList` object which gets the tail of a `ASTList` object. And checks the `ASTList` object aSTList18 is not null.
 *     10. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList25 is not null.
 *     11. Declares a new `Expr` object by calling the method on a `Expr` object which makes with parameters of two `ASTree` objects, and 326. And checks the `Expr` object expr7 is not null.
 *     12. Calls the method on a `ASTList` object which gets the set right with parameter of a `ASTree` object. And checks the `Expr` object expr15 is not null.
 *     13. Calls the method on a `ASTList` object which gets the set head with parameter of a `ASTree` object. And checks the `ASTList` object aSTList22 is not null.
 *     14. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList33 is not null.
 *     15. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList30 is not null.
 */
@Test
public void test13() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test13");
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

/** Assertions: 
 *     1. Calls the method on a `ASTList` object which gets the set right with parameter of a `ASTree` object. And checks the `ASTList` object aSTList3 is not null.
 *     2. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList42 is not null.
 *     3. Declares a new `ASTree` object which gets the head of a `Expr` object. And checks the `ASTree` object aSTree34 is not null.
 *     4. Calls the method on a `Expr` object which sets left with parameter of a `ASTree` object. And checks the `Expr` object expr15 is not null.
 *     5. Declares a new `Expr` object by calling the method on a `Expr` object which makes with parameters of two `ASTree` objects, and 326. And checks the `Expr` object expr43 is not null.
 *     6. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList11 is not null.
 *     7. Calls the method on a `Expr` object which sets oprand 1 with parameter of a `ASTree` object. And checks the `Expr` object expr33 is not null.
 *     8. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList14 is not null.
 *     9. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList24 is not null.
 *     10. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList32 is not null.
 *     11. Declares a new `Expr` object by calling the method on a `Expr` object which makes with parameters of two `ASTree` objects, and 326. And checks the `Expr` object expr25 is not null.
 *     12. Declares a new `ASTree` object which gets the head of a `Expr` object. And checks the `ASTree` object aSTree16 is not null.
 *     13. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList29 is not null.
 *     14. Declares a new `ASTList` object by calling the method on a `ASTList` object which appends with parameters of a `ASTree` object, and a `ASTList` object. And checks the `ASTList` object aSTList39 is not null.
 *     15. Declares a new `Expr` object by calling the method on a `Expr` object which makes with parameters of two `ASTree` objects, and 326. And checks the `Expr` object expr7 is not null.
 *     16. Calls the method on a `ASTList` object which gets the set right with parameter of a `ASTree` object. And checks the `ASTList` object aSTList21 is not null.
 */
@Test
public void test14() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test14");
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
}
