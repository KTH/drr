/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 01:27:54 GMT 2019
 */

package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.Consumer;
import org.apache.commons.math.util.MultidimensionalCounter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;


public class MultidimensionalCounter_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = 4029;
      intArray0[1] = (-1623);
      intArray0[2] = (-938);
      intArray0[3] = (-3380);
      intArray0[4] = 2312;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      multidimensionalCounter_Iterator0.getCount();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 8388608;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      int[] intArray1 = multidimensionalCounter_Iterator0.getCounts();
      try { 
        multidimensionalCounter0.getCount(intArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -1 out of [0, 8,388,607] range
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 188;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
      // Undeclared exception!
      try { 
        multidimensionalCounter_Iterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter$Iterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 8388608;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      int int0 = multidimensionalCounter_Iterator0.getCount(0);
      assertEquals((-1), multidimensionalCounter_Iterator0.getCount());
      assertEquals((-1), int0);
      assertEquals(8388608, multidimensionalCounter0.getSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 2591;
      intArray0[1] = 16;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      int int0 = multidimensionalCounter0.getDimension();
      assertEquals(41456, multidimensionalCounter0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 8388608;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      multidimensionalCounter0.getSizes();
      assertEquals(8388608, multidimensionalCounter0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 917;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      int int0 = multidimensionalCounter0.getSize();
      assertEquals(917, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 2097;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      multidimensionalCounter0.forEach(consumer0);
      assertEquals(2097, multidimensionalCounter0.getSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 22;
      intArray0[1] = 2;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      multidimensionalCounter_Iterator0.forEachRemaining(consumer0);
      multidimensionalCounter_Iterator0.next();
      assertEquals(44, multidimensionalCounter_Iterator0.getCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[2];
      MultidimensionalCounter multidimensionalCounter0 = null;
      try {
        multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 1502;
      intArray0[1] = 3212;
      intArray0[2] = (-2144144712);
      intArray0[3] = 211;
      intArray0[4] = (-2144146924);
      intArray0[5] = (-2144143448);
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      // Undeclared exception!
      try { 
        multidimensionalCounter0.getCounts((-2144144712));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -2,144,144,712 out of [0, 773,900,288] range
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 8;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      // Undeclared exception!
      try { 
        multidimensionalCounter0.getCounts(8);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 8 out of [0, 8] range
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 3079;
      intArray0[1] = 1236;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      int[] intArray1 = multidimensionalCounter0.getCounts(526);
      assertEquals(3805644, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {0, 526}, intArray1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 2097;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      try { 
        multidimensionalCounter0.getCount(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 2,097 out of [0, 2,096] range
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-2965);
      intArray0[1] = (-3410);
      intArray0[2] = (-1132);
      intArray0[3] = 4222;
      intArray0[4] = 27;
      intArray0[5] = 934;
      intArray0[6] = (-1);
      intArray0[7] = 2153;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      // Undeclared exception!
      try { 
        multidimensionalCounter0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 1 != 8
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 8388608;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      String string0 = multidimensionalCounter0.toString();
      assertEquals("[0]", string0);
      assertEquals(8388608, multidimensionalCounter0.getSize());
  }
}
