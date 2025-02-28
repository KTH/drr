/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:02:27 GMT 2014
 */

package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.BufferedOutputStream;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.OutputStream;
import java.io.Writer;
import org.apache.commons.lang.StringEscapeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;

import org.junit.runner.RunWith;

 
public class StringEscapeUtilsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "Th* Writer must 7t be null.";
      String string1 = StringEscapeUtils.unescapeXml(string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("Th* Writer must 7t be null.", string1);
      
      String string2 = null;
      String string3 = StringEscapeUtils.unescapeXml(string2);
      assertNull(string3);
      
      MockFile mockFile0 = new MockFile(string1, string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(mockFile0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(mockPrintWriter0);
      
      StringEscapeUtils.unescapeXml((Writer) mockPrintWriter0, string3);
      assertSame(string1, string0);
      assertSame(string0, string1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "Vj\"1}uvPIv~J_' ";
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("Vj\\\"1}uvPIv~J_' ", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      
      Writer writer0 = null;
      // Undeclared exception!
      try {
        StringEscapeUtils.unescapeXml(writer0, string1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      
      String string0 = "Fy92\".vnROI`\\g5UP";
      StringEscapeUtils.unescapeXml((Writer) charArrayWriter0, string0);
      assertEquals("Fy92\".vnROI`\\g5UP", charArrayWriter0.toString());
      assertEquals(17, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.escapeXml(string0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "g0#\\fH+zLWqyn";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("g0#\fH+zLWqyn", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      
      String string2 = StringEscapeUtils.escapeXml(string1);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotNull(string2);
      assertEquals("g0#\fH+zLWqyn", string2);
      assertTrue(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertTrue(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 0;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(int0);
      assertNotNull(charArrayWriter0);
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      
      String string0 = null;
      String string1 = StringEscapeUtils.escapeSql(string0);
      assertNull(string1);
      
      StringEscapeUtils.escapeXml((Writer) charArrayWriter0, string1);
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "\t\r\n\b";
      Writer writer0 = null;
      // Undeclared exception!
      try {
        StringEscapeUtils.escapeXml(writer0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "";
      int int0 = 0;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(int0);
      assertNotNull(charArrayWriter0);
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      
      String string1 = StringEscapeUtils.escapeSql(string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("", string1);
      
      StringEscapeUtils.escapeXml((Writer) charArrayWriter0, string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "Th* Writer must 7t be null.";
      String string1 = StringEscapeUtils.unescapeXml(string0);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertNotNull(string1);
      assertEquals("Th* Writer must 7t be null.", string1);
      
      String string2 = null;
      String string3 = StringEscapeUtils.unescapeXml(string2);
      assertNull(string3);
      
      MockFile mockFile0 = new MockFile(string1, string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertNotNull(mockFile0);
      
      boolean boolean0 = false;
      MockFileWriter mockFileWriter0 = new MockFileWriter((File) mockFile0, boolean0);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertNotNull(mockFileWriter0);
      
      StringEscapeUtils.unescapeHtml((Writer) mockFileWriter0, string3);
      assertSame(string0, string1);
      assertSame(string1, string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "q\\rpO|B/VL9LOUysMdg7";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("q\rpO|B/VL9LOUysMdg7", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      Writer writer0 = null;
      // Undeclared exception!
      try {
        StringEscapeUtils.unescapeHtml(writer0, string1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.unescapeHtml(string0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "Vj\"1}uvPIv~J_' ";
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("Vj\\\"1}uvPIv~J_' ", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      String string2 = StringEscapeUtils.unescapeHtml(string1);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotNull(string2);
      assertEquals("Vj\\\"1}uvPIv~J_' ", string2);
      assertTrue(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertTrue(string1.equals((Object)string2));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputStream outputStream0 = null;
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(outputStream0);
      assertNotNull(bufferedOutputStream0);
      
      boolean boolean0 = false;
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) bufferedOutputStream0, boolean0);
      assertNotNull(mockPrintStream0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) mockPrintStream0);
      assertNotNull(mockPrintWriter0);
      
      String string0 = null;
      StringEscapeUtils.escapeHtml((Writer) mockPrintWriter0, string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Writer writer0 = null;
      String string0 = "4:  vY}/5";
      // Undeclared exception!
      try {
        StringEscapeUtils.escapeHtml(writer0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.escapeHtml(string0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "Th* Writer must 7t be null.";
      String string1 = StringEscapeUtils.escapeHtml(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("Th* Writer must 7t be null.", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = "\\(>8";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("(>8", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "d\\t6($Acf";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("d\t6($Acf", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "1>O7^u4IZ7|{/{n\\n[";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("1>O7^u4IZ7|{/{n\n[", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = "FJq#}&m|E!mn\\b}7~G]#";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("FJq#}&m|E!mn\b}7~G]#", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      
      String string0 = "I7TE3=!T'1#b8@L";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("I7TE3=!T\\'1#b8@L", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      
      StringEscapeUtils.unescapeJavaScript((Writer) charArrayWriter0, string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("I7TE3=!T'1#b8@L", charArrayWriter0.toString());
      assertEquals(16, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = "\\uxO070l0";
      // Undeclared exception!
      try {
        String string1 = StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: VerifyError");
      
      } catch(VerifyError e) {
         //
         // (class: org/apache/commons/lang/exception/NestableRuntimeException, method: getMessage signature: (I)Ljava/lang/String;) Illegal use of nonvirtual function call
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = "Th* Writer must 7t be null.";
      String string1 = StringEscapeUtils.unescapeXml(string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("Th* Writer must 7t be null.", string1);
      
      String string2 = null;
      String string3 = StringEscapeUtils.unescapeXml(string2);
      assertNull(string3);
      
      MockFile mockFile0 = new MockFile(string1, string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(mockFile0);
      
      boolean boolean0 = false;
      MockFileWriter mockFileWriter0 = new MockFileWriter((File) mockFile0, boolean0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(mockFileWriter0);
      
      StringEscapeUtils.unescapeJavaScript((Writer) mockFileWriter0, string3);
      assertSame(string1, string0);
      assertSame(string0, string1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "#@>Y\\gV~H7W`OC";
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("#@>Y\\\\gV~H7W`OC", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      Writer writer0 = null;
      // Undeclared exception!
      try {
        StringEscapeUtils.unescapeJava(writer0, string1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = "1>O7^u4IZ7|{/{n\\n[";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("1>O7^u4IZ7|{\\/{n\\\\n[", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = "\t\r\n\b";
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("\\t\\r\\n\\b", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OutputStream outputStream0 = null;
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(outputStream0);
      assertNotNull(bufferedOutputStream0);
      
      boolean boolean0 = false;
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) bufferedOutputStream0, boolean0);
      assertNotNull(mockPrintStream0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) mockPrintStream0);
      assertNotNull(mockPrintWriter0);
      
      String string0 = null;
      StringEscapeUtils.escapeJavaScript((Writer) mockPrintWriter0, string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Writer writer0 = null;
      String string0 = "23";
      // Undeclared exception!
      try {
        StringEscapeUtils.escapeJavaScript(writer0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = "Th* Writer must 7t be null.";
      String string1 = StringEscapeUtils.unescapeXml(string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("Th* Writer must 7t be null.", string1);
      
      MockFile mockFile0 = new MockFile(string1, string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(mockFile0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(mockPrintWriter0);
      
      StringEscapeUtils.escapeJava((Writer) mockPrintWriter0, string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
      assertNotNull(stringEscapeUtils0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = "#h\"Dr}{Y#,y\\";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("#h\"Dr}{Y#,y\\", string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      
      String string0 = "Fy92\".vnROI`\\g5UP";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("Fy92\\\".vnROI`\\\\g5UP", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      
      StringEscapeUtils.unescapeJavaScript((Writer) charArrayWriter0, string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("Fy92\".vnROI`\\g5UP", charArrayWriter0.toString());
      assertEquals(17, charArrayWriter0.size());
  }
}
