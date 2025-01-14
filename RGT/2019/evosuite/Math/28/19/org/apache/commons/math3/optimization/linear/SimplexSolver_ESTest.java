/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 18:27:29 GMT 2019
 */

package org.apache.commons.math3.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer;
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
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn((double)100, (-1298.9938258138864)).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint1).getCoefficients();
      doReturn(relationship0).when(linearConstraint1).getRelationship();
      doReturn(2.0454950851007314E110, (double)100).when(linearConstraint1).getValue();
      linkedList0.add(linearConstraint1);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1298.9938258138864), 100);
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

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, (-1298.9938258138864));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100, 100);
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
  public void test2()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn((double)100, (-1298.994)).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint1).getCoefficients();
      doReturn(relationship0).when(linearConstraint1).getRelationship();
      doReturn((double)100, (-1298.994)).when(linearConstraint1).getValue();
      linkedList0.add(linearConstraint1);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 2.433986351722258E-112, (-856));
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

//  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      Relationship relationship0 = Relationship.GEQ;
      Relationship relationship1 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0, (RealVector) null).when(linearConstraint0).getCoefficients();
      doReturn(relationship1, (Relationship) null).when(linearConstraint0).getRelationship();
      doReturn((double)100, (-1298.994), 0.0, 0.0).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0, (RealVector) null).when(linearConstraint1).getCoefficients();
      doReturn(relationship0, (Relationship) null).when(linearConstraint1).getRelationship();
      doReturn((double)100, (-1298.994), 0.0, 0.0).when(linearConstraint1).getValue();
      linkedList0.add(linearConstraint1);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      simplexSolver0.setMaxIterations(7);
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 2.433986351722258E-112, (-856));
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn((double)100, (-1298.994)).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint1).getCoefficients();
      doReturn(relationship0).when(linearConstraint1).getRelationship();
      doReturn((double)100, (-1298.994)).when(linearConstraint1).getValue();
      linkedList0.add(linearConstraint1);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 2.433986351722258E-112, 100);
      simplexTableau0.dropPhase1Objective();
      simplexSolver0.doIteration(simplexTableau0);
      assertEquals(100, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, (-1298.9938258138864));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100, 100);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }
}
