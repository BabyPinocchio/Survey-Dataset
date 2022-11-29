import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Coverage Results: 
 *     BRANCH COVERAGE: 0.000
 *     INSTRUCTION COVERAGE: 0.100
 *     LINE COVERAGE: 0.250
 * Top 2 Methods Under Test: 
 *     None
 * Common Assertions: 
 *     None
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroupWithSummary0 {

    public static boolean debug = false;


/** Assertions: 
 *     1. Declares a new `int` object whose value is TokenId.IF. And checks the `int` object int0 is equal to 320.
 */
@Test
public void test01() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test01");
    int int0 = javassist.compiler.TokenId.IF;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 320 + "'", int0 == 320);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is TokenId.LONG. And checks the `int` object int0 is equal to 326.
 */
@Test
public void test02() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test02");
    int int0 = javassist.compiler.TokenId.LONG;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 326 + "'", int0 == 326);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is TokenId.VOID. And checks the `int` object int0 is equal to 344.
 */
@Test
public void test04() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test05");
    int int0 = javassist.compiler.TokenId.VOID;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 344 + "'", int0 == 344);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is TokenId.CLASS. And checks the `int` object int0 is equal to 307.
 */
@Test
public void test05() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test06");
    int int0 = javassist.compiler.TokenId.CLASS;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 307 + "'", int0 == 307);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is TokenId.CASE. And checks the `int` object int0 is equal to 304.
 */
@Test
public void test07() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test07");
    int int0 = javassist.compiler.TokenId.CASE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 304 + "'", int0 == 304);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is TokenId.INTERFACE. And checks the `int` object int0 is equal to 325.
 */
@Test
public void test08() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test08");
    int int0 = javassist.compiler.TokenId.INTERFACE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 325 + "'", int0 == 325);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is TokenId.EXPR. And checks the `int` object int0 is equal to 69.
 */
@Test
public void test10() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test10");
    int int0 = javassist.compiler.TokenId.EXPR;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 69 + "'", int0 == 69);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is TokenId.EXOR_E. And checks the `int` object int0 is equal to 360.
 */
@Test
public void test11() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test11");
    int int0 = javassist.compiler.TokenId.EXOR_E;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 360 + "'", int0 == 360);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is TokenId.BadToken. And checks the `int` object int0 is equal to 500.
 */
@Test
public void test15() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test15");
    int int0 = javassist.compiler.TokenId.BadToken;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 500 + "'", int0 == 500);
}
}
