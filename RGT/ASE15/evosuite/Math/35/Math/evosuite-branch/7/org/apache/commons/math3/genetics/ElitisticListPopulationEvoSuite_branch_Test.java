/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:29:24 GMT 2014
 */

package org.apache.commons.math3.genetics;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.genetics.Chromosome;
import org.apache.commons.math3.genetics.ElitisticListPopulation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class ElitisticListPopulationEvoSuite_branch_Test   {

  ////@Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 1;
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(int0, int0);
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01D);
      assertEquals(0, elitisticListPopulation0.getPopulationSize());
      assertEquals("[]", elitisticListPopulation0.toString());
      assertEquals(1, elitisticListPopulation0.getPopulationLimit());
      assertNotNull(elitisticListPopulation0);
      
      int int1 = 1802;
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomes();
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01D);
      assertEquals(0, elitisticListPopulation0.getPopulationSize());
      assertEquals("[]", elitisticListPopulation0.toString());
      assertEquals(1, elitisticListPopulation0.getPopulationLimit());
      assertNotNull(list0);
      assertFalse(int0 == int1);
      
      ElitisticListPopulation elitisticListPopulation1 = null;
      try {
        elitisticListPopulation1 = new ElitisticListPopulation(list0, int1, (double) int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (1,802)
         //
      }
  }

 // //@Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = 1;
      double double0 = (-3543.8389626);
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(int0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-3,543.839)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = 1;
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(int0, int0);
      assertEquals(0, elitisticListPopulation0.getPopulationSize());
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01D);
      assertEquals(1, elitisticListPopulation0.getPopulationLimit());
      assertEquals("[]", elitisticListPopulation0.toString());
      assertNotNull(elitisticListPopulation0);
      
      Chromosome chromosome0 = null;
      elitisticListPopulation0.addChromosome(chromosome0);
      assertEquals("[null]", elitisticListPopulation0.toString());
      assertEquals(1, elitisticListPopulation0.getPopulationSize());
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01D);
      assertEquals(1, elitisticListPopulation0.getPopulationLimit());
      
      ElitisticListPopulation elitisticListPopulation1 = (ElitisticListPopulation)elitisticListPopulation0.nextGeneration();
      assertNotSame(elitisticListPopulation1, elitisticListPopulation0);
      assertNotSame(elitisticListPopulation0, elitisticListPopulation1);
      assertEquals(1, elitisticListPopulation1.getPopulationLimit());
      assertEquals(1, elitisticListPopulation1.getPopulationSize());
      assertEquals(1.0, elitisticListPopulation1.getElitismRate(), 0.01D);
      assertEquals("[null]", elitisticListPopulation1.toString());
      assertEquals("[null]", elitisticListPopulation0.toString());
      assertEquals(1, elitisticListPopulation0.getPopulationSize());
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01D);
      assertEquals(1, elitisticListPopulation0.getPopulationLimit());
      assertNotNull(elitisticListPopulation1);
      assertFalse(elitisticListPopulation1.equals((Object)elitisticListPopulation0));
      assertFalse(elitisticListPopulation0.equals((Object)elitisticListPopulation1));
  }
}
