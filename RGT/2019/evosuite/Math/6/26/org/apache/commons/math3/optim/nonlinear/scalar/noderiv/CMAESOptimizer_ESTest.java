/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 25 14:22:36 GMT 2019
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class CMAESOptimizer_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a();
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(17, 17, true, 17, 17, well44497a0, false, (ConvergenceChecker<PointValuePair>) null);
      List<Double> list0 = cMAESOptimizer0.getStatisticsSigmaHistory();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a(396);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer((-2178), (-1793.23), false, (-2178), (-2178), well1024a0, true, (ConvergenceChecker<PointValuePair>) null);
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsDHistory();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Well512a well512a0 = new Well512a();
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(3976, 3058.78266145462);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(0, 3058.78266145462, true, 0, 3976, well512a0, true, simpleValueChecker0);
      List<Double> list0 = cMAESOptimizer0.getStatisticsFitnessHistory();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(1, 305.459994478164);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(1, 1, true, 1, 1, mersenneTwister0, false, simpleValueChecker0);
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsMeanHistory();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (-2846.2);
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = null;
      try {
        cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,846.2 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$Sigma", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CMAESOptimizer.PopulationSize cMAESOptimizer_PopulationSize0 = null;
      try {
        cMAESOptimizer_PopulationSize0 = new CMAESOptimizer.PopulationSize((-1756));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,756 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$PopulationSize", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CMAESOptimizer.PopulationSize cMAESOptimizer_PopulationSize0 = new CMAESOptimizer.PopulationSize(227);
      Well19937c well19937c0 = new Well19937c();
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(227, 227, true, (-538), 227, well19937c0, false, (ConvergenceChecker<PointValuePair>) null);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[3];
      optimizationDataArray0[0] = (OptimizationData) cMAESOptimizer_PopulationSize0;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int[] intArray0 = new int[1];
      ISAACRandom iSAACRandom0 = new ISAACRandom(intArray0);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(2174, 2174, true, 2174, 2174, iSAACRandom0, true, (ConvergenceChecker<PointValuePair>) null);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[8];
      double[] doubleArray0 = new double[8];
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) cMAESOptimizer_Sigma0;
      double[] doubleArray1 = new double[3];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray1);
      optimizationDataArray0[4] = (OptimizationData) initialGuess0;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.parseOptimizationData(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 3
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c((int[]) null);
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(0.0, 1.0E-11);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(0, 0, false, 0, Integer.MAX_VALUE, well19937c0, false, simplePointChecker0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[5];
      double[] doubleArray0 = new double[1];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) initialGuess0;
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      optimizationDataArray0[1] = (OptimizationData) simpleBounds0;
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
      optimizationDataArray0[4] = (OptimizationData) cMAESOptimizer_Sigma0;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c((int[]) null);
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(17.21929835031795, 1.0E-11);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(0, 0, false, 0, Integer.MAX_VALUE, well19937c0, false, simplePointChecker0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[5];
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 17.21929835031795;
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) initialGuess0;
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      optimizationDataArray0[1] = (OptimizationData) simpleBounds0;
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
      optimizationDataArray0[4] = (OptimizationData) cMAESOptimizer_Sigma0;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 17.219 out of [0, 0] range
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", e);
      }
  }
}
