/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:27:37 GMT 2014
 */

package org.apache.commons.math.special;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.special.Gamma;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class GammaEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double double0 = 1728.41;
      double double1 = 620.0;
      double double2 = Gamma.regularizedGammaQ(double0, double1);
      assertEquals(1.0, double2, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = 0.0;
      int int0 = 4367;
      double double1 = Gamma.regularizedGammaQ((double) int0, double0);
      assertEquals(1.0, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = 825.593993;
      double double1 = Gamma.regularizedGammaP(double0, double0);
      assertEquals(0.5046281610534348, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      double double2 = (-3789.0437508926766);
      assertFalse(double2 == double1);
      
      double double3 = Gamma.regularizedGammaQ(double1, double2);
      assertEquals(Double.NaN, double3, 0.01D);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double3);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = 0.0;
      int int0 = (-3330);
      double double1 = Gamma.regularizedGammaQ(double0, double0, double0, int0);
      assertEquals(Double.NaN, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = 0.0;
      double double1 = Gamma.regularizedGammaP(double0, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      
      int int0 = 1121;
      double double2 = Gamma.regularizedGammaQ(double0, double1, double1, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = 695.7542975834192;
      double double1 = 1.580887032249125E-4;
      int int0 = (-545);
      try {
        double double2 = Gamma.regularizedGammaP(double0, double0, double1, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-545) exceeded
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = 825.593993;
      double double1 = Gamma.regularizedGammaP(double0, double0);
      assertEquals(0.5046281610534348, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      double double2 = Gamma.regularizedGammaQ(double1, double1);
      assertEquals(0.3180616531011671, double2, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = 52.25588045;
      double double1 = Gamma.regularizedGammaP(double0, double0);
      assertEquals(0.5183977798551502, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      double double2 = 0.0;
      assertFalse(double2 == double1);
      
      int int0 = Integer.MAX_VALUE;
      double double3 = Gamma.regularizedGammaP(double0, double2, double1, int0);
      assertEquals(0.0, double3, 0.01D);
      assertFalse(double2 == double1);
      assertTrue(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double3 == double0);
      assertTrue(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double1 == double3);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double3);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = (-15.0429458126);
      double double1 = 1564.88379795364;
      int int0 = 4367;
      double double2 = Gamma.regularizedGammaP(double1, double0, double1, int0);
      assertEquals(Double.NaN, double2, 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = 0.0;
      double double1 = Gamma.regularizedGammaP(double0, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      
      int int0 = 1121;
      double double2 = Gamma.regularizedGammaP((double) int0, double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = 0.0;
      double double1 = Gamma.regularizedGammaP(double0, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      
      int int0 = 1121;
      double double2 = Gamma.regularizedGammaP(double1, double1, double1, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = 0.0;
      double double1 = Gamma.logGamma(double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      double double2 = Gamma.logGamma(double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = 52.25588045;
      double double1 = 1819.36791545075;
      double double2 = Gamma.regularizedGammaP(double0, double1);
      assertEquals(1.0, double2, 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = 0.0;
      int int0 = 4367;
      double double1 = Gamma.regularizedGammaP(double0, double0, double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      double double2 = Gamma.regularizedGammaQ(double1, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
  }
}
