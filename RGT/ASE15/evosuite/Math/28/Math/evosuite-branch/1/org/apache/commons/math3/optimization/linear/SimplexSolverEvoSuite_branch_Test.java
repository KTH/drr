/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:37:52 GMT 2014
 */

package org.apache.commons.math3.optimization.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.linear.LinearConstraint;
import org.apache.commons.math3.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optimization.linear.SimplexSolver;
import org.apache.commons.math3.optimization.linear.UnboundedSolutionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class SimplexSolverEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      assertEquals(0, simplexSolver0.getIterations());
      assertEquals(100, simplexSolver0.getMaxIterations());
      assertNotNull(simplexSolver0);
      
      double[] doubleArray0 = new double[2];
      int int0 = 2;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(int0, doubleArray0[1]);
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(0.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(0.0, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(2, arrayRealVector0.getDimension());
      assertEquals(0.0, arrayRealVector0.getL1Norm(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(arrayRealVector0);
      
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction((RealVector) arrayRealVector0, doubleArray0[1]);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(0.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(0.0, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(2, arrayRealVector0.getDimension());
      assertEquals(0.0, arrayRealVector0.getL1Norm(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(linearObjectiveFunction0);
      
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(linkedList0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      boolean boolean0 = true;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, (Collection<LinearConstraint>) linkedList0, goalType0, boolean0);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertEquals(0, simplexSolver0.getIterations());
      assertEquals(100, simplexSolver0.getMaxIterations());
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(0.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(0.0, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(2, arrayRealVector0.getDimension());
      assertEquals(0.0, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexSolver simplexSolver0 = new SimplexSolver();
      assertEquals(0, simplexSolver0.getIterations());
      assertEquals(100, simplexSolver0.getMaxIterations());
      assertNotNull(simplexSolver0);
      
      boolean boolean0 = true;
      double[] doubleArray0 = new double[2];
      double double0 = 1.0;
      doubleArray0[0] = double0;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, doubleArray0[0]);
      assertEquals(1.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertArrayEquals(new double[] {1.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(linearObjectiveFunction0);
      
      try {
        PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, (Collection<LinearConstraint>) linkedList0, goalType0, boolean0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
      }
  }
}
