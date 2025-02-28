/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 07:52:18 GMT 2017
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.HypergeometricDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.TestRandomGenerator;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class HypergeometricDistribution_ESTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 1);
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(1);
      assertEquals(1.0, double0, 0.01);
      assertEquals(1.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1388, 1388, 1);
      double double0 = hypergeometricDistribution0.cumulativeProbability(1);
      assertEquals(1.0, double0, 0.01);
      assertEquals(1.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(764, 0, 0);
      int int0 = hypergeometricDistribution0.getSupportUpperBound();
      assertEquals(0, int0);
      assertEquals(0, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(0, hypergeometricDistribution0.getSampleSize());
      assertEquals(764, hypergeometricDistribution0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 1);
      int int0 = hypergeometricDistribution0.getSupportLowerBound();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TestRandomGenerator testRandomGenerator0 = new TestRandomGenerator();
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) testRandomGenerator0, 1392, 1, 0);
      int int0 = hypergeometricDistribution0.getSampleSize();
      assertEquals(0.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(1392, hypergeometricDistribution0.getPopulationSize());
      assertEquals(1, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(764, 0, 0);
      double double0 = hypergeometricDistribution0.getNumericalMean();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(764, hypergeometricDistribution0.getPopulationSize());
      assertEquals(0, hypergeometricDistribution0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[4];
      Well44497a well44497a0 = new Well44497a(intArray0);
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well44497a0, 1534, 0, 1534);
      int int0 = hypergeometricDistribution0.getNumberOfSuccesses();
      assertEquals(1534, hypergeometricDistribution0.getSampleSize());
      assertEquals(0.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(1534, hypergeometricDistribution0.getPopulationSize());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1359, 1359, 674);
      double double0 = hypergeometricDistribution0.calculateNumericalVariance();
      assertEquals(674, hypergeometricDistribution0.getSampleSize());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 1);
      double double0 = hypergeometricDistribution0.calculateNumericalVariance();
      assertEquals(1.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(2273, 338, 338);
      hypergeometricDistribution0.sample();
      // Undeclared exception!
      hypergeometricDistribution0.upperCumulativeProbability(2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1388, 1388, 1);
      double double0 = hypergeometricDistribution0.getNumericalVariance();
      assertEquals(1, hypergeometricDistribution0.getSampleSize());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1388, 1388, 1);
      double double0 = hypergeometricDistribution0.probability(1);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c((-1293));
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well19937c0, 4189, 1453, 1453);
      // Undeclared exception!
      hypergeometricDistribution0.cumulativeProbability(725);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1388, 1388, 1);
      double double0 = hypergeometricDistribution0.cumulativeProbability(1388);
      assertEquals(1.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 1);
      hypergeometricDistribution0.cumulativeProbability((-1492));
      assertEquals(1.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
  }

  //@Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a(2);
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well44497a0, 2, 3160, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (3,160) must be less than or equal to population size (2)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  //@Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a();
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well19937a0, (-1179), (-1179), (-1179));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population size (-1,179)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1388, 1388, 1);
      double double0 = hypergeometricDistribution0.getNumericalMean();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 1);
      int int0 = hypergeometricDistribution0.getPopulationSize();
      assertEquals(1.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 1);
      int int0 = hypergeometricDistribution0.getNumberOfSuccesses();
      assertEquals(1.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 1);
      int int0 = hypergeometricDistribution0.getSampleSize();
      assertEquals(1.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 1);
      int int0 = hypergeometricDistribution0.getSupportUpperBound();
      assertEquals(1.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[4];
      Well44497a well44497a0 = new Well44497a(intArray0);
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well44497a0, 1534, 0, 1534);
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(1534);
      assertEquals(0.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1534, hypergeometricDistribution0.getSampleSize());
      assertEquals(1534, hypergeometricDistribution0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(2273, 338, 338);
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(338);
      assertEquals(50.261328640563136, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(2273, 338, 338);
      double double0 = hypergeometricDistribution0.probability(2273);
      assertEquals(0.0, double0, 0.01);
      assertEquals(50.261328640563136, hypergeometricDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(2273, 338, 338);
      double double0 = hypergeometricDistribution0.probability((-493));
      assertEquals(50.261328640563136, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  //@Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) null, 1, 1, 4467);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample size (4,467) must be less than or equal to population size (1)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  //@Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(637, 764, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (764) must be less than or equal to population size (637)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  //@Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a(1512);
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well19937a0, 1512, 1512, (-3331));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-3,331)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  //@Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = new int[3];
      Well19937a well19937a0 = new Well19937a(intArray0);
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well19937a0, 143, (-1492), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (-1,492)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  //@Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(0, 1388, (-1277));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population size (0)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TestRandomGenerator testRandomGenerator0 = new TestRandomGenerator();
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) testRandomGenerator0, 1392, 1, 0);
      boolean boolean0 = hypergeometricDistribution0.isSupportConnected();
      assertEquals(1, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(0.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(1392, hypergeometricDistribution0.getPopulationSize());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(2273, 338, 338);
      int int0 = hypergeometricDistribution0.sample();
      //  // Unstable assertion: assertEquals(58, int0);
      
      double double0 = hypergeometricDistribution0.getNumericalVariance();
      //  // Unstable assertion: assertEquals(36.44081998049913, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(2273, 338, 338);
      double double0 = hypergeometricDistribution0.upperCumulativeProbability((-493));
      assertEquals(50.261328640563136, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(2273, 338, 338);
      int int0 = hypergeometricDistribution0.getSupportLowerBound();
      assertEquals(0, int0);
      assertEquals(50.261328640563136, hypergeometricDistribution0.getNumericalMean(), 0.01);
  }
}
