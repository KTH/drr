/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:24:04 GMT 2014
 */

package org.apache.commons.math3.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.distribution.FDistribution;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class FDistributionEvoSuite_branch_Test   {

  //@Test(timeout = 4000)
  public void test0()  throws Throwable  {
      long long0 = 1235L;
      FDistribution fDistribution0 = new FDistribution((double) long0, (double) long0, (double) long0);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(1.0016220600162207, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1235.0, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(1235.0, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertNotNull(fDistribution0);
      
      double double0 = fDistribution0.sample();
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(1.0016220600162207, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1235.0, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(1235.0, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(1.175390407805834, double0, 0.01D);
      
      double double1 = fDistribution0.getNumericalVariance();
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(1.0016220600162207, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1235.0, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(1235.0, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertFalse(double1 == double0);
      assertEquals(0.0032573010741305574, double1, 0.01D);
  }

  //@Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = 1.0;
      double double1 = (-148.27880924795);
      FDistribution fDistribution0 = null;
      try {
        fDistribution0 = new FDistribution(double0, double1, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom (-148.279)
         //
      }
  }

  //@Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = (-329.843869);
      FDistribution fDistribution0 = null;
      try {
        fDistribution0 = new FDistribution(double0, double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom (-329.844)
         //
      }
  }

  //@Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = 1.3351752758026123;
      FDistribution fDistribution0 = new FDistribution(double0, double0, double0);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(1.3351752758026123, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(1.3351752758026123, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertNotNull(fDistribution0);
      
      double double1 = fDistribution0.probability(double0, double0);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(1.3351752758026123, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(1.3351752758026123, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(0.0, double1, 0.01D);
      
      double double2 = fDistribution0.density(double1);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(1.3351752758026123, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(1.3351752758026123, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertEquals(Double.NaN, double2, 0.01D);
  }

  //@Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = 1.3351752758026123;
      FDistribution fDistribution0 = new FDistribution(double0, double0, double0);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(1.3351752758026123, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(1.3351752758026123, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertNotNull(fDistribution0);
      
      boolean boolean0 = fDistribution0.isSupportUpperBoundInclusive();
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(1.3351752758026123, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(1.3351752758026123, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertFalse(boolean0);
  }

  //@Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = 0.14349138736724854;
      FDistribution fDistribution0 = new FDistribution(double0, double0);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(0.14349138736724854, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(0.14349138736724854, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertNotNull(fDistribution0);
  }

  //@Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double double0 = 1.3351752758026123;
      FDistribution fDistribution0 = new FDistribution(double0, double0, double0);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(1.3351752758026123, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(1.3351752758026123, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertNotNull(fDistribution0);
      
      boolean boolean0 = fDistribution0.isSupportLowerBoundInclusive();
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(1.3351752758026123, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(1.3351752758026123, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertFalse(boolean0);
  }

  //@Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double double0 = 1.0;
      Well512a well512a0 = new Well512a();
      assertNotNull(well512a0);
      
      FDistribution fDistribution0 = new FDistribution((RandomGenerator) well512a0, double0, double0, double0);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(1.0, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(1.0, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertNotNull(fDistribution0);
      
      double double1 = fDistribution0.sample();
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(1.0, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(1.0, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals(1.0, double1, 0.01D);
  }
}
