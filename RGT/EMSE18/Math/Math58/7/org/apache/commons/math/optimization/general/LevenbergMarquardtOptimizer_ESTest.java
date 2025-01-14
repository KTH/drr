/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 20 23:28:02 GMT 2017
 */

package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.optimization.general.CircleVectorial;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class LevenbergMarquardtOptimizer_ESTest  {

  //@Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // evaluations
         //
         verifyException("org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer", e);
      }
  }

  //@Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[8];
      levenbergMarquardtOptimizer0.optimize(1789, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      levenbergMarquardtOptimizer0.rows = 2;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dimensions mismatch: 0 != 2
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  //@Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.cols = (-4507);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  //@Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[2];
      levenbergMarquardtOptimizer0.optimize(10, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      levenbergMarquardtOptimizer0.cols = 10;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(2210.0, 2210.0, 2210.0, 0.06666666666666667, 0.06666666666666667);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[8];
      doubleArray1[2] = (double) 10;
      VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(10, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      assertNotNull(vectorialPointValuePair0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[8];
      VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(10, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      VectorialPointValuePair vectorialPointValuePair1 = levenbergMarquardtOptimizer0.doOptimize();
      assertNotSame(vectorialPointValuePair1, vectorialPointValuePair0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(15.0, 15.0, 15.0);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
  }

  //@Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[3];
      circleVectorial0.addPoint(1985.4407037343506, 10);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(10, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }
}
