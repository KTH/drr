/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:24:41 GMT 2014
 */

package org.apache.commons.math3.genetics;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
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
      int int0 = 250;
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      double double0 = (-1.0);
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) linkedList0, int0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-1)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = 1;
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(int0, int0);
      assertNotNull(elitisticListPopulation0);
      assertEquals("[]", elitisticListPopulation0.toString());
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01D);
      assertEquals(0, elitisticListPopulation0.getPopulationSize());
      assertEquals(1, elitisticListPopulation0.getPopulationLimit());
      
      Chromosome chromosome0 = null;
      elitisticListPopulation0.addChromosome(chromosome0);
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01D);
      assertEquals(1, elitisticListPopulation0.getPopulationSize());
      assertEquals(1, elitisticListPopulation0.getPopulationLimit());
      assertEquals("[null]", elitisticListPopulation0.toString());
      
      ElitisticListPopulation elitisticListPopulation1 = (ElitisticListPopulation)elitisticListPopulation0.nextGeneration();
      assertNotSame(elitisticListPopulation1, elitisticListPopulation0);
      assertNotSame(elitisticListPopulation0, elitisticListPopulation1);
      assertNotNull(elitisticListPopulation1);
      assertEquals(1.0, elitisticListPopulation1.getElitismRate(), 0.01D);
      assertEquals("[null]", elitisticListPopulation1.toString());
      assertEquals(1, elitisticListPopulation1.getPopulationSize());
      assertEquals(1, elitisticListPopulation1.getPopulationLimit());
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01D);
      assertEquals(1, elitisticListPopulation0.getPopulationSize());
      assertEquals(1, elitisticListPopulation0.getPopulationLimit());
      assertEquals("[null]", elitisticListPopulation0.toString());
      assertFalse(elitisticListPopulation1.equals((Object)elitisticListPopulation0));
      assertFalse(elitisticListPopulation0.equals((Object)elitisticListPopulation1));
  }

 // //@Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      int int0 = 2292;
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) linkedList0, int0, (double) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (2,292)
         //
      }
  }
}
