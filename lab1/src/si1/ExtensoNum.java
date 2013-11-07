package si1;

import java.util.HashMap;

public class ExtensoNum {

	private HashMap<String, String> mapaPrincipaisExtensos;

	public ExtensoNum() {
		mapaPrincipaisExtensos = new HashMap<String, String>();
		preencheMapa();
	}

	public String showExtenso(String numero) throws Exception {
		if (Integer.parseInt(numero) >= 0 && Integer.parseInt(numero) <= 1000000000) {
			int lenght = numero.length();
			if (mapaPrincipaisExtensos.containsKey(numero)) {
				return mapaPrincipaisExtensos.get(numero);
			} else if (lenght == 2) {
				return resolveDezena(numero);
			} else if (lenght == 3) {
				return resolveCentena(numero);
			}
			return null;
		} else {
			throw new Exception("Numero fora dos limites.");
		}
	}
	
	private String resolveDezena(String numero) {
		if (mapaPrincipaisExtensos.containsKey(numero)) {
			return mapaPrincipaisExtensos.get(numero);
		}
		String unidade = numero.substring(1);
		String dezena = (numero.substring(0,1)) + "0";
		if (!dezena.equals("00")){
			return mapaPrincipaisExtensos.get(dezena) + " e " + mapaPrincipaisExtensos.get(unidade);
		} else {
			return mapaPrincipaisExtensos.get(unidade);
		}
	}
	
	private String resolveCentena(String numero) {
		if (mapaPrincipaisExtensos.containsKey(numero)) {
			return mapaPrincipaisExtensos.get(numero);
		}
		String centena = numero.substring(0, 1) + "00";
		String dezena = numero.substring(1);
		if (centena.equals("100")) {
			return "cento e " + resolveDezena(dezena);
		} else {
			return mapaPrincipaisExtensos.get(centena) + " e " + resolveDezena(dezena);
		}
	}
	
	private void preencheMapa() {
		mapaPrincipaisExtensos.put("0", "zero");
		mapaPrincipaisExtensos.put("1", "um");
		mapaPrincipaisExtensos.put("2", "dois");
		mapaPrincipaisExtensos.put("3", "tres");
		mapaPrincipaisExtensos.put("4", "quatro");
		mapaPrincipaisExtensos.put("5", "cinco");
		mapaPrincipaisExtensos.put("6", "seis");
		mapaPrincipaisExtensos.put("7", "sete");
		mapaPrincipaisExtensos.put("8", "oito");
		mapaPrincipaisExtensos.put("9", "nove");
		mapaPrincipaisExtensos.put("10", "dez");
		mapaPrincipaisExtensos.put("11", "onze");
		mapaPrincipaisExtensos.put("12", "doze");
		mapaPrincipaisExtensos.put("13", "treze"); // S2
		mapaPrincipaisExtensos.put("14", "catorze");
		mapaPrincipaisExtensos.put("15", "quinze");
		mapaPrincipaisExtensos.put("16", "dezesseis");
		mapaPrincipaisExtensos.put("17", "dezessete");
		mapaPrincipaisExtensos.put("18", "dezoito");
		mapaPrincipaisExtensos.put("19", "dezenove");
		mapaPrincipaisExtensos.put("20", "vinte");
		mapaPrincipaisExtensos.put("30", "trinta");
		mapaPrincipaisExtensos.put("40", "quarenta");
		mapaPrincipaisExtensos.put("50", "cinquenta");
		mapaPrincipaisExtensos.put("60", "sessenta");
		mapaPrincipaisExtensos.put("70", "setenta");
		mapaPrincipaisExtensos.put("80", "oitenta");
		mapaPrincipaisExtensos.put("90", "noventa");
		mapaPrincipaisExtensos.put("100", "cem");
		mapaPrincipaisExtensos.put("200", "duzentos");
		mapaPrincipaisExtensos.put("300", "trezentos");
		mapaPrincipaisExtensos.put("400", "quatrocentos");
		mapaPrincipaisExtensos.put("500", "quinhentos");
		mapaPrincipaisExtensos.put("600", "seiscentos");
		mapaPrincipaisExtensos.put("700", "setecentos");
		mapaPrincipaisExtensos.put("800", "oitocentos");
		mapaPrincipaisExtensos.put("900", "novecentos");
		mapaPrincipaisExtensos.put("1000000", "um milhao");
		mapaPrincipaisExtensos.put("1000000000", "um bilhao");
	}
}