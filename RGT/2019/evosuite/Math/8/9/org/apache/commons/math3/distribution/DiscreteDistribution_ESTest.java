/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 14:30:27 GMT 2019
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well44497b;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class DiscreteDistribution_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Pair<Long, Double>> linkedList0 = new LinkedList<Pair<Long, Double>>();
      Long long0 = new Long(1213L);
      Double double0 = new Double(1213L);
      Pair<Long, Double> pair0 = new Pair<Long, Double>(long0, double0);
      linkedList0.offerLast(pair0);
      DiscreteDistribution<Long> discreteDistribution0 = new DiscreteDistribution<Long>(linkedList0);
      discreteDistribution0.reseedRandomGenerator(1317L);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Double double0 = new Double((-161.9916));
      Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
      linkedList0.add(pair0);
      DiscreteDistribution<String> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<String>(well19937c0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -161.992 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[1];
      Well44497a well44497a0 = new Well44497a(intArray0);
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Double double0 = new Double(2614);
      Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
      linkedList0.add(pair0);
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>(well44497a0, linkedList0);
      double double1 = discreteDistribution0.probability("");
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      Integer integer0 = new Integer(677);
      Double double0 = new Double(677);
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>(integer0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = new DiscreteDistribution<Integer>(linkedList0);
      double double1 = discreteDistribution0.probability((Integer) null);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b();
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(522.902332938);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(well44497b0, linkedList0);
      double double1 = discreteDistribution0.probability((Object) null);
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[1];
      Well44497a well44497a0 = new Well44497a(intArray0);
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Double double0 = new Double(2614);
      Pair<String, Double> pair0 = new Pair<String, Double>("g;B)6*oo\"DLT5p,fa", double0);
      linkedList0.add(pair0);
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>(well44497a0, linkedList0);
      double double1 = discreteDistribution0.probability("");
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[1];
      Well44497a well44497a0 = new Well44497a(intArray0);
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Double double0 = new Double(2614);
      Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
      linkedList0.add(pair0);
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>(well44497a0, linkedList0);
      List<Pair<String, Double>> list0 = discreteDistribution0.getSamples();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
      Float float0 = new Float(Float.NaN);
      Double double0 = new Double(Float.NaN);
      Pair<Float, Double> pair0 = new Pair<Float, Double>(float0, double0);
      linkedList0.add(pair0);
      Double double1 = new Double(1686.0F);
      Pair<Float, Double> pair1 = new Pair<Float, Double>(float0, double1);
      linkedList0.add(pair1);
      DiscreteDistribution<Float> discreteDistribution0 = new DiscreteDistribution<Float>(linkedList0);
      Object[] objectArray0 = discreteDistribution0.sample(538);
      assertEquals(538, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
      Float float0 = new Float(1686.0F);
      Double double0 = new Double(1686.0F);
      Pair<Float, Double> pair0 = new Pair<Float, Double>(float0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Float> discreteDistribution0 = new DiscreteDistribution<Float>(linkedList0);
      Object[] objectArray0 = discreteDistribution0.sample(497);
      assertEquals(497, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(1723.22202);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(linkedList0);
      try { 
        discreteDistribution0.sample((-2120));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-2,120)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }
}
