/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 15:59:28 GMT 2019
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.BoundedRangeModel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;


public class StatisticalBarRenderer_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Color color0 = (Color)statisticalBarRenderer0.getErrorIndicatorPaint();
      assertEquals((-8355712), color0.getRGB());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      BasicStroke basicStroke0 = (BasicStroke)statisticalBarRenderer0.getErrorIndicatorStroke();
      assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setErrorIndicatorStroke((Stroke) null);
      assertTrue(statisticalBarRenderer0.getAutoPopulateSeriesShape());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultStatisticalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart(multiplePiePlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 70);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      AreaRenderer areaRenderer0 = new AreaRenderer();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.1, 1.0F, 2616.9937, 5.0E11);
      LogAxis logAxis0 = new LogAxis("org.jfree.chart.renderer.category.StatisticalBarRenderer");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(logAxis0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      CategoryItemRendererState categoryItemRendererState0 = areaRenderer0.initialise(graphics2D0, rectangle2D_Double0, combinedRangeCategoryPlot0, 201, plotRenderingInfo0);
      CategoryAxis categoryAxis0 = new CategoryAxis("Requires StatisticalCategoryDataset.");
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem(graphics2D0, categoryItemRendererState0, rectangle2D_Double0, combinedRangeCategoryPlot0, categoryAxis0, logAxis0, defaultStatisticalCategoryDataset0, 0, 70, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = categoryStepRenderer0.createState(plotRenderingInfo0);
      JTable jTable0 = new JTable(5, 1222);
      Rectangle rectangle0 = jTable0.getBounds();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, rectangle0, (CategoryPlot) null, subCategoryAxis0, (ValueAxis) null, defaultKeyedValues2DDataset0, 4056, (-1395), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires StatisticalCategoryDataset.
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      PiePlot piePlot0 = new PiePlot();
      JFreeChart jFreeChart0 = new JFreeChart("X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ", statisticalBarRenderer0.DEFAULT_VALUE_LABEL_FONT, piePlot0, false);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, (double) 10, (double) 420, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      CategoryItemRendererState categoryItemRendererState0 = boxAndWhiskerRenderer0.initialise(graphics2D0, rectangle2D_Double0, combinedRangeCategoryPlot0, 0, plotRenderingInfo0);
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("ZOOM_IN_BOTH");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem(graphics2D0, categoryItemRendererState0, rectangle2D_Double0, combinedRangeCategoryPlot0, extendedCategoryAxis0, numberAxis3D0, defaultStatisticalCategoryDataset0, 300, 420);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 300, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      JProgressBar jProgressBar0 = new JProgressBar((BoundedRangeModel) null);
      boolean boolean0 = statisticalBarRenderer0.equals(jProgressBar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Object object0 = statisticalBarRenderer0.clone();
      boolean boolean0 = statisticalBarRenderer0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemLabelGenerator();
      statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator0);
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer1 = (StatisticalBarRenderer)statisticalBarRenderer0.clone();
      assertTrue(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      
      statisticalBarRenderer1.setErrorIndicatorPaint(statisticalBarRenderer0.DEFAULT_PAINT);
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertFalse(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      assertFalse(boolean0);
  }
}
