/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:30:26 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.LiveVariablesAnalysis;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class LiveVariablesAnalysisEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ControlFlowGraph<Node> controlFlowGraph0 = null;
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      Scope scope0 = null;
      LiveVariablesAnalysis liveVariablesAnalysis0 = null;
      try {
        liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
