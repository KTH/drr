/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:58:34 GMT 2014
 */

package org.apache.commons.math3.optimization;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.Weight;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class WeightEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[][] doubleArray0 = new double[6][2];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertEquals(2, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(6, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertNotNull(array2DRowRealMatrix0);
      
      Weight weight0 = null;
      try {
        weight0 = new Weight((RealMatrix) array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // non square (2x6) matrix
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      Weight weight0 = new Weight(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(weight0);
      
      DiagonalMatrix diagonalMatrix0 = (DiagonalMatrix)weight0.getWeight();
      assertEquals(7, diagonalMatrix0.getColumnDimension());
      assertEquals(true, diagonalMatrix0.isSquare());
      assertEquals(7, diagonalMatrix0.getRowDimension());
      assertEquals(false, diagonalMatrix0.isTransposable());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(diagonalMatrix0);
      
      Weight weight1 = new Weight((RealMatrix) diagonalMatrix0);
      assertFalse(weight1.equals((Object)weight0));
      assertFalse(weight0.equals((Object)weight1));
      assertEquals(7, diagonalMatrix0.getColumnDimension());
      assertEquals(true, diagonalMatrix0.isSquare());
      assertEquals(7, diagonalMatrix0.getRowDimension());
      assertEquals(false, diagonalMatrix0.isTransposable());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(weight1, weight0);
      assertNotSame(weight0, weight1);
      assertNotNull(weight1);
  }
}
