/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 19:50:41 GMT 2019
 */

package org.apache.commons.math3.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.complex.ComplexField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class Complex_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(3003.18);
      assertEquals((-0.9602936856771772), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.27899110603842336, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Complex complex0 = Complex.INF;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = (Complex)complex0.NaN.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(boolean0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      String string0 = complex0.toString();
      assertEquals("(NaN, NaN)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = new Complex((-434.87), (-434.87));
      Complex complex1 = complex0.ZERO.log();
      Complex complex2 = complex1.cosh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertFalse(complex2.isInfinite());
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = new Complex((-434.87), (-434.87));
      Complex complex1 = complex0.INF.acos();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals((-434.87), complex0.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
      assertEquals((-434.87), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Complex complex0 = new Complex((-434.87), (-434.87));
      Complex complex1 = complex0.NaN.add(0.0);
      assertEquals((-434.87), complex0.getReal(), 0.01);
      assertEquals((-434.87), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.add((-2132.66));
      assertEquals((-2132.66), complex1.getReal(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.conjugate();
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Complex complex0 = new Complex(1451.7848442);
      Complex complex1 = complex0.INF.divide(complex0);
      Complex complex2 = complex1.conjugate();
      assertEquals(1451.7848442, complex0.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertTrue(complex2.isNaN());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.pow(3401.035407187);
      Complex complex2 = complex1.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (double) 2561);
      Complex complex1 = complex0.atan();
      assertEquals((-1.5707963267948966), complex1.getReal(), 0.01);
      assertEquals(3.904724915356755E-4, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = new Complex(1451.7848442);
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex0.INF.divide(complex1);
      assertFalse(complex0.isInfinite());
      assertTrue(complex2.isNaN());
      assertEquals(1451.7848442, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.reciprocal();
      Complex complex2 = complex0.ONE.divide(complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertSame(complex2, complex0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ZERO.divide(0.0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(2594.0);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(3.8550501156515033E-4, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.NaN.reciprocal();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Complex complex0 = new Complex(2606.8467827);
      Complex complex1 = complex0.INF.reciprocal();
      Complex complex2 = complex1.sqrt();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.equals((Object)complex0));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = new Complex(2606.8467827);
      boolean boolean0 = complex0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(2606.8467827, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.equals(complex0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.INF.subtract(complex0);
      boolean boolean0 = complex2.equals(complex1);
      assertSame(complex2, complex0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.reciprocal();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.INF.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Complex complex0 = new Complex(1451.7848442);
      Complex complex1 = complex0.INF.divide(complex0);
      Complex complex2 = complex0.pow(complex1);
      assertEquals(1451.7848442, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = new Complex((-878372.26832649), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertTrue(complex0.isInfinite());
      assertEquals((-878372.26832649), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Complex complex0 = new Complex((-878372.26832649), Double.POSITIVE_INFINITY);
      Complex complex1 = Complex.I;
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals((-878372.26832649), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.multiply((-1673.865153598));
      Complex complex2 = complex1.multiply(0);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Complex complex0 = new Complex((-1699.5509));
      Complex complex1 = complex0.NaN.multiply(990);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-1699.5509), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Complex complex0 = new Complex((-434.87), (-434.87));
      Complex complex1 = complex0.multiply(2561);
      assertEquals((-434.87), complex0.getReal(), 0.01);
      assertEquals((-1113702.07), complex1.getImaginary(), 0.01);
      assertEquals((-1113702.07), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-434.87), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Complex complex0 = new Complex((-878372.26832649), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(625);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals((-878372.26832649), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Complex complex0 = Complex.valueOf((double) (-1340), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(688.4225756);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals((-1340.0), complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ONE.multiply(Double.POSITIVE_INFINITY);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.NaN.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Complex complex0 = new Complex((-434.87), (-434.87));
      Complex complex1 = complex0.subtract((-7.947087669425045E-8));
      assertEquals((-434.87), complex0.getImaginary(), 0.01);
      assertEquals((-434.86999992052915), complex1.getReal(), 0.01);
      assertEquals((-434.87), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.subtract(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.asin();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ZERO.cos();
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.atan();
      Complex complex2 = complex1.cosh();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sin();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Complex complex0 = new Complex((-434.87), (-434.87));
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.isInfinite());
      assertEquals((-434.87), complex0.getReal(), 0.01);
      assertEquals((-8.6631896119311E187), complex1.getReal(), 0.01);
      assertEquals((-3.53117897135182E188), complex1.getImaginary(), 0.01);
      assertEquals((-434.87), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sinh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Complex complex0 = new Complex(2606.8467827);
      Complex complex1 = complex0.ZERO.tan();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.tan();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Complex complex0 = new Complex(2.193649279840519E199, 694.69612797924);
      Complex complex1 = complex0.tan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals(694.69612797924, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Complex complex0 = new Complex((-71.9122550017811), (-71.9122550017811));
      Complex complex1 = complex0.tan();
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-71.9122550017811), complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.divide(Double.NaN);
      Complex complex2 = complex1.tanh();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.ONE.tanh();
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.7615941559557649, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.tanh();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-922.2171679));
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.tanh();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(922.2171679, complex1.getReal(), 0.01);
      assertEquals(1.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Complex complex0 = new Complex((-688.9882925921316));
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-688.9882925921316), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.NaN.nthRoot(2608);
      assertEquals(1, list0.size());
      assertFalse(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      try { 
        complex0.INF.nthRoot((-2881));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -2,881
         //
         verifyException("org.apache.commons.math3.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2.483435099819282), (-2.483435099819282));
      List<Complex> list0 = complex0.ZERO.nthRoot(244);
      assertEquals(244, list0.size());
      assertFalse(complex0.isInfinite());
      assertEquals((-2.483435099819282), complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals((-2.483435099819282), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(2405);
      assertTrue(list0.contains(complex0));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, (-321.00997786377));
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Complex complex0 = Complex.valueOf((double) 2561, Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }
}
