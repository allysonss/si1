package si1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestaExtensoNum {

	private ExtensoNum eNum;
	private String numero;

	@Before
	public void setUp() {
		eNum = new ExtensoNum();
	}

	@Test
	public void testCasosBases() throws Exception {
		numero = "0";
		assertEquals("zero", eNum.showExtenso(numero));
		numero = "1";
		assertEquals("um", eNum.showExtenso(numero));
		numero = "2";
		assertEquals("dois", eNum.showExtenso(numero));
		numero = "3";
		assertEquals("tres", eNum.showExtenso(numero));
		numero = "4";
		assertEquals("quatro", eNum.showExtenso(numero));
		numero = "5";
		assertEquals("cinco", eNum.showExtenso(numero));
		numero = "6";
		assertEquals("seis", eNum.showExtenso(numero));
		numero = "7";
		assertEquals("sete", eNum.showExtenso(numero));
		numero = "8";
		assertEquals("oito", eNum.showExtenso(numero));
		numero = "9";
		assertEquals("nove", eNum.showExtenso(numero));
		numero = "10";
		assertEquals("dez", eNum.showExtenso(numero));
		numero = "11";
		assertEquals("onze", eNum.showExtenso(numero));
		numero = "12";
		assertEquals("doze", eNum.showExtenso(numero));
		numero = "13";
		assertEquals("treze", eNum.showExtenso(numero));
		numero = "14";
		assertEquals("catorze", eNum.showExtenso(numero));
		numero = "15";
		assertEquals("quinze", eNum.showExtenso(numero));
		numero = "16";
		assertEquals("dezesseis", eNum.showExtenso(numero));
		numero = "17";
		assertEquals("dezessete", eNum.showExtenso(numero));
		numero = "18";
		assertEquals("dezoito", eNum.showExtenso(numero));
		numero = "19";
		assertEquals("dezenove", eNum.showExtenso(numero));
		numero = "20";
		assertEquals("vinte", eNum.showExtenso(numero));
		numero = "1000000000";
		assertEquals("um bilhao", eNum.showExtenso(numero));
	}

	@Test
	public void testDezenas() throws Exception {
		numero = "21";
		assertEquals("vinte e um", eNum.showExtenso(numero));
		numero = "43";
		assertEquals("quarenta e tres", eNum.showExtenso(numero));
		numero = "54";
		assertEquals("cinquenta e quatro", eNum.showExtenso(numero));
		numero = "89";
		assertEquals("oitenta e nove", eNum.showExtenso(numero));
		numero = "01";
		assertEquals("um", eNum.showExtenso(numero));
	}

	@Test
	public void testCentenas() throws Exception {
		numero = "101";
		assertEquals("cento e um", eNum.showExtenso(numero));
		numero = "198";
		assertEquals("cento e noventa e oito", eNum.showExtenso(numero));
		numero = "387";
		assertEquals("trezentos e oitenta e sete", eNum.showExtenso(numero));
		numero = "450";
		assertEquals("quatrocentos e cinquenta", eNum.showExtenso(numero));
		numero = "999";
		assertEquals("novecentos e noventa e nove", eNum.showExtenso(numero));
		numero = "583";
		assertEquals("quinhentos e oitenta e tres", eNum.showExtenso(numero));
		numero = "500";
		assertEquals("quinhentos", eNum.showExtenso(numero));
		numero = "123";
		assertEquals("cento e vinte e tres", eNum.showExtenso(numero));
		numero = "343";
		assertEquals("trezentos e quarenta e tres", eNum.showExtenso(numero));
		numero = "210";
		assertEquals("duzentos e dez", eNum.showExtenso(numero));
		numero = "001";
		assertEquals("um", eNum.showExtenso(numero));
		numero = "011";
		assertEquals("onze", eNum.showExtenso(numero));
	}

	@Test
	public void testMilhares() throws Exception {
		numero = "1001";
		assertEquals("mil e um", eNum.showExtenso(numero));
		numero = "1210";
		assertEquals("mil duzentos e dez", eNum.showExtenso(numero));
		numero = "2001";
		assertEquals("dois mil e um", eNum.showExtenso(numero));
		numero = "2013";
		assertEquals("dois mil e treze", eNum.showExtenso(numero));
		numero = "9999";
		assertEquals("nove mil novecentos e noventa e nove", eNum.showExtenso(numero));
		numero = "5652";
		assertEquals("cinco mil seiscentos e cinquenta e dois", eNum.showExtenso(numero));
		numero = "1994";
		assertEquals("mil novecentos e noventa e quatro", eNum.showExtenso(numero));
		numero = "2009";
		assertEquals("dois mil e nove", eNum.showExtenso(numero));
		numero = "4610";
		assertEquals("quatro mil seiscentos e dez", eNum.showExtenso(numero));
		numero = "5500";
		assertEquals("cinco mil e quinhentos", eNum.showExtenso(numero));
		numero = "5000";
		assertEquals("cinco mil", eNum.showExtenso(numero));
		numero = "0000";
		assertEquals("zero", eNum.showExtenso(numero));
		numero = "2100";
		assertEquals("dois mil e cem", eNum.showExtenso(numero));
	}

	@Test
	public void testDezenasDeMilhares() throws Exception {
		numero = "10870";
		assertEquals("dez mil oitocentos e setenta", eNum.showExtenso(numero));
		numero = "99500";
		assertEquals("noventa e nove mil e quinhentos", eNum.showExtenso(numero));
		numero = "19616";
		assertEquals("dezenove mil seiscentos e dezesseis", eNum.showExtenso(numero));
		numero = "19000";
		assertEquals("dezenove mil", eNum.showExtenso(numero));
		numero = "84965";
		assertEquals("oitenta e quatro mil novecentos e sessenta e cinco", eNum.showExtenso(numero));
		numero = "99584";
		assertEquals("noventa e nove mil quinhentos e oitenta e quatro", eNum.showExtenso(numero));
	}

	@Test
	public void testCentenasDeMilhares() throws Exception {
		numero = "100000";
		assertEquals("cem mil", eNum.showExtenso(numero));
		numero = "686523";
		assertEquals("seiscentos e oitenta e seis mil quinhentos e vinte e tres", eNum.showExtenso(numero));
		numero = "100001";
		assertEquals("cem mil e um", eNum.showExtenso(numero));
		numero = "816010";
		assertEquals("oitocentos e dezesseis mil e dez", eNum.showExtenso(numero));
		numero = "100100";
		assertEquals("cem mil e cem", eNum.showExtenso(numero));
		numero = "298485";
		assertEquals("duzentos e noventa e oito mil quatrocentos e oitenta e cinco", eNum.showExtenso(numero));
		numero = "844683";
		assertEquals("oitocentos e quarenta e quatro mil seiscentos e oitenta e tres", eNum.showExtenso(numero));
		numero = "901101";
		assertEquals("novecentos e um mil cento e um", eNum.showExtenso(numero));
	}
	
	@Test
	public void testMilhao() throws Exception {
		numero = "1000000";
		assertEquals("um milhao", eNum.showExtenso(numero));
		numero = "1100000";
		assertEquals("um milhao e cem mil", eNum.showExtenso(numero));
		numero = "1000001";
		assertEquals("um milhao e um", eNum.showExtenso(numero));
		numero = "1081961";
		assertEquals("um milhao oitenta e um mil novecentos e sessenta e um", eNum.showExtenso(numero));
		numero = "1600000";
		assertEquals("um milhao e seiscentos mil", eNum.showExtenso(numero));
		numero = "3000484";
		assertEquals("tres milhoes quatrocentos e oitenta e quatro", eNum.showExtenso(numero));
		numero = "1000010";
		assertEquals("um milhao e dez", eNum.showExtenso(numero));
		numero = "2000010";
		assertEquals("dois milhoes e dez", eNum.showExtenso(numero));
		numero = "2000200";
		assertEquals("dois milhoes e duzentos", eNum.showExtenso(numero));
	}

	@Test(expected = Exception.class)
	public void testExcecao1() throws Exception {
		numero = "-21";
		assertEquals("vinte e um", eNum.showExtenso(numero));
	}

	@Test(expected = Exception.class)
	public void testExcecao2() throws Exception {
		numero = "1000000001";
		assertEquals("um bilhao e um", eNum.showExtenso(numero));
	}

}