import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroup2 {

    public static boolean debug = false;

@Test
public void test07() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test07");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPrivate(128);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}@Test
public void test10() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test10");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPublic((int) (byte) 0);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}@Test
public void test38() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test38");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPrivate(4096);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}@Test
public void test39() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test39");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPublic(8192);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}@Test
public void test41() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test41");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPackage(1028);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}@Test
public void test42() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test42");
    boolean boolean1 = javassist.bytecode.AccessFlag.isProtected((int) (short) 0);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}@Test
public void test43() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test43");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPrivate(0);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}@Test
public void test44() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test44");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPackage((int) (short) 10);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}@Test
public void test46() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test46");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPackage((int) 'a');
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
}@Test
public void test53() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test53");
    boolean boolean1 = javassist.bytecode.AccessFlag.isPackage(8);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
}}
