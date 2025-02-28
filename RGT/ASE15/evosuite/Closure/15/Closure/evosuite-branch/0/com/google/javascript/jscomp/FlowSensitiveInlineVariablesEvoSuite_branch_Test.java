/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:47:27 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FlowSensitiveInlineVariables;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

 
public class FlowSensitiveInlineVariablesEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(abstractCompiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      flowSensitiveInlineVariables0.enterScope(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(abstractCompiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      int int0 = 147;
      String string0 = "3R!~j%hnpIv[Ks#b";
      Node node0 = Node.newString(int0, string0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isStringKey());
      assertEquals(147, node0.getLineno());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isNot());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isAssign());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.hasChildren());
      assertEquals(true, node0.isGetterDef());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isComma());
      assertEquals(147, node0.getCharno());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isBlock());
      assertEquals(147, node0.getType());
      assertEquals(false, node0.isNull());
      assertEquals(602259, node0.getSourcePosition());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.wasEmptyNode());
      
      flowSensitiveInlineVariables0.visit(nodeTraversal0, node0, node0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isStringKey());
      assertEquals(147, node0.getLineno());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isNot());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isAssign());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.hasChildren());
      assertEquals(true, node0.isGetterDef());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isComma());
      assertEquals(147, node0.getCharno());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isBlock());
      assertEquals(147, node0.getType());
      assertEquals(false, node0.isNull());
      assertEquals(602259, node0.getSourcePosition());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.wasEmptyNode());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(abstractCompiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      flowSensitiveInlineVariables0.exitScope(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) compiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Node node0 = compiler0.getRoot();
      assertNull(node0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      // Undeclared exception!
      try {
        flowSensitiveInlineVariables0.process(node0, node0);
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
