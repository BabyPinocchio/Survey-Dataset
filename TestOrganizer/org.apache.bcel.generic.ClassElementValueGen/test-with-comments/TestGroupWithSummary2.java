import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Coverage Results: 
 *     BRANCH COVERAGE: 0.500
 *     INSTRUCTION COVERAGE: 0.137
 *     LINE COVERAGE: 0.150
 * Top 2 Methods Under Test: 
 *     None
 * Common Assertions: 
 *     None
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroupWithSummary2 {

    public static boolean debug = false;


/** Assertions: 
 *     1. Expects exception when creating a new `ClassElementValueGen` object with a `ObjectType` object, and a `ConstantPoolGen` object.
 */
@Test
public void test07() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test07");
    org.apache.bcel.generic.ObjectType objectType0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
        org.apache.bcel.generic.ClassElementValueGen classElementValueGen2 = new org.apache.bcel.generic.ClassElementValueGen(objectType0, constantPoolGen1);
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    // Expected exception.
    }
}

/** Assertions: 
 *     1. Expects exception when creating a new `ClassElementValueGen` object with a `ConstantPoolGen` object, a `ClassElementValue` object, and true.
 */
@Test
public void test10() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test10");
    org.apache.bcel.classfile.ClassElementValue classElementValue0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
        org.apache.bcel.generic.ClassElementValueGen classElementValueGen3 = new org.apache.bcel.generic.ClassElementValueGen(classElementValue0, constantPoolGen1, true);
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    // Expected exception.
    }
}

/** Assertions: 
 *     1. Expects exception when creating a new `ClassElementValueGen` object with a `ConstantPoolGen` object, a `ClassElementValue` object, and false.
 */
@Test
public void test11() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test11");
    org.apache.bcel.classfile.ClassElementValue classElementValue0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
        org.apache.bcel.generic.ClassElementValueGen classElementValueGen3 = new org.apache.bcel.generic.ClassElementValueGen(classElementValue0, constantPoolGen1, false);
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    // Expected exception.
    }
}
}
