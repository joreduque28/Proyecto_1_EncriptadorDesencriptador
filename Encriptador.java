public class Encriptador {
    //Método para encriptar letras
    //Creando el objeto desplazadorDeLetras
    static ConvertidorDeLetras desplazadorDeLetras = new ConvertidorDeLetras();

    // Llamando al método desplazarLetrasDePalabras
    static String cifrar(String textoSinCifrar, int clave) {
        String textocifrado = desplazadorDeLetras.desplazarLetrasDePalabras(textoSinCifrar, clave);
        return textocifrado;
    }


}