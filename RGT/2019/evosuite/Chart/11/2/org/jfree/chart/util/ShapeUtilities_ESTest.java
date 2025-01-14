/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 21 22:02:00 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.SystemColor;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.border.SoftBevelBorder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.ShapeUtilities;
import org.jfree.chart.util.Size2D;
import org.junit.runner.RunWith;


public class ShapeUtilities_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Size2D size2D0 = new Size2D();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM;
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 0.0, 0.0, rectangleAnchor0);
      Point2D.Double point2D_Double0 = (Point2D.Double)ShapeUtilities.getPointInRectangle((-1.0F), 1.7976931348623157E308, rectangle2D0);
      assertEquals(0.0, point2D_Double0.y, 0.01);
      assertEquals(0.0, point2D_Double0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JTree jTree0 = new JTree();
      Rectangle rectangle0 = jTree0.getRowBounds(0);
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, rectangle0, (-239.35764), (-1.0F), 18);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createRegularCross(0.0F, 0.0F);
      assertEquals(1, generalPath0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
      assertNull(shape0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Point2D.Float point2D_Float0 = new Point2D.Float(1.0F, (-1927.6722F));
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Float0, point2D_Float0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 2.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, shape0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) line2D_Double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, (Shape) ellipse2D_Double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, (Shape) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, (Shape) arc2D_Float0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      Object[][] objectArray0 = new Object[3][2];
      Object[] objectArray1 = new Object[3];
      objectArray1[0] = (Object) arc2D_Double0;
      objectArray1[1] = (Object) arc2D_Double0;
      objectArray1[2] = (Object) arc2D_Double0;
      objectArray0[0] = objectArray1;
      JTable jTable0 = new JTable(objectArray0, objectArray0[0]);
      Rectangle rectangle0 = jTable0.getBounds();
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, (Shape) rectangle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) polygon0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) arc2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond((-1.0F));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle((-1264.59F));
      Rectangle rectangle0 = new Rectangle(3, 0, (-1), 0);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) rectangle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1.0F), (-1.0F), 0.0F, 1690.125F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) line2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Point point0 = new Point(1235, 6);
      Line2D.Double line2D_Double0 = new Line2D.Double(point0, point0);
      Line2D.Float line2D_Float0 = new Line2D.Float((-1542.804F), 1235, (-1.0F), 4990.1245F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(Double.NaN, Double.NaN, Double.NaN, Double.NaN);
      line2D_Double0.setLine(3014.41045011601, 348.04496543, 314.539880811479, Double.NaN);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(214.62457F, 0.5, 481.5, 1884.0452);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(214.62457F, 0.5, 481.5, 1884.0452);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      ellipse2D_Float0.setFrameFromDiagonal((-2.147483648E9), Double.NEGATIVE_INFINITY, 1945.5999755859375, Double.NEGATIVE_INFINITY);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) arc2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(1.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0);
      Point2D.Float point2D_Float0 = new Point2D.Float(1.0F, (-1927.6722F));
      arc2D_Float0.setArcByTangent(point2D_Float0, point2D_Float0, point2D_Float0, 1.0F);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Point point0 = new Point(0, 0);
      Line2D.Float line2D_Float0 = new Line2D.Float(point0, point0);
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0);
      Arc2D.Float arc2D_Float1 = new Arc2D.Float(rectangle2D0, (-2076.143F), 0, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      Rectangle2D rectangle2D0 = polygon0.getBounds2D();
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(rectangle2D0, 0, (-3308), 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(1);
      Arc2D.Double arc2D_Double1 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, polygon0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, (Polygon) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int[] intArray0 = new int[9];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 1);
      Polygon polygon1 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int[] intArray0 = new int[6];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Polygon polygon1 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      int[] intArray0 = new int[9];
      polygon0.ypoints = intArray0;
      Polygon polygon1 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0);
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, generalPath0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0, 696);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, (GeneralPath) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Size2D size2D0 = new Size2D((-1.0), (-1.0));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, (-1.0), 696.27, rectangleAnchor0);
      GeneralPath generalPath0 = new GeneralPath(rectangle2D0);
      GeneralPath generalPath1 = new GeneralPath(0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      GeneralPath generalPath0 = new GeneralPath(polygon0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross(3633.9124F, 3633.9124F);
      GeneralPath generalPath1 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Line2D.Float line2D_Float0 = new Line2D.Float();
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
      GeneralPath generalPath1 = new GeneralPath(ellipse2D_Float0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond((-1.0F));
      Shape shape1 = ShapeUtilities.createDownTriangle((-623.2997F));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross(147, 147);
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.clone(generalPath0);
      generalPath1.curveTo((double) 147, 0.0, 0.0, (double) 147, 2.0, 446.94165);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond((-1.0F));
      Path2D.Double path2D_Double0 = (Path2D.Double)ShapeUtilities.createTranslatedShape(shape0, 1.7976931348623157E308, (-3382.857124791647));
      assertEquals(1, path2D_Double0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, 858.3698538, (double) 0.0F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(3633.9124F, 3633.9124F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      Path2D.Double path2D_Double0 = (Path2D.Double)ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) 0.0F, 1135.147608545193);
      assertEquals(1, path2D_Double0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, (-1453.78141), Double.POSITIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) line2D_Double0, (RectangleAnchor) null, (-1041.4587701), (-1041.4587701));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      Path2D.Double path2D_Double0 = (Path2D.Double)ShapeUtilities.rotateShape(arc2D_Double0, 147, 0, 0);
      assertEquals(1, path2D_Double0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, (-1217.678), 0.0F, 0.0F);
      assertNull(shape0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      line2D_Float0.x1 = (-1.0F);
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Float0, 1.0F);
      assertEquals(1, generalPath0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-2792.2272370634), (-2792.2272370634), (-2792.2272370634), (-732.3415701537542));
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(4234.2F, 4234.2F, (-1.0F), 1.0F);
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Size2D size2D0 = new Size2D(0.0F, (-2605.2762));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 0.0, 0, rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(1349.985361162, (-849.79471), 0.0, 0.0);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-1998.168638), (-2.0), 2909.8998908532417, (-1306.6478630973));
      rectangle2D_Double0.x = Double.NEGATIVE_INFINITY;
      Rectangle2D.union(rectangle2D_Double0, rectangle2D_Double0, rectangle2D_Double0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Double0, rectangle2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 3633.9124F, 0.0F, 0.0F);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
      Rectangle2D rectangle2D0 = shape0.getBounds2D();
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Float0, rectangle2D0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      rectangle2D_Float0.setRect(0.0, (-1354.72), (-1354.72), (-405.0));
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Float0, rectangle2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Float0, rectangle2D_Float0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 1189.0F, 0.0F, (-1840.202F));
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Point point0 = new Point(0, 0);
      Line2D.Float line2D_Float0 = new Line2D.Float(point0, point0);
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      SystemColor systemColor0 = SystemColor.textHighlightText;
      SoftBevelBorder softBevelBorder0 = new SoftBevelBorder(2142615571, systemColor0, (Color) null, (Color) null, systemColor0);
      ImageIcon imageIcon0 = new ImageIcon("");
      JLabel jLabel0 = new JLabel("", imageIcon0, 0);
      Rectangle rectangle0 = softBevelBorder0.getInteriorRectangle((Component) jLabel0, 2142615571, 1584, 1, 1695);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(4327L, 0.0, 4327L, 0.0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(4327L, 4327L, 1.0F, (-356.18F));
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle2D_Float0);
      assertFalse(boolean0);
  }
}
