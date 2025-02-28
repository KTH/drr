/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:34:07 GMT 2014
 */

package org.jfree.chart.renderer;

import static org.junit.Assert.*;
import org.junit.Test;
import java.awt.Color;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.jfree.chart.renderer.GrayPaintScale;
import org.junit.runner.RunWith;

 
public class GrayPaintScaleEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertNotNull(grayPaintScale0);
      
      GrayPaintScale grayPaintScale1 = new GrayPaintScale();
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertTrue(grayPaintScale1.equals((Object)grayPaintScale0));
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertNotNull(grayPaintScale1);
      
      boolean boolean0 = grayPaintScale0.equals((Object) grayPaintScale1);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertTrue(grayPaintScale0.equals((Object)grayPaintScale1));
      assertTrue(grayPaintScale1.equals((Object)grayPaintScale0));
      assertNotSame(grayPaintScale0, grayPaintScale1);
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = 0.0;
      double double1 = 2778.0;
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertNotNull(grayPaintScale0);
      
      GrayPaintScale grayPaintScale1 = new GrayPaintScale(double0, double1);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals(2778.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale0));
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertNotNull(grayPaintScale1);
      
      boolean boolean0 = grayPaintScale1.equals((Object) grayPaintScale0);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals(2778.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertFalse(grayPaintScale0.equals((Object)grayPaintScale1));
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale0));
      assertNotSame(grayPaintScale0, grayPaintScale1);
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = (-1797.089993);
      double double1 = 0.0;
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(double0, double1);
      assertEquals((-1797.089993), grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertNotNull(grayPaintScale0);
      
      GrayPaintScale grayPaintScale1 = new GrayPaintScale();
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale0));
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertNotNull(grayPaintScale1);
      
      boolean boolean0 = grayPaintScale1.equals((Object) grayPaintScale0);
      assertEquals((-1797.089993), grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(grayPaintScale0.equals((Object)grayPaintScale1));
      assertFalse(double0 == double1);
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale0));
      assertNotSame(grayPaintScale0, grayPaintScale1);
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertNotNull(grayPaintScale0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      boolean boolean0 = grayPaintScale0.equals(object0);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = (-1797.089993);
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale(double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires lowerBound < upperBound.
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertNotNull(grayPaintScale0);
      
      GrayPaintScale grayPaintScale1 = (GrayPaintScale)grayPaintScale0.clone();
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertTrue(grayPaintScale1.equals((Object)grayPaintScale0));
      assertTrue(grayPaintScale0.equals((Object)grayPaintScale1));
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertNotSame(grayPaintScale0, grayPaintScale1);
      assertNotNull(grayPaintScale1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertNotNull(grayPaintScale0);
      
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(1.0, double0, 0.01D);
      
      Color color0 = (Color)grayPaintScale0.getPaint(double0);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(1, color0.getTransparency());
      assertEquals(255, color0.getBlue());
      assertEquals(-1, color0.getRGB());
      assertEquals(255, color0.getGreen());
      assertEquals(255, color0.getRed());
      assertEquals("java.awt.Color[r=255,g=255,b=255]", color0.toString());
      assertEquals(255, color0.getAlpha());
      assertNotNull(color0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertNotNull(grayPaintScale0);
      
      double double0 = grayPaintScale0.getLowerBound();
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(0.0, double0, 0.01D);
  }
}
