/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 18:16:29 GMT 2019
 */

package org.apache.commons.math3.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.linear.ArrayRealVector;
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
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector1, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector1).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn((-316.32369), 1.0).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
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
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn((double)100, (double)100).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint1).getCoefficients();
      doReturn(relationship0).when(linearConstraint1).getRelationship();
      doReturn((double)100, (double)100).when(linearConstraint1).getValue();
      linkedList0.add(linearConstraint1);
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.EQ;
      Relationship relationship1 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0, arrayRealVector0, arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0, relationship1).when(linearConstraint0).getRelationship();
      doReturn((-291.6190931682398), (double)100, 2.6222628001695826E-8, 1.4110645699377834E-8, (double)100).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      Relationship relationship2 = Relationship.LEQ;
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0, arrayRealVector0, arrayRealVector0).when(linearConstraint1).getCoefficients();
      doReturn(relationship0, relationship0, relationship2).when(linearConstraint1).getRelationship();
      doReturn((-291.6190931682398), (double)100, 818.98317532017, 1.4110645699377834E-8, (double)100).when(linearConstraint1).getValue();
      linkedList0.add(linearConstraint1);
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      simplexTableau0.normalizeConstraints(linkedList0);
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      assertEquals(1, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0, arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0).when(linearConstraint0).getRelationship();
      doReturn((-291.6190931682398), (double)100, 2.6222628001695826E-8, 1.4110645699377834E-8).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0, arrayRealVector0).when(linearConstraint1).getCoefficients();
      doReturn(relationship0, relationship0).when(linearConstraint1).getRelationship();
      doReturn((-291.6190931682398), (double)100, 818.98317532017, 1.4110645699377834E-8).when(linearConstraint1).getValue();
      linkedList0.add(linearConstraint1);
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-291.6190931682398), (-228));
      try { 
        simplexSolver0.doIteration(simplexTableau1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn((double)100, (double)100).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint1).getCoefficients();
      doReturn(relationship0).when(linearConstraint1).getRelationship();
      doReturn((double)100, (double)100).when(linearConstraint1).getValue();
      linkedList0.add(linearConstraint1);
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.setMaxIterations(3);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100, (-228));
      simplexSolver0.doIteration(simplexTableau0);
      assertEquals(3, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn((-316.32369), (double)100).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint1).getCoefficients();
      doReturn(relationship0).when(linearConstraint1).getRelationship();
      doReturn((-345.97649), (-411800.0)).when(linearConstraint1).getValue();
      linkedList0.add(linearConstraint1);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
}
