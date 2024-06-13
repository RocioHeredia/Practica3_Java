import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MiHilo extends Thread {
    private String rutaArchivo;
    private ConjuntoPalabras conjuntoPalabras;

    public MiHilo(String rutaArchivo, ConjuntoPalabras conjuntoPalabras) {
        this.rutaArchivo = rutaArchivo;
        this.conjuntoPalabras = conjuntoPalabras;
    }

    public String LimpiarSignos(String texto){
        return texto.replaceAll("[^a-zA-Z0-9\\s]", "");
    }

    public String[] limpiarStopWords(String[] texto) {
        Set<String> stopWords = new HashSet<>();
        stopWords.add("y");
        stopWords.add("el");
        stopWords.add("la");
        stopWords.add("los");
        stopWords.add("las");
        stopWords.add("de");
        stopWords.add("que");
        stopWords.add("costara");
        stopWords.add("costar");

        ArrayList<String> result = new ArrayList<>();
        for (String palabra : texto) {
            if (!stopWords.contains(palabra.toLowerCase())) {
                result.add(palabra);
            }
        }
        return result.toArray(new String[0]);
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String textoLimpio = LimpiarSignos(linea); // Limpia signos de puntuación
                String[] palabras = textoLimpio.split("\\s+"); // Divide el texto en palabras
    
                // Limpia las stop words (palabras vacías) y transforma a minúsculas
                String[] palabrasSinStopWords = limpiarStopWords(palabras);
    
                synchronized (conjuntoPalabras) {
                    // Procesa cada palabra no stop word
                    for (String palabra : palabrasSinStopWords) {
                        // Ignorar entradas vacías o no válidas
                        if (palabra == null || palabra.trim().isEmpty()) {
                            continue;
                        }
                        // Convierte la palabra a minúsculas
                        String palabraMin = palabra.toLowerCase();
                        Palabra p = conjuntoPalabras.buscarPalabra(palabraMin);
                        if (p != null) {
                            conjuntoPalabras.incrementar(p);
                        } else {
                            conjuntoPalabras.agregarPalabra(new Palabra(palabraMin));
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Maneja cualquier excepción de IO (lectura de archivo)
        }
    }
    
}