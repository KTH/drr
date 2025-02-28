/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 04 05:36:06 GMT 2019
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class EigenDecompositionImpl_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-3152.926811));
      double[] doubleArray1 = eigenDecompositionImpl0.getImagEigenvalues();
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.getSubMatrix(0, 0, 0, 0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 612.6358);
      double double0 = eigenDecompositionImpl0.getImagEigenvalue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Double[] doubleArray0 = new Double[4];
      doubleArray0[0] = (Double) 552.6146805;
      doubleArray0[1] = (Double) (-2557.7999);
      doubleArray0[2] = (Double) 0.0;
      doubleArray0[3] = (Double) 552.6146805;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 2524.091160209103);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(377);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 377
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.getSubMatrix(0, 0, 0, 0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 612.6358);
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-1835.7);
      doubleArray0[2] = 322.2456313301;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      openMapRealVector0.mapAbsToSelf();
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-4104.391900310979));
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
      Double[] doubleArray0 = new Double[4];
      doubleArray0[0] = (Double) 552.6146805;
      doubleArray0[1] = (Double) (-2557.7999);
      doubleArray0[2] = (Double) 0.0;
      doubleArray0[3] = (Double) 552.6146805;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 2524.091160209103);
      eigenDecompositionImpl0.getV();
      eigenDecompositionImpl0.getV();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, (-3152.926811));
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getV();
      assertTrue(realMatrix1.equals((Object)realMatrix0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.getSubMatrix(0, 0, 0, 0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 612.6358);
      eigenDecompositionImpl0.getD();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getD();
      assertEquals(1, realMatrix1.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 6.374956728648543E-7);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1.0));
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix2 = eigenDecompositionImpl0.getVT();
      assertSame(realMatrix2, realMatrix1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getV();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      assertEquals(6, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getSolver();
      try { 
        eigenDecompositionImpl0.getEigenvector((-4509));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4509
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = Double.NEGATIVE_INFINITY;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0, arrayRealVector0);
      RealMatrix realMatrix0 = arrayRealVector1.outerProduct((RealVector) arrayRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.NEGATIVE_INFINITY);
      try { 
        eigenDecompositionImpl0.getEigenvector((-3));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      assertNotNull(realMatrix0);
      
      eigenDecompositionImpl0.getSolver();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      doubleArray1[3] = 2.304997621701598E-16;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Double[] doubleArray0 = new Double[4];
      doubleArray0[0] = (Double) 552.6146805;
      doubleArray0[1] = (Double) 0.0;
      doubleArray0[2] = (Double) (-2557.7999);
      doubleArray0[3] = (Double) 552.6146805;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (double) doubleArray0[2]);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // cannot solve degree 3 equation
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = 6.374956728648543E-7;
      doubleArray0[2] = 1.0;
      doubleArray0[4] = 6110.608209938;
      doubleArray0[5] = 1.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, -0.0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, (-1.0));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.NaN);
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
      double[] doubleArray0 = new double[19];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = (-0.22470887695192068);
      doubleArray0[2] = (-0.22470887695192068);
      doubleArray0[3] = (-0.22470887695192068);
      doubleArray0[4] = 6110.608209938;
      doubleArray0[5] = 0.9999999999999998;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.22470887695192068));
      openMapRealVector0.mapDivideToSelf((-0.22470887695192068));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1.0));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1.0);
      doubleArray0[4] = 6.374956728648543E-7;
      doubleArray0[5] = 0.9999999999999998;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, -0.0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1.0));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Double[] doubleArray0 = new Double[4];
      doubleArray0[0] = (Double) 552.6146805;
      doubleArray0[1] = (Double) 0.0;
      doubleArray0[2] = (Double) (-2557.7999);
      doubleArray0[3] = (Double) 552.6146805;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, arrayRealVector0);
      RealMatrix realMatrix0 = arrayRealVector1.outerProduct((RealVector) arrayRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (double) doubleArray0[2]);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 6.374956728648543E-7;
      doubleArray0[3] = 6.374956728648543E-7;
      doubleArray0[4] = 6110.608209938;
      doubleArray0[5] = 0.9999999999999998;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 6.374956728648543E-7);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1.0));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-559.2);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, Double.NaN);
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
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-0.49452891826025214);
      doubleArray0[2] = 1.0;
      doubleArray0[3] = (-13.290896894906338);
      doubleArray0[4] = 6110.608209938;
      doubleArray0[5] = 0.9999999999999998;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-13.290896894906338));
      openMapRealVector0.mapDivideToSelf((-13.290896894906338));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-0.49452891826025214));
      assertEquals(1.1683384655769595E-69, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = 6.374956728648543E-7;
      doubleArray0[2] = 1.0;
      doubleArray0[4] = 6110.608209938;
      doubleArray0[5] = 0.9384647661903305;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, -0.0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, (-1.0));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 6.374956728648543E-7;
      doubleArray0[2] = 1.0;
      doubleArray0[3] = 6.374956728648543E-7;
      doubleArray0[4] = 6110.608209938;
      doubleArray0[5] = 0.9999999999999998;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 6.374956728648543E-7);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1.0));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-0.49452891826025214);
      doubleArray0[1] = (-0.22470887695192068);
      doubleArray0[2] = 1.0;
      doubleArray0[3] = (-0.22470887695192068);
      doubleArray0[4] = 6110.608209938;
      doubleArray0[5] = 0.9999999999999998;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.22470887695192068));
      openMapRealVector0.mapDivideToSelf((-0.22470887695192068));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-0.49452891826025214));
      assertEquals((-3.6282924080477665E-62), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = (-43.99600441672583);
      doubleArray0[2] = (-43.99600441672583);
      doubleArray0[3] = (-43.99600441672583);
      doubleArray0[4] = 6101.222503623936;
      doubleArray0[5] = 0.9999999999999998;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-43.99600441672583));
      openMapRealVector0.mapDivideToSelf((-43.99600441672583));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1.0));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-3463.3399628419834);
      doubleArray0[1] = (-0.9622627688550279);
      doubleArray0[2] = 1.0;
      doubleArray0[3] = (-0.9622627688550279);
      doubleArray0[4] = (-3463.3399628419834);
      doubleArray0[5] = 0.9999999999999998;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.9622627688550279));
      openMapRealVector0.mapDivideToSelf((-0.9622627688550279));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-3463.3399628419834));
      assertEquals((-4.329769138684229E-58), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-3463.3399628419834);
      doubleArray0[1] = (-0.22470887695192068);
      doubleArray0[2] = 1.0;
      doubleArray0[3] = (-0.22470887695192068);
      doubleArray0[4] = 6110.608209938;
      doubleArray0[5] = 0.9999999999999998;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.22470887695192068));
      openMapRealVector0.unitize();
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-3463.3399628419834));
      assertEquals(2.4598748039706517E-81, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = (-0.22470887695192068);
      doubleArray0[2] = 1.0;
      doubleArray0[3] = (-0.22470887695192068);
      doubleArray0[4] = 6110.608209938;
      doubleArray0[5] = 0.680224767561741;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.22470887695192068));
      openMapRealVector0.mapMultiplyToSelf(0.680224767561741);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1.0));
      assertEquals(8.571738760144973E-67, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = (-0.22470887695192068);
      doubleArray0[2] = (-1.0);
      doubleArray0[3] = (-0.22470887695192068);
      doubleArray0[4] = 6110.608209938;
      doubleArray0[5] = 0.9999999999999998;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.22470887695192068));
      openMapRealVector0.mapDivideToSelf((-0.22470887695192068));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1.0));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 6.374956728648543E-7;
      doubleArray0[2] = 1.0;
      doubleArray0[4] = (-2439.3437403513);
      doubleArray0[5] = 0.9999999999999998;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, -0.0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1.0));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 6.374956728648543E-7;
      doubleArray0[2] = (-1.0);
      doubleArray0[4] = 6110.608209938;
      doubleArray0[5] = 4.361964786677234;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-1.0));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Double[] doubleArray0 = new Double[4];
      doubleArray0[0] = (Double) 552.6146805;
      doubleArray0[1] = (Double) (-2553.6805677813777);
      doubleArray0[2] = (Double) 0.0;
      doubleArray0[3] = (Double) 552.6146805;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, arrayRealVector0);
      RealMatrix realMatrix0 = arrayRealVector1.outerProduct((RealVector) arrayRealVector1);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, (-2553.6805677813777));
      eigenDecompositionImpl0.getV();
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }
}
