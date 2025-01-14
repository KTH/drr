/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:01:56 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.InlineVariables;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.Tracer;
import com.google.javascript.rhino.Node;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

 
public class InlineVariablesEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Logger logger0 = Tracer.logger;
      assertNotNull(logger0);
      assertEquals(true, logger0.getUseParentHandlers());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertNull(logger0.getResourceBundleName());
      
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      assertNotNull(loggerErrorManager0);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(true, logger0.getUseParentHandlers());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertNull(logger0.getResourceBundleName());
      
      Compiler compiler0 = new Compiler((ErrorManager) loggerErrorManager0);
      assertNotNull(compiler0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(true, logger0.getUseParentHandlers());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertNull(logger0.getResourceBundleName());
      
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.CONSTANTS_ONLY;
      boolean boolean0 = true;
      InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, boolean0);
      assertNotNull(inlineVariables0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(true, logger0.getUseParentHandlers());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertNull(logger0.getResourceBundleName());
      
      Node node0 = null;
      // Undeclared exception!
      try {
        inlineVariables0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Logger logger0 = Logger.getGlobal();
      assertNotNull(logger0);
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("global", logger0.getName());
      
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      assertNotNull(loggerErrorManager0);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("global", logger0.getName());
      
      Compiler compiler0 = new Compiler((ErrorManager) loggerErrorManager0);
      assertNotNull(compiler0);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("global", logger0.getName());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      
      boolean boolean0 = true;
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.ALL;
      InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, boolean0);
      assertNotNull(inlineVariables0);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("global", logger0.getName());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      
      Node node0 = null;
      // Undeclared exception!
      try {
        inlineVariables0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.LOCALS_ONLY;
      boolean boolean0 = true;
      AbstractCompiler abstractCompiler0 = null;
      InlineVariables inlineVariables0 = new InlineVariables(abstractCompiler0, inlineVariables_Mode0, boolean0);
      assertNotNull(inlineVariables0);
      
      Node node0 = null;
      // Undeclared exception!
      try {
        inlineVariables0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
