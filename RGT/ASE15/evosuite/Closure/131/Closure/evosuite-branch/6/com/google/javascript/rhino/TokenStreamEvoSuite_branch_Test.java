/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:41:30 GMT 2014
 */

package com.google.javascript.rhino;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.rhino.TokenStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class TokenStreamEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      String string0 = "t[";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = "catch";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = ";N9>xO -t5>-1)W";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = " ,27Q+l&9wY";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = "Z9s*e";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = TokenStream.isJSIdentifier(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = "inskanceof";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = "implemunts";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = "transient";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = "Q<Xgk(aQW";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = "interface";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = "volatiRe";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = "function";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = "debugger";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String string0 = "continue";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = "aH\"%\\'8:";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = "ClzB;jz";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = "extends";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = "private";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = "finally";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = "9e*-6*P";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      String string0 = "package";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      String string0 = "Telet+";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      String string0 = "return";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      String string0 = " +y1A(";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      String string0 = "typeof";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      String string0 = "export";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      String string0 = "switch";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      String string0 = "Lv 15q";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      String string0 = "public";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      String string0 = "static";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      String string0 = "ms&S,@";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      String string0 = "privte";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      String string0 = " q4&wu";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      String string0 = "lpf8K|";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      String string0 = "voltil";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      String string0 = "fnalbl";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      String string0 = "import";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      String string0 = "bl6ow:";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      String string0 = "Pk8,4|";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      String string0 = "Gj,z%6";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      String string0 = "finaly";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      String string0 = "wh+~fh";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      String string0 = "Bg)uQ/";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      String string0 = "yf\"qbw";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      String string0 = "hd5g&w";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      String string0 = "Hc)&lb";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      String string0 = ",bkiV&";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      String string0 = "native";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      String string0 = "s(ort";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      String string0 = "float";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      String string0 = "Mqn7 ";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      String string0 = "const";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      String string0 = "$D5eK";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      String string0 = "catch";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      String string0 = "Z9s*e";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      String string0 = "throw";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      String string0 = "|xqnK";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      String string0 = "super";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      String string0 = "lGong";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      String string0 = "final";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      String string0 = "PCmf1";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      String string0 = "false";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      String string0 = "J2k~!";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      String string0 = "F9j>+";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      String string0 = "\"\\iuc";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      String string0 = "j;hbY";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      String string0 = "[!g";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      String string0 = "[ef'r";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      String string0 = "'rexk";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = "*?dNe";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      String string0 = "usb/H";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = "class";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      String string0 = "tpef";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      String string0 = "cxbr";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = "@\"ms";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = "with";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = "void";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = "t%hs";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      String string0 = "solD";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = "r8_";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      String string0 = "q\\jA";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      String string0 = "peof";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      String string0 = "oQib";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = "null";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = "moW_";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      String string0 = "long";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      String string0 = "k|wm";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = "jm1&";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = "ivWp";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = "hile";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      String string0 = "g)Ps";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      String string0 = "fG50";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      String string0 = "eOph";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      String string0 = "dlu.";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = "c,ai";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = "byte";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = "Chd";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      String string0 = "v%D";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String string0 = "nxw";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      String string0 = "iw,";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      String string0 = "t1K";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      String string0 = "`o";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      String string0 = "jn";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      String string0 = "if";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      String string0 = "%f";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      String string0 = ";N9>xO -t5>-1)W";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      String string0 = " ,27Q+l&9wY";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      String string0 = "`NJQ>bgg!=R";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      String string0 = "GN8$*vnE,m";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      String string0 = "p/}NDym()";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      String string0 = "gvrY@?{-";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      String string0 = "Do{@X|";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      String string0 = "delete";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      String string0 = "uB>&";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      String string0 = "f~s";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      String string0 = "#7c1k";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      String string0 = "(1";
      boolean boolean0 = TokenStream.isKeyword(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      TokenStream tokenStream0 = new TokenStream();
      assertNotNull(tokenStream0);
  }
}
