public class Desencriptador {
    // Creación metodo para desencriptar fichero
    static ConvertidorDeLetras convertidorDeLetras = new ConvertidorDeLetras();

    //Lamando el método desplazarLetrasDePalabras
    static String desencriptar(String textoCifrado, int clave){
        String textoDescifrado = convertidorDeLetras.desplazarLetrasDePalabras(textoCifrado, -clave);
        return textoDescifrado;
    }

}