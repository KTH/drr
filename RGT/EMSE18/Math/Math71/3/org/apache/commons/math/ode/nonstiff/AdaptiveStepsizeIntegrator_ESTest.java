/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 03:41:27 GMT 2017
 */

package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.TestProblem5;
import org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math.ode.nonstiff.StepProblem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class AdaptiveStepsizeIntegrator_ESTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1388.1986973843, 1388.1986973843, doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.filterStep(1388.1986973843, false, false);
      assertEquals(1388.1986973843, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(1388.1986973843, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 295.9112, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      dormandPrince54Integrator0.setInitialStepSize(0.0);
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.initializeStep(testProblem5_0, false, 7, doubleArray0, (-273.9435839582), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-13.61039454664), (-13.61039454664), doubleArray0, doubleArray0);
      dormandPrince54Integrator0.setInitialStepSize((-13.61039454664));
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(13.61039454664, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-762.547), 0.0, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      highamHall54Integrator0.sanityChecks(testProblem5_0, 1388.1986973843, doubleArray0, Double.NaN, doubleArray0);
      assertEquals(-0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3762.37377933488), (-945.8), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.resetInternalState();
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(1886.3862596231265, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 691.6625;
      doubleArray0[1] = 1388.1986973843;
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1388.1986973843, 1388.1986973843, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      dormandPrince54Integrator0.integrate(testProblem5_0, 5, doubleArray0, (-1852.4695882681), doubleArray0);
      assertArrayEquals(new double[] {1.4895748422086252E32, 2.989645752965409E32}, doubleArray0, 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getMinStep();
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2471.15, 2471.15, 2471.15, 2471.15);
      double double0 = dormandPrince853Integrator0.getMinStep();
      assertEquals(2471.15, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(2471.15, double0, 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-762.547), 0.0, doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getMaxStep();
      assertEquals(0.0, double0, 0.01);
      assertEquals(-0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-78.125), (-78.125), doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.getMaxStep();
      assertEquals((-78.125), double0, 0.01);
      assertEquals(78.125, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(5, (double) 5, 0.0, 600.92533948, (-34.6));
      double double0 = adamsMoultonIntegrator0.filterStep(962.38342286, false, false);
      assertEquals(0.0, adamsMoultonIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(Double.NaN, adamsMoultonIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(5.0, adamsMoultonIntegrator0.getMinStep(), 0.01);
  }

  ////@Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(3540.1901496, 0.0, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        dormandPrince54Integrator0.sanityChecks(testProblem5_0, (-1206.6472), doubleArray0, 3540.1901496, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 2, initial state vector has dimension 5
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      StepProblem stepProblem0 = new StepProblem(0.0, Double.NEGATIVE_INFINITY, 2.220446049250313E-16);
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.sanityChecks(stepProblem0, Double.POSITIVE_INFINITY, (double[]) null, 0.0, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1399.16, 2387.094065463391, 3087.045, 1399.16);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        highamHall54Integrator0.integrate((FirstOrderDifferentialEquations) null, 3087.045, doubleArray0, 2387.094065463391, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3358.3751, 0.0, 3358.3751, 3358.3751);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[8];
      graggBulirschStoerIntegrator0.setMaxEvaluations(0);
      try { 
        graggBulirschStoerIntegrator0.initializeStep(testProblem5_0, true, 0, doubleArray0, (-1444.1063564174), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 295.9112, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray1 = new double[1];
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.initializeStep(testProblem5_0, false, 7, doubleArray1, (-273.9435839582), doubleArray0, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(3102.0409, 117.98, 3102.0409, 3102.0409);
      try { 
        dormandPrince54Integrator0.filterStep(1003.7025512, false, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (3.10E03) reached, integration needs 1.00E03
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3762.37377933488), (-945.8), doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.getMinStep();
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(1886.3862596231265, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-3762.37377933488), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      double double0 = dormandPrince54Integrator0.getMaxStep();
      assertEquals(Double.POSITIVE_INFINITY, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3762.37377933488), (-945.8), doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(356.127650538, true, true);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals((-945.8), double0, 0.01);
      assertEquals(1886.3862596231265, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  ////@Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 691.6625;
      doubleArray0[1] = 1388.1986973843;
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1388.1986973843, 0.0, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        dormandPrince54Integrator0.integrate(testProblem5_0, 5, doubleArray0, (-2355.4635128257582), doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (1.39E03) reached, integration needs 0.00E00
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(62.5857, 2471.15, 2471.15, 1.0E-10);
      double double0 = highamHall54Integrator0.filterStep((-1.0), true, true);
      assertEquals(62.5857, double0, 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(393.26664307439046, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  ////@Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.01;
      doubleArray0[1] = (double) 1;
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, 2800.0, (-267.0), doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        adamsBashforthIntegrator0.integrate(testProblem5_0, 0.01, doubleArray0, 11.0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (2.80E03) reached, integration needs 1.55E02
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 295.91;
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 295.91, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 295.91;
      double[] doubleArray2 = new double[3];
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.initializeStep(testProblem5_0, false, (-2), doubleArray0, 101.5331225588257, doubleArray1, doubleArray2, doubleArray2, doubleArray2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray1);
      TestProblem5 testProblem5_0 = new TestProblem5();
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.initializeStep(testProblem5_0, true, (-786), doubleArray1, 242.28349177525817, doubleArray1, (double[]) null, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 295.9112, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      dormandPrince54Integrator0.setInitialStepSize(0.001613);
      double double0 = dormandPrince54Integrator0.initializeStep(testProblem5_0, false, 7, doubleArray0, (-273.9435839582), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals((-0.001613), double0, 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 295.91, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      dormandPrince54Integrator0.setInitialStepSize(0.0016132115863414821);
      double double0 = dormandPrince54Integrator0.initializeStep(testProblem5_0, true, 7, doubleArray0, (-273.9435839582), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(295.91, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(0.0016132115863414821, double0, 0.01);
  }

  ////@Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray1 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1852.4695882681), 1.0E-15, doubleArray0, doubleArray1);
      try { 
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, 3358.3751, doubleArray0, (-762.547), doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: state vector has dimension 2, relative tolerance vector has dimension 1
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3358.3751, 0.0, 3358.3751, 3358.3751);
      graggBulirschStoerIntegrator0.setInitialStepSize(3358.3751);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(3358.3751, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 295.91, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.setInitialStepSize((-32.0));
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(295.91, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }
}
