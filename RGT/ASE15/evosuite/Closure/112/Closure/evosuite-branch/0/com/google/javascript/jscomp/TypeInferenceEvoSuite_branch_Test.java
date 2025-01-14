/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:16:19 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.TypeInference;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class TypeInferenceEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.BOTH;
      boolean boolean0 = false;
      BooleanLiteralSet booleanLiteralSet1 = TypeInference.getBooleanOutcomes(booleanLiteralSet0, booleanLiteralSet0, boolean0);
      assertEquals(BooleanLiteralSet.BOTH, booleanLiteralSet1);
      assertEquals("BOTH", booleanLiteralSet1.toString());
      assertEquals(3, booleanLiteralSet1.ordinal());
      assertEquals("BOTH", booleanLiteralSet1.name());
      assertSame(booleanLiteralSet1, booleanLiteralSet0);
      assertSame(booleanLiteralSet0, booleanLiteralSet1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.TRUE;
      boolean boolean0 = true;
      BooleanLiteralSet booleanLiteralSet1 = TypeInference.getBooleanOutcomes(booleanLiteralSet0, booleanLiteralSet0, boolean0);
      assertEquals(BooleanLiteralSet.TRUE, booleanLiteralSet1);
      assertEquals("TRUE", booleanLiteralSet1.name());
      assertEquals("TRUE", booleanLiteralSet1.toString());
      assertEquals(1, booleanLiteralSet1.ordinal());
      assertSame(booleanLiteralSet1, booleanLiteralSet0);
      assertSame(booleanLiteralSet0, booleanLiteralSet1);
  }
}
