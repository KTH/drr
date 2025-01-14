/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:13:58 GMT 2014
 */

package org.apache.commons.math3.optimization.univariate;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.HarmonicOscillator;
import org.apache.commons.math3.analysis.function.Sinh;
import org.apache.commons.math3.analysis.function.Tan;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.univariate.BrentOptimizer;
import org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class BrentOptimizerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 5.167390528799477E-9;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertNotNull(brentOptimizer0);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      
      int int0 = 166;
      double double1 = (-47.65);
      double double2 = (-2563.9849242);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(double0, double1, double2);
      assertNotNull(harmonicOscillator0);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) harmonicOscillator0, goalType0, double1, double0, double0);
      assertNotNull(univariatePointValuePair0);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertEquals(24, brentOptimizer0.getEvaluations());
      assertEquals((-47.65), brentOptimizer0.getMin(), 0.01D);
      assertEquals(GoalType.MAXIMIZE, brentOptimizer0.getGoalType());
      assertEquals(166, brentOptimizer0.getMaxEvaluations());
      assertEquals(5.167390528799477E-9, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(5.167390528799477E-9, brentOptimizer0.getMax(), 0.01D);
      assertEquals(5.167390528799477E-9, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals((-18.20618869367022), univariatePointValuePair0.getPoint(), 0.01D);
  }

  //@Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = 0.019276907186627446;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertNotNull(brentOptimizer0);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      
      int int0 = 917;
      GoalType goalType0 = GoalType.MINIMIZE;
      Tan tan0 = new Tan();
      assertNotNull(tan0);
      
      UnivariateFunction univariateFunction0 = tan0.derivative();
      assertNotNull(univariateFunction0);
      
      double double1 = (-960.3532591091198);
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, univariateFunction0, goalType0, (double) int0, double1, double1);
      assertNotNull(univariatePointValuePair0);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals((-960.3532591091198), brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(917.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(7, brentOptimizer0.getEvaluations());
      assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      assertEquals((-960.3532591091198), brentOptimizer0.getMax(), 0.01D);
      assertEquals(917, brentOptimizer0.getMaxEvaluations());
      assertEquals((-920.3914741068701), univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(1.009112955133684, univariatePointValuePair0.getValue(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = 5.167390528799477E-9;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertNotNull(brentOptimizer0);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getEvaluations());
      
      int int0 = 166;
      double double1 = (-47.65);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(double0, double1, (double) int0);
      assertNotNull(harmonicOscillator0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) harmonicOscillator0, goalType0, double1, double0, double0);
      assertNotNull(univariatePointValuePair0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals((-47.65), brentOptimizer0.getMin(), 0.01D);
      assertEquals(5.167390528799477E-9, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(5.167390528799477E-9, brentOptimizer0.getMax(), 0.01D);
      assertEquals(24, brentOptimizer0.getEvaluations());
      assertEquals(166, brentOptimizer0.getMaxEvaluations());
      assertEquals(GoalType.MAXIMIZE, brentOptimizer0.getGoalType());
      assertEquals((-4.691657681633943), univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(5.1673905287987914E-9, univariatePointValuePair0.getValue(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = 0.019276907186627446;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertNotNull(brentOptimizer0);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      
      int int0 = 917;
      GoalType goalType0 = GoalType.MINIMIZE;
      Tan tan0 = new Tan();
      assertNotNull(tan0);
      
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) tan0, goalType0, (double) int0, (double) int0, (double) int0);
      assertNotNull(univariatePointValuePair0);
      assertEquals(917.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1, brentOptimizer0.getEvaluations());
      assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      assertEquals(917.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(917, brentOptimizer0.getMaxEvaluations());
      assertEquals(917.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(917.0, univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals((-0.3594344746201911), univariatePointValuePair0.getValue(), 0.01D);
      
      double double1 = brentOptimizer0.getMin();
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(917.0, double1, 0.01D);
      assertEquals(917.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1, brentOptimizer0.getEvaluations());
      assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      assertEquals(917.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(917, brentOptimizer0.getMaxEvaluations());
      assertEquals(917.0, brentOptimizer0.getMin(), 0.01D);
      
      Sinh sinh0 = new Sinh();
      assertNotNull(sinh0);
      
      UnivariatePointValuePair univariatePointValuePair1 = brentOptimizer0.optimize(int0, (UnivariateFunction) sinh0, goalType0, double0, double1, double1);
      assertNotNull(univariatePointValuePair1);
      assertFalse(univariatePointValuePair1.equals((Object)univariatePointValuePair0));
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertNotSame(univariatePointValuePair1, univariatePointValuePair0);
      assertEquals(917.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      assertEquals(917.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(917, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.019276907186627446, brentOptimizer0.getMin(), 0.01D);
      assertEquals(132, brentOptimizer0.getEvaluations());
      assertEquals(0.05340867705966427, univariatePointValuePair1.getPoint(), 0.01D);
      assertEquals(0.05343407193891008, univariatePointValuePair1.getValue(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = 917;
      double double0 = (-960.3532591091198);
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer((double) int0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -960.353 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = (-2563.9849242);
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer(double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,563.985 is smaller than the minimum (0)
         //
      }
  }
}
