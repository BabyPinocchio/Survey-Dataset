import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Coverage Results: 
 *     BRANCH COVERAGE: 0.000
 *     INSTRUCTION COVERAGE: 0.000
 *     LINE COVERAGE: 0.000
 * Top 2 Methods Under Test: 
 *     copy
 *     readElementValue
 * Common Assertions: 
 *     None
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroupWithSummary0 {

    public static boolean debug = false;


/** Assertions: 
 *     1. Expects exception when declaring a new `ElementValueGen` object by calling the method on a `ElementValueGen` object which copies from a `ConstantPoolGen` object, true, and a `ElementValue` object.
 */
@Test
public void test14() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test14");
    org.apache.bcel.classfile.ElementValue elementValue0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
        org.apache.bcel.generic.ElementValueGen elementValueGen3 = org.apache.bcel.generic.ElementValueGen.copy(elementValue0, constantPoolGen1, true);
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    // Expected exception.
    }
}

/** Assertions: 
 *     1. Expects exception when declaring a new `ElementValueGen` object by calling the method on a `ElementValueGen` object which reads element value with parameters of a `DataInput` object, and a `ConstantPoolGen` object.
 */
@Test
public void test16() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test16");
    java.io.DataInput dataInput0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
        org.apache.bcel.generic.ElementValueGen elementValueGen2 = org.apache.bcel.generic.ElementValueGen.readElementValue(dataInput0, constantPoolGen1);
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    // Expected exception.
    }
}

/** Assertions: 
 *     1. Expects exception when declaring a new `ElementValueGen` object by calling the method on a `ElementValueGen` object which copies from a `ConstantPoolGen` object, false, and a `ElementValue` object.
 */
@Test
public void test19() throws Throwable {
    if (debug)
        System.out.format("%n%s%n", "RegressionTest0.test19");
    org.apache.bcel.classfile.ElementValue elementValue0 = null;
    org.apache.bcel.generic.ConstantPoolGen constantPoolGen1 = null;
    // The following exception was thrown during execution in test generation
    try {
        org.apache.bcel.generic.ElementValueGen elementValueGen3 = org.apache.bcel.generic.ElementValueGen.copy(elementValue0, constantPoolGen1, false);
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    // Expected exception.
    }
}
}
