/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 25 14:37:15 GMT 2019
 */

package org.apache.commons.math3.optim;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.linear.SimplexSolver;
import org.apache.commons.math3.optim.univariate.BrentOptimizer;
import org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer;
import org.apache.commons.math3.random.RandomGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class BaseOptimizer_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(1602.7546, 1602.7546);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[2];
      try { 
        brentOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-1.0), (-1));
      int int0 = simplexSolver0.getIterations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(Double.POSITIVE_INFINITY, Integer.MAX_VALUE);
      int int0 = simplexSolver0.getEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(Double.POSITIVE_INFINITY, Integer.MAX_VALUE);
      int int0 = simplexSolver0.getMaxIterations();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-1316.18496073), 0, (-1316.18496073));
      int int0 = simplexSolver0.getMaxEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(1599.255, 1599.255);
      MultiStartUnivariateOptimizer multiStartUnivariateOptimizer0 = new MultiStartUnivariateOptimizer(brentOptimizer0, 1787, (RandomGenerator) null);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[3];
      MaxEval maxEval0 = MaxEval.unlimited();
      optimizationDataArray0[0] = (OptimizationData) maxEval0;
      // Undeclared exception!
      try { 
        multiStartUnivariateOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state
         //
         verifyException("org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(9.223372036854776E18);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[1];
      MaxIter maxIter0 = MaxIter.unlimited();
      optimizationDataArray0[0] = (OptimizationData) maxIter0;
      // Undeclared exception!
      try { 
        simplexSolver0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }
}
