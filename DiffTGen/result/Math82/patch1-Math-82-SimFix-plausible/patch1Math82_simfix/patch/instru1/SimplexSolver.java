/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.math.optimization.linear;

import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.util.MathUtils;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import myprinter.FieldPrinter;


/**
 * Solves a linear problem using the Two-Phase Simplex Method.
 * @version $Revision$ $Date$
 * @since 2.0
 */
public class SimplexSolver extends AbstractLinearOptimizer {

    public static int eid_SimplexSolver_7au3e = 0;

	public static int eid_SimplexSolver_double_7au3e = 0;

	public static int eid_getPivotColumn_SimplexTableau_7au3e = 0;

	public static int eid_getPivotRow_int_SimplexTableau_7au3e = 0;

	public static int eid_doIteration_SimplexTableau_7au3e = 0;

	public static int eid_isPhase1Solved_SimplexTableau_7au3e = 0;

	public static int eid_isOptimal_SimplexTableau_7au3e = 0;

	public static int eid_solvePhase1_SimplexTableau_7au3e = 0;

	public static int eid_doOptimize_7au3e = 0;

	public static Map oref_map = new HashMap();

	public static void addToORefMap(String msig, Object obj) {
		List l = (List) oref_map.get(msig);
		if (l == null) {
			l = new ArrayList();
			oref_map.put(msig, l);
		}
		l.add(obj);
	}

	public static void clearORefMap() {
		oref_map.clear();
		eid_SimplexSolver_7au3e = 0;
		eid_SimplexSolver_double_7au3e = 0;
		eid_getPivotColumn_SimplexTableau_7au3e = 0;
		eid_getPivotRow_int_SimplexTableau_7au3e = 0;
		eid_doIteration_SimplexTableau_7au3e = 0;
		eid_isPhase1Solved_SimplexTableau_7au3e = 0;
		eid_isOptimal_SimplexTableau_7au3e = 0;
		eid_solvePhase1_SimplexTableau_7au3e = 0;
		eid_doOptimize_7au3e = 0;
	}

	/** Default amount of error to accept in floating point comparisons. */ 
    private static final double DEFAULT_EPSILON = 1.0e-6;

    /** Amount of error to accept in floating point comparisons. */ 
    protected final double epsilon;  

    /**
     * Build a simplex solver with default settings.
     */
    public SimplexSolver() {
        this(DEFAULT_EPSILON);
    }

    /**
     * Build a simplex solver with a specified accepted amount of error
     * @param epsilon the amount of error to accept in floating point comparisons
     */
    public SimplexSolver(final double epsilon) {
        this.epsilon = epsilon;
    }

    /**
     * Returns the column with the most negative coefficient in the objective function row.
     * @param tableau simple tableau for the problem
     * @return column with the most negative coefficient
     */
    private Integer getPivotColumn_7au3e(SimplexTableau tableau) {
        double minValue = 0;
        Integer minPos = null;
        for (int i = tableau.getNumObjectiveFunctions(); i < tableau.getWidth() - 1; i++) {
            if (MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0) {
                minValue = tableau.getEntry(0, i);
                minPos = i;
            }
        }
        return minPos;
    }

    /**
     * Returns the row with the minimum ratio as given by the minimum ratio test (MRT).
     * @param tableau simple tableau for the problem
     * @param col the column to test the ratio of.  See {@link #getPivotColumn(SimplexTableau)}
     * @return row with the minimum ratio
     */
    private Integer getPivotRow(final int col, final SimplexTableau tableau) {
        double minRatio = Double.MAX_VALUE;
        Integer minRatioPos = null;
        for (int i = tableau.getNumObjectiveFunctions(); i < tableau.getHeight(); i++) {
            final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
            final double entry = tableau.getEntry(i, col);
            if (MathUtils.compareTo(entry, 0, epsilon) >= 0) {
                final double ratio = rhs / entry;
                if (ratio < minRatio) {
                    minRatio = ratio;
                    minRatioPos = i; 
                }
            }
        }
        return minRatioPos;
    }


