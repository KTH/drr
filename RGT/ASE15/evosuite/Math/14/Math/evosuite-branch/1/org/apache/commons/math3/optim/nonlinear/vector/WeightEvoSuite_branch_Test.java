/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:34:58 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.vector;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class WeightEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 1412;
      int int1 = 1220;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(int0, int1);
      assertEquals(1220, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(1412, array2DRowRealMatrix0.getRowDimension());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertNotNull(array2DRowRealMatrix0);
      
      Weight weight0 = null;
      try {
        weight0 = new Weight((RealMatrix) array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // non square (1,220x1,412) matrix
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(doubleArray0);
      assertEquals(1, blockRealMatrix0.getRowDimension());
      assertEquals(1, blockRealMatrix0.getColumnDimension());
      assertEquals(false, blockRealMatrix0.isTransposable());
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertNotNull(blockRealMatrix0);
      
      Weight weight0 = new Weight((RealMatrix) blockRealMatrix0);
      assertEquals(1, blockRealMatrix0.getRowDimension());
      assertEquals(1, blockRealMatrix0.getColumnDimension());
      assertEquals(false, blockRealMatrix0.isTransposable());
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertNotNull(weight0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Weight weight0 = new Weight(doubleArray0);
      assertNotNull(weight0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      DiagonalMatrix diagonalMatrix0 = (DiagonalMatrix)weight0.getWeight();
      assertEquals(1, diagonalMatrix0.getColumnDimension());
      assertEquals(false, diagonalMatrix0.isTransposable());
      assertEquals(true, diagonalMatrix0.isSquare());
      assertEquals(1, diagonalMatrix0.getRowDimension());
      assertNotNull(diagonalMatrix0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }
}
