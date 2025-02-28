/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:36:40 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CheckEventfulObjectDisposal;
import com.google.javascript.jscomp.CommandLineRunner;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.SourceFile;
import java.io.OutputStream;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockNullPointerException;
import org.junit.runner.RunWith;

 
public class CommandLineRunnerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = "%";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
      assertNotNull(commandLineRunner0);
      
      // Undeclared exception!
      try {
        List<SourceFile> list0 = commandLineRunner0.createExterns();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "-w=1THV>JI<R-sG";
      boolean boolean0 = true;
      String[] stringArray0 = new String[4];
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      stringArray0[1] = string0;
      assertNotNull(stringArray0[1]);
      
      stringArray0[2] = string0;
      assertNotNull(stringArray0[2]);
      
      stringArray0[3] = string0;
      assertNotNull(stringArray0[3]);
      
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(stringArray0[3], boolean0);
      assertNotNull(mockFileOutputStream0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) mockFileOutputStream0);
      assertNotNull(mockPrintStream0);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
      assertNotNull(commandLineRunner0);
      
      CompilerOptions compilerOptions0 = commandLineRunner0.createOptions();
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.aliasKeywords);
      assertTrue(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.generateExports);
      assertTrue(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertTrue(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.ideMode);
      assertTrue(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertTrue(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertTrue(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertTrue(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.preserveGoogRequires);
      assertTrue(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertTrue(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertTrue(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.aliasExternals);
      assertTrue(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.markAsCompiled);
      assertTrue(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertTrue(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertTrue(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.removeUnusedClassProperties);
      assertFalse(compilerOptions0.inlineVariables);
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(CheckEventfulObjectDisposal.DisposalCheckingPolicy.OFF, compilerOptions0.getCheckEventfulObjectDisposalPolicy());
      assertEquals(false, compilerOptions0.isRemoveUnusedClassProperties());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(false, compilerOptions0.getInstrumentMemoryAllocations());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(CompilerOptions.TracerMode.OFF, compilerOptions0.getTracerMode());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.isDisambiguatePrivateProperties());
      assertEquals(false, compilerOptions0.getCheckDeterminism());
      assertNotNull(compilerOptions0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[2];
      String string0 = "{0} expressions are not callable";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      stringArray0[1] = string0;
      assertNotNull(stringArray0[1]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
      assertNotNull(commandLineRunner0);
      
      Compiler compiler0 = commandLineRunner0.createCompiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
      assertNotNull(compiler0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = "\n";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
      assertNotNull(commandLineRunner0);
      
      boolean boolean0 = commandLineRunner0.shouldRunCompiler();
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
      assertTrue(boolean0);
  }
}
