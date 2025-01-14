/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 06:36:30 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessClosurePrimitives_ESTest extends ProcessClosurePrimitives_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      Node node0 = compiler0.parseTestCode("goog.base");
      processClosurePrimitives0.process(node0, node0);
      assertEquals(1, compiler0.getErrorCount());
      assertTrue(compiler0.hasErrors());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Set<String> set0 = processClosurePrimitives0.getExportedVariableNames();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      Node node0 = Node.newString(106, "exportSymbol");
      Node node1 = new Node(30, node0);
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      processClosurePrimitives0.process(node0, node1);
      assertEquals(1, Node.FLAG_GLOBAL_STATE_UNMODIFIED);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, makeDeclaredNamesUnique0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      Node node0 = new Node(86, (byte) (-72), (byte) (-72));
      processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
      assertEquals(18, Node.SPECIAL_PROP_PROP);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString(37, "com.google.javascript.jscomp.TightenTypes$ConcreteScope");
      node0.addChildToFront(node0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      processClosurePrimitives0.visit((NodeTraversal) null, node0, node0);
      assertFalse(node0.isOnlyModifiesThisCall());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      JSType[] jSTypeArray0 = new JSType[1];
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      Node node1 = new Node(105, node0, (-4369), (-2));
      Node node2 = new Node(31, node1, node1);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      processClosurePrimitives0.visit(nodeTraversal0, node1, node0);
      assertFalse(node1.isVarArgs());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString(37, "com.google.javascript.jscomp.TightenTypes$ConcreteScope");
      Node node1 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.TightenTypes$ConcreteScope", "com.google.javascript.jscomp.TightenTypes$ConcreteScope");
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      processClosurePrimitives0.process(node0, node1);
      assertEquals((-3), Node.LOCAL_BLOCK_PROP);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = Node.newString(30, "");
      processClosurePrimitives0.visit((NodeTraversal) null, node0, node0);
      assertEquals(12, Node.REGEXP_PROP);
  }
}
