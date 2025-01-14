/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 23:54:00 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CheckGlobalThis;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.ClosureReverseAbstractInterpreter;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.CombinedCompilerPass;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClosureCodingConvention_ESTest extends ClosureCodingConvention_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType[] jSTypeArray0 = new JSType[1];
      JSTypeNative jSTypeNative0 = JSTypeNative.GREATEST_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      jSTypeArray0[0] = (JSType) functionType0;
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      String string0 = googleCodingConvention0.extractClassNameIfRequire(node0, node0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString((-2613), "7;_7]F|%K(^;");
      boolean boolean0 = closureCodingConvention0.isVarArgsParameter(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString("~o6Z$I&mQ", 306, 306);
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
      Node node0 = Node.newString("~o6Z$I&mQ", 306, 306);
      boolean boolean0 = closureCodingConvention0.isOptionalParameter(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      boolean boolean0 = googleCodingConvention0.isSuperClassReference("goog.exportSymbol");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      String string0 = googleCodingConvention0.getAbstractMethodName();
      assertEquals("goog.abstractMethod", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      boolean boolean0 = closureCodingConvention0.isPrivate("@VPSq9|Z");
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
      // Undeclared exception!
      try { 
        closureCodingConvention0.applySingletonGetter((FunctionType) null, (FunctionType) null, (ObjectType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ClosureCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      String string0 = googleCodingConvention0.getGlobalObject();
      assertEquals("goog.global", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Collection<CodingConvention.AssertionFunctionSpec> collection0 = googleCodingConvention0.getAssertionFunctions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(closureCodingConvention0, jSTypeRegistry0);
      JSTypeNative jSTypeNative0 = JSTypeNative.STRING_TYPE;
      JSType jSType0 = closureReverseAbstractInterpreter0.getNativeType(jSTypeNative0);
      JSType[] jSTypeArray0 = new JSType[7];
      JSTypeNative jSTypeNative1 = JSTypeNative.REFERENCE_ERROR_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative1);
      jSTypeArray0[6] = (JSType) objectType0;
      FunctionType functionType0 = jSTypeRegistry0.createConstructorType(jSType0, true, jSTypeArray0);
      CodingConvention.SubclassType codingConvention_SubclassType0 = CodingConvention.SubclassType.MIXIN;
      closureCodingConvention0.applySubclassRelationship(functionType0, functionType0, codingConvention_SubclassType0);
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      CodingConvention.SubclassType codingConvention_SubclassType0 = CodingConvention.SubclassType.INHERITS;
      // Undeclared exception!
      try { 
        googleCodingConvention0.applySubclassRelationship((FunctionType) null, (FunctionType) null, codingConvention_SubclassType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ClosureCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString("~o6Z$I&mQ", 306, 306);
      Node node1 = new Node(306, node0, node0, 24, 0);
      CodingConvention.SubclassRelationship codingConvention_SubclassRelationship0 = closureCodingConvention0.getClassesDefinedByCall(node1);
      assertNull(codingConvention_SubclassRelationship0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = Node.newString(33, "O}Fzx}!dM'#,i15k");
      Node node1 = new Node((-4807), node0, node0, node0, node0, 9, 33);
      // Undeclared exception!
      try { 
        googleCodingConvention0.getClassesDefinedByCall(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ClosureCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      JSTypeNative jSTypeNative0 = JSTypeNative.RANGE_ERROR_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      arrayList0.add((JSType) functionType0);
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
      CodingConvention.SubclassRelationship codingConvention_SubclassRelationship0 = closureCodingConvention0.getClassesDefinedByCall(node0);
      assertNull(codingConvention_SubclassRelationship0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString(38, "goog$addSingletonGetter");
      Node node1 = new Node((-4807), node0, node0, node0, node0, 9, 38);
      CodingConvention.SubclassRelationship codingConvention_SubclassRelationship0 = closureCodingConvention0.getClassesDefinedByCall(node1);
      assertNull(codingConvention_SubclassRelationship0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString(38, "goog$addSingletonGetter");
      Node node1 = new Node((-4807), node0, node0, node0, node0, 9, 38);
      List<String> list0 = closureCodingConvention0.identifyTypeDeclarationCall(node1);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString(38, "goog.addDependency");
      Node node1 = new Node((-4807), node0, node0, node0, node0, 9, 38);
      List<String> list0 = closureCodingConvention0.identifyTypeDeclarationCall(node1);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString(38, "goog.addSingletonGetter");
      Node node1 = new Node((-4807), node0, node0, node0, node0, 9, 38);
      String string0 = closureCodingConvention0.getSingletonGetterClassName(node1);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString(38, "goog.addDependency");
      Node node1 = new Node((-4807), node0, node0, node0, node0, 9, 38);
      String string0 = closureCodingConvention0.getSingletonGetterClassName(node1);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString(38, "goog$addSingletonGetter");
      Node node1 = new Node((-4807), node0, node0, node0, node0, 9, 38);
      String string0 = closureCodingConvention0.getSingletonGetterClassName(node1);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
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
  public void test24()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = new Node((byte) (-80));
      Node node1 = new Node(37, node0);
      boolean boolean0 = googleCodingConvention0.isPropertyTestFunction(node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Compiler compiler0 = new Compiler();
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0, (ScopeCreator) null);
      SyntheticAst syntheticAst0 = new SyntheticAst("goog.exportProperty");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
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
  public void test26()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = new Node((byte) (-80));
      Node node1 = new Node(37, node0);
      Compiler compiler0 = new Compiler();
      Vector<NodeTraversal.Callback> vector0 = new Vector<NodeTraversal.Callback>();
      CombinedCompilerPass combinedCompilerPass0 = new CombinedCompilerPass(compiler0, vector0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, combinedCompilerPass0);
      CodingConvention.ObjectLiteralCast codingConvention_ObjectLiteralCast0 = googleCodingConvention0.getObjectLiteralCast(nodeTraversal0, node1);
      assertNull(codingConvention_ObjectLiteralCast0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString(38, "goog$addSingletonGetter");
      CodingConvention.Bind codingConvention_Bind0 = closureCodingConvention0.describeFunctionBind(node0);
      assertNull(codingConvention_Bind0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = new Node((byte) (-80));
      Node node1 = new Node(37, node0);
      CodingConvention.Bind codingConvention_Bind0 = googleCodingConvention0.describeFunctionBind(node1);
      assertNull(codingConvention_Bind0);
  }
}
