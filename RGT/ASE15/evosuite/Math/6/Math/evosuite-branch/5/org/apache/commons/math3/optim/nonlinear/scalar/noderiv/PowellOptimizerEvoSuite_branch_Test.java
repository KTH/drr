/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 01:01:54 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class PowellOptimizerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 3375.367405332895;
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(double0, double0);
      assertEquals(0, powellOptimizer0.getMaxEvaluations());
      assertNull(powellOptimizer0.getGoalType());
      assertEquals(2147483647, powellOptimizer0.getMaxIterations());
      assertEquals(0, powellOptimizer0.getIterations());
      assertEquals(0, powellOptimizer0.getEvaluations());
      assertNotNull(powellOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[18];
      double[] doubleArray0 = new double[9];
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      assertNotNull(simpleBounds0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[6] = (OptimizationData) simpleBounds0;
      assertNotNull(optimizationDataArray0[6]);
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = powellOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // constraint
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = 25.4371;
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(double0, double0);
      assertEquals(25.4371, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(25.4371, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(simpleValueChecker0);
      
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(double0, double0, double0, double0, (ConvergenceChecker<PointValuePair>) simpleValueChecker0);
      assertEquals(25.4371, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(25.4371, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(0, powellOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, powellOptimizer0.getMaxIterations());
      assertEquals(0, powellOptimizer0.getEvaluations());
      assertEquals(0, powellOptimizer0.getIterations());
      assertNull(powellOptimizer0.getGoalType());
      assertNotNull(powellOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[42];
      double[] doubleArray0 = new double[13];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      assertNotNull(initialGuess0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[0] = (OptimizationData) initialGuess0;
      assertNotNull(optimizationDataArray0[0]);
      
      try {
        PointValuePair pointValuePair0 = powellOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = 2082.473189794926;
      double double1 = (-8.8588);
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(double0, double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -8.859 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = (-0.32889);
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -0.329 is smaller than the minimum (0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = 30.745964488798236;
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(double0, double0, double0, double0);
      assertEquals(0, powellOptimizer0.getEvaluations());
      assertEquals(2147483647, powellOptimizer0.getMaxIterations());
      assertEquals(0, powellOptimizer0.getMaxEvaluations());
      assertEquals(0, powellOptimizer0.getIterations());
      assertNull(powellOptimizer0.getGoalType());
      assertNotNull(powellOptimizer0);
  }
}
