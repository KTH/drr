/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 12:47:52 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class FastDateParser_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(102, "D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+H|[^'[-Za-z]++");
      FastDateParser fastDateParser0 = new FastDateParser("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+H|[^'[-Za-z]++", simpleTimeZone0, locale0);
      assertEquals("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+H|[^'[-Za-z]++", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.UK;
      FastDateParser fastDateParser0 = new FastDateParser("hz kf/.MN'1$AQFrY", timeZone0, locale0);
      assertEquals("hz kf/.MN'1$AQFrY", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2755, "^0+r?ty4r");
      Locale locale0 = Locale.US;
      FastDateParser fastDateParser0 = new FastDateParser("z/yGm?`r7o~", simpleTimeZone0, locale0);
      try { 
        fastDateParser0.parseObject("z/yGm?`r7o~");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable date: \"z/yGm?`r7o~\" does not match (GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|ACDT|Acre Time|ACST|ACT|ACWST|ADT|AEDT|AEST|Afghanistan Time|AFT|AKDT|AKST|Alaska Daylight Time|Alaska Standard Time|Alma-Ata Time|ALMT|Amazon Summer Time|Amazon Time|AMST|AMT|Anadyr Time|ANAT|Aqtau Time|Aqtobe Time|AQTT|Arabia Standard Time|Argentine Time|Armenia Time|ART|AST|Atlantic Daylight Time|Atlantic Standard Time|Australian Central Daylight Time \\(South Australia\\)|Australian Central Daylight Time \\(South Australia/New South Wales\\)|Australian Central Standard Time \\(Northern Territory\\)|Australian Central Standard Time \\(South Australia\\)|Australian Central Standard Time \\(South Australia/New South Wales\\)|Australian Central Western Standard Time|Australian Eastern Daylight Time \\(New South Wales\\)|Australian Eastern Daylight Time \\(Tasmania\\)|Australian Eastern Daylight Time \\(Victoria\\)|Australian Eastern Standard Time \\(New South Wales\\)|Australian Eastern Standard Time \\(Queensland\\)|Australian Eastern Standard Time \\(Tasmania\\)|Australian Eastern Standard Time \\(Victoria\\)|Australian Western Standard Time|AWST|Azerbaijan Time|Azores Summer Time|Azores Time|AZOST|AZOT|AZT|Bangladesh Time|BDT|Bhutan Time|BNT|Bolivia Time|BOT|Bougainville Standard Time|Brasilia Summer Time|Brasilia Time|British Summer Time|BRST|BRT|Brunei Time|BST|BTT|Cape Verde Time|CAT|CCT|CDT|Central African Time|Central Daylight Time|Central European Summer Time|Central European Time|Central Indonesia Time|Central Standard Time|CEST|CET|CHADT|Chamorro Standard Time|CHAST|Chatham Daylight Time|Chatham Standard Time|Chile Summer Time|Chile Time|China Standard Time|Choibalsan Time|CHOT|Christmas Island Time|ChST|CHUT|Chuuk Time|CKT|CLST|CLT|Cocos Islands Time|Colombia Time|Cook Is\\. Time|Coordinated Universal Time|COT|CST|Cuba Daylight Time|Cuba Standard Time|CVT|CXT|Davis Time|DAVT|DDUT|Dumont-d'Urville Time|EASST|EAST|East Indonesia Time|Easter Is\\. Summer Time|Easter Is\\. Time|Eastern African Time|Eastern Daylight Time|Eastern European Summer Time|Eastern European Time|Eastern Greenland Summer Time|Eastern Greenland Time|Eastern Standard Time|EAT|ECT|Ecuador Time|EDT|EEST|EET|EGST|EGT|EST|Falkland Is\\. Time|Fernando de Noronha Time|Fiji Summer Time|Fiji Time|FJST|FJT|FKT|FNT|French Guiana Time|French Southern & Antarctic Lands Time|Galapagos Time|GALT|Gambier Time|GAMT|Georgia Time|GET|GFT|Ghana Mean Time|Gilbert Is\\. Time|GILT|GMT|GMT\\+01:00|GMT\\+02:00|GMT\\+03:00|GMT\\+04:00|GMT\\+05:00|GMT\\+06:00|GMT\\+07:00|GMT\\+08:00|GMT\\+09:00|GMT\\+10:00|GMT\\+11:00|GMT\\+12:00|GMT\\+13:00|GMT\\+14:00|GMT-01:00|GMT-02:00|GMT-03:00|GMT-04:00|GMT-05:00|GMT-06:00|GMT-07:00|GMT-08:00|GMT-09:00|GMT-10:00|GMT-11:00|GMT-12:00|Greenwich Mean Time|GST|Gulf Standard Time|Guyana Time|GYT|Hawaii Daylight Time|Hawaii Standard Time|HDT|HKT|Hong Kong Time|Hovd Time|HOVT|HST|ICT|IDT|India Standard Time|Indian Ocean Territory Time|Indochina Time|IOT|Iran Daylight Time|Iran Standard Time|IRDT|Irish Summer Time|IRKT|Irkutsk Time|IRST|Israel Daylight Time|Israel Standard Time|IST|Japan Standard Time|JST|KGT|Kirgizstan Time|Korea Standard Time|Kosrae Time|KOST|Krasnoyarsk Time|KRAT|KST|LHDT|LHST|Line Is\\. Time|LINT|Lord Howe Daylight Time|Lord Howe Standard Time|Macquarie Island Standard Time|Magadan Time|MAGT|Malaysia Time|Maldives Time|Marquesas Time|Marshall Islands Time|MART|Mauritius Time|Mawson Time|MAWT|MDT|MEST|MET|MHT|Middle Europe Summer Time|Middle Europe Time|MIST|MMT|Moscow Standard Time|Mountain Daylight Time|Mountain Standard Time|MSK|MST|MUT|MVT|Myanmar Time|MYT|Nauru Time|NCT|NDT|Nepal Time|New Caledonia Time|New Zealand Daylight Time|New Zealand Standard Time|Newfoundland Daylight Time|Newfoundland Standard Time|NFT|Niue Time|Norfolk Time|Novosibirsk Time|NOVT|NPT|NRT|NST|NUT|NZDT|NZST|Omsk Time|OMST|Oral Time|ORAT|Pacific Daylight Time|Pacific Standard Time|Pakistan Time|Palau Time|Papua New Guinea Time|Paraguay Summer Time|Paraguay Time|PDT|Peru Time|PET|Petropavlovsk-Kamchatski Time|PETT|PGT|Philippines Time|Phoenix Is\\. Time|PHOT|PHT|Pierre & Miquelon Daylight Time|Pierre & Miquelon Standard Time|Pitcairn Standard Time|PKT|PMDT|PMST|Pohnpei Time|PONT|PST|PWT|PYST|PYT|QYZT|Qyzylorda Time|RET|Reunion Time|Rothera Time|ROTT|Sakhalin Time|SAKT|Samara Time|Samoa Standard Time|SAMT|SAST|SBT|SCT|Seychelles Time|SGT|Singapore Time|Solomon Is\\. Time|South Africa Standard Time|South Georgia Standard Time|Srednekolymsk Time|SRET|SRT|SST|Suriname Time|SYOT|Syowa Time|Tahiti Time|TAHT|Tajikistan Time|TFT|Timor-Leste Time|TJT|TKT|TLT|TMT|Tokelau Time|Tonga Summer Time|Tonga Time|TOST|TOT|Turkmenistan Time|Tuvalu Time|TVT|Ulaanbaatar Time|ULAT|Uruguay Time|Ust-Nera Time|UTC|UYT|Uzbekistan Time|UZT|Vanuatu Time|Venezuela Time|VET|Vladivostok Time|VLAT|VOST|Vostok Time|VUT|Wake Time|WAKT|Wallis & Futuna Time|WAST|WAT|WEST|West Indonesia Time|West Samoa Daylight Time|West Samoa Standard Time|Western African Summer Time|Western African Time|Western European Summer Time|Western European Time|Western Greenland Summer Time|Western Greenland Time|WET|WFT|WGST|WGT|WIB|WIT|WITA|WSDT|WSST|Xinjiang Standard Time|XJT|YAKT|Yakutsk Time|Yekaterinburg Time|YEKT)/(\\p{IsNd}++)(AD|AD|BC|BC)(\\p{IsNd}++)\\?`
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2779, "zym?WD7o~");
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = new FastDateParser("zym?WD7o~", simpleTimeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("diZ^z>vmAAqjyD");
      Locale locale0 = Locale.ITALIAN;
      FastDateParser fastDateParser0 = new FastDateParser("diZ^z>vmAAqjyD", timeZone0, locale0);
      ParsePosition parsePosition0 = new ParsePosition(0);
      fastDateParser0.parse("9Wav-", parsePosition0);
      assertEquals(1, parsePosition0.getIndex());
      assertEquals("java.text.ParsePosition[index=1,errorIndex=-1]", parsePosition0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("h~M-=>?Hy", timeZone0, locale0);
      fastDateParser0.hashCode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("diZ^z>vmAAqjyD");
      Locale locale0 = Locale.ITALIAN;
      FastDateParser fastDateParser0 = new FastDateParser("diZ^z>vmAAqjyD", timeZone0, locale0);
      String string0 = fastDateParser0.toString();
      assertEquals("FastDateParser[diZ^z>vmAAqjyD,it,GMT]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("6IC8S");
      Locale locale0 = Locale.CANADA;
      FastDateParser fastDateParser0 = new FastDateParser("6IC8S", timeZone0, locale0);
      ParsePosition parsePosition0 = new ParsePosition(0);
      fastDateParser0.parseObject("6IC8S", parsePosition0);
      assertEquals("java.text.ParsePosition[index=1,errorIndex=-1]", parsePosition0.toString());
      assertEquals(1, parsePosition0.getIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ROOT;
      FastDateParser fastDateParser0 = new FastDateParser("%;`P8", timeZone0, locale0);
      String string0 = fastDateParser0.getPattern();
      assertEquals("%;`P8", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("$&Z-VJppD /eZ~", timeZone0, locale0);
      Locale locale1 = fastDateParser0.getLocale();
      assertEquals("", locale1.getCountry());
  }

////  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("$&Z-VJppD /eZ~", timeZone0, locale0);
      TimeZone timeZone1 = fastDateParser0.getTimeZone();
      assertEquals("GMT", timeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("diZ^z>vmAAqjyD");
      Locale locale0 = Locale.ITALIAN;
      FastDateParser fastDateParser0 = new FastDateParser("diZ^z>vmAAqjyD", timeZone0, locale0);
      Pattern pattern0 = fastDateParser0.getParsePattern();
      assertEquals("(\\p{IsNd}++)", pattern0.pattern());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALY;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(84, "GMTBST");
      FastDateParser fastDateParser0 = new FastDateParser("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", simpleTimeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("GMTAST");
      Locale locale0 = new Locale("GMTAST", "GMTAST");
      FastDateParser fastDateParser0 = new FastDateParser("GMTAST", timeZone0, locale0);
      FastDateParser fastDateParser1 = new FastDateParser("Greenwich Mean Time", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2779, "zym?WD7o~");
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = new FastDateParser("zym?WD7o~", simpleTimeZone0, locale0);
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateParser fastDateParser1 = new FastDateParser("zym?WD7o~", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2755, "^0+r?ty4r");
      Locale locale0 = Locale.US;
      FastDateParser fastDateParser0 = new FastDateParser("zyGm?Wr7o~", simpleTimeZone0, locale0);
      Locale locale1 = Locale.CANADA;
      FastDateParser fastDateParser1 = new FastDateParser("zyGm?Wr7o~", simpleTimeZone0, locale1);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

////  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("^B6sT;'", timeZone0, locale0);
      Object object0 = fastDateParser0.parseObject("^B6sT;'");
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", object0.toString());
  }

////  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("GMT", timeZone0, locale0);
      try { 
        fastDateParser0.parse("GMT");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // (The ja_JP_JP_#u-ca-japanese locale does not support dates before 1868 AD)
         // Unparseable date: \"GMT\" does not match (\u7D00\u5143\u524D|\u7D00\u5143\u524D|\u897F\u66A6|\u897F\u66A6)(\\p{IsNd}++)
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = new FastDateParser("`{ 9{(j(R}@N?", timeZone0, locale0);
      assertEquals("`{ 9{(j(R}@N?", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("AH$P");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("5,S*Z#}o@h9~'0_rl", timeZone0, locale0);
      int int0 = fastDateParser0.adjustYear(0);
      assertEquals(2000, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("F_YeCd");
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = new FastDateParser("F_YeCd", timeZone0, locale0);
      int int0 = fastDateParser0.adjustYear(493);
      assertEquals(2393, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("S(XF%u#uj");
      Locale locale0 = Locale.PRC;
      FastDateParser fastDateParser0 = new FastDateParser("S(XF%u#uj", timeZone0, locale0);
      assertEquals("S(XF%u#uj", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-776), "");
      Locale locale0 = Locale.CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser(")9A.;Cn$,U%y=f.%XZ", simpleTimeZone0, locale0);
      assertEquals(")9A.;Cn$,U%y=f.%XZ", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-66));
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = new Locale(",I(3[[R!6E1~5SI.|", "\" does not match ", ",pPX8YqRU3txsJcGxKe");
      FastDateParser fastDateParser0 = new FastDateParser(",I(3[[R!6E1~5SI.|", timeZone0, locale0);
      assertEquals(",I(3[[R!6E1~5SI.|", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("(p{IsNd}{");
      Locale locale0 = Locale.ENGLISH;
      FastDateParser fastDateParser0 = new FastDateParser("Dh.~wC9_5O<WR", timeZone0, locale0);
      assertEquals("Dh.~wC9_5O<WR", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("AH$P");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("0wVfB-GnD!!u}nL4g5n", timeZone0, locale0);
      assertEquals("0wVfB-GnD!!u}nL4g5n", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = new FastDateParser("1I7S", timeZone0, locale0);
      assertEquals("1I7S", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.forLanguageTag("y2&iA]aL6LcU");
      FastDateParser fastDateParser0 = new FastDateParser("y2&iA]aL6LcU", timeZone0, locale0);
      assertEquals("y2&iA]aL6LcU", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(" k5a3\">6cnf");
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = new FastDateParser(" k5a3\">6cnf", timeZone0, locale0);
      assertEquals(" k5a3\">6cnf", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("4.5\">6cn");
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = new FastDateParser("4.5\">6cn", timeZone0, locale0);
      assertEquals("4.5\">6cn", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser("S84pc|p[W!a", timeZone0, locale0);
      assertEquals("S84pc|p[W!a", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-490), "91IF~2 tC]L");
      Locale locale0 = Locale.GERMAN;
      FastDateParser fastDateParser0 = new FastDateParser("91IF~2 tC]L", simpleTimeZone0, locale0);
      assertEquals("91IF~2 tC]L", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(41);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.TAIWAN;
      FastDateParser fastDateParser0 = new FastDateParser(":*[26FCw%Z>TN", timeZone0, locale0);
      assertEquals(":*[26FCw%Z>TN", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-3313), ";b rreR?=");
      Locale locale0 = new Locale("B}o`#x4&p", " locale does not support dates before 1868 AD)\n");
      FastDateParser fastDateParser0 = new FastDateParser(";b rreR?=", simpleTimeZone0, locale0);
      assertEquals(";b rreR?=", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2779, "yym<?WD7o~");
      Locale locale0 = Locale.KOREA;
      FastDateParser fastDateParser0 = new FastDateParser("yym<?WD7o~", simpleTimeZone0, locale0);
      assertEquals("yym<?WD7o~", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("2}LmuP");
      Locale locale0 = Locale.UK;
      FastDateParser fastDateParser0 = new FastDateParser("=v8,%vmki`7)/SL", timeZone0, locale0);
      assertEquals("=v8,%vmki`7)/SL", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = new FastDateParser(">\"%", timeZone0, locale0);
      assertEquals(">\"%", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("62 wm@%=HUupzEy", timeZone0, locale0);
      assertEquals("62 wm@%=HUupzEy", fastDateParser0.getPattern());
  }
}
