/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:47:50 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class SimplexOptimizerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 1.0;
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(double0, double0);
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertNotNull(simplexOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[6];
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = doubleArray0[2];
      doubleArray0[4] = double0;
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0);
      assertEquals(5, multiDirectionalSimplex0.getDimension());
      assertNotNull(multiDirectionalSimplex0);
      assertArrayEquals(new double[] {1.0, 1.0, 1.0, 1.0, 1.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[1] = (OptimizationData) multiDirectionalSimplex0;
      assertEquals(5, multiDirectionalSimplex0.getDimension());
      assertNotNull(optimizationDataArray0[1]);
      
      int int0 = 1610;
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(int0);
      assertNotNull(simpleBounds0);
      
      optimizationDataArray0[2] = (OptimizationData) simpleBounds0;
      assertNotNull(optimizationDataArray0[2]);
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // constraint
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = 742.8777;
      int int0 = 169;
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(double0, double0, int0);
      assertEquals(742.8777, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(742.8777, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer((ConvergenceChecker<PointValuePair>) simplePointChecker0);
      assertEquals(742.8777, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(742.8777, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertNotNull(simplexOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[6];
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) int0;
      doubleArray0[1] = double0;
      doubleArray0[2] = (double) int0;
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = double0;
      doubleArray0[5] = doubleArray0[4];
      doubleArray0[6] = (double) int0;
      doubleArray0[7] = double0;
      doubleArray0[8] = (double) int0;
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      assertNotNull(initialGuess0);
      assertArrayEquals(new double[] {169.0, 742.8777, 169.0, 169.0, 742.8777, 742.8777, 169.0, 742.8777, 169.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[2] = (OptimizationData) initialGuess0;
      assertNotNull(optimizationDataArray0[2]);
      
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0);
      assertEquals(9, multiDirectionalSimplex0.getDimension());
      assertNotNull(multiDirectionalSimplex0);
      assertArrayEquals(new double[] {169.0, 742.8777, 169.0, 169.0, 742.8777, 742.8777, 169.0, 742.8777, 169.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[4] = (OptimizationData) multiDirectionalSimplex0;
      assertEquals(9, multiDirectionalSimplex0.getDimension());
      assertNotNull(optimizationDataArray0[4]);
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = 1.0;
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(double0, double0);
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertNotNull(simplexOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[6];
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
      }
  }
}
