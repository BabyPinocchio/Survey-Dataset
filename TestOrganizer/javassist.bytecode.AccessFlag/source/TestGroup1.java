import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroup1 {

    public static boolean debug = false;

@Test
public void test21() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test21");
    java.lang.Object obj0 = new java.lang.Object();
    java.lang.Class<?> wildcardClass1 = obj0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass1);
}@Test
public void test25() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test25");
    javassist.bytecode.AccessFlag accessFlag0 = new javassist.bytecode.AccessFlag();
    java.lang.Class<?> wildcardClass1 = accessFlag0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass1);
}}
