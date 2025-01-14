/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:46:09 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class BrentSolverEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double double0 = (-752.91197805);
      double double1 = 3178.532661964244;
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = double0;
      doubleArray0[9] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(9, polynomialFunction0.degree());
      assertArrayEquals(new double[] {(-752.91197805), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 3178.532661964244}, doubleArray0, 0.01);
      
      double double2 = 0.0;
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double2, doubleArray0[9]);
      assertEquals(0.8521223172222114, double3, 0.01D);
      assertEquals(9, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(32, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertFalse(double2 == double3);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertFalse(double3 == double0);
      assertArrayEquals(new double[] {(-752.91197805), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 3178.532661964244}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      
      double double0 = (-752.91197805);
      double double1 = 3178.532661964244;
      int int0 = 27;
      brentSolver0.setMaximalIterationCount(int0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(27, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = double0;
      doubleArray0[9] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(9, polynomialFunction0.degree());
      assertArrayEquals(new double[] {(-752.91197805), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 3178.532661964244}, doubleArray0, 0.01);
      
      try {
        double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[0], doubleArray0[9]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (27) exceeded
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = 182.526633314822;
      doubleArray0[1] = double0;
      double double1 = (-1285.9597047699733);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(1, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 182.526633314822, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 182.526633314822, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double2 = 0.0;
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double1, double2);
      assertEquals(0.0, double3, 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1, polynomialFunction0.degree());
      assertFalse(double2 == double0);
      assertTrue(double2 == double3);
      assertFalse(double2 == double1);
      assertFalse(double3 == double0);
      assertTrue(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertArrayEquals(new double[] {0.0, 182.526633314822, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double double0 = (-3420.065607034795);
      double[] doubleArray0 = new double[10];
      doubleArray0[4] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(4, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-3420.065607034795), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      PolynomialFunction polynomialFunction1 = (PolynomialFunction)polynomialFunction0.derivative();
      assertNotNull(polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertEquals(3, polynomialFunction1.degree());
      assertEquals(4, polynomialFunction0.degree());
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-3420.065607034795), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = 1047.7864020401644;
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction1, double0, double1);
      assertEquals(1.8506694566857008E-7, double2, 0.01D);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(93, brentSolver0.getIterationCount());
      assertEquals(3, polynomialFunction1.degree());
      assertEquals(4, polynomialFunction0.degree());
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-3420.065607034795), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      
      double[] doubleArray0 = new double[9];
      double double0 = (-3642.3168704418836);
      doubleArray0[2] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(2, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, (-3642.3168704418836), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = 2021.59408059;
      // Undeclared exception!
      try {
        double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[2], double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-3,642.317, 2,021.594], Values: [-48,320,695,449.601, -14,885,575,845.985]
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double double0 = 1.0E-14;
      double[] doubleArray0 = new double[11];
      doubleArray0[0] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {1.0E-14, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.multiply(polynomialFunction0);
      assertNotNull(polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertEquals(0, polynomialFunction1.degree());
      assertEquals(0, polynomialFunction0.degree());
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertArrayEquals(new double[] {1.0E-14, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction1, doubleArray0[2], doubleArray0[0]);
      assertEquals(0.0, double1, 0.01D);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertEquals(0, polynomialFunction1.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, polynomialFunction0.degree());
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(double1 == double0);
      assertArrayEquals(new double[] {1.0E-14, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = (-1312.7851);
      doubleArray0[6] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(6, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-1312.7851), 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertEquals(6, polynomialFunction0.degree());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-1312.7851), 0.0}, doubleArray0, 0.01);
      
      double double1 = Double.NaN;
      double double2 = brentSolver0.solve(double1, doubleArray0[1]);
      assertEquals(0.0, double2, 0.01D);
      assertEquals(6, polynomialFunction0.degree());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-1312.7851), 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      double double0 = 4501.511369558;
      double double1 = 206.21239;
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double2 = (-1126.0);
      brentSolver0.setFunctionValueAccuracy(double2);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-1126.0), brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      
      doubleArray0[0] = double0;
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[2], doubleArray0[0], double1);
      assertEquals(3069.7450428720254, double3, 0.01D);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-1126.0), brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(33, brentSolver0.getIterationCount());
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertArrayEquals(new double[] {4501.511369558, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = 182.526633314822;
      doubleArray0[1] = double0;
      double double1 = 1.0E-14;
      double double2 = (-1285.9597047699733);
      doubleArray0[3] = double2;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(3, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 182.526633314822, 0.0, (-1285.9597047699733), 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(3, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 182.526633314822, 0.0, (-1285.9597047699733), 0.0}, doubleArray0, 0.01);
      
      double double3 = brentSolver0.solve(doubleArray0[3], doubleArray0[1], double1);
      assertEquals(0.376746652641227, double3, 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(24, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(3, polynomialFunction0.degree());
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double1 == double3);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertArrayEquals(new double[] {0.0, 182.526633314822, 0.0, (-1285.9597047699733), 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double double0 = 3800.554740750835;
      double double1 = 154.46;
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = double0;
      double double2 = (-1.0);
      doubleArray0[1] = double2;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(1, polynomialFunction0.degree());
      assertArrayEquals(new double[] {3800.554740750835, (-1.0), 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double2, doubleArray0[0], double1);
      assertEquals(0.0, double3, 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1, polynomialFunction0.degree());
      assertFalse(double2 == double0);
      assertFalse(double2 == double3);
      assertFalse(double2 == double1);
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertFalse(double3 == double0);
      assertFalse(double1 == double3);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertArrayEquals(new double[] {3800.554740750835, (-1.0), 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[19];
      double double0 = 130.6530038845;
      double double1 = (-164.033);
      doubleArray0[2] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(2, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, (-164.033), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertNotNull(polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertEquals(2, polynomialFunction0.degree());
      assertEquals(1, polynomialFunction1.degree());
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertArrayEquals(new double[] {0.0, 0.0, (-164.033), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction1);
      assertNotNull(brentSolver0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(2, polynomialFunction0.degree());
      assertEquals(1, polynomialFunction1.degree());
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertArrayEquals(new double[] {0.0, 0.0, (-164.033), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double2 = 3355.2965591601164;
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction1, double1, double2, double0);
      assertEquals(0.0, double3, 0.01D);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(2, polynomialFunction0.degree());
      assertEquals(1, polynomialFunction1.degree());
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(double2 == double3);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(double0 == double2);
      assertFalse(double0 == double3);
      assertFalse(double0 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double1 == double3);
      assertArrayEquals(new double[] {0.0, 0.0, (-164.033), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = 0.0;
      double double1 = 108.42337196424074;
      doubleArray0[1] = double1;
      double double2 = 1.0E-14;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(1, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 108.42337196424074, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 108.42337196424074, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double3 = brentSolver0.solve(double0, doubleArray0[1], double2);
      assertEquals(0.0, double3, 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1, polynomialFunction0.degree());
      assertFalse(double0 == double2);
      assertTrue(double0 == double3);
      assertFalse(double0 == double1);
      assertTrue(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertArrayEquals(new double[] {0.0, 108.42337196424074, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      
      double double0 = 3819.1308306790347;
      double double1 = 2176.69378032;
      double[] doubleArray0 = new double[19];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      doubleArray0[0] = double0;
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[2], doubleArray0[0], double1);
      assertEquals(2176.69378032, double2, 0.01D);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertFalse(double2 == double0);
      assertTrue(double2 == double1);
      assertFalse(double1 == double0);
      assertTrue(double1 == double2);
      assertArrayEquals(new double[] {3819.1308306790347, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  //@Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      
      double double0 = 1502.3926968932246;
      double double1 = 154.458307903448;
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {1502.3926968932246}, doubleArray0, 0.01);
      
      double double2 = (-15.295410272352761);
      // Undeclared exception!
      try {
        double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double2, doubleArray0[0], double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-15.295, 1,502.393], Values: [1,502.393, 1,502.393]
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = (-1312.7851);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(brentSolver0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = brentSolver0.solve(double0, doubleArray0[1]);
      assertEquals((-1312.7851), double1, 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, polynomialFunction0.degree());
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }
}
