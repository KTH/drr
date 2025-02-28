/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 16:44:21 GMT 2019
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class EigenDecompositionImpl_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(13, 13);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 13);
      eigenDecompositionImpl0.getImagEigenvalues();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2035.669));
      double double0 = eigenDecompositionImpl0.getImagEigenvalue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2035.669));
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2035.669));
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      assertNotSame(doubleArray0, doubleArray2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2461.651372627;
      doubleArray0[2] = 605.0551896522744;
      doubleArray0[3] = 0.563;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1967.3));
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl(realMatrix1, 3438.745247689);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2035.669));
      eigenDecompositionImpl0.getV();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      assertEquals(1, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2035.669));
      eigenDecompositionImpl0.getEigenvector(0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      assertEquals(1, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2035.669));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      assertSame(realMatrix1, realMatrix0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1487.160326293085));
      eigenDecompositionImpl0.getVT();
      eigenDecompositionImpl0.getVT();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2035.669));
      eigenDecompositionImpl0.getEigenvector(0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      assertEquals(1, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2035.669));
      eigenDecompositionImpl0.getEigenvector(0);
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(0);
      assertEquals(1.0, realVector0.getLInfNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(13, 13);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 13);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(13, 13);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 13);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      eigenDecompositionImpl0.getSolver();
      assertFalse(array2DRowRealMatrix0.equals((Object)realMatrix0));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1967.3));
      eigenDecompositionImpl0.getSolver();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[6] = (-2809.69639901);
      doubleArray0[7] = 54.0;
      doubleArray0[8] = 1645.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.563);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 3411.400791;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = (-1512.9);
      double[] doubleArray1 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1487.160326293085));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2461.651372627;
      doubleArray0[2] = 605.0551896522744;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = (-694.9669005);
      doubleArray0[5] = 0.563;
      doubleArray0[6] = (-2809.69639901);
      doubleArray0[7] = 1.301107087560245;
      doubleArray0[8] = 1659.229691223657;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2461.651372627;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = (-694.9669005);
      doubleArray0[6] = (-2809.69639901);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1967.3));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2476.649203443081;
      doubleArray0[2] = 605.0551896522744;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = (-694.9669005);
      doubleArray0[6] = (-2809.69639901);
      doubleArray0[7] = 54.0;
      doubleArray0[8] = 1645.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.563);
      assertEquals((-1.5177375400002896E-84), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = 0.563;
      doubleArray0[6] = (-2809.69639901);
      doubleArray0[7] = 54.0;
      doubleArray0[8] = 1645.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 2.2250738585072014E-308);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 3411.400791;
      doubleArray0[2] = (-1512.9);
      doubleArray0[3] = 6.283185307179586;
      doubleArray0[4] = (-1487.160326293085);
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 9.0;
      doubleArray1[1] = (-1.0);
      doubleArray1[3] = (-1487.160326293085);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1487.160326293085));
      assertEquals((-2.6459430326044742E11), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2461.651372627;
      doubleArray0[2] = 605.0551896522744;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = (-694.9669005);
      doubleArray0[6] = (-2832.458925577033);
      doubleArray0[8] = 1645.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1967.3));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[7] = Double.POSITIVE_INFINITY;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1967.3));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2453.899857232586;
      doubleArray0[2] = 605.0551896522744;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = (-694.9669005);
      doubleArray0[5] = (-694.9669005);
      doubleArray0[7] = 54.0;
      doubleArray0[8] = 1645.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1967.3));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2461.651372627;
      doubleArray0[2] = 605.0551896522744;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = (-694.9669005);
      doubleArray0[5] = 0.563;
      doubleArray0[6] = 7.150566216320511E-7;
      doubleArray0[7] = 54.0;
      doubleArray0[8] = 1645.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = 605.0551896522744;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = (-694.9669005);
      doubleArray0[6] = (-2809.69639901);
      doubleArray0[7] = 54.0;
      doubleArray0[8] = 1645.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.563);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2461.651372627;
      doubleArray0[2] = 605.0551896522744;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = (-694.9669005);
      doubleArray0[6] = (-2832.458925577033);
      doubleArray0[7] = 54.0;
      doubleArray0[8] = 1645.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1967.3));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2461.651372627;
      doubleArray0[2] = 605.0551896522744;
      doubleArray0[4] = (-694.9669005);
      doubleArray0[6] = (-2833.0682049934526);
      doubleArray0[7] = 54.0;
      doubleArray0[8] = 1645.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1967.3));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2461.651372627;
      doubleArray0[0] = 605.0551896522744;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = (-694.9669005);
      doubleArray0[6] = (-2992.744);
      doubleArray0[8] = 1645.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1967.3));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2461.651372627;
      doubleArray0[2] = 605.0551896522744;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = (-694.9669005);
      doubleArray0[5] = 0.333;
      doubleArray0[6] = (-2832.458925577033);
      doubleArray0[7] = (-2832.458925577033);
      doubleArray0[8] = 1645.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1967.3));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2460.2768242053794;
      doubleArray0[2] = 605.0551896522744;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = (-694.9669005);
      doubleArray0[6] = (-2809.69639901);
      doubleArray0[7] = 54.0;
      doubleArray0[8] = 1645.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.563);
      assertEquals(4.391502658751981E-95, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[18];
      doubleArray0[1] = 2461.651372627;
      doubleArray0[2] = 2461.651372627;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = 2577.23741309994;
      doubleArray0[5] = 0.563;
      doubleArray0[6] = (-2809.69639901);
      doubleArray0[7] = 2461.651372627;
      doubleArray0[8] = 0.563;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.563);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2461.651372627;
      doubleArray0[2] = 605.0551896522744;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = (-694.9669005);
      doubleArray0[5] = 0.333;
      doubleArray0[0] = (-2832.458925577033);
      doubleArray0[8] = 1645.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1967.3));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[18];
      doubleArray0[1] = 2461.651372627;
      doubleArray0[2] = 2461.651372627;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = 2577.23741309994;
      doubleArray0[5] = 0.563;
      doubleArray0[6] = (-2809.69639901);
      doubleArray0[7] = 2461.651372627;
      doubleArray0[8] = 0.563;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2461.651372627;
      doubleArray0[2] = 605.0551896522744;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = (-694.9669005);
      doubleArray0[6] = (-2809.69639901);
      doubleArray0[7] = 54.0;
      doubleArray0[8] = 1645.0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 2.2250738585072014E-308);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.563;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 1360.3100564869);
      try { 
        eigenDecompositionImpl0.getEigenvector((-503));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -503
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }
}
