/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:52:54 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CodeGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class CodeGeneratorEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "405";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(405.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "3";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(3.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = "N8xrSd(";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = "\n";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = "";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertNotNull(string1);
      assertEquals("", string1);
      
      double double0 = CodeGenerator.getSimpleNumber(string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = "02";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = "\u0001G\u00A0Uo\u0000\u0000\u0000\u0000*\n\u000B\r\u0000\u0000U\u0000Y\u0000`\u0000\u0000\u0000\u0000!\u0000<\u0000\u0000\u0000\u0000\u0000\u0000?\u0000\u3000\u0000'\u0000\u0000\u0000o\u0000m\u0085\u2000\u2001\u2002\u2003\u2004 \u2006\u2008\u200A\u00002\u0000\u0000\u0000\u205F\u1680^\u0000\u180EO6\u0000";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("\\u0001G\\u00a0Uo\\u0000\\u0000\\u0000\\u0000*\\u000a\\u000b\\u000d\\u0000\\u0000U\\u0000Y\\u0000`\\u0000\\u0000\\u0000\\u0000!\\u0000<\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000?\\u0000\\u3000\\u0000'\\u0000\\u0000\\u0000o\\u0000m\\u0085\\u2000\\u2001\\u2002\\u2003\\u2004 \\u2006\\u2008\\u200a\\u00002\\u0000\\u0000\\u0000\\u205f\\u1680^\\u0000\\u180eO6\\u0000", string1);
  }
}
