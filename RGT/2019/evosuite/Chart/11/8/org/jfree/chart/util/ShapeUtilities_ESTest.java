/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 21 22:12:17 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.ShapeUtilities;
import org.junit.runner.RunWith;


public class ShapeUtilities_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Point2D.Double point2D_Double0 = (Point2D.Double)ShapeUtilities.getPointInRectangle(0.0F, 0.0, rectangle2D_Float0);
      assertEquals(0.0, point2D_Double0.x, 0.01);
      assertEquals(0.0, point2D_Double0.y, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-2431.864F));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Dimension dimension0 = new Dimension((-2855), 851);
      Rectangle rectangle0 = new Rectangle(dimension0);
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, rectangle0, (-2218.021035186932), (-64), (-1358.0F));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
      assertNull(shape0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      Shape shape0 = ShapeUtilities.clone(ellipse2D_Double0);
      assertNotSame(shape0, ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(2401.3381F);
      Line2D.Float line2D_Float0 = new Line2D.Float(2401.3381F, 1264.1813F, 1368.0F, 2401.3381F);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, shape0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      Point2D point2D0 = arc2D_Double0.getStartPoint();
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D0, point2D0);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) line2D_Float0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, (-3247.94343401), (-1.0), 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, (Shape) rectangle2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, (Shape) ellipse2D_Double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0);
      GeneralPath generalPath0 = new GeneralPath(0, 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Float0, (Shape) generalPath0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0);
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Float0, (Shape) arc2D_Float0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross((-1.0F), 0.0F);
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, (double) (-1.0F), (double) 0.0F);
      int[] intArray0 = new int[5];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, shape1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) polygon0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Shape shape0 = ShapeUtilities.createDiagonalCross(0.0F, (-2880.0F));
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) ellipse2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) line2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      Point2D point2D0 = arc2D_Double0.getStartPoint();
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D0, point2D0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      arc2D_Double0.height = (double) 797;
      Point2D point2D0 = arc2D_Double0.getStartPoint();
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D0, point2D0);
      Line2D.Double line2D_Double0 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double((-4208.33F), 0.0, (-1.0), 2649.054966);
      Line2D.Double line2D_Double1 = (Line2D.Double)line2D_Double0.clone();
      line2D_Double0.x2 = (-1858.568916606);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double1, (Line2D) line2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(299, 0, 0.0F, 2.0F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(299, 0, 0.0F, 2.0F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.0, (-1.0), (-2110.557983464), 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) arc2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(982.9, 982.9, 0, 0.0, 982.9, (-2372.38181), 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      Rectangle rectangle0 = generalPath0.getBounds();
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      rectangle0.add(1, 797);
      Arc2D.Double arc2D_Double1 = new Arc2D.Double(rectangle0, (-1109.7259521484375), 0.0, 1);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(2);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Object[][]) null, (Object[]) null);
      JTable jTable0 = new JTable(defaultTableModel0);
      Rectangle rectangle0 = jTable0.getCellRect(0, 2, true);
      Arc2D.Float arc2D_Float1 = new Arc2D.Float(rectangle0, 1.0F, 0, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(rectangle2D_Float0, 0.0F, (-731.25714F), 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(2);
      Arc2D.Double arc2D_Double1 = new Arc2D.Double(0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[6];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, polygon0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, (Polygon) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int[] intArray0 = new int[8];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 1);
      Polygon polygon1 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      int[] intArray0 = new int[7];
      polygon0.xpoints = intArray0;
      Polygon polygon1 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      int[] intArray0 = new int[6];
      polygon0.ypoints = intArray0;
      Polygon polygon1 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon1, polygon0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(382.02, 382.02, 1620.100336, 3525.1);
      GeneralPath generalPath0 = new GeneralPath(line2D_Double0);
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, generalPath0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, (GeneralPath) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createUpTriangle((-3665.9F));
      GeneralPath generalPath1 = new GeneralPath(0);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double((-1222.7209040175), (-1222.7209040175), (-1222.7209040175), (-1222.7209040175));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-641.95F));
      Point point0 = new Point();
      Dimension dimension0 = new Dimension(0, (-205));
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      GeneralPath generalPath0 = new GeneralPath(rectangle0);
      boolean boolean0 = ShapeUtilities.equal((Shape) generalPath0, shape0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      GeneralPath generalPath0 = new GeneralPath(defaultCaret0);
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.0, 0.0, 0, 0.0);
      GeneralPath generalPath1 = new GeneralPath(ellipse2D_Double0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-2431.864F));
      Shape shape1 = ShapeUtilities.createUpTriangle((-2431.864F));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      Rectangle rectangle0 = generalPath0.getBounds();
      GeneralPath generalPath1 = new GeneralPath(rectangle0);
      GeneralPath generalPath2 = (GeneralPath)generalPath1.clone();
      generalPath1.moveTo(0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath2, generalPath1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, (-93.839049606), 357.71527989956);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-2431.864F));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      Path2D.Double path2D_Double0 = (Path2D.Double)ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) (-3128.498F), 367.94416818928);
      assertEquals(1, path2D_Double0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(615.328F);
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape(shape0, (RectangleAnchor) null, (double) 615.328F, (double) 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      Path2D.Double path2D_Double0 = (Path2D.Double)ShapeUtilities.rotateShape(arc2D_Double0, 1827.0, 3.0F, 0.0F);
      assertEquals(1, path2D_Double0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, (-781.12), 0.0F, 0.0F);
      assertNull(shape0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double((-1222.7209040175), (-1222.7209040175), (-1222.7209040175), (-1222.7209040175));
      line2D_Double0.setLine(722.69477446382, 2090.9, 1235.4499657782646, (-1274.3351449898));
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Double0, 4744.0F);
      assertEquals(1, generalPath0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double((-4208.33F), 0.0, (-1.0), 2649.054966);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Object[][] objectArray0 = new Object[0][4];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, (Object[]) null);
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      ListSelectionModel listSelectionModel0 = defaultTableColumnModel0.getSelectionModel();
      JTable jTable0 = new JTable(defaultTableModel0, defaultTableColumnModel0, listSelectionModel0);
      Rectangle rectangle1 = jTable0.getCellRect(820, 2143898533, true);
      boolean boolean0 = ShapeUtilities.contains(rectangle1, rectangle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1.0F), 0, (-1.0F), 0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Float0, rectangle2D_Float0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Rectangle2D.Double rectangle2D_Double1 = new Rectangle2D.Double(0.0, (-1109.7259521484375), 1, 0.0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Double0, rectangle2D_Double1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      int[] intArray0 = new int[1];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Rectangle2D rectangle2D0 = polygon0.getBounds2D();
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-952.683191096), (-101.37), 0, 0);
      ellipse2D_Double0.setFrameFromCenter(2.0, (double) 0, (double) 0, (double) 0);
      Rectangle rectangle0 = ellipse2D_Double0.getBounds();
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      Rectangle rectangle0 = generalPath0.getBounds();
      rectangle0.add(1, 797);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      rectangle2D_Double0.width = 1376.8810551768;
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Double0, rectangle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-1696.20935), 0.0F, (-1271.24846), 1236.696498);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Rectangle rectangle0 = new Rectangle();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Float0, rectangle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, (-3247.94343401), 0, 0.0F);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Float0, rectangle2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Rectangle rectangle0 = new Rectangle();
      rectangle0.x = 2146822668;
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Float0, rectangle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, (-3247.94343401), 0, 0.0F);
      Rectangle rectangle0 = new Rectangle();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle0);
      assertFalse(boolean0);
  }
}
