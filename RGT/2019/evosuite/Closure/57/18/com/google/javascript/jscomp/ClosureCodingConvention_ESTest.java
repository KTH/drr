/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 23:56:12 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DeadAssignmentsElimination;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.Collection;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClosureCodingConvention_ESTest extends ClosureCodingConvention_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = new Node(0);
      String string0 = closureCodingConvention0.extractClassNameIfRequire(node0, node0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      boolean boolean0 = closureCodingConvention0.isVarArgsParameter((Node) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString("Named type with empty name component", 0, 1);
      String string0 = closureCodingConvention0.extractClassNameIfProvide(node0, node0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      String string0 = closureCodingConvention0.getExportSymbolFunction();
      assertEquals("goog.exportSymbol", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      boolean boolean0 = closureCodingConvention0.isOptionalParameter((Node) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      boolean boolean0 = closureCodingConvention0.isSuperClassReference("Ex2KN~uY5gTXQ'B");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      String string0 = closureCodingConvention0.getAbstractMethodName();
      assertEquals("goog.abstractMethod", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      boolean boolean0 = closureCodingConvention0.isPrivate("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      String string0 = closureCodingConvention0.getExportPropertyFunction();
      assertEquals("goog.exportProperty", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      FunctionType functionType0 = jSTypeRegistry0.createInterfaceType("goog.partial", (Node) null);
      closureCodingConvention0.applySingletonGetter(functionType0, functionType0, functionType0);
      assertTrue(functionType0.hasInstanceType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      String string0 = googleCodingConvention0.getGlobalObject();
      assertEquals("goog.global", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Collection<CodingConvention.AssertionFunctionSpec> collection0 = closureCodingConvention0.getAssertionFunctions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      CodingConvention.SubclassType codingConvention_SubclassType0 = CodingConvention.SubclassType.MIXIN;
      googleCodingConvention0.applySubclassRelationship((FunctionType) null, (FunctionType) null, codingConvention_SubclassType0);
      assertNull(googleCodingConvention0.getDelegateSuperclassName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      CodingConvention.SubclassType codingConvention_SubclassType0 = CodingConvention.SubclassType.INHERITS;
      closureCodingConvention0.applySubclassRelationship(functionType0, functionType0, codingConvention_SubclassType0);
      assertTrue(functionType0.canBeCalled());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[1] = (JSType) functionType0;
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      CodingConvention.SubclassRelationship codingConvention_SubclassRelationship0 = closureCodingConvention0.getClassesDefinedByCall(node0);
      assertNull(codingConvention_SubclassRelationship0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = Node.newString(0, "goog.global");
      node0.addChildToFront(node0);
      CodingConvention.SubclassRelationship codingConvention_SubclassRelationship0 = googleCodingConvention0.getClassesDefinedByCall(node0);
      assertNull(codingConvention_SubclassRelationship0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[1] = (JSType) functionType0;
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      List<String> list0 = closureCodingConvention0.identifyTypeDeclarationCall(node0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      JSType[] jSTypeArray0 = new JSType[2];
      jSTypeArray0[1] = (JSType) functionType0;
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      String string0 = closureCodingConvention0.getSingletonGetterClassName(node0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = new Node((-864), (-864), 0);
      // Undeclared exception!
      try { 
        closureCodingConvention0.isPropertyTestFunction(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = new Node(37, 37, 37);
      Node node1 = new Node(37, node0, node0, node0, node0);
      boolean boolean0 = googleCodingConvention0.isPropertyTestFunction(node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Compiler compiler0 = new Compiler();
      DeadAssignmentsElimination deadAssignmentsElimination0 = new DeadAssignmentsElimination(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, deadAssignmentsElimination0);
      Node node0 = Node.newString(2892, "cI}|sj_WUmY-V`", 64, 2892);
      // Undeclared exception!
      try { 
        googleCodingConvention0.getObjectLiteralCast(nodeTraversal0, node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = new Node(37, 37, 37);
      Node node1 = new Node(37, node0, node0, node0, node0);
      CodingConvention.ObjectLiteralCast codingConvention_ObjectLiteralCast0 = googleCodingConvention0.getObjectLiteralCast((NodeTraversal) null, node1);
      assertNull(codingConvention_ObjectLiteralCast0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = new Node(37, 37, 37);
      Node node1 = new Node(37, node0, node0, node0, node0);
      CodingConvention.Bind codingConvention_Bind0 = googleCodingConvention0.describeFunctionBind(node1);
      assertNull(codingConvention_Bind0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = Node.newNumber(0.0, 1113, 1113);
      CodingConvention.Bind codingConvention_Bind0 = googleCodingConvention0.describeFunctionBind(node0);
      assertNull(codingConvention_Bind0);
  }
}
