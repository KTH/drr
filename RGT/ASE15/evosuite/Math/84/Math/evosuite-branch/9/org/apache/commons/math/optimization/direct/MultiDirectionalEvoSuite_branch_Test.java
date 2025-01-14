/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:39:03 GMT 2014
 */

package org.apache.commons.math.optimization.direct;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class MultiDirectionalEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      assertEquals(0, multiDirectional0.getIterations());
      assertEquals(2147483647, multiDirectional0.getMaxEvaluations());
      assertEquals(2147483647, multiDirectional0.getMaxIterations());
      assertEquals(0, multiDirectional0.getEvaluations());
      assertNotNull(multiDirectional0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = 7.921483332524206;
      MultiDirectional multiDirectional0 = new MultiDirectional(double0, double0);
      assertEquals(0, multiDirectional0.getIterations());
      assertEquals(2147483647, multiDirectional0.getMaxEvaluations());
      assertEquals(0, multiDirectional0.getEvaluations());
      assertEquals(2147483647, multiDirectional0.getMaxIterations());
      assertNotNull(multiDirectional0);
  }
}
