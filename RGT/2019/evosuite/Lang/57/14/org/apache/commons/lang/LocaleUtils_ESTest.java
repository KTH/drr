/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 11:11:53 GMT 2019
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class LocaleUtils_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      List<Locale> list0 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedList1);
      List<Locale> list1 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) list0);
      Locale.lookup(linkedList0, list1);
      locale0.getExtensionKeys();
      Locale locale1 = Locale.ROOT;
      LocaleUtils.localeLookupList(locale0, locale1);
      List list2 = LocaleUtils.localeLookupList(locale0);
      LocaleUtils.localeLookupList((Locale) null);
      List list3 = LocaleUtils.countriesByLanguage(",0TW}6+,PZ3~vo");
      assertFalse(list3.equals((Object)list2));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocaleUtils.toLocale((String) null);
      List list0 = LocaleUtils.countriesByLanguage((String) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: 
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: q
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("l'*lmRg7-t2`*D");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: l'*lmRg7-t2`*D
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("c|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: c|
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("cw_W/?D'~1AW}o");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: cw_W/?D'~1AW}o
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("cw_/?D'V~1AW}o");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: cw_/?D'V~1AW}o
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("cw_fW?D'~1AW}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: cw_fW?D'~1AW}
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("cw_KN_?D'~{AW;o");
      assertEquals("KN", locale0.getCountry());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("cw_W_?D'~1AWro");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: cw_W_?D'~1AWro
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("cw_KN");
      assertEquals("KN", locale0.getCountry());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("cw_KNW;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: cw_KNW;
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = new Locale("a!d!%T]", "", "GEvfkd,^Q@");
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocaleUtils.availableLocaleSet();
      Set set0 = LocaleUtils.availableLocaleSet();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = LocaleUtils.isAvailableLocale((Locale) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocaleUtils.languagesByCountry("");
      LocaleUtils.availableLocaleSet();
      Locale locale0 = Locale.JAPANESE;
      locale0.getDisplayCountry();
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils localeUtils0 = new LocaleUtils();
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("Rq6Qt");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: Rq6Qt
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocaleUtils.availableLocaleList();
      LocaleUtils.languagesByCountry((String) null);
      Locale locale0 = Locale.CANADA_FRENCH;
      locale0.getDisplayVariant();
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils.languagesByCountry("");
      LocaleUtils.availableLocaleList();
      LocaleUtils.isAvailableLocale(locale0);
      Locale locale1 = LocaleUtils.toLocale((String) null);
      assertNull(locale1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "";
      LocaleUtils.countriesByLanguage("");
      LocaleUtils.languagesByCountry("");
      LocaleUtils.languagesByCountry("");
      LocaleUtils.languagesByCountry("TH");
      LocaleUtils.countriesByLanguage("TH");
      LocaleUtils.languagesByCountry("UY");
      LocaleUtils.countriesByLanguage("Invalid locale format: ");
      String string1 = "";
      LocaleUtils.countriesByLanguage("");
      LocaleUtils.languagesByCountry("UY");
      String string2 = "Invalid locale format: ";
      LocaleUtils.languagesByCountry("Invalid locale format: ");
      LocaleUtils.countriesByLanguage("Invalid locale format: ");
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("CJKzV(]L");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: CJKzV(]L
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocaleUtils.toLocale((String) null);
      LocaleUtils.toLocale("be");
      String string0 = "ja";
      LocaleUtils.countriesByLanguage("ja");
      LocaleUtils.countriesByLanguage("org.apache.commons.lang.LocaleUtils");
      LocaleUtils.toLocale("ja");
      LocaleUtils.countriesByLanguage((String) null);
      LocaleUtils.toLocale((String) null);
      LocaleUtils.countriesByLanguage("");
      LocaleUtils.countriesByLanguage((String) null);
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("org.apache.commons.lang.LocaleUtils");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: org.apache.commons.lang.LocaleUtils
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }
}
