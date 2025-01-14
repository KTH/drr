/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:12:13 GMT 2014
 */

package org.apache.commons.lang.text;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.RoundingMode;
import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang.text.ExtendedMessageFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class ExtendedMessageFormatEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "{6 )ywq_Q6v";
      Locale locale0 = Locale.CANADA;
      assertEquals("", locale0.getVariant());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("en_CA", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CA", locale0.getCountry());
      assertNotNull(locale0);
      
      HashMap<Object, DateFormat> hashMap0 = new HashMap<Object, DateFormat>();
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 1: 6 )
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = ",,v{ ";
      Locale locale0 = Locale.PRC;
      assertEquals("", locale0.getVariant());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertNotNull(locale0);
      
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 4
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = "8wYA Q{}*^u&[";
      HashMap<Integer, MessageFormat> hashMap0 = new HashMap<Integer, MessageFormat>();
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 7: }
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = "'\"";
      Locale locale0 = Locale.US;
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("US", locale0.getCountry());
      assertEquals("en_US", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertNotNull(locale0);
      
      HashMap<String, MessageFormat> hashMap0 = new HashMap<String, MessageFormat>();
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map) hashMap0);
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("US", locale0.getCountry());
      assertEquals("en_US", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("\"", extendedMessageFormat0.toPattern());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(extendedMessageFormat0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = "";
      HashMap<String, SimpleDateFormat> hashMap0 = new HashMap<String, SimpleDateFormat>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
      assertEquals("", extendedMessageFormat0.toPattern());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(extendedMessageFormat0);
      
      Format[] formatArray0 = new Format[6];
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
  public void test5()  throws Throwable  {
      String string0 = "Aa$v";
      Locale locale0 = Locale.KOREA;
      assertEquals("ko", locale0.getLanguage());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("KR", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      Map<MessageFormat, Integer> map0 = null;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map) map0);
      assertEquals("Aa$v", extendedMessageFormat0.toPattern());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("KR", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertNotNull(extendedMessageFormat0);
      
      int int0 = 665;
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getInstance(locale0);
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("KR", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertNotNull(decimalFormat0);
      
      // Undeclared exception!
      try {
        extendedMessageFormat0.setFormat(int0, (Format) decimalFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = "or.apache.commons.lang.text.StrMtcher";
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0);
      assertEquals("or.apache.commons.lang.text.StrMtcher", extendedMessageFormat0.toPattern());
      assertNotNull(extendedMessageFormat0);
      
      String string1 = extendedMessageFormat0.toPattern();
      assertEquals("or.apache.commons.lang.text.StrMtcher", extendedMessageFormat0.toPattern());
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertEquals("or.apache.commons.lang.text.StrMtcher", string1);
  }

  @Test(timeout = 4000)
  public void test7() {}
//   @Test(timeout = 4000)
//   public void test7()  throws Throwable  {
//       String string0 = "or.apache.commons.lang.text.StrMtcher";
//       ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0);
//       assertEquals("or.apache.commons.lang.text.StrMtcher", extendedMessageFormat0.toPattern());
//       assertNotNull(extendedMessageFormat0);
//       
//       int int0 = (-3265);
//       SimpleDateFormat simpleDateFormat0 = (SimpleDateFormat)DateFormat.getTimeInstance();
//       assertEquals("H:mm:ss", simpleDateFormat0.toPattern());
//       assertEquals("H:mm:ss", simpleDateFormat0.toLocalizedPattern());
//       assertEquals(true, simpleDateFormat0.isLenient());
//       assertNotNull(simpleDateFormat0);
//       
//       // Undeclared exception!
//       try {
//         extendedMessageFormat0.setFormatByArgumentIndex(int0, (Format) simpleDateFormat0);
//         fail("Expecting exception: UnsupportedOperationException");
//       
//       } catch(UnsupportedOperationException e) {
//          //
//          // no message in exception (getMessage() returned null)
//          //
//       }
//   }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String string0 = "";
      HashMap<NumberFormat, Object> hashMap0 = new HashMap<NumberFormat, Object>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("", extendedMessageFormat0.toPattern());
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
  public void test9()  throws Throwable  {
      String string0 = "RA@o{1,'j|y";
      Locale locale0 = Locale.FRANCE;
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      HashMap<ChoiceFormat, MessageFormat> hashMap0 = new HashMap<ChoiceFormat, MessageFormat>();
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 7
         //
      }
  }
}
