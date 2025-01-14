/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 01 22:38:19 GMT 2019
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.DefaultDrawingSupplier;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;


public class MultiplePiePlot_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      String string0 = multiplePiePlot0.getPlotType();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      assertEquals("Multiple Pie Plot", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      Comparable comparable0 = multiplePiePlot0.getAggregatedItemsKey();
      assertEquals("Other", comparable0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      double double0 = multiplePiePlot0.getLimit();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(taskSeriesCollection0);
      Color color0 = (Color)multiplePiePlot0.getAggregatedItemsPaint();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      assertEquals(192, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(taskSeriesCollection0);
      multiplePiePlot0.setDataset(taskSeriesCollection0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      multiplePiePlot0.setPieChart(jFreeChart0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      // Undeclared exception!
      try { 
        multiplePiePlot0.setPieChart((JFreeChart) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'pieChart' argument.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = new JFreeChart("RectangleAnchor.BOTTOM_LEFT", multiplePiePlot0);
      // Undeclared exception!
      try { 
        multiplePiePlot0.setPieChart(jFreeChart0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'pieChart' argument must be a chart based on a PiePlot.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(taskSeriesCollection0);
      TableOrder tableOrder0 = multiplePiePlot0.getDataExtractOrder();
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(taskSeriesCollection0);
      // Undeclared exception!
      try { 
        multiplePiePlot0.setDataExtractOrder((TableOrder) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'order' argument
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      // Undeclared exception!
      try { 
        multiplePiePlot0.setAggregatedItemsKey((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      LogAxis logAxis0 = new LogAxis("Multiple Pie Plot");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(logAxis0);
      Paint paint0 = combinedDomainXYPlot0.getDomainGridlinePaint();
      multiplePiePlot0.setAggregatedItemsPaint(paint0);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
      assertFalse(boolean0);
      assertFalse(multiplePiePlot1.equals((Object)multiplePiePlot0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      // Undeclared exception!
      try { 
        multiplePiePlot0.setAggregatedItemsPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("YYM3a&*:|HP\"A%~", multiplePiePlot0);
      jFreeChart0.createBufferedImage(10, 10);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][7];
      Number[] numberArray1 = new Number[19];
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      numberArray1[1] = (Number) integer0;
      numberArray0[0] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("YYM3a&*:|HP\"A%~", multiplePiePlot0);
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(10, 1848);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][7];
      Number[] numberArray1 = new Number[19];
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      numberArray1[1] = (Number) integer0;
      numberArray0[0] = numberArray1;
      numberArray0[1] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      multiplePiePlot0.setLimit(10);
      JFreeChart jFreeChart0 = new JFreeChart("YYM3a&*:|HP\"A%~", multiplePiePlot0);
      jFreeChart0.createBufferedImage(10, 10);
      assertEquals(10.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][7];
      Number[] numberArray1 = new Number[7];
      Double double0 = AbstractRenderer.ZERO;
      numberArray1[4] = (Number) double0;
      numberArray0[0] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("YYM3a&*:|HP\"A%~", multiplePiePlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 1848);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-663.0F), (-1095L), 0.0F, (-1.0F));
      PlotState plotState0 = new PlotState();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      multiplePiePlot0.draw(sunGraphics2D0, rectangle2D_Float0, (Point2D) null, plotState0, plotRenderingInfo0);
      assertEquals(2, sunGraphics2D0.strokeState);
      assertEquals(7, plotRenderingInfo0.getSubplotCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][7];
      Number[] numberArray1 = new Number[16];
      Double double0 = AbstractRenderer.ZERO;
      numberArray1[4] = (Number) double0;
      numberArray0[0] = numberArray1;
      numberArray0[1] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("YYM3a&*:|HP\"A%~", multiplePiePlot0);
      jFreeChart0.createBufferedImage(10, 1848);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][7];
      Number[] numberArray1 = new Number[16];
      numberArray1[4] = (Number) 10;
      numberArray0[1] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      JFreeChart jFreeChart0 = new JFreeChart("YYM3a&*:|HP\"A%~", multiplePiePlot0);
      jFreeChart0.createBufferedImage(10, 10);
      LegendItemCollection legendItemCollection0 = multiplePiePlot0.getLegendItems();
      assertEquals(7, legendItemCollection0.getItemCount());
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      multiplePiePlot0.getLegendItems();
      LegendItemCollection legendItemCollection0 = multiplePiePlot0.getLegendItems();
      assertEquals(7, legendItemCollection0.getItemCount());
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.getLegendItems();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      multiplePiePlot0.setLimit(10);
      multiplePiePlot0.getLegendItems();
      assertEquals(10.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(taskSeriesCollection0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      boolean boolean0 = multiplePiePlot0.equals(jFreeChart0);
      assertFalse(boolean0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertTrue(boolean0);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.setLimit(10);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertEquals(10.0, multiplePiePlot0.getLimit(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      MultiplePiePlot multiplePiePlot1 = (MultiplePiePlot)multiplePiePlot0.clone();
      assertTrue(multiplePiePlot1.equals((Object)multiplePiePlot0));
      
      multiplePiePlot1.setAggregatedItemsKey(true);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(multiplePiePlot1.equals((Object)multiplePiePlot0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][7];
      Number[] numberArray1 = new Number[19];
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      numberArray1[1] = (Number) integer0;
      numberArray0[1] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("YYM3a&*:|HP\"A%~", multiplePiePlot0);
      jFreeChart0.createBufferedImage(10, 10);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      MultiplePiePlot multiplePiePlot1 = (MultiplePiePlot)multiplePiePlot0.clone();
      assertTrue(multiplePiePlot1.equals((Object)multiplePiePlot0));
      
      Paint[] paintArray0 = new Paint[5];
      Stroke[] strokeArray0 = new Stroke[9];
      Shape[] shapeArray0 = new Shape[1];
      DefaultDrawingSupplier defaultDrawingSupplier0 = new DefaultDrawingSupplier(paintArray0, paintArray0, strokeArray0, strokeArray0, shapeArray0);
      multiplePiePlot1.setDrawingSupplier(defaultDrawingSupplier0);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(boolean0);
  }
}
