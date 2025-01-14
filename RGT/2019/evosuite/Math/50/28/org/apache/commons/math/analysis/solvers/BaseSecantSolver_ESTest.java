/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 21:22:11 GMT 2019
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Identity;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class BaseSecantSolver_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      illinoisSolver0.solve(985, (UnivariateRealFunction) cbrt0, 0.0, (-877.702));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1494.44647698), (-1494.44647698));
      assertEquals((-1494.44647698), regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0));
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) sinh0, 922.46853071, 0.0, allowedSolution0);
      assertEquals(922.46853071, pegasusSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1526.89314, (-561.54), (-561.54));
      Identity identity0 = new Identity();
      double double0 = illinoisSolver0.solve(1900, (UnivariateRealFunction) identity0, (-3518.518), 1526.89314);
      assertEquals((-3518.518), illinoisSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      double double0 = pegasusSolver0.solve(62, (UnivariateRealFunction) inverse0, (-3.141592653589793), (double) 62, (-1016.85));
      assertEquals((-1016.85), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-8.770076684482139E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(773, (UnivariateRealFunction) cbrt0, (-0.4145473177245523), (double) 773, (-0.4145473177245523), allowedSolution0);
      assertEquals((-0.4145473177245523), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1.2196933407176634E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      double double0 = illinoisSolver0.solve(106, (UnivariateRealFunction) sin0, (-5.35344141), (double) 106, 2.384185791015625E-7);
      assertEquals(2.384185791015625E-7, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(103.67255756846318, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(106, (UnivariateRealFunction) sin0, (-5.35344141), (double) 106, allowedSolution0);
      assertEquals((-5.35344141), illinoisSolver0.getMin(), 0.01);
      assertEquals(103.67255756846319, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(98, (UnivariateRealFunction) sin0, (-5.35344141), (double) 98, allowedSolution0);
      assertEquals(46.323279295, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3.1415926535897936), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(106, (UnivariateRealFunction) sin0, (-5.35344141), (double) 106, allowedSolution0);
      assertEquals((-5.35344141), illinoisSolver0.getMin(), 0.01);
      assertEquals(103.67255756846319, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(94, (UnivariateRealFunction) sin0, (-5.35344141), (double) 94, allowedSolution0);
      assertEquals(44.323279295, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(91.106186954104, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(87, (UnivariateRealFunction) sin0, (-5.35344141), (double) 87, allowedSolution0);
      assertEquals(40.823279295, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(65.97344572538566, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(106, (UnivariateRealFunction) sin0, (-16.66267879461745), (double) 106, allowedSolution0);
      assertEquals(44.668660602691276, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3.1415926535897936), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(104, (UnivariateRealFunction) sin0, (-5.35344141), 495.7076583447, allowedSolution0);
      assertEquals(245.17710846735002, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(398.98226700590374, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2950, (UnivariateRealFunction) inverse0, (-1210.79045804085), 22.009063800761254, (double) 2950, allowedSolution0);
      assertEquals(2950.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-3.613786610488902E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(104, (UnivariateRealFunction) sin0, (-5.35344141), (double) 985, allowedSolution0);
      assertEquals(489.82327929499996, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(342.4335992412875, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(124, (UnivariateRealFunction) sin0, 13.9856, (double) 124, allowedSolution0);
      assertEquals(68.9928, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(15.70796326809214, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(150, (UnivariateRealFunction) sinh0, (-1.9092643079754947E-6), 9.98978939698, Double.NaN, allowedSolution0);
      assertEquals(Double.NaN, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(3.2823306954980785E-8, double0, 0.01);
  }
}