    /**
     * Runs one iteration of the Simplex method on the given model.
     * @param tableau simple tableau for the problem
     * @throws OptimizationException if the maximal iteration count has been
     * exceeded or if the model is found not to have a bounded solution
     */
    protected void doIteration(final SimplexTableau tableau)
        throws OptimizationException {

        incrementIterationsCounter();

        Integer pivotCol = getPivotColumn(tableau);
        Integer pivotRow = getPivotRow(pivotCol, tableau);
        if (pivotRow == null) {
            throw new UnboundedSolutionException();
        }

        // set the pivot element to 1
        double pivotVal = tableau.getEntry(pivotRow, pivotCol);
        tableau.divideRow(pivotRow, pivotVal);

        // set the rest of the pivot column to 0
        for (int i = 0; i < tableau.getHeight(); i++) {
            if (i != pivotRow) {
                double multiplier = tableau.getEntry(i, pivotCol);
                tableau.subtractRow(i, pivotRow, multiplier);
            }
        }
    }

    /**
     * Checks whether Phase 1 is solved.
     * @param tableau simple tableau for the problem
     * @return whether Phase 1 is solved
     */
    private boolean isPhase1Solved(final SimplexTableau tableau) {
        if (tableau.getNumArtificialVariables() == 0) {
            return true;
        }
        for (int i = tableau.getNumObjectiveFunctions(); i < tableau.getWidth() - 1; i++) {
            if (MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns whether the problem is at an optimal state.
     * @param tableau simple tableau for the problem
     * @return whether the model has been solved
     */
    public boolean isOptimal(final SimplexTableau tableau) {
        if (tableau.getNumArtificialVariables() > 0) {
            return false;
        }
        for (int i = tableau.getNumObjectiveFunctions(); i < tableau.getWidth() - 1; i++) {
            if (MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Solves Phase 1 of the Simplex method.
     * @param tableau simple tableau for the problem
     * @exception OptimizationException if the maximal number of iterations is
     * exceeded, or if the problem is found not to have a bounded solution, or
     * if there is no feasible solution
     */
    protected void solvePhase1(final SimplexTableau tableau)
        throws OptimizationException {
        // make sure we're in Phase 1
        if (tableau.getNumArtificialVariables() == 0) {
            return;
        }

        while (!isPhase1Solved(tableau)) {
            doIteration(tableau);
        }

        // if W is not zero then we have no feasible solution
        if (!MathUtils.equals(tableau.getEntry(0, tableau.getRhsOffset()), 0, epsilon)) {
            throw new NoFeasibleSolutionException();
        }
    }

    /** {@inheritDoc} */
    @Override
    public RealPointValuePair doOptimize()
        throws OptimizationException {
        final SimplexTableau tableau =
            new SimplexTableau(f, constraints, goalType, restrictToNonNegative, epsilon);
        solvePhase1(tableau);
        tableau.discardArtificialVariables();
        while (!isOptimal(tableau)) {
            doIteration(tableau);
        }
        return tableau.getSolution();
    }

	/**
	 * Returns the column with the most negative coefficient in the objective function row.
	 * @param tableau  simple tableau for the problem
	 * @return  column with the most negative coefficient
	 */
	private Integer getPivotColumn(SimplexTableau tableau) {
		Object o_7au3e = null;
		String c_7au3e = "org.apache.commons.math.optimization.linear.SimplexSolver";
		String msig_7au3e = "getPivotColumn(SimplexTableau)"
				+ eid_getPivotColumn_SimplexTableau_7au3e;
		try {
			o_7au3e = getPivotColumn_7au3e(tableau);
			addToORefMap(msig_7au3e, o_7au3e);
			addToORefMap(msig_7au3e, this);
			addToORefMap(msig_7au3e, tableau);
		} catch (Throwable t7au3e) {
			addToORefMap(msig_7au3e, t7au3e);
			throw t7au3e;
		} finally {
			eid_getPivotColumn_SimplexTableau_7au3e++;
		}
		return (Integer) o_7au3e;
	}

}
