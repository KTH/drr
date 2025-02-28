/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:45:25 GMT 2014
 */

package org.apache.commons.math.transform;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.transform.FastCosineTransformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class FastCosineTransformerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FastCosineTransformer fastCosineTransformer0 = new FastCosineTransformer();
      assertNotNull(fastCosineTransformer0);
      
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = fastCosineTransformer0.inversetransform2(doubleArray0);
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FastCosineTransformer fastCosineTransformer0 = new FastCosineTransformer();
      assertNotNull(fastCosineTransformer0);
      
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = fastCosineTransformer0.inversetransform(doubleArray0);
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FastCosineTransformer fastCosineTransformer0 = new FastCosineTransformer();
      assertNotNull(fastCosineTransformer0);
      
      double[] doubleArray0 = new double[10];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(9, polynomialFunction0.degree());
      
      int int0 = 2;
      try {
        double[] doubleArray1 = fastCosineTransformer0.transform((UnivariateRealFunction) polynomialFunction0, doubleArray0[8], doubleArray0[0], int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [0.0, 0.0]
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FastCosineTransformer fastCosineTransformer0 = new FastCosineTransformer();
      assertNotNull(fastCosineTransformer0);
      
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(2, polynomialFunction0.degree());
      
      int int0 = 1502;
      try {
        double[] doubleArray1 = fastCosineTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], doubleArray0[1], int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [0.0, 0.0]
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FastCosineTransformer fastCosineTransformer0 = new FastCosineTransformer();
      assertNotNull(fastCosineTransformer0);
      
      double[] doubleArray0 = new double[10];
      try {
        double[] doubleArray1 = fastCosineTransformer0.inversetransform(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2 plus one: 10
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FastCosineTransformer fastCosineTransformer0 = new FastCosineTransformer();
      assertNotNull(fastCosineTransformer0);
      
      double[] doubleArray0 = new double[8];
      double double0 = 3.141592653589793;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(7, polynomialFunction0.degree());
      
      int int0 = (-976);
      try {
        double[] doubleArray1 = fastCosineTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, double0, doubleArray0[0], int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FastCosineTransformer fastCosineTransformer0 = new FastCosineTransformer();
      assertNotNull(fastCosineTransformer0);
      
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = fastCosineTransformer0.transform(doubleArray0);
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }
}
