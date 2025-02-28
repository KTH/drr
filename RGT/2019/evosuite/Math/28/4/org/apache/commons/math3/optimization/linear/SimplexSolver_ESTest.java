/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 18:02:58 GMT 2019
 */

package org.apache.commons.math3.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.linear.LinearConstraint;
import org.apache.commons.math3.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optimization.linear.Relationship;
import org.apache.commons.math3.optimization.linear.SimplexSolver;
import org.apache.commons.math3.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;


public class SimplexSolver_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn(1.0E-12, 1.0E-12).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.EQ;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn(1.0E-12, (double)100).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint1).getCoefficients();
      doReturn(relationship0).when(linearConstraint1).getRelationship();
      doReturn((double)100, 100.0).when(linearConstraint1).getValue();
      linkedList0.add(linearConstraint1);
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, -0.0, (-2145100203));
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.EQ;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0, openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0).when(linearConstraint0).getRelationship();
      doReturn(1.0E-12, (double)100, 100.0, 1.0E-12).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0, openMapRealVector0).when(linearConstraint1).getCoefficients();
      doReturn(relationship0, relationship0).when(linearConstraint1).getRelationship();
      doReturn((double)100, 100.0, (-1483.0), 100.0).when(linearConstraint1).getValue();
      linkedList0.add(linearConstraint1);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0E-12);
      List<LinearConstraint> list0 = simplexTableau0.normalizeConstraints(linkedList0);
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, list0, goalType0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.LEQ;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn(1.0E-12, (double)100).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint1).getCoefficients();
      doReturn(relationship0).when(linearConstraint1).getRelationship();
      doReturn((double)100, 100.0).when(linearConstraint1).getValue();
      linkedList0.add(linearConstraint1);
      GoalType goalType0 = GoalType.MAXIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      assertEquals(1, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.EQ;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn(1.0E-12, (double)100).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint1).getCoefficients();
      doReturn(relationship0).when(linearConstraint1).getRelationship();
      doReturn((double)100, 100.0).when(linearConstraint1).getValue();
      linkedList0.add(linearConstraint1);
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.LEQ;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn(1.0E-12, (double)100).when(linearConstraint0).getValue();
      simplexSolver0.setMaxIterations(1);
      linkedList0.add(linearConstraint0);
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint1).getCoefficients();
      doReturn(relationship0).when(linearConstraint1).getRelationship();
      doReturn((double)100, 100.0).when(linearConstraint1).getValue();
      linkedList0.add(linearConstraint1);
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      assertNotNull(pointValuePair0);
  }
}
