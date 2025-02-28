/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:10:50 GMT 2014
 */

package org.apache.commons.math3.exception.util;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Locale;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class LocalizedFormatsEvoSuite_branch_Test   {

  //@Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS;
      assertEquals(LocalizedFormats.CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS, localizedFormats0);
      assertEquals("CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS", localizedFormats0.toString());
      assertEquals("statistics constructed from external moments cannot be incremented", localizedFormats0.getSourceString());
      assertEquals("CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS", localizedFormats0.name());
      assertEquals(20, localizedFormats0.ordinal());
      
      Locale locale0 = Locale.CANADA_FRENCH;
      assertEquals("", locale0.getVariant());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.getLanguage());
      assertNotNull(locale0);
      
      String string0 = localizedFormats0.getLocalizedString(locale0);
      assertEquals("les statistiques bas\u00E9es sur des moments externes ne peuvent pas \u00EAtre incr\u00E9ment\u00E9es", string0);
      assertEquals("CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS", localizedFormats0.toString());
      assertEquals("statistics constructed from external moments cannot be incremented", localizedFormats0.getSourceString());
      assertEquals("CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS", localizedFormats0.name());
      assertEquals(20, localizedFormats0.ordinal());
      assertEquals("", locale0.getVariant());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.getLanguage());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS;
      assertEquals(LocalizedFormats.CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS, localizedFormats0);
      assertEquals(20, localizedFormats0.ordinal());
      assertEquals("CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS", localizedFormats0.toString());
      assertEquals("statistics constructed from external moments cannot be incremented", localizedFormats0.getSourceString());
      assertEquals("CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS", localizedFormats0.name());
      
      Locale locale0 = Locale.GERMANY;
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("de", locale0.getLanguage());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de_DE", locale0.toString());
      assertNotNull(locale0);
      
      String string0 = localizedFormats0.getLocalizedString(locale0);
      assertEquals("statistics constructed from external moments cannot be incremented", string0);
      assertEquals(20, localizedFormats0.ordinal());
      assertEquals("CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS", localizedFormats0.toString());
      assertEquals("statistics constructed from external moments cannot be incremented", localizedFormats0.getSourceString());
      assertEquals("CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS", localizedFormats0.name());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("de", locale0.getLanguage());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de_DE", locale0.toString());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS;
      assertEquals(LocalizedFormats.CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS, localizedFormats0);
      assertEquals("statistics constructed from external moments cannot be incremented", localizedFormats0.getSourceString());
      assertEquals("CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS", localizedFormats0.name());
      assertEquals(20, localizedFormats0.ordinal());
      assertEquals("CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS", localizedFormats0.toString());
      
      String string0 = localizedFormats0.getSourceString();
      assertEquals("statistics constructed from external moments cannot be incremented", string0);
      assertEquals("statistics constructed from external moments cannot be incremented", localizedFormats0.getSourceString());
      assertEquals("CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS", localizedFormats0.name());
      assertEquals(20, localizedFormats0.ordinal());
      assertEquals("CANNOT_INCREMENT_STATISTIC_CONSTRUCTED_FROM_EXTERNAL_MOMENTS", localizedFormats0.toString());
      assertNotNull(string0);
  }
}
