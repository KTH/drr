/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:37:15 GMT 2014
 */

package org.apache.commons.lang3.text;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang3.text.ExtendedMessageFormat;
import org.apache.commons.lang3.text.FormatFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class ExtendedMessageFormatEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "_tk{2,{}Q}{pT";
      Locale locale0 = null;
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map<String, ? extends FormatFactory>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 11: p
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "I*mRk5DOz{,~xdy";
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 10: ,
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "0k{4 -}:U}.(";
      Locale locale0 = null;
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map<String, ? extends FormatFactory>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 3: 4 -
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "p^_I{ ";
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 5
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "rSAZ?)|I6ykZ+";
      Locale locale0 = Locale.ITALY;
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertNotNull(locale0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0);
      assertEquals("rSAZ?)|I6ykZ+", extendedMessageFormat0.toPattern());
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertNotNull(extendedMessageFormat0);
      
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat1 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
      assertFalse(extendedMessageFormat1.equals((Object)extendedMessageFormat0));
      assertEquals("rSAZ?)|I6ykZ+", extendedMessageFormat1.toPattern());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertNotSame(extendedMessageFormat1, extendedMessageFormat0);
      assertNotNull(extendedMessageFormat1);
      
      boolean boolean0 = extendedMessageFormat0.equals((Object) extendedMessageFormat1);
      assertFalse(extendedMessageFormat0.equals((Object)extendedMessageFormat1));
      assertFalse(extendedMessageFormat1.equals((Object)extendedMessageFormat0));
      assertEquals("rSAZ?)|I6ykZ+", extendedMessageFormat0.toPattern());
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("rSAZ?)|I6ykZ+", extendedMessageFormat1.toPattern());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertNotSame(extendedMessageFormat0, extendedMessageFormat1);
      assertNotSame(extendedMessageFormat1, extendedMessageFormat0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "Invalid format argument index at position ";
      Locale locale0 = null;
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map<String, ? extends FormatFactory>) hashMap0);
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals("Invalid format argument index at position ", extendedMessageFormat0.toPattern());
      assertNotNull(extendedMessageFormat0);
      
      ExtendedMessageFormat extendedMessageFormat1 = (ExtendedMessageFormat)extendedMessageFormat0.clone();
      assertTrue(extendedMessageFormat1.equals((Object)extendedMessageFormat0));
      assertTrue(extendedMessageFormat0.equals((Object)extendedMessageFormat1));
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals("Invalid format argument index at position ", extendedMessageFormat1.toPattern());
      assertEquals("Invalid format argument index at position ", extendedMessageFormat0.toPattern());
      assertNotSame(extendedMessageFormat1, extendedMessageFormat0);
      assertNotSame(extendedMessageFormat0, extendedMessageFormat1);
      assertNotNull(extendedMessageFormat1);
      
      boolean boolean0 = extendedMessageFormat0.equals((Object) extendedMessageFormat1);
      assertTrue(extendedMessageFormat1.equals((Object)extendedMessageFormat0));
      assertTrue(extendedMessageFormat0.equals((Object)extendedMessageFormat1));
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals("Invalid format argument index at position ", extendedMessageFormat1.toPattern());
      assertEquals("Invalid format argument index at position ", extendedMessageFormat0.toPattern());
      assertNotSame(extendedMessageFormat1, extendedMessageFormat0);
      assertNotSame(extendedMessageFormat0, extendedMessageFormat1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "ME";
      Map<String, FormatFactory> map0 = null;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) map0);
      assertEquals("ME", extendedMessageFormat0.toPattern());
      assertNotNull(extendedMessageFormat0);
      
      boolean boolean0 = extendedMessageFormat0.equals((Object) map0);
      assertEquals("ME", extendedMessageFormat0.toPattern());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "_{2 }I}V(";
      Locale locale0 = null;
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map<String, ? extends FormatFactory>) hashMap0);
      assertEquals("_{2}I}V(", extendedMessageFormat0.toPattern());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertNotNull(extendedMessageFormat0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "ME";
      Map<String, FormatFactory> map0 = null;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) map0);
      assertEquals("ME", extendedMessageFormat0.toPattern());
      assertNotNull(extendedMessageFormat0);
      
      int int0 = (-3692);
      // Undeclared exception!
      try {
        extendedMessageFormat0.setFormat(int0, (Format) extendedMessageFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09() {}
//   @Test(timeout = 4000)
//   public void test09()  throws Throwable  {
//       String string0 = "Invalid format argument index at position ";
//       Locale locale0 = null;
//       HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
//       assertEquals(true, hashMap0.isEmpty());
//       assertEquals(0, hashMap0.size());
//       assertEquals("{}", hashMap0.toString());
//       assertNotNull(hashMap0);
//       
//       ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map<String, ? extends FormatFactory>) hashMap0);
//       assertEquals(true, hashMap0.isEmpty());
//       assertEquals(0, hashMap0.size());
//       assertEquals("{}", hashMap0.toString());
//       assertEquals("Invalid format argument index at position ", extendedMessageFormat0.toPattern());
//       assertNotNull(extendedMessageFormat0);
//       
//       int int0 = extendedMessageFormat0.hashCode();
//       assertEquals(true, hashMap0.isEmpty());
//       assertEquals(0, hashMap0.size());
//       assertEquals("{}", hashMap0.toString());
//       assertEquals("Invalid format argument index at position ", extendedMessageFormat0.toPattern());
//       assertEquals((-923118852), int0);
//   }

  @Test(timeout = 4000)
  public void test10() {}
//   @Test(timeout = 4000)
//   public void test10()  throws Throwable  {
//       String string0 = "Yh%QW'";
//       Locale locale0 = Locale.FRANCE;
//       assertEquals("fra", locale0.getISO3Language());
//       assertEquals("fr_FR", locale0.toString());
//       assertEquals("", locale0.getVariant());
//       assertEquals("FRA", locale0.getISO3Country());
//       assertEquals("FR", locale0.getCountry());
//       assertEquals("fr", locale0.getLanguage());
//       assertNotNull(locale0);
//       
//       HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
//       assertEquals(0, hashMap0.size());
//       assertEquals("{}", hashMap0.toString());
//       assertEquals(true, hashMap0.isEmpty());
//       assertNotNull(hashMap0);
//       
//       ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map<String, ? extends FormatFactory>) hashMap0);
//       assertEquals(0, hashMap0.size());
//       assertEquals("{}", hashMap0.toString());
//       assertEquals(true, hashMap0.isEmpty());
//       assertEquals("fra", locale0.getISO3Language());
//       assertEquals("fr_FR", locale0.toString());
//       assertEquals("", locale0.getVariant());
//       assertEquals("FRA", locale0.getISO3Country());
//       assertEquals("FR", locale0.getCountry());
//       assertEquals("fr", locale0.getLanguage());
//       assertEquals("Yh%QW", extendedMessageFormat0.toPattern());
//       assertNotNull(extendedMessageFormat0);
//       
//       int int0 = (-785);
//       DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getPercentInstance();
//       assertEquals(0, decimalFormat0.getMaximumFractionDigits());
//       assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
//       assertEquals("-", decimalFormat0.getNegativePrefix());
//       assertEquals("%", decimalFormat0.getPositiveSuffix());
//       assertEquals(100, decimalFormat0.getMultiplier());
//       assertEquals("#.##0%", decimalFormat0.toLocalizedPattern());
//       assertEquals(0, decimalFormat0.getMinimumFractionDigits());
//       assertEquals("%", decimalFormat0.getNegativeSuffix());
//       assertEquals(false, decimalFormat0.isParseIntegerOnly());
//       assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
//       assertEquals(true, decimalFormat0.isGroupingUsed());
//       assertEquals(3, decimalFormat0.getGroupingSize());
//       assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
//       assertEquals("#,##0%", decimalFormat0.toPattern());
//       assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
//       assertEquals(false, decimalFormat0.isParseBigDecimal());
//       assertEquals("", decimalFormat0.getPositivePrefix());
//       assertNotNull(decimalFormat0);
//       
//       // Undeclared exception!
//       try {
//         extendedMessageFormat0.setFormatByArgumentIndex(int0, (Format) decimalFormat0);
//         fail("Expecting exception: UnsupportedOperationException");
//       
//       } catch(UnsupportedOperationException e) {
//          //
//          // no message in exception (getMessage() returned null)
//          //
//       }
//   }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "The validated object is null";
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0);
      assertEquals("The validated object is null", extendedMessageFormat0.toPattern());
      assertNotNull(extendedMessageFormat0);
      
      Format[] formatArray0 = new Format[1];
      // Undeclared exception!
      try {
        extendedMessageFormat0.setFormatsByArgumentIndex(formatArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "UPGR#}Q\\h";
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0);
      assertEquals("UPGR#}Q\\h", extendedMessageFormat0.toPattern());
      assertNotNull(extendedMessageFormat0);
      
      Format[] formatArray0 = new Format[1];
      // Undeclared exception!
      try {
        extendedMessageFormat0.setFormats(formatArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "UPGR#}Q\\h";
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0);
      assertEquals("UPGR#}Q\\h", extendedMessageFormat0.toPattern());
      assertNotNull(extendedMessageFormat0);
      
      String string1 = extendedMessageFormat0.toPattern();
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertEquals("UPGR#}Q\\h", extendedMessageFormat0.toPattern());
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("UPGR#}Q\\h", string1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "<^gy[yu4{2,\\[&0'";
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 11
         //
      }
  }
}
