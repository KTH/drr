/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 02:12:46 GMT 2019
 */

package org.apache.commons.math.stat.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math.stat.clustering.Cluster;
import org.apache.commons.math.stat.clustering.EuclideanIntegerPoint;
import org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;


public class KMeansPlusPlusClusterer_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0);
      int[] intArray0 = new int[9];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
      cluster0.addPoint(euclideanIntegerPoint0);
      List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
      cluster0.addPoint(euclideanIntegerPoint0);
      kMeansPlusPlusClusterer0.cluster(list0, 2, 2);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      int[] intArray0 = new int[1];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
      cluster0.addPoint(euclideanIntegerPoint0);
      List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
      cluster0.addPoint(euclideanIntegerPoint0);
      KMeansPlusPlusClusterer.EmptyClusterStrategy kMeansPlusPlusClusterer_EmptyClusterStrategy0 = KMeansPlusPlusClusterer.EmptyClusterStrategy.FARTHEST_POINT;
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0, kMeansPlusPlusClusterer_EmptyClusterStrategy0);
      List<Cluster<EuclideanIntegerPoint>> list1 = kMeansPlusPlusClusterer0.cluster(list0, 2, 2);
      assertEquals(2, list1.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      int[] intArray0 = new int[3];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
      cluster0.addPoint(euclideanIntegerPoint0);
      List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
      cluster0.addPoint(euclideanIntegerPoint0);
      KMeansPlusPlusClusterer.EmptyClusterStrategy kMeansPlusPlusClusterer_EmptyClusterStrategy0 = KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_POINTS_NUMBER;
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0, kMeansPlusPlusClusterer_EmptyClusterStrategy0);
      List<Cluster<EuclideanIntegerPoint>> list1 = kMeansPlusPlusClusterer0.cluster(list0, 2, 2);
      assertEquals(2, list1.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      int[] intArray0 = new int[8];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
      cluster0.addPoint(euclideanIntegerPoint0);
      List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
      cluster0.addPoint(euclideanIntegerPoint0);
      KMeansPlusPlusClusterer.EmptyClusterStrategy kMeansPlusPlusClusterer_EmptyClusterStrategy0 = KMeansPlusPlusClusterer.EmptyClusterStrategy.ERROR;
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0, kMeansPlusPlusClusterer_EmptyClusterStrategy0);
      // Undeclared exception!
      try { 
        kMeansPlusPlusClusterer0.cluster(list0, 2, 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // empty cluster in k-means
         //
         verifyException("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0);
      int[] intArray0 = new int[9];
      intArray0[0] = (-2147483647);
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
      cluster0.addPoint(euclideanIntegerPoint0);
      List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
      cluster0.addPoint(euclideanIntegerPoint0);
      List<Cluster<EuclideanIntegerPoint>> list1 = kMeansPlusPlusClusterer0.cluster(list0, (-2147483647), (-2147483647));
      assertFalse(list1.contains(cluster0));
  }

//  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(451L);
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      int[] intArray0 = new int[6];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      linkedList0.add(euclideanIntegerPoint0);
      // Undeclared exception!
      kMeansPlusPlusClusterer0.cluster(linkedList0, 30, 30);
  }
}
