public class ConvertidorDeLetras {
    private char desplazarLetra(char letraSinCifrar, int clave){
        int codigoDeLetraCifrada = letraSinCifrar + clave;
        char letraCifrada = (char) codigoDeLetraCifrada;
        return letraCifrada;
    }
    String desplazarLetrasDePalabras(String textoOriginal, int clave){
        StringBuilder creadorDeCadena = new StringBuilder();
        for (int i = 0; i < textoOriginal.length(); i++) {
            char caracterSinCifrar = textoOriginal.charAt(i);
            char letraCifrada = desplazarLetra(caracterSinCifrar, clave);
            creadorDeCadena.append(letraCifrada);
        }

        String textoCifrado = creadorDeCadena.toString();
        return textoCifrado;
    }
}