/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 23:25:25 GMT 2019
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.Side;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class SubLine_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, 0.0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      IntervalsSet intervalsSet0 = new IntervalsSet(0.0, 0.0);
      AbstractSubHyperplane<Euclidean2D, Euclidean1D> abstractSubHyperplane0 = subLine0.buildNew(line0, intervalsSet0);
      assertNotSame(subLine0, abstractSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      List<Segment> list0 = subLine0.getSegments();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      Vector2D vector2D1 = subLine0.intersection(subLine0, true);
      assertNotSame(vector2D1, vector2D0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, 0.0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      Vector2D vector2D1 = subLine0.intersection(subLine0, false);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      Vector2D vector2D1 = subLine0.intersection(subLine0, false);
      assertTrue(vector2D1.isNaN());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine1 = new SubLine(segment0);
      Vector2D vector2D1 = subLine1.intersection(subLine0, true);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      SubLine subLine1 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = subLine0.intersection(subLine1, true);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = subLine0.intersection(subLine0, false);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      SubLine subLine1 = new SubLine(vector2D0, vector2D0);
      Vector2D vector2D1 = subLine0.intersection(subLine1, false);
      assertNull(vector2D1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      Side side0 = subLine0.side(line0);
      assertEquals(Side.BOTH, side0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, 0.0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      Side side0 = subLine0.side(line0);
      assertEquals(Side.HYPER, side0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Plane plane0 = new Plane(vector3D0);
      Vector2D vector2D0 = plane0.toSubSpace(vector3D0);
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, vector2D0);
      line0.setOriginOffset((-3055.3));
      Side side0 = subLine0.side(line0);
      assertEquals(Side.MINUS, side0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Plane plane0 = new Plane(vector3D0);
      Vector2D vector2D0 = plane0.toSubSpace(vector3D0);
      Line line0 = new Line(vector2D0, vector2D0);
      Line line1 = new Line(line0);
      SubLine subLine0 = line1.wholeHyperplane();
      line1.setOriginOffset((-3055.3));
      Side side0 = subLine0.side(line0);
      assertEquals(Side.PLUS, side0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D((-2420.59265), 462.3186940195);
      Vector2D vector2D1 = new Vector2D(0.0, vector2D0);
      SubLine subLine0 = new SubLine(vector2D0, vector2D1);
      Line line0 = new Line(vector2D0, vector2D0);
      Side side0 = subLine0.side(line0);
      assertEquals(Side.PLUS, side0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, 0.0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Plane plane0 = new Plane(vector3D0);
      Vector2D vector2D0 = plane0.toSubSpace(vector3D0);
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, vector2D0);
      line0.setOriginOffset((-3055.3));
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D(2682.4989, 0.031);
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Line line0 = new Line(vector2D0, 397.558);
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
      assertNotNull(subHyperplane_SplitSubHyperplane0);
  }
}
