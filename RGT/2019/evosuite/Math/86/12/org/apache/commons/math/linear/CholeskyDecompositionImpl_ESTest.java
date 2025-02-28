/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 04 08:18:30 GMT 2019
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.CholeskyDecompositionImpl;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.DenseRealMatrix;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class CholeskyDecompositionImpl_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DenseRealMatrix denseRealMatrix0 = new DenseRealMatrix(40, 40);
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = null;
      try {
        choleskyDecompositionImpl0 = new CholeskyDecompositionImpl(denseRealMatrix0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // not positive definite matrix
         //
         verifyException("org.apache.commons.math.linear.CholeskyDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = new CholeskyDecompositionImpl(realMatrixImpl0, 871.2399319, 871.2399319);
      DecompositionSolver decompositionSolver0 = choleskyDecompositionImpl0.getSolver();
      assertTrue(decompositionSolver0.isNonSingular());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(4300, 2253);
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = null;
      try {
        choleskyDecompositionImpl0 = new CholeskyDecompositionImpl(openMapRealMatrix0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // a 4,300x2,253 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.CholeskyDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      Double double1 = new Double((-4981.6863779));
      doubleArray0[1] = double1;
      doubleArray0[2] = doubleArray0[0];
      Double double2 = new Double((-4981.6863779));
      doubleArray0[3] = double2;
      doubleArray0[4] = doubleArray0[2];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = null;
      try {
        choleskyDecompositionImpl0 = new CholeskyDecompositionImpl(openMapRealMatrix0, (double) doubleArray0[1], 1.0E-12);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // not symmetric matrix
         //
         verifyException("org.apache.commons.math.linear.CholeskyDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-825.2038195790861));
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = new CholeskyDecompositionImpl(realMatrix0, 1.0, (-825.2038195790861));
      double double0 = choleskyDecompositionImpl0.getDeterminant();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = new CholeskyDecompositionImpl(realMatrixImpl0, (-2392.006626789), 0.0);
      choleskyDecompositionImpl0.getL();
      RealMatrix realMatrix0 = choleskyDecompositionImpl0.getL();
      assertEquals(1, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = new CholeskyDecompositionImpl(realMatrixImpl0, (-2392.006626789), 0.0);
      RealMatrix realMatrix0 = choleskyDecompositionImpl0.getL();
      RealMatrix realMatrix1 = choleskyDecompositionImpl0.getLT();
      assertNotSame(realMatrix1, realMatrix0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = new CholeskyDecompositionImpl(realMatrixImpl0, 1426, 1426);
      double double0 = choleskyDecompositionImpl0.getDeterminant();
      assertEquals(1.0, double0, 0.01);
  }
}
