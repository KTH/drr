/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 18:05:39 GMT 2019
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.BrentSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.PolynomialSplineFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class BrentSolver_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve(91.99341, (-1424.4), 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      // Undeclared exception!
      try { 
        brentSolver0.solve((-1.0), (-1.0), 2585.11022316563);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Initial guess is not in search interval.  Initial: 2585.11022316563  Endpoints: [-1.0,-1.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (-103.456);
      doubleArray0[2] = (-1.0);
      doubleArray0[3] = 1997.45497752407;
      doubleArray0[4] = 601.17826;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      double double0 = brentSolver0.solve(0.0, (-992.281206615), Double.NaN);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 282.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve(0.0, 282.0, 0.0);
      assertEquals(187.9999998501773, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[6] = (-2425.269379053294);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction1);
      double double0 = brentSolver0.solve((-2400.8092293018008), 1554.1733989980771, 221.743333076956);
      assertEquals(9.752787733465386E-5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = 225.9;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve(675.8226750603454, 0.0, 1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = 2.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      double double0 = brentSolver0.solve(2842.15856, (-5216.3), 2842.15856);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((-3782.043017670984), 282.0);
      assertEquals((-3782.043017670984), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-1572.09);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      try { 
        brentSolver0.solve((-5216.3), 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-5216.3,0.0]  Values: [-1572.09,-1572.09]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[5] = (-4026.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction1);
      brentSolver0.setFunctionValueAccuracy(Double.POSITIVE_INFINITY);
      double double0 = brentSolver0.solve((-2487.65546301828), 245.6731767691797);
      assertEquals((-2487.65546301828), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 6.421806262187901E-5;
      doubleArray0[3] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      brentSolver0.functionValueAccuracy = 112.3226055829396;
      double double0 = brentSolver0.solve((-592.29), 6.456044708352184E-4);
      assertEquals(6.456044708352184E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = 282.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      double double0 = brentSolver0.solve((-3782.043017670984), 282.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = Double.NaN;
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[0] = polynomialFunction0;
      PolynomialSplineFunction polynomialSplineFunction0 = new PolynomialSplineFunction(doubleArray0, polynomialFunctionArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialSplineFunction0);
      double double0 = brentSolver0.solve(Double.NaN, 3048.9354279329405);
      assertEquals(3048.9354279329405, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-281.625);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      try { 
        brentSolver0.solve((-1465.08702), Double.NaN, 0.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 282.0;
      doubleArray0[1] = 282.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve(0.0, 282.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }
}
