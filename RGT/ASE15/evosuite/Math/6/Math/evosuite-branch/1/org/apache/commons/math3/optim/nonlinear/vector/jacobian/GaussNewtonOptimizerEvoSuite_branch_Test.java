/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:46:29 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class GaussNewtonOptimizerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConvergenceChecker<PointVectorValuePair> convergenceChecker0 = null;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(convergenceChecker0);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertNotNull(gaussNewtonOptimizer0);
      
      // Undeclared exception!
      try {
        PointVectorValuePair pointVectorValuePair0 = gaussNewtonOptimizer0.doOptimize();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = false;
      int int0 = 119;
      SimplePointChecker<PointVectorValuePair> simplePointChecker0 = new SimplePointChecker<PointVectorValuePair>((double) int0, (double) int0);
      assertEquals(119.0, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(119.0, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0, (ConvergenceChecker<PointVectorValuePair>) simplePointChecker0);
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(119.0, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(119.0, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(gaussNewtonOptimizer0);
      
      // Undeclared exception!
      try {
        PointVectorValuePair pointVectorValuePair0 = gaussNewtonOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
