import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Coverage Results: 
 *     BRANCH COVERAGE: 0.625
 *     INSTRUCTION COVERAGE: 0.388
 *     LINE COVERAGE: 0.333
 * Top 2 Methods Under Test: 
 *     isPackage
 *     isPrivate
 * Common Assertions: 
 *     None
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroupWithSummary2 {

    public static boolean debug = false;


/** Assertions: 
 *     1. Declares a new `boolean` object by calling the method on a `AccessFlag` object which is private with parameter of 128. And checks the `boolean` object boolean1 is equal to false.
 */
@Test
public void test07() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test07");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPrivate(128);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}

/** Assertions: 
 *     1. Declares a new `boolean` object by calling the method on a `AccessFlag` object which is public with parameter of 0. And checks the `boolean` object boolean1 is equal to false.
 */
@Test
public void test10() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test10");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPublic((int) (byte) 0);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}

/** Assertions: 
 *     1. Declares a new `boolean` object by calling the method on a `AccessFlag` object which is private with parameter of 4096. And checks the `boolean` object boolean1 is equal to false.
 */
@Test
public void test38() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test38");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPrivate(4096);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}

/** Assertions: 
 *     1. Declares a new `boolean` object by calling the method on a `AccessFlag` object which is public with parameter of 8192. And checks the `boolean` object boolean1 is equal to false.
 */
@Test
public void test39() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test39");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPublic(8192);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}

/** Assertions: 
 *     1. Declares a new `boolean` object by calling the method on a `AccessFlag` object which is package with parameter of 1028. And checks the `boolean` object boolean1 is equal to false.
 */
@Test
public void test41() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test41");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPackage(1028);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}

/** Assertions: 
 *     1. Declares a new `boolean` object by calling the method on a `AccessFlag` object which is protected with parameter of 0. And checks the `boolean` object boolean1 is equal to false.
 */
@Test
public void test42() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test42");
    boolean boolean1 = javassist.bytecode.AccessFlag.isProtected((int) (short) 0);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}

/** Assertions: 
 *     1. Declares a new `boolean` object by calling the method on a `AccessFlag` object which is private with parameter of 0. And checks the `boolean` object boolean1 is equal to false.
 */
@Test
public void test43() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test43");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPrivate(0);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}

/** Assertions: 
 *     1. Declares a new `boolean` object by calling the method on a `AccessFlag` object which is package with parameter of 10. And checks the `boolean` object boolean1 is equal to false.
 */
@Test
public void test44() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test44");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPackage((int) (short) 10);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}

/** Assertions: 
 *     1. Declares a new `boolean` object by calling the method on a `AccessFlag` object which is package with parameter of 'a'. And checks the `boolean` object boolean1 is equal to false.
 */
@Test
public void test46() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test46");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPackage((int) 'a');
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}

/** Assertions: 
 *     1. Declares a new `boolean` object by calling the method on a `AccessFlag` object which is package with parameter of 8. And checks the `boolean` object boolean1 is equal to true.
 */
@Test
public void test53() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test53");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPackage(8);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
}
}
