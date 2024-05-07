public class DesencriptadorPruebaError {
    Desencriptador desencriptador = new Desencriptador();
    String desencriptarPorPruebayError(String textoCifrado) {
        String posiblePalabraDescifrada = " tu seleccion";

        // Creación  Ciclo for para identificar clave,del 1 al 13
        for (int i = 1; i < 13; i++) {
            posiblePalabraDescifrada = desencriptador.desencriptar(textoCifrado, i);
            boolean existePalabraEnEspanol = existeAlgunaPalabraConocida(posiblePalabraDescifrada);
            if (existePalabraEnEspanol) {
                System.out.println();
                System.out.println("      La clave ingresada por usted fue: " + i);
                System.out.println();
                System.out.println("      El archivo desencriptado es: " + posiblePalabraDescifrada);
            }
        }
        return posiblePalabraDescifrada;
    }
    static boolean existeAlgunaPalabraConocida(String archivoTexto) {
        String[] cadenaEnEspanol = new String [7];
        cadenaEnEspanol [0] = " do ";
        cadenaEnEspanol [1] = " pa ";
        cadenaEnEspanol [2] = " yo ";
        cadenaEnEspanol [3] = " tu ";
        cadenaEnEspanol [4] = " no ";
        cadenaEnEspanol [5] = " la ";
        cadenaEnEspanol [6] = " el ";

        // Ciclo for para comparar estas palabras en las posibles palabras descifradas
        for(int j = 0; j < cadenaEnEspanol.length; j++) {
            if(archivoTexto.contains(cadenaEnEspanol[j])){
                return true;
            }
        }
        return false;
    }
}