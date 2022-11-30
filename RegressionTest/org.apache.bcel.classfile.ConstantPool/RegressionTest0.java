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
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = constantPool2.constantToString((int) '4', (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 52. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.Class<?> wildcardClass3 = constantArray1.getClass();
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant5 = constantPool2.getConstant((int) (byte) 0, (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Constant pool at index 0 is null.");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = constantPool2.getConstantString((int) (byte) 100, (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 100. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = constantPool2.getConstantString((int) (short) 10, (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 10. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = constantPool2.getConstantString((int) (short) -1, (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: -1. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = constantPool2.getConstantString(100, (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 100. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = constantPool2.getConstantString((int) (short) 10, (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 10. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant constant4 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.setConstant((int) (short) 10, constant4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = constantPool2.getConstantString((int) (short) 10, (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 10. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant7 = constantPool2.getConstant((int) (byte) 10, (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 10. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        java.io.DataOutputStream dataOutputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.dump(dataOutputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant6 = constantPool2.getConstant((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 100. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = constantPool2.constantToString((-1), (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: -1. Constant pool size is: 0");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant6 = constantPool4.getConstant((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 100. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        org.apache.bcel.classfile.Constant constant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.setConstant((int) 'a', constant7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        org.apache.bcel.classfile.Constant constant6 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.setConstant((int) (short) 100, constant6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = constantPool2.getConstantString((int) (byte) 100, (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 100. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant4 = constantPool2.getConstant((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: -1. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = constantPool2.getConstantPool();
        java.io.DataOutputStream dataOutputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.dump(dataOutputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        int int10 = constantPool2.getLength();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant12 = constantPool2.getConstant((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 97. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = constantPool2.getConstantPool();
        java.lang.Class<?> wildcardClass5 = constantPool2.getClass();
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = constantPool2.getConstantPool();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = constantPool2.getConstantString((int) (short) 10, (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 10. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = constantPool2.constantToString((int) (byte) 1, (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 1. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = constantPool2.constantToString(constant4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = constantPool2.getConstantString((int) ' ', (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 32. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = constantPool2.getConstantString((int) (short) -1, (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: -1. Constant pool size is: 0");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        java.lang.String str4 = constantPool2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant7 = constantPool2.getConstant((int) (short) -1, (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: -1. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        int int10 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.setConstant((int) 'a', constant12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        int int10 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant12 = constantPool2.getConstant((int) (short) 0);
        int int13 = constantPool2.getLength();
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constant12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        java.lang.Class<?> wildcardClass10 = constantPool2.getClass();
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant5 = constantPool2.getConstant(10);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 10. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        org.apache.bcel.classfile.Constant constant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = constantPool2.constantToString(constant5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        int int6 = constantPool2.getLength();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant9 = constantPool2.getConstant((int) (short) 0, (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 0. Constant pool size is: 0");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = constantPool2.constantToString((int) ' ', (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 32. Constant pool size is: 0");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        org.apache.bcel.classfile.Constant constant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = constantPool4.constantToString(constant5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.ConstantPool constantPool1 = new org.apache.bcel.classfile.ConstantPool(dataInput0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        java.lang.Class<?> wildcardClass5 = constantPool4.getClass();
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantPool4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant constant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.setConstant((int) (byte) 100, constant5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant11 = constantPool2.getConstant((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 10. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        int int6 = constantPool2.getLength();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant9 = constantPool2.getConstant((int) '4', (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 52. Constant pool size is: 0");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        org.apache.bcel.classfile.Visitor visitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.accept(visitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant8 = constantPool2.getConstant((int) (byte) 1, (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 1. Constant pool size is: 0");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        java.lang.String str4 = constantPool2.toString();
        java.io.DataOutputStream dataOutputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.dump(dataOutputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = constantPool2.getConstantPool();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = constantPool2.getConstantString((int) (short) -1, (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: -1. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        org.apache.bcel.classfile.Constant constant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = constantPool2.constantToString(constant10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Visitor visitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.accept(visitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        org.apache.bcel.classfile.Constant constant5 = null;
        org.apache.bcel.classfile.Constant[] constantArray6 = new org.apache.bcel.classfile.Constant[] { constant5 };
        org.apache.bcel.classfile.ConstantPool constantPool7 = new org.apache.bcel.classfile.ConstantPool(constantArray6);
        java.lang.String str8 = constantPool7.toString();
        org.apache.bcel.classfile.Constant[] constantArray9 = constantPool7.getConstantPool();
        constantPool2.setConstantPool(constantArray9);
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantPool4);
        org.junit.Assert.assertNotNull(constantArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(constantArray9);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        int int10 = constantPool2.getLength();
        java.lang.String str11 = constantPool2.toString();
        org.apache.bcel.classfile.Visitor visitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.accept(visitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        int int6 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant7 = null;
        org.apache.bcel.classfile.Constant[] constantArray8 = new org.apache.bcel.classfile.Constant[] { constant7 };
        org.apache.bcel.classfile.ConstantPool constantPool9 = new org.apache.bcel.classfile.ConstantPool(constantArray8);
        java.lang.String str10 = constantPool9.toString();
        org.apache.bcel.classfile.Constant[] constantArray11 = new org.apache.bcel.classfile.Constant[] {};
        constantPool9.setConstantPool(constantArray11);
        int int13 = constantPool9.getLength();
        org.apache.bcel.classfile.Constant[] constantArray14 = constantPool9.getConstantPool();
        constantPool2.setConstantPool(constantArray14);
        org.apache.bcel.classfile.ConstantPool constantPool16 = new org.apache.bcel.classfile.ConstantPool(constantArray14);
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(constantArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(constantArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(constantArray14);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        org.apache.bcel.classfile.Constant constant6 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.setConstant((int) (short) -1, constant6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant constant4 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.setConstant(100, constant4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = constantPool2.getConstantString(0, (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 0. Constant pool size is: 0");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        int int6 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool2.getConstantPool();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = constantPool2.getConstantString((int) (byte) 1, (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 1. Constant pool size is: 0");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(constantArray7);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        int int6 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant7 = null;
        org.apache.bcel.classfile.Constant[] constantArray8 = new org.apache.bcel.classfile.Constant[] { constant7 };
        org.apache.bcel.classfile.ConstantPool constantPool9 = new org.apache.bcel.classfile.ConstantPool(constantArray8);
        java.lang.String str10 = constantPool9.toString();
        org.apache.bcel.classfile.Constant[] constantArray11 = new org.apache.bcel.classfile.Constant[] {};
        constantPool9.setConstantPool(constantArray11);
        int int13 = constantPool9.getLength();
        org.apache.bcel.classfile.Constant[] constantArray14 = constantPool9.getConstantPool();
        constantPool2.setConstantPool(constantArray14);
        int int16 = constantPool2.getLength();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant18 = constantPool2.getConstant(0);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 0. Constant pool size is: 0");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(constantArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(constantArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(constantArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        int int10 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant12 = constantPool2.getConstant((int) (short) 0);
        org.apache.bcel.classfile.Constant constant13 = null;
        org.apache.bcel.classfile.Constant[] constantArray14 = new org.apache.bcel.classfile.Constant[] { constant13 };
        org.apache.bcel.classfile.ConstantPool constantPool15 = new org.apache.bcel.classfile.ConstantPool(constantArray14);
        java.lang.String str16 = constantPool15.toString();
        org.apache.bcel.classfile.Constant[] constantArray17 = constantPool15.getConstantPool();
        constantPool2.setConstantPool(constantArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = constantPool2.getConstantString((int) 'a', (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 97. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constant12);
        org.junit.Assert.assertNotNull(constantArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(constantArray17);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        int int6 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.ConstantPool constantPool8 = new org.apache.bcel.classfile.ConstantPool(constantArray7);
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(constantArray7);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = constantPool2.getConstantPool();
        java.lang.Class<?> wildcardClass5 = constantArray4.getClass();
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant constant4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = constantPool2.constantToString(constant4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        int int10 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant12 = constantPool2.getConstant((int) (short) 0);
        org.apache.bcel.classfile.Constant constant13 = null;
        org.apache.bcel.classfile.Constant[] constantArray14 = new org.apache.bcel.classfile.Constant[] { constant13 };
        org.apache.bcel.classfile.ConstantPool constantPool15 = new org.apache.bcel.classfile.ConstantPool(constantArray14);
        java.lang.String str16 = constantPool15.toString();
        org.apache.bcel.classfile.Constant[] constantArray17 = constantPool15.getConstantPool();
        constantPool2.setConstantPool(constantArray17);
        org.apache.bcel.classfile.Constant constant20 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.setConstant(1, constant20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constant12);
        org.junit.Assert.assertNotNull(constantArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(constantArray17);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        org.apache.bcel.classfile.ConstantPool constantPool9 = constantPool2.copy();
        java.io.DataOutputStream dataOutputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool9.dump(dataOutputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertNotNull(constantPool9);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        int int10 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant12 = constantPool2.getConstant((int) (short) 0);
        org.apache.bcel.classfile.ConstantPool constantPool13 = constantPool2.copy();
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constant12);
        org.junit.Assert.assertNotNull(constantPool13);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        int int10 = constantPool2.getLength();
        int int11 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = constantPool2.constantToString(constant12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.ConstantPool constantPool5 = new org.apache.bcel.classfile.ConstantPool(constantArray4);
        org.apache.bcel.classfile.Constant constant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool5.setConstant((int) '#', constant7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        int int10 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = constantPool2.constantToString(constant11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.ConstantPool constantPool3 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.junit.Assert.assertNotNull(constantArray1);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.ConstantPool constantPool5 = new org.apache.bcel.classfile.ConstantPool(constantArray4);
        org.apache.bcel.classfile.Constant[] constantArray6 = constantPool5.getConstantPool();
        org.apache.bcel.classfile.Constant constant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool5.setConstant((int) (byte) 10, constant8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
        org.junit.Assert.assertNotNull(constantArray6);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        org.apache.bcel.classfile.Constant constant6 = null;
        constantPool2.setConstant(0, constant6);
        org.apache.bcel.classfile.Visitor visitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.accept(visitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        java.lang.Class<?> wildcardClass4 = constantArray3.getClass();
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        org.apache.bcel.classfile.ConstantPool constantPool5 = constantPool2.copy();
        org.apache.bcel.classfile.Constant[] constantArray6 = constantPool5.getConstantPool();
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantPool4);
        org.junit.Assert.assertNotNull(constantPool5);
        org.junit.Assert.assertNotNull(constantArray6);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        int int6 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant7 = null;
        org.apache.bcel.classfile.Constant[] constantArray8 = new org.apache.bcel.classfile.Constant[] { constant7 };
        org.apache.bcel.classfile.ConstantPool constantPool9 = new org.apache.bcel.classfile.ConstantPool(constantArray8);
        java.lang.String str10 = constantPool9.toString();
        org.apache.bcel.classfile.Constant[] constantArray11 = new org.apache.bcel.classfile.Constant[] {};
        constantPool9.setConstantPool(constantArray11);
        int int13 = constantPool9.getLength();
        org.apache.bcel.classfile.Constant[] constantArray14 = constantPool9.getConstantPool();
        constantPool2.setConstantPool(constantArray14);
        org.apache.bcel.classfile.Constant constant17 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.setConstant((int) (short) 0, constant17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(constantArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(constantArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(constantArray14);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        org.apache.bcel.classfile.Visitor visitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.accept(visitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        int int6 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant7 = null;
        org.apache.bcel.classfile.Constant[] constantArray8 = new org.apache.bcel.classfile.Constant[] { constant7 };
        org.apache.bcel.classfile.ConstantPool constantPool9 = new org.apache.bcel.classfile.ConstantPool(constantArray8);
        java.lang.String str10 = constantPool9.toString();
        org.apache.bcel.classfile.Constant[] constantArray11 = new org.apache.bcel.classfile.Constant[] {};
        constantPool9.setConstantPool(constantArray11);
        int int13 = constantPool9.getLength();
        org.apache.bcel.classfile.Constant[] constantArray14 = constantPool9.getConstantPool();
        constantPool2.setConstantPool(constantArray14);
        int int16 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant17 = null;
        org.apache.bcel.classfile.Constant[] constantArray18 = new org.apache.bcel.classfile.Constant[] { constant17 };
        org.apache.bcel.classfile.ConstantPool constantPool19 = new org.apache.bcel.classfile.ConstantPool(constantArray18);
        java.lang.String str20 = constantPool19.toString();
        org.apache.bcel.classfile.Constant[] constantArray21 = new org.apache.bcel.classfile.Constant[] {};
        constantPool19.setConstantPool(constantArray21);
        int int23 = constantPool19.getLength();
        org.apache.bcel.classfile.Constant[] constantArray24 = constantPool19.getConstantPool();
        constantPool2.setConstantPool(constantArray24);
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(constantArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(constantArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(constantArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(constantArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(constantArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(constantArray24);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        int int6 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool2.getConstantPool();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant9 = constantPool2.getConstant(10);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 10. Constant pool size is: 0");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(constantArray7);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        org.apache.bcel.classfile.Constant constant6 = null;
        org.apache.bcel.classfile.Constant[] constantArray7 = new org.apache.bcel.classfile.Constant[] { constant6 };
        org.apache.bcel.classfile.ConstantPool constantPool8 = new org.apache.bcel.classfile.ConstantPool(constantArray7);
        java.lang.String str9 = constantPool8.toString();
        org.apache.bcel.classfile.Constant[] constantArray10 = new org.apache.bcel.classfile.Constant[] {};
        constantPool8.setConstantPool(constantArray10);
        org.apache.bcel.classfile.ConstantPool constantPool12 = new org.apache.bcel.classfile.ConstantPool(constantArray10);
        constantPool2.setConstantPool(constantArray10);
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(constantArray10);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        org.apache.bcel.classfile.Constant constant6 = null;
        constantPool2.setConstant(0, constant6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = constantPool2.getConstantString((int) (byte) 1, (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 1. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        int int10 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant12 = constantPool2.getConstant((int) (short) 0);
        org.apache.bcel.classfile.Constant constant13 = null;
        org.apache.bcel.classfile.Constant[] constantArray14 = new org.apache.bcel.classfile.Constant[] { constant13 };
        org.apache.bcel.classfile.ConstantPool constantPool15 = new org.apache.bcel.classfile.ConstantPool(constantArray14);
        java.lang.String str16 = constantPool15.toString();
        org.apache.bcel.classfile.Constant[] constantArray17 = constantPool15.getConstantPool();
        constantPool2.setConstantPool(constantArray17);
        org.apache.bcel.classfile.ConstantPool constantPool19 = constantPool2.copy();
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constant12);
        org.junit.Assert.assertNotNull(constantArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(constantArray17);
        org.junit.Assert.assertNotNull(constantPool19);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        int int10 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant12 = constantPool2.getConstant((int) (short) 0);
        java.lang.String str13 = constantPool2.toString();
        org.apache.bcel.classfile.Visitor visitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantPool2.accept(visitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constant12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        org.apache.bcel.classfile.ConstantPool constantPool5 = constantPool2.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant8 = constantPool2.getConstant((-1), (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: -1. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantPool4);
        org.junit.Assert.assertNotNull(constantPool5);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        int int10 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant12 = constantPool2.getConstant((int) (short) 0);
        org.apache.bcel.classfile.Constant constant14 = constantPool2.getConstant((int) (byte) 0);
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constant12);
        org.junit.Assert.assertNull(constant14);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        int int10 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant12 = constantPool2.getConstant((int) (short) 0);
        org.apache.bcel.classfile.Constant constant13 = null;
        org.apache.bcel.classfile.Constant[] constantArray14 = new org.apache.bcel.classfile.Constant[] { constant13 };
        org.apache.bcel.classfile.ConstantPool constantPool15 = new org.apache.bcel.classfile.ConstantPool(constantArray14);
        java.lang.String str16 = constantPool15.toString();
        org.apache.bcel.classfile.Constant[] constantArray17 = constantPool15.getConstantPool();
        constantPool2.setConstantPool(constantArray17);
        org.apache.bcel.classfile.Constant constant20 = null;
        constantPool2.setConstant((int) (byte) 0, constant20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant24 = constantPool2.getConstant(10, (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 10. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constant12);
        org.junit.Assert.assertNotNull(constantArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(constantArray17);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant6 = constantPool4.getConstant((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 100. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        int int9 = constantPool2.getLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = constantPool2.constantToString(100, (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 100. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.ConstantPool constantPool5 = new org.apache.bcel.classfile.ConstantPool(constantArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant8 = constantPool5.getConstant((int) (byte) -1, (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: -1. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.Constant constant4 = null;
        org.apache.bcel.classfile.Constant[] constantArray5 = new org.apache.bcel.classfile.Constant[] { constant4 };
        org.apache.bcel.classfile.ConstantPool constantPool6 = new org.apache.bcel.classfile.ConstantPool(constantArray5);
        org.apache.bcel.classfile.Constant[] constantArray7 = constantPool6.getConstantPool();
        constantPool2.setConstantPool(constantArray7);
        java.lang.String str9 = constantPool2.toString();
        int int10 = constantPool2.getLength();
        org.apache.bcel.classfile.Constant constant12 = constantPool2.getConstant((int) (short) 0);
        org.apache.bcel.classfile.Constant constant13 = null;
        org.apache.bcel.classfile.Constant[] constantArray14 = new org.apache.bcel.classfile.Constant[] { constant13 };
        org.apache.bcel.classfile.ConstantPool constantPool15 = new org.apache.bcel.classfile.ConstantPool(constantArray14);
        java.lang.String str16 = constantPool15.toString();
        org.apache.bcel.classfile.Constant[] constantArray17 = constantPool15.getConstantPool();
        constantPool2.setConstantPool(constantArray17);
        org.apache.bcel.classfile.ConstantPool constantPool19 = new org.apache.bcel.classfile.ConstantPool(constantArray17);
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantArray5);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(constant12);
        org.junit.Assert.assertNotNull(constantArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(constantArray17);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] {};
        constantPool2.setConstantPool(constantArray4);
        org.apache.bcel.classfile.Constant constant6 = null;
        org.apache.bcel.classfile.Constant[] constantArray7 = new org.apache.bcel.classfile.Constant[] { constant6 };
        org.apache.bcel.classfile.ConstantPool constantPool8 = new org.apache.bcel.classfile.ConstantPool(constantArray7);
        java.lang.String str9 = constantPool8.toString();
        org.apache.bcel.classfile.Constant[] constantArray10 = new org.apache.bcel.classfile.Constant[] {};
        constantPool8.setConstantPool(constantArray10);
        int int12 = constantPool8.getLength();
        org.apache.bcel.classfile.Constant[] constantArray13 = constantPool8.getConstantPool();
        constantPool2.setConstantPool(constantArray13);
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
        org.junit.Assert.assertNotNull(constantArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(constantArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(constantArray13);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = constantPool4.constantToString(0, (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Constant pool at index 0 is null.");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant[] constantArray3 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.ConstantPool constantPool4 = constantPool2.copy();
        org.apache.bcel.classfile.Constant constant6 = null;
        constantPool2.setConstant(0, constant6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant9 = constantPool2.getConstant((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 100. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray3);
        org.junit.Assert.assertNotNull(constantPool4);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        org.apache.bcel.classfile.Constant constant3 = null;
        org.apache.bcel.classfile.Constant[] constantArray4 = new org.apache.bcel.classfile.Constant[] { constant3 };
        org.apache.bcel.classfile.ConstantPool constantPool5 = new org.apache.bcel.classfile.ConstantPool(constantArray4);
        constantPool2.setConstantPool(constantArray4);
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertNotNull(constantArray4);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        org.apache.bcel.classfile.Constant constant0 = null;
        org.apache.bcel.classfile.Constant[] constantArray1 = new org.apache.bcel.classfile.Constant[] { constant0 };
        org.apache.bcel.classfile.ConstantPool constantPool2 = new org.apache.bcel.classfile.ConstantPool(constantArray1);
        java.lang.String str3 = constantPool2.toString();
        org.apache.bcel.classfile.Constant[] constantArray4 = constantPool2.getConstantPool();
        org.apache.bcel.classfile.ConstantPool constantPool5 = new org.apache.bcel.classfile.ConstantPool(constantArray4);
        org.apache.bcel.classfile.Constant[] constantArray6 = constantPool5.getConstantPool();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bcel.classfile.Constant constant8 = constantPool5.getConstant((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.bcel.classfile.ClassFormatException; message: Invalid constant pool reference: 100. Constant pool size is: 1");
        } catch (org.apache.bcel.classfile.ClassFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(constantArray4);
        org.junit.Assert.assertNotNull(constantArray6);
    }
}

