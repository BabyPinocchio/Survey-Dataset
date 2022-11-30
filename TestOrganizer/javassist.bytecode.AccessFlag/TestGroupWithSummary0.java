import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Coverage Results: 
 *     BRANCH COVERAGE: 0.000
 *     INSTRUCTION COVERAGE: 0.000
 *     LINE COVERAGE: 0.000
 * Top 2 Methods Under Test: 
 *     setProtected
 *     setPublic
 * Common Assertions: 
 *     None
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroupWithSummary0 {

    public static boolean debug = false;


/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.SYNTHETIC. And checks the `int` object int0 is equal to 4096.
 */
@Test
public void test01() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test01");
    int int0 = javassist.bytecode.AccessFlag.SYNTHETIC;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which sets package with parameter of 4096. And checks the `int` object int1 is equal to 4096.
 */
@Test
public void test02() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test02");
    int int1 = javassist.bytecode.AccessFlag.setPackage(4096);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4096 + "'", int1 == 4096);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.ABSTRACT. And checks the `int` object int0 is equal to 1024.
 */
@Test
public void test03() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test03");
    int int0 = javassist.bytecode.AccessFlag.ABSTRACT;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.TRANSIENT. And checks the `int` object int0 is equal to 128.
 */
@Test
public void test04() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test04");
    int int0 = javassist.bytecode.AccessFlag.TRANSIENT;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.FINAL. And checks the `int` object int0 is equal to 16.
 */
@Test
public void test05() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test05");
    int int0 = javassist.bytecode.AccessFlag.FINAL;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.PRIVATE. And checks the `int` object int0 is equal to 2.
 */
@Test
public void test06() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test06");
    int int0 = javassist.bytecode.AccessFlag.PRIVATE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.SUPER. And checks the `int` object int0 is equal to 32.
 */
@Test
public void test08() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test08");
    int int0 = javassist.bytecode.AccessFlag.SUPER;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.INTERFACE. And checks the `int` object int0 is equal to 512.
 */
@Test
public void test09() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test09");
    int int0 = javassist.bytecode.AccessFlag.INTERFACE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 512 + "'", int0 == 512);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.BRIDGE. And checks the `int` object int0 is equal to 64.
 */
@Test
public void test11() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test11");
    int int0 = javassist.bytecode.AccessFlag.BRIDGE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which returns the modifier of 2. And checks the `int` object int1 is equal to 2.
 */
@Test
public void test12() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test12");
    int int1 = javassist.bytecode.AccessFlag.toModifier(2);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.MANDATED. And checks the `int` object int0 is equal to 32768.
 */
@Test
public void test13() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test13");
    int int0 = javassist.bytecode.AccessFlag.MANDATED;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32768 + "'", int0 == 32768);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.VARARGS. And checks the `int` object int0 is equal to 128.
 */
@Test
public void test14() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test14");
    int int0 = javassist.bytecode.AccessFlag.VARARGS;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which gets the set protected with parameter of 128. And checks the `int` object int1 is equal to 132.
 */
@Test
public void test15() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test15");
    int int1 = javassist.bytecode.AccessFlag.setProtected(128);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 132 + "'", int1 == 132);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which gets the clear with parameters of 10, 10. And checks the `int` object int2 is equal to 0.
 */
@Test
public void test16() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test16");
    int int2 = javassist.bytecode.AccessFlag.clear(10, 10);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.ANNOTATION. And checks the `int` object int0 is equal to 8192.
 */
@Test
public void test17() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test17");
    int int0 = javassist.bytecode.AccessFlag.ANNOTATION;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8192 + "'", int0 == 8192);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.SYNCHRONIZED. And checks the `int` object int0 is equal to 32.
 */
@Test
public void test18() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test18");
    int int0 = javassist.bytecode.AccessFlag.SYNCHRONIZED;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which sets public with parameter of '4'. And checks the `int` object int1 is equal to 49.
 */
@Test
public void test19() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test19");
    int int1 = javassist.bytecode.AccessFlag.setPublic((int) '4');
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which returns the of ' '. And checks the `int` object int1 is equal to 32.
 */
@Test
public void test20() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test20");
    int int1 = javassist.bytecode.AccessFlag.of((int) ' ');
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.STATIC. And checks the `int` object int0 is equal to 8.
 */
@Test
public void test22() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test22");
    int int0 = javassist.bytecode.AccessFlag.STATIC;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which sets private with parameter of 'a'. And checks the `int` object int1 is equal to 98.
 */
@Test
public void test23() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test23");
    int int1 = javassist.bytecode.AccessFlag.setPrivate((int) 'a');
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 98 + "'", int1 == 98);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which returns the modifier of 100. And checks the `int` object int1 is equal to 100.
 */
@Test
public void test24() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test24");
    int int1 = javassist.bytecode.AccessFlag.toModifier(100);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which sets private with parameter of 2. And checks the `int` object int1 is equal to 2.
 */
