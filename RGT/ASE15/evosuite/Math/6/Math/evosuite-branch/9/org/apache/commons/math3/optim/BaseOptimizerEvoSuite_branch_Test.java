/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 06:37:57 GMT 2014
 */

package org.apache.commons.math3.optim;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.linear.SimplexSolver;
import org.apache.commons.math3.optim.univariate.BrentOptimizer;
import org.apache.commons.math3.optim.univariate.UnivariatePointValuePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class BaseOptimizerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      assertEquals(0, simplexSolver0.getMaxEvaluations());
      assertEquals(2147483647, simplexSolver0.getMaxIterations());
      assertEquals(0, simplexSolver0.getEvaluations());
      assertEquals(0, simplexSolver0.getIterations());
      assertNull(simplexSolver0.getGoalType());
      assertNotNull(simplexSolver0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[20];
      MaxIter maxIter0 = MaxIter.unlimited();
      assertEquals(2147483647, maxIter0.getMaxIter());
      assertNotNull(maxIter0);
      
      optimizationDataArray0[2] = (OptimizationData) maxIter0;
      assertEquals(2147483647, maxIter0.getMaxIter());
      assertNotNull(optimizationDataArray0[2]);
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = simplexSolver0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      assertEquals(0, simplexSolver0.getEvaluations());
      assertEquals(0, simplexSolver0.getMaxEvaluations());
      assertNull(simplexSolver0.getGoalType());
      assertEquals(2147483647, simplexSolver0.getMaxIterations());
      assertEquals(0, simplexSolver0.getIterations());
      assertNotNull(simplexSolver0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[20];
      MaxEval maxEval0 = MaxEval.unlimited();
      assertEquals(2147483647, maxEval0.getMaxEval());
      assertNotNull(maxEval0);
      
      optimizationDataArray0[19] = (OptimizationData) maxEval0;
      assertEquals(2147483647, maxEval0.getMaxEval());
      assertNotNull(optimizationDataArray0[19]);
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = simplexSolver0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = 2147483574;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer((double) int0, (double) int0);
      assertEquals(0, brentOptimizer0.getIterations());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, brentOptimizer0.getMaxIterations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertNotNull(brentOptimizer0);
      
      int int1 = brentOptimizer0.getIterations();
      assertEquals(0, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(0, brentOptimizer0.getIterations());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, brentOptimizer0.getMaxIterations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = (-745.631197799071);
      SimplexSolver simplexSolver0 = new SimplexSolver(double0);
      assertEquals(0, simplexSolver0.getMaxEvaluations());
      assertNull(simplexSolver0.getGoalType());
      assertEquals(2147483647, simplexSolver0.getMaxIterations());
      assertEquals(0, simplexSolver0.getEvaluations());
      assertEquals(0, simplexSolver0.getIterations());
      assertNotNull(simplexSolver0);
      
      int int0 = simplexSolver0.getEvaluations();
      assertEquals(0, int0);
      assertEquals(0, simplexSolver0.getMaxEvaluations());
      assertNull(simplexSolver0.getGoalType());
      assertEquals(2147483647, simplexSolver0.getMaxIterations());
      assertEquals(0, simplexSolver0.getEvaluations());
      assertEquals(0, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = (-745.631197799071);
      SimplexSolver simplexSolver0 = new SimplexSolver(double0);
      assertEquals(0, simplexSolver0.getIterations());
      assertNull(simplexSolver0.getGoalType());
      assertEquals(0, simplexSolver0.getEvaluations());
      assertEquals(0, simplexSolver0.getMaxEvaluations());
      assertEquals(2147483647, simplexSolver0.getMaxIterations());
      assertNotNull(simplexSolver0);
      
      int int0 = simplexSolver0.getMaxEvaluations();
      assertEquals(0, int0);
      assertEquals(0, simplexSolver0.getIterations());
      assertNull(simplexSolver0.getGoalType());
      assertEquals(0, simplexSolver0.getEvaluations());
      assertEquals(0, simplexSolver0.getMaxEvaluations());
      assertEquals(2147483647, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = 2147483574;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer((double) int0, (double) int0);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(2147483647, brentOptimizer0.getMaxIterations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNotNull(brentOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[49];
      try {
        UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int int0 = 2147483574;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer((double) int0, (double) int0);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getIterations());
      assertEquals(2147483647, brentOptimizer0.getMaxIterations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNotNull(brentOptimizer0);
      
      int int1 = brentOptimizer0.getMaxIterations();
      assertEquals(Integer.MAX_VALUE, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getIterations());
      assertEquals(2147483647, brentOptimizer0.getMaxIterations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
  }
}
