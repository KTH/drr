/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 02:05:22 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CheckPropertyOrder;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.jscomp.SimpleRegion;
import com.google.javascript.jscomp.SourceExcerptProvider;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LightweightMessageFormatter_ESTest extends LightweightMessageFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatLine("", 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      SourceExcerptProvider.SourceExcerpt sourceExcerptProvider_SourceExcerpt0 = SourceExcerptProvider.SourceExcerpt.REGION;
      LightweightMessageFormatter lightweightMessageFormatter0 = new LightweightMessageFormatter(compiler0, sourceExcerptProvider_SourceExcerpt0);
      Node node0 = compiler0.parseTestCode("");
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      String[] stringArray0 = new String[5];
      JSError jSError0 = JSError.make("", node0, checkLevel0, compiler0.OPTIMIZE_LOOP_ERROR, stringArray0);
      String string0 = lightweightMessageFormatter0.formatError(jSError0);
      assertEquals(":1: ERROR - Exceeded max number of optimization iterations: null\n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      DiagnosticType diagnosticType0 = CheckPropertyOrder.UNEQUAL_PROPERTIES;
      JSError jSError0 = JSError.make(">)3sk", (-71), (-71), checkLevel0, diagnosticType0, (String[]) null);
      String string0 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertEquals(">)3sk: WARNING - different control paths produce different (ordered) property lists: {0} vs. {1}\n", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("");
      assertEquals(35, Node.PARENTHESIZED_PROP);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      DiagnosticType diagnosticType0 = ProcessClosurePrimitives.INVALID_STYLE_ERROR;
      String[] stringArray0 = new String[9];
      JSError jSError0 = JSError.make(diagnosticType0, stringArray0);
      String string0 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertEquals("WARNING - Invalid CSS name map style null\n", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion(2100, 2100, "\"c");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertEquals("  2100| \"c", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion(132, 132, "");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion(353, (-1079), "^\n");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertEquals("    353| ^", string0);
      assertNotNull(string0);
  }
}
