/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 01:12:03 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class NonLinearConjugateGradientOptimizerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE;
      ConvergenceChecker<PointValuePair> convergenceChecker0 = null;
      UnivariateSolver univariateSolver0 = null;
      NonLinearConjugateGradientOptimizer.IdentityPreconditioner nonLinearConjugateGradientOptimizer_IdentityPreconditioner0 = new NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
      assertNotNull(nonLinearConjugateGradientOptimizer_IdentityPreconditioner0);
      
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, convergenceChecker0, univariateSolver0, (Preconditioner) nonLinearConjugateGradientOptimizer_IdentityPreconditioner0);
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getEvaluations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, nonLinearConjugateGradientOptimizer0.getMaxIterations());
      assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
      assertNotNull(nonLinearConjugateGradientOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[9];
      double[] doubleArray0 = new double[3];
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(simpleBounds0);
      
      optimizationDataArray0[4] = (OptimizationData) simpleBounds0;
      assertNotNull(optimizationDataArray0[4]);
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = nonLinearConjugateGradientOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // constraint
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = (-4.299291961717);
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
      int int0 = 13;
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(double0, double0, int0);
      assertEquals((-4.299291961717), simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals((-4.299291961717), simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      BrentSolver brentSolver0 = new BrentSolver((double) int0, double0, double0);
      assertEquals(0.0, brentSolver0.getStartValue(), 0.01D);
      assertEquals((-4.299291961717), brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getEvaluations());
      assertEquals(0.0, brentSolver0.getMin(), 0.01D);
      assertEquals(13.0, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, brentSolver0.getMax(), 0.01D);
      assertEquals(0, brentSolver0.getMaxEvaluations());
      assertEquals((-4.299291961717), brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      NonLinearConjugateGradientOptimizer.IdentityPreconditioner nonLinearConjugateGradientOptimizer_IdentityPreconditioner0 = new NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
      assertNotNull(nonLinearConjugateGradientOptimizer_IdentityPreconditioner0);
      
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) simplePointChecker0, (UnivariateSolver) brentSolver0, (Preconditioner) nonLinearConjugateGradientOptimizer_IdentityPreconditioner0);
      assertEquals((-4.299291961717), simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals((-4.299291961717), simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, nonLinearConjugateGradientOptimizer0.getMaxIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getEvaluations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getIterations());
      assertEquals(0.0, brentSolver0.getStartValue(), 0.01D);
      assertEquals((-4.299291961717), brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getEvaluations());
      assertEquals(0.0, brentSolver0.getMin(), 0.01D);
      assertEquals(13.0, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, brentSolver0.getMax(), 0.01D);
      assertEquals(0, brentSolver0.getMaxEvaluations());
      assertEquals((-4.299291961717), brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(nonLinearConjugateGradientOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[3];
      NonLinearConjugateGradientOptimizer.BracketingStep nonLinearConjugateGradientOptimizer_BracketingStep0 = new NonLinearConjugateGradientOptimizer.BracketingStep(double0);
      assertNotNull(nonLinearConjugateGradientOptimizer_BracketingStep0);
      
      optimizationDataArray0[1] = (OptimizationData) nonLinearConjugateGradientOptimizer_BracketingStep0;
      assertNotNull(optimizationDataArray0[1]);
      
      nonLinearConjugateGradientOptimizer0.parseOptimizationData(optimizationDataArray0);
      assertEquals((-4.299291961717), simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals((-4.299291961717), simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, nonLinearConjugateGradientOptimizer0.getMaxIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getEvaluations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getIterations());
      assertEquals(0.0, brentSolver0.getStartValue(), 0.01D);
      assertEquals((-4.299291961717), brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getEvaluations());
      assertEquals(0.0, brentSolver0.getMin(), 0.01D);
      assertEquals(13.0, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, brentSolver0.getMax(), 0.01D);
      assertEquals(0, brentSolver0.getMaxEvaluations());
      assertEquals((-4.299291961717), brentSolver0.getAbsoluteAccuracy(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.IdentityPreconditioner nonLinearConjugateGradientOptimizer_IdentityPreconditioner0 = new NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
      assertNotNull(nonLinearConjugateGradientOptimizer_IdentityPreconditioner0);
      
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = nonLinearConjugateGradientOptimizer_IdentityPreconditioner0.precondition(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(doubleArray1);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
      double double0 = 3173.3762;
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(double0, double0);
      assertEquals(3173.3762, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(3173.3762, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) simplePointChecker0);
      assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getEvaluations());
      assertEquals(2147483647, nonLinearConjugateGradientOptimizer0.getMaxIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getMaxEvaluations());
      assertEquals(3173.3762, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(3173.3762, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(nonLinearConjugateGradientOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[2];
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
      double double0 = (-4.299291961717);
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
      int int0 = 13;
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(double0, double0, int0);
      assertEquals((-4.299291961717), simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals((-4.299291961717), simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      assertEquals(1.0E-15, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(1.0E-14, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertNotNull(regulaFalsiSolver0);
      
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) simplePointChecker0, (UnivariateSolver) regulaFalsiSolver0);
      assertEquals(1.0E-15, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(1.0E-14, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals((-4.299291961717), simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals((-4.299291961717), simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getEvaluations());
      assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
      assertEquals(2147483647, nonLinearConjugateGradientOptimizer0.getMaxIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getMaxEvaluations());
      assertNotNull(nonLinearConjugateGradientOptimizer0);
  }
}
