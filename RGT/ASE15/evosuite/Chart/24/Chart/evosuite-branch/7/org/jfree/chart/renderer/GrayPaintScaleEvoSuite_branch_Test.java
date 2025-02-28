/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:33:33 GMT 2014
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
      double double0 = (-439.95588455808);
      double double1 = 787.89;
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(double0, double1);
      assertEquals((-439.95588455808), grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(787.89, grayPaintScale0.getUpperBound(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertNotNull(grayPaintScale0);
      
      double double2 = 0.0;
      GrayPaintScale grayPaintScale1 = new GrayPaintScale(double0, double2);
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertEquals(0.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertEquals((-439.95588455808), grayPaintScale1.getLowerBound(), 0.01D);
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale0));
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertNotNull(grayPaintScale1);
      
      GrayPaintScale grayPaintScale2 = (GrayPaintScale)grayPaintScale1.clone();
      assertNotSame(grayPaintScale1, grayPaintScale2);
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertNotSame(grayPaintScale2, grayPaintScale1);
      assertNotSame(grayPaintScale2, grayPaintScale0);
      assertEquals(0.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertEquals((-439.95588455808), grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals((-439.95588455808), grayPaintScale2.getLowerBound(), 0.01D);
      assertEquals(0.0, grayPaintScale2.getUpperBound(), 0.01D);
      assertTrue(grayPaintScale1.equals((Object)grayPaintScale2));
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale0));
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertTrue(grayPaintScale2.equals((Object)grayPaintScale1));
      assertFalse(grayPaintScale2.equals((Object)grayPaintScale0));
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertNotNull(grayPaintScale2);
      
      boolean boolean0 = grayPaintScale0.equals((Object) grayPaintScale2);
      assertNotSame(grayPaintScale1, grayPaintScale2);
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertNotSame(grayPaintScale2, grayPaintScale1);
      assertNotSame(grayPaintScale2, grayPaintScale0);
      assertNotSame(grayPaintScale0, grayPaintScale2);
      assertNotSame(grayPaintScale0, grayPaintScale1);
      assertEquals(0.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertEquals((-439.95588455808), grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals((-439.95588455808), grayPaintScale2.getLowerBound(), 0.01D);
      assertEquals(0.0, grayPaintScale2.getUpperBound(), 0.01D);
      assertEquals((-439.95588455808), grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(787.89, grayPaintScale0.getUpperBound(), 0.01D);
      assertFalse(boolean0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertTrue(grayPaintScale1.equals((Object)grayPaintScale2));
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale0));
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertTrue(grayPaintScale2.equals((Object)grayPaintScale1));
      assertFalse(grayPaintScale2.equals((Object)grayPaintScale0));
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(grayPaintScale0.equals((Object)grayPaintScale2));
      assertFalse(grayPaintScale0.equals((Object)grayPaintScale1));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertNotNull(grayPaintScale0);
      
      double double0 = (-439.95588455808);
      double double1 = 787.89;
      GrayPaintScale grayPaintScale1 = new GrayPaintScale(double0, double1);
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertEquals((-439.95588455808), grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals(787.89, grayPaintScale1.getUpperBound(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale0));
      assertFalse(double1 == double0);
      assertNotNull(grayPaintScale1);
      
      GrayPaintScale grayPaintScale2 = (GrayPaintScale)grayPaintScale0.clone();
      assertNotSame(grayPaintScale2, grayPaintScale0);
      assertNotSame(grayPaintScale2, grayPaintScale1);
      assertNotSame(grayPaintScale0, grayPaintScale2);
      assertNotSame(grayPaintScale0, grayPaintScale1);
      assertEquals(0.0, grayPaintScale2.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale2.getUpperBound(), 0.01D);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertTrue(grayPaintScale2.equals((Object)grayPaintScale0));
      assertFalse(grayPaintScale2.equals((Object)grayPaintScale1));
      assertTrue(grayPaintScale0.equals((Object)grayPaintScale2));
      assertFalse(grayPaintScale0.equals((Object)grayPaintScale1));
      assertNotNull(grayPaintScale2);
      
      boolean boolean0 = grayPaintScale1.equals((Object) grayPaintScale2);
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertNotSame(grayPaintScale1, grayPaintScale2);
      assertNotSame(grayPaintScale2, grayPaintScale0);
      assertNotSame(grayPaintScale2, grayPaintScale1);
      assertNotSame(grayPaintScale0, grayPaintScale2);
      assertNotSame(grayPaintScale0, grayPaintScale1);
      assertEquals((-439.95588455808), grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals(787.89, grayPaintScale1.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale2.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale2.getUpperBound(), 0.01D);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertFalse(boolean0);
      assertFalse(double0 == double1);
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale0));
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale2));
      assertFalse(double1 == double0);
      assertTrue(grayPaintScale2.equals((Object)grayPaintScale0));
      assertFalse(grayPaintScale2.equals((Object)grayPaintScale1));
      assertTrue(grayPaintScale0.equals((Object)grayPaintScale2));
      assertFalse(grayPaintScale0.equals((Object)grayPaintScale1));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertNotNull(grayPaintScale0);
      
      GrayPaintScale grayPaintScale1 = (GrayPaintScale)grayPaintScale0.clone();
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertNotSame(grayPaintScale0, grayPaintScale1);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertTrue(grayPaintScale1.equals((Object)grayPaintScale0));
      assertTrue(grayPaintScale0.equals((Object)grayPaintScale1));
      assertNotNull(grayPaintScale1);
      
      boolean boolean0 = grayPaintScale0.equals((Object) grayPaintScale1);
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertNotSame(grayPaintScale0, grayPaintScale1);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertTrue(boolean0);
      assertTrue(grayPaintScale1.equals((Object)grayPaintScale0));
      assertTrue(grayPaintScale0.equals((Object)grayPaintScale1));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertNotNull(grayPaintScale0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      boolean boolean0 = grayPaintScale0.equals(object0);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertNotNull(grayPaintScale0);
      
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(1.0, double0, 0.01D);
      
      GrayPaintScale grayPaintScale1 = null;
      try {
        grayPaintScale1 = new GrayPaintScale(double0, double0);
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
      
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(1.0, double0, 0.01D);
      
      Color color0 = (Color)grayPaintScale0.getPaint(double0);
      assertEquals(255, color0.getRed());
      assertEquals(-1, color0.getRGB());
      assertEquals(255, color0.getGreen());
      assertEquals(255, color0.getAlpha());
      assertEquals("java.awt.Color[r=255,g=255,b=255]", color0.toString());
      assertEquals(1, color0.getTransparency());
      assertEquals(255, color0.getBlue());
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertNotNull(color0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
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
