/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 20:25:27 GMT 2017
 */

package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.TestProblem5;
import org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math.ode.nonstiff.StepProblem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class AdaptiveStepsizeIntegrator_ESTest  {

  ////@Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1624.457, 0.0, doubleArray0, doubleArray0);
      try { 
        dormandPrince54Integrator0.filterStep(379.1019574277046, false, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (1.62E03) reached, integration needs 3.79E02
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 4314.045569;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(doubleArray0[0], (-1376.3368908869738), 0.0, 4314.045569);
      double double0 = graggBulirschStoerIntegrator0.filterStep(2.2404374302607883, true, true);
      assertEquals(1376.3368908869738, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(2436.7150152576696, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1697.5684159591076, 1697.5684159591076, 1697.5684159591076, 1697.5684159591076);
      graggBulirschStoerIntegrator0.setInitialStepSize(1697.5684159591076);
      assertEquals(1697.5684159591076, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.resetInternalState();
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-0.5), (-4184.0), (-4184.0), 61.05);
      StepProblem stepProblem0 = new StepProblem((-0.5), (-0.5), (-774.0));
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.integrate(stepProblem0, (-4184.0), doubleArray0, 2281.94, doubleArray0);
      assertEquals(998.9017368802683, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, 0.0, (-1430.6974642678638));
      double double0 = highamHall54Integrator0.getMinStep();
      assertEquals(0.0, double0, 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((double) (-4238), 1950.210941, doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getMinStep();
      assertEquals((-4238.0), double0, 0.01);
      assertEquals(1950.210941, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, (double) 4687);
      dormandPrince853Integrator0.getMaxStep();
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-3354.7268041946), (-3354.7268041946), doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getMaxStep();
      assertEquals(3354.7268041946, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-3354.7268041946), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.filterStep(0.0, true, false);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1699.2, 1699.2, 1699.2, 1699.2);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-844.8133114363083), false, true);
      assertEquals(1699.2, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals((-1699.2), double0, 0.01);
  }

  ////@Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1193.93336210568), (-1193.93336210568), doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.sanityChecks((FirstOrderDifferentialEquations) null, (-1193.93336210568), doubleArray0, (-1193.93336210568), doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-319.9221145), (-319.9221145), doubleArray0, doubleArray0);
      StepProblem stepProblem0 = new StepProblem((-922.52573495195), (-319.9221145), (-319.9221145));
      try { 
        highamHall54Integrator0.integrate(stepProblem0, (-3404.188139767), doubleArray0, (-394.636907), doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 1, initial state vector has dimension 5
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.225, 0.225, 0.225, 0.0);
      StepProblem stepProblem0 = new StepProblem((-2352.527654929), 5.333333333333333, 5.333333333333333);
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.integrate(stepProblem0, 0.0, (double[]) null, 0.0, (double[]) null);
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
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1228.089763227737), (-1228.089763227737), (-2171.7934432607267), (-1228.089763227737));
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      dormandPrince853Integrator0.integrate(testProblem5_0, (-1228.089763227737), doubleArray0, 0.0, doubleArray0);
      double[] doubleArray1 = new double[3];
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.initializeStep(testProblem5_0, true, 8, doubleArray1, 0.0, doubleArray1, doubleArray1, doubleArray1, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1228.089763227737), (-1228.089763227737), (-2171.7934432607267), (-1228.089763227737));
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      dormandPrince853Integrator0.integrate(testProblem5_0, (-1228.089763227737), doubleArray0, 0.0, doubleArray0);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 8;
      doubleArray1[1] = (-2171.7934432607267);
      double double0 = dormandPrince853Integrator0.initializeStep(testProblem5_0, false, 8, doubleArray1, 8, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(27, testProblem5_0.getCalls());
      assertEquals((-1228.089763227737), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1228.089763227737), (-1228.089763227737), (-2171.7934432607267), (-1228.089763227737));
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 8;
      doubleArray1[1] = (-2171.7934432607267);
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.initializeStep(testProblem5_0, false, 8, doubleArray1, 8, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-0.5), (-4184.0), (-4184.0), 61.05);
      StepProblem stepProblem0 = new StepProblem((-0.5), (-0.5), (-774.0));
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.setInitialStepSize(1362.2528275112375);
      double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, true, 2, doubleArray0, 100.6317191205587, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(45.73838650411709, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(1362.2528275112375, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1699.2, 1699.2, 1699.2, 1699.2);
      double double0 = graggBulirschStoerIntegrator0.getMinStep();
      assertEquals(1699.2, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(1699.2, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-105.210245787), 1.0, 1076.46482899026, 1.0E-6);
      double double0 = highamHall54Integrator0.getMaxStep();
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(10.257204579562602, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1228.089763227737), (-1228.089763227737), (-2171.7934432607267), (-1228.089763227737));
      double double0 = dormandPrince853Integrator0.filterStep(0.0, true, true);
      assertEquals(1228.089763227737, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(1228.089763227737, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-0.5), (-4184.0), (-4184.0), 61.05);
      StepProblem stepProblem0 = new StepProblem(2316.108033829, (-0.5), (-774.0));
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.integrate(stepProblem0, (-774.0), doubleArray0, (-387.0), doubleArray0);
      graggBulirschStoerIntegrator0.getCurrentStepStart();
      assertEquals(199.5429908647335, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 2692;
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(458.28285025329, (-1.0), doubleArray1, doubleArray1);
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.initializeStep(testProblem5_0, false, 2692, doubleArray1, 8, doubleArray1, doubleArray0, doubleArray1, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-0.5), (-4184.0), (-4184.0), 61.05);
      StepProblem stepProblem0 = new StepProblem((-0.5), (-0.5), (-774.0));
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.setInitialStepSize(1362.2528275112375);
      graggBulirschStoerIntegrator0.integrate(stepProblem0, (-774.0), doubleArray0, (-936.8894947801399), doubleArray0);
      assertEquals((-1.1368683772161603E-13), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-828.63652), 2725.6544, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      highamHall54Integrator0.sanityChecks(testProblem5_0, 4314.045569, doubleArray0, 0.0, doubleArray0);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(2725.6544, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-828.63652), highamHall54Integrator0.getMinStep(), 0.01);
  }

  ////@Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1076.29676335, 0.1, 371293.0);
      double[] doubleArray0 = new double[2];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.175201193643801, 0.125, doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[1];
      try { 
        dormandPrince853Integrator0.sanityChecks(stepProblem0, 1376.26, doubleArray1, 0.125, doubleArray1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: state vector has dimension 1, absolute tolerance vector has dimension 2
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, (double) 1, 0.0, doubleArray0, doubleArray0);
      adamsBashforthIntegrator0.setInitialStepSize(2044.686);
      assertEquals(0.0, adamsBashforthIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, adamsBashforthIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(1.0, adamsBashforthIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1293.3866), 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize((-2715.66025));
      assertEquals(-0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-0.5), (-4184.0), (-4184.0), 61.05);
      double double0 = graggBulirschStoerIntegrator0.getCurrentStepStart();
      assertEquals(45.73838650411709, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1228.089763227737), (-1228.089763227737), (-2171.7934432607267), (-1228.089763227737));
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[2];
      dormandPrince853Integrator0.integrate(testProblem5_0, (-1228.089763227737), doubleArray0, 0.0, doubleArray0);
      double double0 = dormandPrince853Integrator0.initializeStep(testProblem5_0, true, 8, doubleArray0, 0.0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(27, testProblem5_0.getCalls());
      assertEquals(Double.NaN, double0, 0.01);
  }
}
