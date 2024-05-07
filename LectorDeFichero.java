import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LectorDeFichero {
    public static String leerArchivo(String rutaArchivo) throws IOException {
        StringBuilder textoContenido = new StringBuilder();
        try (BufferedReader archivoLeido = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            while ((line = archivoLeido.readLine()) != null) {
                textoContenido.append(line).append("\n");
            }
        }
        return textoContenido.toString();

    }

}