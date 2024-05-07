import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            //opcion = Integer.parseInt(scanner.nextLine());
            System.out.println();
            System.out.println("       *** Menú Principal ***");
            System.out.println();
            System.out.println("      1. Encriptar Archivo");
            System.out.println("      2. Desencriptar Archivo ");
            System.out.println("      3. Salir");
            System.out.println("");
            System.out.print("      Digite el número de la opción requerida: ");
            opcion = Integer.parseInt(scanner.nextLine());
            //opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println("      ==) Usted seleccionó la opción #1");
                    // Leyendo el archivo a cifrar llamando al método lector
                    Scanner console = new Scanner(System.in);
                    System.out.println();
                    System.out.print("      Ingrese la ruta del archivo a Encriptar:  ");
                    String rutaArchivo = console.nextLine();
                    String contenidoDeArchivo = LectorDeFichero.leerArchivo(rutaArchivo);
                    System.out.println();
                    System.out.println("      Archivo original leido:  ");
                    //Pidiendo la clave para encriptar
                    int clave;
                    System.out.println();
                    System.out.print("      Digite un número del 1 al 12:  ");
                    clave = console.nextInt();
                    System.out.println("      La clave de encriptación es: " + clave);
                    // Llamada al método para cifrar archivo de texto.
                    String textoCifrado = Encriptador.cifrar(contenidoDeArchivo, clave);
                    // Mostrando archivo cifrado por pantalla.
                    System.out.println(textoCifrado);
                    // Llamada al método para guardar texto cifrado.
                    String rutaArchivoDestino = "cifrado.txt";
                    CreadorDeFichero.guardarArchivo(textoCifrado, rutaArchivoDestino);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("      ==) Usted seleccionó la opción #2 Desencriptar archivo!  ");
                    do {
                        System.out.println();
                        System.out.println("      1. Desencriptado con clave:  ");
                        System.out.println("      2. Desencriptado por fuerza bruta:  ");
                        System.out.println("      3. Salir del programa ");
                        System.out.println();
                        System.out.print("      Seleccione el número de la opción a realizar:  ");
                        opcion = scanner.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println();
                                System.out.println("      ==) Usted eligió desencriptar con una clave.  ");
                                // LLamada al método para descifrar con clave
                                console = new Scanner(System.in);
                                int claveDescifrar;
                                System.out.println();
                                System.out.print("      Digite un número del 1 al 12:  ");
                                claveDescifrar = console.nextInt();
                                String textoCodificado = Files.readString(Path.of("cifrado.txt"));
                                String textoOriginal = Desencriptador.desencriptar(textoCodificado, claveDescifrar);
                                System.out.println(textoOriginal);
                                break;
                            case 2:
                                System.out.println();
                                System.out.println("      ==) Usted seleccionó desencriptar por fuerza bruta!  ");
                                // LLamada al método desencriptadorPruebaError
                                DesencriptadorPruebaError desencriptadorPruebaError = new DesencriptadorPruebaError();
                                textoCifrado = Files.readString(Path.of("cifrado.txt"));
                                desencriptadorPruebaError.desencriptarPorPruebayError(textoCifrado);
                                break;
                            case 3:
                                System.out.println();
                                System.out.println("      Hasta pronto! ");
                                break;
                            default:
                                System.out.println("      Opción inválida. usted digitó un número diferente, vuelva a intentarlo!. ");
                                break;
                        }
                    } while (opcion != 3);
                case 3:
                    System.out.println("      Usted eligió salir del programa!.");
                    break;
                default:
                    System.out.println(3);
                    System.out.println("      Opción inválida. usted digitó un número diferente, vuelva a intentarlo!. ");
                    break;
            }
        } while (opcion != 3);
        scanner.close();
    }
}