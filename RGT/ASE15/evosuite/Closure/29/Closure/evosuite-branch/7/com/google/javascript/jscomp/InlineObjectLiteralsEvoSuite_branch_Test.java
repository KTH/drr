/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:30:27 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.InlineObjectLiterals;
import com.google.javascript.jscomp.RenameLabels;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

 
public class InlineObjectLiteralsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "%x[5";
      MockPrintStream mockPrintStream0 = new MockPrintStream(string0);
      assertNotNull(mockPrintStream0);
      
      Compiler compiler0 = new Compiler((PrintStream) mockPrintStream0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(renameLabels_DefaultNameSupplier0);
      assertNotNull(functionToBlockMutator_LabelNameSupplier0);
      
      InlineObjectLiterals inlineObjectLiterals0 = new InlineObjectLiterals(compiler0, functionToBlockMutator_LabelNameSupplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(inlineObjectLiterals0);
      
      Node node0 = null;
      // Undeclared exception!
      try {
        inlineObjectLiterals0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }
}
