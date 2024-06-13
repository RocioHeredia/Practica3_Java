package Ej2_P3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    public static final String SEPARADOR = ",";
	
    public static List<Deportista>leerArchivo(String nombreArchivo)throws IOException{
        //Imprime la ruta del archivo
       /*System.out.println("Intentando leer archivo: " + new File(nombreArchivo).getAbsolutePath());*/

        BufferedReader bufferLectura = null;
        List<Deportista> datos = new ArrayList<>();
        try {
            bufferLectura = new BufferedReader(new FileReader(nombreArchivo));
            String linea;                  

            while ((linea=bufferLectura.readLine()) != null) {
             // Sepapar la linea leída con el separador definido previamente
             String[] campos = linea.split(SEPARADOR); 
            
             try {
                verificardatos(campos);
                Deportista d = new Deportista(campos[0],campos[1]);
                datos.add(d); 
             } catch (MiExcepcion e) {
                System.err.println(e.getMessage());  
             }
                          
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
         // Cierro el buffer de lectura
         if (bufferLectura != null) {
             bufferLectura.close();
         }
        }
        return datos;
    }
    /**
    * Crea los equipos con los datos pasados como parámetro
    * @param datos lista con todos los deportistas inscriptos
     * @param cantidadJugadores cantidad de jugadores que conforman un equipo
     * @return una lista de equipos
    */
    public static List<IDeporte> creaEquipos(List<Deportista> datos, int cantidadJugadores){
        List<IDeporte> equipos = new ArrayList<>();
        int contequipo = 1;
        for (int i = 0; i < datos.size(); i += cantidadJugadores){
            try {
                verificaEqui(datos,i, cantidadJugadores);
                List<Deportista> integrantes = datos.subList(i, i+cantidadJugadores);
                Equipo equipo = new Equipo("Equipo "+ contequipo++);
                if (equipo.conformar(integrantes, cantidadJugadores)) {
                    equipos.add(equipo);
                }
            }catch (MiExcepcion e) {
                System.err.println(e.getMessage());
            }
        }
        return equipos;
    }
    /**
    Crea los equipos con los datos pasados como parámetro
     * @param datos es una lista con todos los deportitas inscriptos
     * @return una lista de Parejas formadas
    */
    public static List<IDeporte> creaParejas(List<Deportista> datos) {
        List<IDeporte> parejas = new ArrayList<>();
        for (int i = 0; i < datos.size(); i += 2) {
            try {
                verificaPare(datos, i);
                List<Deportista> integrantes = datos.subList(i, i + 2);
                Pareja pareja = new Pareja();
                if (pareja.conformar(integrantes)) {
                    parejas.add(pareja); // Agrega la pareja a la lista de parejas
                }
            } catch (MiExcepcion e) {
                System.err.println(e.getMessage());
            }
        }
        return parejas;
    }

    
    /**
    * Numera cada integrante del equipo o de la pareja
     * @param datos 
    */
    public static void numerar(List<IDeporte> datos){
        for (IDeporte deporte : datos) {
            deporte.numeroDeportista();
        }
    }
    /**
    * Muestra los datos de cada equipo o de cada pareja
     * @param datos
    */
    public static void mostrar(List<IDeporte> datos){
        for (IDeporte deporte : datos) {
            deporte.mostrar();
        }
    }
    
    public static void verificardatos(String[] i) throws MiExcepcion{
        if(i.length < 2 || i[0]==""){
            throw new MiExcepcion("Error: Ingresa Dato Vacio.");
        }
    }
    
    public static void verificaEqui(List<Deportista> datos, int i, int cantidad) throws MiExcepcion{
        if(i+cantidad>datos.size()){
            throw new MiExcepcion("ERROR: No hay suficientes jugadores para completar un nuevo equipo.");
        }
    }

    public static void verificaPare(List<Deportista> datos, int i)throws MiExcepcion{
        if(i+2>datos.size()){
            throw new MiExcepcion("ERROR: No hay suficientes jugadores para completar una nueva pareja.");
        }
    }
  
}
