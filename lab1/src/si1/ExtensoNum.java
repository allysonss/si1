package si1;

import java.util.HashMap;

public class ExtensoNum {

        private String extenso;
        private HashMap<String, String> mapa;
        
        public ExtensoNum() {
                mapa = new HashMap<String, String>();
                preencheMapa();
        }
        
        
        public String showExtenso(String numero) {
                if (mapa.containsKey(numero)) {
                        extenso = mapa.get(numero);
                        return extenso;
                }
                return null;
        }
        
        private void preencheMapa() {
                mapa.put("0", "zero");
                mapa.put("1", "um");
                mapa.put("2", "dois");
                mapa.put("3", "tres");
                mapa.put("4", "quatro");
                mapa.put("5", "cinco");
                mapa.put("6", "seis");
                mapa.put("7", "sete");
                mapa.put("8", "oito");
                mapa.put("9", "nove");
                mapa.put("10", "dez");
                mapa.put("11", "onze");
                mapa.put("12", "doze");
                mapa.put("13", "treze");  //S2
                mapa.put("14", "catorze");
                mapa.put("15", "quinze");
                mapa.put("16", "dezesseis");
                mapa.put("17", "dezessete");
                mapa.put("18", "dezoito");
                mapa.put("19", "dezenove");
                mapa.put("20", "vinte");
                mapa.put("1000000000", "um bilh�o");
        }
}