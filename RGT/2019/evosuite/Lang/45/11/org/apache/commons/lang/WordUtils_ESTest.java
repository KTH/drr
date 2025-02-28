/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 08:20:21 GMT 2019
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang.WordUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class WordUtils_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = WordUtils.initials("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = WordUtils.wrap("gKV,gAC\"-?*BX;4>C_r", 4);
      assertNotNull(string0);
      assertEquals("gKV,gAC\"-?*BX;4>C_r", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, (-1140));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = WordUtils.wrap(" FXK<a;eSG", 0, "", false);
      assertEquals("FXK<a;eSG", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = WordUtils.wrap(",=o 'Tvnx'Uj", 0, ",=o 'Tvnx'Uj", true);
      assertEquals(",,=o 'Tvnx'Uj=,=o 'Tvnx'Ujo,=o 'Tvnx'Uj',=o 'Tvnx'UjT,=o 'Tvnx'Ujv,=o 'Tvnx'Ujn,=o 'Tvnx'Ujx,=o 'Tvnx'Uj',=o 'Tvnx'UjU,=o 'Tvnx'Ujj", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = WordUtils.wrap("#I/MZwU Y!Q", 0);
      assertNotNull(string0);
      assertEquals("#I/MZwU\nY!Q", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[2];
      String string0 = WordUtils.capitalize("", charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[3];
      String string0 = WordUtils.capitalize((String) null, charArray0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize("V9=x6j+|3|jy}(j}", charArray0);
      assertEquals("V9=x6j+|3|jy}(j}", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = WordUtils.capitalize(" FXK<a;eSG");
      assertEquals(" FXK<a;eSG", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully(",=o 'Tvnx'Uj", charArray0);
      assertEquals(",=o 'Tvnx'Uj", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("I7LZ)KAtT_Y");
      assertEquals("I7lz)katt_y", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[3];
      String string0 = WordUtils.uncapitalize((String) null, charArray0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize("java.runtime.name", charArray0);
      assertEquals("java.runtime.name", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = WordUtils.uncapitalize(",,=o 'Tvnx'Uj=,=o 'Tvnx'Ujo,=o 'Tvnx'Uj',=o 'Tvnx'UjT,=o 'Tvnx'Ujv,=o 'Tvnx'Ujn,=o 'Tvnx'Ujx,=o 'Tvnx'Uj',=o 'Tvnx'UjU,=o 'Tvnx'Ujj");
      assertEquals(",,=o 'Tvnx'Uj=,=o 'Tvnx'Ujo,=o 'Tvnx'Uj',=o 'Tvnx'UjT,=o 'Tvnx'Ujv,=o 'Tvnx'Ujn,=o 'Tvnx'Ujx,=o 'Tvnx'Uj',=o 'Tvnx'UjU,=o 'Tvnx'Ujj", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = WordUtils.swapCase((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = WordUtils.swapCase("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = WordUtils.swapCase("B`bCE`eRd\"");
      assertEquals("b`Bce`ErD\"", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = WordUtils.swapCase("g");
      assertEquals("G", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = WordUtils.initials((String) null, (char[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = WordUtils.initials("gKV,gAC\"-?*BX;4>C_r");
      assertEquals("g", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.initials("7Wmq xR", charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[2];
      String string0 = WordUtils.initials("dZGjT*\"GuC[~E)Y/!j", charArray0);
      assertEquals("d", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = WordUtils.initials("K\nGiJ4-]", (char[]) null);
      assertEquals("KG", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '4';
      String string0 = WordUtils.capitalizeFully("tE&E@>A;Ev/4!i", charArray0);
      assertEquals("Te&e@>a;ev/4!i", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = WordUtils.abbreviate("g", 4, 4, "g");
      assertNotNull(string0);
      assertEquals("g", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = WordUtils.abbreviate((String) null, (-100), (-1636), (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 0, 0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = WordUtils.abbreviate("1FB6tzS&pl5~#", 0, 0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = WordUtils.abbreviate("jj2>[Gci?V2j2>[Gci?V>j2>[Gci?V[j2>[Gci?VGj2>[Gci?Vcj2>[Gci?Vij2>[Gci?V?j2>[Gci?VV", (-1), (-1), "6A?aitKARTj}I#c#V");
      assertEquals("jj2>[Gci?V2j2>[Gci?V>j2>[Gci?V[j2>[Gci?VGj2>[Gci?Vcj2>[Gci?Vij2>[Gci?V?j2>[Gci?VV", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = WordUtils.abbreviate("PFeD`\"?Wo", 57, 0, "A_3I&(g)ic");
      assertEquals("PFeD`\"?Wo", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = WordUtils.abbreviate("**xjO$ ye9N'WAq", 0, 0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = WordUtils.abbreviate(" ", 0, 0, " ");
      assertEquals(" ", string0);
  }
}
