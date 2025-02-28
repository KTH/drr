/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 03:22:51 GMT 2019
 */

package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.util.FastMath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class FastMath_ESTest {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      double double0 = FastMath.toRadians((-8.0E298));
      assertEquals((-1.3962634015954635E297), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      double double0 = FastMath.toDegrees((-7.800414592973399E-9));
      assertEquals((-4.4693083462963363E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      double double0 = FastMath.ulp(740.3173966951848);
      assertEquals(1.1368683772161603E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      double double0 = FastMath.cos(514816443);
      assertEquals((-0.37723775738127036), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      int int0 = FastMath.round(0.0F);
      assertEquals(0, int0);
  }

//  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      double double0 = FastMath.random();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      double double0 = FastMath.nextUp((-1615.182));
      assertEquals((-1615.1819999999998), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      double double0 = FastMath.cosh(1.0);
      assertEquals(1.5430806348152437, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      double double0 = FastMath.cosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      double double0 = FastMath.cosh(3832.84);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      double double0 = FastMath.cosh((-173.0));
      assertEquals(6.790712962373925E74, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      double double0 = FastMath.cosh((-18.43086276236962));
      assertEquals(5.051170157748907E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      double double0 = FastMath.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      double double0 = FastMath.sinh(747.0603352710938);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      double double0 = FastMath.sinh((-3288.185952148));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      double double0 = FastMath.sinh(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      double double0 = FastMath.sinh((-0.2876820724517809));
      assertEquals((-0.29166666666666663), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      double double0 = FastMath.sinh(1.3526894423597173E-6);
      assertEquals(1.3526894423601298E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      double double0 = FastMath.tanh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      double double0 = FastMath.tanh(199.6);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      double double0 = FastMath.tanh((-938.448307976));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      double double0 = FastMath.tanh(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      double double0 = FastMath.tanh((-1.0));
      assertEquals((-0.7615941559557649), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      double double0 = FastMath.tanh(0.3153223395347595);
      assertEquals(0.30527125368084973, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      double double0 = FastMath.asinh(3.552713678800501E-15);
      assertEquals(3.552713678800501E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      double double0 = FastMath.asinh((-175.2638018662147));
      assertEquals((-5.859447597283215), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      double double0 = FastMath.asinh(0.1666666505023083);
      assertEquals(0.16590453432487628, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      double double0 = FastMath.asinh(0.097);
      assertEquals(0.09684852829972478, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      double double0 = FastMath.asinh(0.030584810199603525);
      assertEquals(0.03058004387771577, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      double double0 = FastMath.atanh(2.639144044101463E-7);
      assertEquals(2.6391440441015244E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      double double0 = FastMath.atanh(0.10526403784751892);
      assertEquals(0.1056554366458838, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      double double0 = FastMath.atanh((-0.05417713522911072));
      assertEquals((-0.05423023499691139), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      double double0 = FastMath.atanh(0.01745329052209854);
      assertEquals(0.017455063037776063, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      double double0 = FastMath.signum(0.25);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      double double0 = FastMath.signum((-962.39038499));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      double double0 = FastMath.signum(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      double double0 = FastMath.signum(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      double double0 = FastMath.expm1((-771.1583246899999));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      double double0 = FastMath.pow(1.4456468917292502E-16, 20.0);
      assertEquals(1.5894413E-317, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      double double0 = FastMath.pow(0.4983980160344162, 1018.2228370315804);
      assertEquals(1.1622168136200694E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      double double0 = FastMath.expm1(5.64876908699981E18);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      double double0 = FastMath.expm1(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      double double0 = FastMath.expm1(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      double double0 = FastMath.expm1((-0.2876820724517809));
      assertEquals((-0.24999999999999997), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      double double0 = FastMath.acosh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      double double0 = FastMath.log(-0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      double double0 = FastMath.log1p((-81L));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      double double0 = FastMath.atanh(1.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      double double0 = FastMath.log10(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      double double0 = FastMath.pow(4.9E-324, 1844.8);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      double double0 = FastMath.log10(0L);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      double double0 = FastMath.log1p((-0.25));
      assertEquals((-0.2876820724517809), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      double double0 = FastMath.log(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      double double0 = FastMath.pow(1.625, 1687.036822);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      double double0 = FastMath.pow(1.0, 1040.99940163371);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      double double0 = FastMath.log1p((-1.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      double double0 = FastMath.log1p(3832.84);
      assertEquals(8.251622190862074, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      double double0 = FastMath.log1p(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      double double0 = FastMath.log1p(0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      double double0 = FastMath.pow(1.5647853839513477, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      double double0 = FastMath.pow(Double.NaN, 5062.174F);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      double double0 = FastMath.pow(0L, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 378);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-305.0));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-0.620153370482057));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, (-4020.0));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      double double0 = FastMath.pow(-0.0, 1.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, 4326.965873);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      double double0 = FastMath.pow(Double.POSITIVE_INFINITY, (-2576.6698211));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      double double0 = FastMath.pow(0.8414709848078965, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      double double0 = FastMath.pow(520, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 2.6365310530323782E-6);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-9223372036854775808L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1080.09716871));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, (-1.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 1.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      double double0 = FastMath.pow(Double.NEGATIVE_INFINITY, 2144505216);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      double double0 = FastMath.pow((-1.0), Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      double double0 = FastMath.pow((-0.33333333333333287), Double.NEGATIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      double double0 = FastMath.pow((-1144.64340884848), Double.NEGATIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      double double0 = FastMath.pow((-4313.23), (-1274));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      double double0 = FastMath.pow((-278.266986), 4.3947775126138192E16);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      double double0 = FastMath.pow((-0.2710218548637878), (-8.0E298));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      double double0 = FastMath.pow((-1.5707963267948966), 0.10526403784751892);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      double double0 = FastMath.pow((-803.0), (-1.0));
      assertEquals((-0.0012453300124533001), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      double double0 = FastMath.pow(3606.3881, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      double double0 = FastMath.tan(1.0);
      assertEquals(1.5574077246549023, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      double double0 = FastMath.sin(1.8278074942355168E173);
      assertEquals((-0.6682617985774093), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      double double0 = FastMath.tan(4.3088693800637676E99);
      assertEquals((-0.4127314650102072), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      double double0 = FastMath.sin(2.0084369412742696E16);
      assertEquals(0.7134606083196743, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      double double0 = FastMath.cos(1.849204358843427E11);
      assertEquals((-0.30276861758365986), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      double double0 = FastMath.tan((-2.6670937881134914E32));
      assertEquals((-13.424174572721206), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      double double0 = FastMath.cos(2.85040095144011776E17);
      assertEquals((-0.00918780066381382), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      double double0 = FastMath.cos(2144505168);
      assertEquals(0.9859772882932637, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      double double0 = FastMath.sin(6.790712962373925E74);
      assertEquals(0.2691771092867923, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      double double0 = FastMath.sin(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      double double0 = FastMath.sin(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      double double0 = FastMath.sin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      double double0 = FastMath.sin(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      double double0 = FastMath.sin(3.141592653589793);
      assertEquals(1.2246467991473532E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      double double0 = FastMath.sin((-1.0));
      assertEquals((-0.8414709848078965), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      double double0 = FastMath.cos((-4.503599627370496E15));
      assertEquals((-0.4855348677422206), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      double double0 = FastMath.cos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      double double0 = FastMath.cos(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      double double0 = FastMath.cos(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      double double0 = FastMath.cos((-5159.3));
      assertEquals(0.6932101224551839, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      double double0 = FastMath.cos(3.141592653589793);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      double double0 = FastMath.tan(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      double double0 = FastMath.tan(-0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      double double0 = FastMath.tan(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      double double0 = FastMath.tan(Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      double double0 = FastMath.tan(3.141592653589793);
      assertEquals((-1.2246467991473532E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      double double0 = FastMath.atan2((-3277234.763543444), 2.479773539153719E-5);
      assertEquals((-1.57079632678733), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      double double0 = FastMath.atan2((-8.0E298), (-9223372036854775808L));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      double double0 = FastMath.atan(Double.POSITIVE_INFINITY);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      double double0 = FastMath.atan2(1.3586334290604372, (-488.269818323675));
      assertEquals(3.1388101143632126, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      double double0 = FastMath.atan2((-0.869172182655692), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NaN, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, 1304.62);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      double double0 = FastMath.atan2(0L, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      double double0 = FastMath.atan2(-0.0, -0.0);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      double double0 = FastMath.atan2(0.0, (-2685));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, 4325.18548);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(0.7853981633974483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      double double0 = FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(2.356194490192345, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, (-3013.638583868));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals((-0.7853981633974483), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      double double0 = FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals((-2.356194490192345), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      double double0 = FastMath.atan2((-1253), Double.POSITIVE_INFINITY);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      double double0 = FastMath.atan2(5693.197347819171, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      double double0 = FastMath.atan2((-3679.0), Double.NEGATIVE_INFINITY);
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      double double0 = FastMath.atan2(3128.3727295, Double.NEGATIVE_INFINITY);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      double double0 = FastMath.atan2((-2599.16), 0.0);
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      double double0 = FastMath.atan2(5693.197347819171, 0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      double double0 = FastMath.atan2(0.5039018405998233, (-5.505998394031243E301));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      double double0 = FastMath.asin(290041.1955131459);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      double double0 = FastMath.asin(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      double double0 = FastMath.asin((-798.9));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      double double0 = FastMath.asin((-1.0));
      assertEquals((-1.5707963267948966), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      double double0 = FastMath.asin(1.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      double double0 = FastMath.asin(3.4620039155736807E-7);
      assertEquals(3.46200391557375E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      double double0 = FastMath.acos(5062.174F);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      double double0 = FastMath.acos(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      double double0 = FastMath.acos(5.261908426442558E-7);
      assertEquals(1.5707958006040539, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      double double0 = FastMath.acos((-1367.3457245158));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      double double0 = FastMath.acos((-1.0));
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      double double0 = FastMath.acos(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      double double0 = FastMath.acos(0.0);
      assertEquals(1.5707963267948966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      double double0 = FastMath.acos((-0.6682617985774093));
      assertEquals(2.302666130863264, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      double double0 = FastMath.cbrt(0.097);
      assertEquals(0.459470089220704, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      double double0 = FastMath.cbrt(4.9E-324);
      assertEquals(1.7031839360032603E-108, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      double double0 = FastMath.cbrt(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      double double0 = FastMath.cbrt(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      int int0 = FastMath.abs(593);
      assertEquals(593, int0);
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      int int0 = FastMath.abs((-219));
      assertEquals(219, int0);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      long long0 = FastMath.abs(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      long long0 = FastMath.abs((long) (-1));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      float float0 = FastMath.abs(5062.174F);
      assertEquals(5062.174F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      float float0 = FastMath.abs((-310.561F));
      assertEquals(310.561F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      double double0 = FastMath.abs((-95.88629));
      assertEquals(95.88629, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.NaN, (-1.6307776399840703));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      double double0 = FastMath.nextAfter(Double.POSITIVE_INFINITY, (-326.86905221546));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, 0.0);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.0, (-2794.47111063926));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.1818181574344635, 0.18384851468869348);
      assertEquals(0.18181815743446353, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      double double0 = FastMath.nextAfter(0.9999999999999999, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      double double0 = FastMath.nextAfter(1.0, (-188.056));
      assertEquals(0.9999999999999999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      double double0 = FastMath.ceil(9.074419897037198E60);
      assertEquals(9.074419897037198E60, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      long long0 = FastMath.round(Double.NEGATIVE_INFINITY);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      double double0 = FastMath.rint((-173.42211017));
      assertEquals((-173.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      double double0 = FastMath.rint((-219));
      assertEquals((-219.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      double double0 = FastMath.floor(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test177()  throws Throwable  {
      double double0 = FastMath.ceil(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test178()  throws Throwable  {
      double double0 = FastMath.ceil(1469.31156);
      assertEquals(1470.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test179()  throws Throwable  {
      double double0 = FastMath.ceil((-0.7109738706064436));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test180()  throws Throwable  {
      double double0 = FastMath.rint(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test181()  throws Throwable  {
      double double0 = FastMath.rint(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test182()  throws Throwable  {
      int int0 = FastMath.min(2144505168, (-57));
      assertEquals((-57), int0);
  }

  @Test(timeout = 4000)
  public void test183()  throws Throwable  {
      int int0 = FastMath.min(2144505168, 2144505168);
      assertEquals(2144505168, int0);
  }

  @Test(timeout = 4000)
  public void test184()  throws Throwable  {
      long long0 = FastMath.min(198L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test185()  throws Throwable  {
      long long0 = FastMath.min((long) 593, (long) 593);
      assertEquals(593L, long0);
  }

  @Test(timeout = 4000)
  public void test186()  throws Throwable  {
      float float0 = FastMath.min(1827.35F, (float) (-1));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test187()  throws Throwable  {
      float float0 = FastMath.min((float) 1, 175.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test188()  throws Throwable  {
      float float0 = FastMath.min(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test189()  throws Throwable  {
      double double0 = FastMath.min(Double.POSITIVE_INFINITY, 2.639144044101463E-7);
      assertEquals(2.639144044101463E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test190()  throws Throwable  {
      double double0 = FastMath.min(1.3526894423597173E-6, 0.8213795731573869);
      assertEquals(1.3526894423597173E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test191()  throws Throwable  {
      double double0 = FastMath.min((double) (-219.0F), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test192()  throws Throwable  {
      int int0 = FastMath.max(2144505168, (-57));
      assertEquals(2144505168, int0);
  }

  @Test(timeout = 4000)
  public void test193()  throws Throwable  {
      int int0 = FastMath.max(562, 2147483643);
      assertEquals(2147483643, int0);
  }

  @Test(timeout = 4000)
  public void test194()  throws Throwable  {
      long long0 = FastMath.max((long) 1805, (-1615L));
      assertEquals(1805L, long0);
  }

  @Test(timeout = 4000)
  public void test195()  throws Throwable  {
      long long0 = FastMath.max(1L, 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test196()  throws Throwable  {
      float float0 = FastMath.max((float) 593L, (-1.0F));
      assertEquals(593.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test197()  throws Throwable  {
      float float0 = FastMath.max(1.0F, 1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test198()  throws Throwable  {
      float float0 = FastMath.max(Float.NaN, Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test199()  throws Throwable  {
      double double0 = FastMath.max(2.384185791015625E-7, (-1.0));
      assertEquals(2.384185791015625E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test200()  throws Throwable  {
      double double0 = FastMath.max(5.261908426442558E-7, 5.261908426442558E-7);
      assertEquals(5.261908426442558E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test201()  throws Throwable  {
      double double0 = FastMath.max(Double.NaN, 2.563009154379015E-7);
      assertEquals(Double.NaN, double0, 0.01);
  }
}