@Test
public void test26() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test26");
    int int1 = javassist.bytecode.AccessFlag.setPrivate(2);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.PUBLIC. And checks the `int` object int0 is equal to 1.
 */
@Test
public void test27() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test27");
    int int0 = javassist.bytecode.AccessFlag.PUBLIC;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which sets public with parameter of 100. And checks the `int` object int1 is equal to 97.
 */
@Test
public void test28() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test28");
    int int1 = javassist.bytecode.AccessFlag.setPublic((int) (byte) 100);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which returns the modifier of 100. And checks the `int` object int1 is equal to 100.
 */
@Test
public void test29() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test29");
    int int1 = javassist.bytecode.AccessFlag.toModifier((int) (byte) 100);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.STRICT. And checks the `int` object int0 is equal to 2048.
 */
@Test
public void test30() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test30");
    int int0 = javassist.bytecode.AccessFlag.STRICT;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.ENUM. And checks the `int` object int0 is equal to 16384.
 */
@Test
public void test31() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test31");
    int int0 = javassist.bytecode.AccessFlag.ENUM;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which gets the set protected with parameter of ' '. And checks the `int` object int1 is equal to 36.
 */
@Test
public void test32() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test32");
    int int1 = javassist.bytecode.AccessFlag.setProtected((int) ' ');
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which gets the set protected with parameter of 8192. And checks the `int` object int1 is equal to 8196.
 */
@Test
public void test33() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test33");
    int int1 = javassist.bytecode.AccessFlag.setProtected(8192);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8196 + "'", int1 == 8196);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.NATIVE. And checks the `int` object int0 is equal to 256.
 */
@Test
public void test34() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test34");
    int int0 = javassist.bytecode.AccessFlag.NATIVE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which sets public with parameter of 8196. And checks the `int` object int1 is equal to 8193.
 */
@Test
public void test35() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test35");
    int int1 = javassist.bytecode.AccessFlag.setPublic(8196);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8193 + "'", int1 == 8193);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which sets package with parameter of '#'. And checks the `int` object int1 is equal to 32.
 */
@Test
public void test36() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test36");
    int int1 = javassist.bytecode.AccessFlag.setPackage((int) '#');
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which sets public with parameter of 1. And checks the `int` object int1 is equal to (-7).
 */
@Test
public void test37() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test37");
    int int1 = javassist.bytecode.AccessFlag.setPublic((int) (short) -1);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1 == (-7));
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which gets the set protected with parameter of 1024. And checks the `int` object int1 is equal to 1028.
 */
@Test
public void test40() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test40");
    int int1 = javassist.bytecode.AccessFlag.setProtected(1024);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1028 + "'", int1 == 1028);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which gets the clear with parameters of 16, and 8196. And checks the `int` object int2 is equal to 16.
 */
@Test
public void test45() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test45");
    int int2 = javassist.bytecode.AccessFlag.clear(16, 8196);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.PROTECTED. And checks the `int` object int0 is equal to 4.
 */
@Test
public void test47() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test47");
    int int0 = javassist.bytecode.AccessFlag.PROTECTED;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which returns the of 16384. And checks the `int` object int1 is equal to 16384.
 */
@Test
public void test48() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test48");
    int int1 = javassist.bytecode.AccessFlag.of(16384);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16384 + "'", int1 == 16384);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which gets the set protected with parameter of 2048. And checks the `int` object int1 is equal to 2052.
 */
@Test
public void test49() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test49");
    int int1 = javassist.bytecode.AccessFlag.setProtected(2048);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2052 + "'", int1 == 2052);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.VOLATILE. And checks the `int` object int0 is equal to 64.
 */
@Test
public void test50() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test50");
    int int0 = javassist.bytecode.AccessFlag.VOLATILE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which gets the clear with parameters of 8196, and 64. And checks the `int` object int2 is equal to 64.
 */
@Test
public void test51() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test51");
    int int2 = javassist.bytecode.AccessFlag.clear(64, 8196);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
}

/** Assertions: 
 *     1. Declares a new `int` object whose value is AccessFlag.MODULE. And checks the `int` object int0 is equal to 32768.
 */
@Test
public void test52() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test52");
    int int0 = javassist.bytecode.AccessFlag.MODULE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32768 + "'", int0 == 32768);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which gets the set protected with parameter of 16384. And checks the `int` object int1 is equal to 16388.
 */
@Test
public void test54() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test54");
    int int1 = javassist.bytecode.AccessFlag.setProtected(16384);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16388 + "'", int1 == 16388);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which returns the modifier of '#'. And checks the `int` object int1 is equal to 35.
 */
@Test
public void test55() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test55");
    int int1 = javassist.bytecode.AccessFlag.toModifier((int) '#');
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
}

/** Assertions: 
 *     1. Declares a new `int` object by calling the method on a `AccessFlag` object which sets public with parameter of 1. And checks the `int` object int1 is equal to 1.
 */
@Test
public void test56() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test56");
    int int1 = javassist.bytecode.AccessFlag.setPublic((int) (byte) 1);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
}
}
