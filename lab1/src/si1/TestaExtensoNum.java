package si1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestaExtensoNum {

	private ExtensoNum extnum;
	private String numero;

	@Before
	public void setUp() {
		extnum = new ExtensoNum();
	}

	@Test
	public void testCasosBases() {
		numero = "0";
		assertEquals("zero", extnum.showExtenso(numero));
		numero = "1";
		assertEquals("um", extnum.showExtenso(numero));
		numero = "2";
		assertEquals("dois", extnum.showExtenso(numero));
		numero = "3";
		assertEquals("tres", extnum.showExtenso(numero));
		numero = "4";
		assertEquals("quatro", extnum.showExtenso(numero));
		numero = "5";
		assertEquals("cinco", extnum.showExtenso(numero));
		numero = "6";
		assertEquals("seis", extnum.showExtenso(numero));
		numero = "7";
		assertEquals("sete", extnum.showExtenso(numero));
		numero = "8";
		assertEquals("oito", extnum.showExtenso(numero));
		numero = "9";
		assertEquals("nove", extnum.showExtenso(numero));
		numero = "10";
		assertEquals("dez", extnum.showExtenso(numero));
		numero = "11";
		assertEquals("onze", extnum.showExtenso(numero));
		numero = "12";
		assertEquals("doze", extnum.showExtenso(numero));
		numero = "13";
		assertEquals("treze", extnum.showExtenso(numero));
		numero = "14";
		assertEquals("catorze", extnum.showExtenso(numero));
		numero = "15";
		assertEquals("quinze", extnum.showExtenso(numero));
		numero = "16";
		assertEquals("dezesseis", extnum.showExtenso(numero));
		numero = "17";
		assertEquals("dezessete", extnum.showExtenso(numero));
		numero = "18";
		assertEquals("dezoito", extnum.showExtenso(numero));
		numero = "19";
		assertEquals("dezenove", extnum.showExtenso(numero));
		numero = "20";
		assertEquals("vinte", extnum.showExtenso(numero));
		numero = "1000000000";
		assertEquals("um bilh�o", extnum.showExtenso(numero));
	}
}