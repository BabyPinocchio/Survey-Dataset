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
        int int0 = org.apache.bcel.generic.ElementValueGen.ARRAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 91 + "'", int0 == 91);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_BYTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 66 + "'", int0 == 66);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_CHAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 67 + "'", int0 == 67);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 83 + "'", int0 == 83);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int int0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_FLOAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 70 + "'", int0 == 70);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int0 = org.apache.bcel.generic.ElementValueGen.ENUM_CONSTANT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 101 + "'", int0 == 101);
    }

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

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int0 = org.apache.bcel.generic.ElementValueGen.CLASS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 99 + "'", int0 == 99);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        int int0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_BOOLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 90 + "'", int0 == 90);
    }

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

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        int int0 = org.apache.bcel.generic.ElementValueGen.ANNOTATION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        int int0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 74 + "'", int0 == 74);
    }

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

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        int int0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 73 + "'", int0 == 73);
    }

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

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        int int0 = org.apache.bcel.generic.ElementValueGen.STRING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 115 + "'", int0 == 115);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        int int0 = org.apache.bcel.generic.ElementValueGen.PRIMITIVE_DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 68 + "'", int0 == 68);
    }

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

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

