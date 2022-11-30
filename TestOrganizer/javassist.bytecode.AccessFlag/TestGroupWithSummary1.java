import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Coverage Results: 
 *     BRANCH COVERAGE: 0.000
 *     INSTRUCTION COVERAGE: 0.045
 *     LINE COVERAGE: 0.083
 * Top 2 Methods Under Test: 
 *     getClass
 * Common Assertions: 
 *     None
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroupWithSummary1 {

    public static boolean debug = false;


/** Assertions: 
 *     1. Declares a new `Class<?>` object which gets class of a `Object` object. And checks the `WildcardClass` object wildcardClass1 is not null.
 */
@Test
public void test21() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test21");
    java.lang.Object obj0 = new java.lang.Object();
    java.lang.Class<?> wildcardClass1 = obj0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass1);
}

/** Assertions: 
 *     1. Declares a new `Class<?>` object which gets class of a `AccessFlag` object. And checks the `WildcardClass` object wildcardClass1 is not null.
 */
@Test
public void test25() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test25");
    javassist.bytecode.AccessFlag accessFlag0 = new javassist.bytecode.AccessFlag();
    java.lang.Class<?> wildcardClass1 = accessFlag0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass1);
}
}
