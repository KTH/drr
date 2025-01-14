/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 15:43:38 GMT 2019
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.HypergeometricDistribution;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class HypergeometricDistribution_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 1);
      int int0 = hypergeometricDistribution0.sample();
      assertEquals(1.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 1);
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(1568);
      assertEquals(1.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(974, 974, 2);
      boolean boolean0 = hypergeometricDistribution0.isSupportConnected();
      assertEquals(2.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population size (0)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(1, (-989), (-989));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (-989)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(2739, 2739, (-486));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-486)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(2, 1312, 499);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (1,312) must be less than or equal to population size (2)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 4962);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample size (4,962) must be less than or equal to population size (1)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(199, 199, 0);
      double double0 = hypergeometricDistribution0.cumulativeProbability(0);
      assertEquals(199, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(1.0, double0, 0.01);
      assertEquals(199, hypergeometricDistribution0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(5073, 495, 495);
      double double0 = hypergeometricDistribution0.cumulativeProbability((-144));
      assertEquals(48.29982259018332, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(5073, 495, 495);
      double double0 = hypergeometricDistribution0.cumulativeProbability(424);
      assertEquals(1.0000000000000002, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(3484, 2047, 2047);
      double double0 = hypergeometricDistribution0.probability(0);
      assertEquals(1202.7006314580942, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(199, 199, 0);
      double double0 = hypergeometricDistribution0.probability(2340);
      assertEquals(0.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(199, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(0.0, double0, 0.01);
      assertEquals(199, hypergeometricDistribution0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(199, 199, 0);
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(0);
      assertEquals(199, hypergeometricDistribution0.getPopulationSize());
      assertEquals(1.0, double0, 0.01);
      assertEquals(199, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(0.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(3484, 2047, 2047);
      // Undeclared exception!
      hypergeometricDistribution0.upperCumulativeProbability(645);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(199, 199, 0);
      hypergeometricDistribution0.getNumericalVariance();
      double double0 = hypergeometricDistribution0.getNumericalVariance();
      assertEquals(0, hypergeometricDistribution0.getSampleSize());
      assertEquals(199, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(0.0, double0, 0.01);
      assertEquals(199, hypergeometricDistribution0.getPopulationSize());
  }
}
