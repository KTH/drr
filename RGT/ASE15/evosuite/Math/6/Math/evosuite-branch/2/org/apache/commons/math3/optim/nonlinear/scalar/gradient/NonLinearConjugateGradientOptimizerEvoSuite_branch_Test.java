/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:37:39 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math3.analysis.solvers.MullerSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class NonLinearConjugateGradientOptimizerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 2.460564136505127;
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE;
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(double0, double0);
      assertEquals(2.460564136505127, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(2.460564136505127, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(simpleValueChecker0);
      
      MullerSolver mullerSolver0 = new MullerSolver();
      assertEquals(0, mullerSolver0.getEvaluations());
      assertEquals(0.0, mullerSolver0.getMax(), 0.01D);
      assertEquals(0, mullerSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, mullerSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, mullerSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01D);
      assertNotNull(mullerSolver0);
      
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) simpleValueChecker0, (UnivariateSolver) mullerSolver0);
      assertEquals(0, mullerSolver0.getEvaluations());
      assertEquals(0.0, mullerSolver0.getMax(), 0.01D);
      assertEquals(0, mullerSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, mullerSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, mullerSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(2.460564136505127, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(2.460564136505127, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, nonLinearConjugateGradientOptimizer0.getMaxIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getEvaluations());
      assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
      assertNotNull(nonLinearConjugateGradientOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[11];
      int int0 = 229;
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(int0);
      assertNotNull(simpleBounds0);
      
      optimizationDataArray0[1] = (OptimizationData) simpleBounds0;
      assertNotNull(optimizationDataArray0[1]);
      
      // Undeclared exception!
      try {
        nonLinearConjugateGradientOptimizer0.parseOptimizationData(optimizationDataArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // constraint
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = 2.460564136505127;
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE;
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(double0, double0);
      assertEquals(2.460564136505127, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(2.460564136505127, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(simpleValueChecker0);
      
      MullerSolver mullerSolver0 = new MullerSolver();
      assertEquals(0.0, mullerSolver0.getMax(), 0.01D);
      assertEquals(0.0, mullerSolver0.getMin(), 0.01D);
      assertEquals(0, mullerSolver0.getEvaluations());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, mullerSolver0.getStartValue(), 0.01D);
      assertEquals(0, mullerSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01D);
      assertNotNull(mullerSolver0);
      
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) simpleValueChecker0, (UnivariateSolver) mullerSolver0);
      assertEquals(2.460564136505127, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(2.460564136505127, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(0.0, mullerSolver0.getMax(), 0.01D);
      assertEquals(0.0, mullerSolver0.getMin(), 0.01D);
      assertEquals(0, mullerSolver0.getEvaluations());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, mullerSolver0.getStartValue(), 0.01D);
      assertEquals(0, mullerSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getEvaluations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getIterations());
      assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
      assertEquals(2147483647, nonLinearConjugateGradientOptimizer0.getMaxIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getMaxEvaluations());
      assertNotNull(nonLinearConjugateGradientOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[11];
      NonLinearConjugateGradientOptimizer.BracketingStep nonLinearConjugateGradientOptimizer_BracketingStep0 = new NonLinearConjugateGradientOptimizer.BracketingStep(double0);
      assertNotNull(nonLinearConjugateGradientOptimizer_BracketingStep0);
      
      optimizationDataArray0[6] = (OptimizationData) nonLinearConjugateGradientOptimizer_BracketingStep0;
      assertNotNull(optimizationDataArray0[6]);
      
      nonLinearConjugateGradientOptimizer0.parseOptimizationData(optimizationDataArray0);
      assertEquals(2.460564136505127, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(2.460564136505127, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(0.0, mullerSolver0.getMax(), 0.01D);
      assertEquals(0.0, mullerSolver0.getMin(), 0.01D);
      assertEquals(0, mullerSolver0.getEvaluations());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, mullerSolver0.getStartValue(), 0.01D);
      assertEquals(0, mullerSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getEvaluations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getIterations());
      assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
      assertEquals(2147483647, nonLinearConjugateGradientOptimizer0.getMaxIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      NonLinearConjugateGradientOptimizer.IdentityPreconditioner nonLinearConjugateGradientOptimizer_IdentityPreconditioner0 = new NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
      assertNotNull(nonLinearConjugateGradientOptimizer_IdentityPreconditioner0);
      
      double[] doubleArray1 = nonLinearConjugateGradientOptimizer_IdentityPreconditioner0.precondition(doubleArray0, doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(doubleArray1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
      double double0 = 1.3923850661332222;
      int int0 = 666;
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(double0, double0, int0);
      assertEquals(1.3923850661332222, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(1.3923850661332222, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertNotNull(bracketingNthOrderBrentSolver0);
      
      NonLinearConjugateGradientOptimizer.IdentityPreconditioner nonLinearConjugateGradientOptimizer_IdentityPreconditioner0 = new NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
      assertNotNull(nonLinearConjugateGradientOptimizer_IdentityPreconditioner0);
      
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) simplePointChecker0, (UnivariateSolver) bracketingNthOrderBrentSolver0, (Preconditioner) nonLinearConjugateGradientOptimizer_IdentityPreconditioner0);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.3923850661332222, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(1.3923850661332222, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getMaxEvaluations());
      assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getEvaluations());
      assertEquals(2147483647, nonLinearConjugateGradientOptimizer0.getMaxIterations());
      assertNotNull(nonLinearConjugateGradientOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[3];
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = nonLinearConjugateGradientOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE;
      ConvergenceChecker<PointValuePair> convergenceChecker0 = null;
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, convergenceChecker0);
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getEvaluations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getIterations());
      assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
      assertEquals(2147483647, nonLinearConjugateGradientOptimizer0.getMaxIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getMaxEvaluations());
      assertNotNull(nonLinearConjugateGradientOptimizer0);
  }
}
