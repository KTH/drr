/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:45:09 GMT 2014
 */

package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class OpenMapRealMatrixEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 1202;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(1202, openMapRealMatrix0.getRowDimension());
      assertEquals(1202, openMapRealMatrix0.getColumnDimension());
      
      int int1 = 239;
      openMapRealMatrix0.multiplyEntry(int1, int1, (double) int1);
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(1202, openMapRealMatrix0.getRowDimension());
      assertEquals(1202, openMapRealMatrix0.getColumnDimension());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = 1202;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(1202, openMapRealMatrix0.getRowDimension());
      assertEquals(1202, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      
      int int1 = 239;
      openMapRealMatrix0.addToEntry(int1, int1, (double) int0);
      assertEquals(1202, openMapRealMatrix0.getRowDimension());
      assertEquals(1202, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = 1;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(1, openMapRealMatrix0.getRowDimension());
      assertEquals(1, openMapRealMatrix0.getColumnDimension());
      
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) int0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      assertNotNull(openMapRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01D);
      assertEquals(1, openMapRealVector0.getDimension());
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
      
      OpenMapRealMatrix openMapRealMatrix1 = (OpenMapRealMatrix)openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      assertNotNull(openMapRealMatrix1);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01D);
      assertEquals(1, openMapRealVector0.getDimension());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(1, openMapRealMatrix1.getRowDimension());
      assertEquals(1, openMapRealMatrix1.getColumnDimension());
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
      assertFalse(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      
      OpenMapRealMatrix openMapRealMatrix2 = openMapRealMatrix0.subtract((RealMatrix) openMapRealMatrix1);
      assertNotNull(openMapRealMatrix2);
      assertNotSame(openMapRealMatrix2, openMapRealMatrix1);
      assertNotSame(openMapRealMatrix2, openMapRealMatrix0);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix2);
      assertNotSame(openMapRealMatrix0, openMapRealMatrix2);
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01D);
      assertEquals(1, openMapRealVector0.getDimension());
      assertEquals(true, openMapRealMatrix2.isSquare());
      assertEquals(1, openMapRealMatrix2.getRowDimension());
      assertEquals(1, openMapRealMatrix2.getColumnDimension());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(1, openMapRealMatrix1.getRowDimension());
      assertEquals(1, openMapRealMatrix1.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(1, openMapRealMatrix0.getRowDimension());
      assertEquals(1, openMapRealMatrix0.getColumnDimension());
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
      assertFalse(openMapRealMatrix2.equals((Object)openMapRealMatrix1));
      assertFalse(openMapRealMatrix2.equals((Object)openMapRealMatrix0));
      assertFalse(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      assertFalse(openMapRealMatrix1.equals((Object)openMapRealMatrix2));
      assertFalse(openMapRealMatrix0.equals((Object)openMapRealMatrix2));
      assertFalse(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = 1202;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(1202, openMapRealMatrix0.getColumnDimension());
      assertEquals(1202, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      
      OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.add(openMapRealMatrix0);
      assertNotNull(openMapRealMatrix1);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(1202, openMapRealMatrix1.getRowDimension());
      assertEquals(1202, openMapRealMatrix1.getColumnDimension());
      assertEquals(1202, openMapRealMatrix0.getColumnDimension());
      assertEquals(1202, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertTrue(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      assertTrue(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
  }

  //@Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = 19;
      int int1 = Integer.MAX_VALUE;
      OpenMapRealMatrix openMapRealMatrix0 = null;
      try {
        openMapRealMatrix0 = new OpenMapRealMatrix(int0, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 40,802,189,293 is larger than, or equal to, the maximum (2,147,483,647)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = 118;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(118, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(118, openMapRealMatrix0.getColumnDimension());
      
      OpenMapRealMatrix openMapRealMatrix1 = (OpenMapRealMatrix)openMapRealMatrix0.power(int0);
      assertNotNull(openMapRealMatrix1);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(118, openMapRealMatrix1.getRowDimension());
      assertEquals(118, openMapRealMatrix1.getColumnDimension());
      assertEquals(118, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(118, openMapRealMatrix0.getColumnDimension());
      assertTrue(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      assertTrue(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int int0 = 118;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(118, openMapRealMatrix0.getColumnDimension());
      assertEquals(118, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      
      OpenMapRealMatrix openMapRealMatrix1 = (OpenMapRealMatrix)openMapRealMatrix0.add((RealMatrix) openMapRealMatrix0);
      assertNotNull(openMapRealMatrix1);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertEquals(118, openMapRealMatrix1.getColumnDimension());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(118, openMapRealMatrix1.getRowDimension());
      assertEquals(118, openMapRealMatrix0.getColumnDimension());
      assertEquals(118, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertTrue(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      assertTrue(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
  }
}
