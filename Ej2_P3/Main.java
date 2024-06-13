package Ej2_P3;

import java.io.IOException;
import java.util.List;

/* Main */
public class Main {
    
    public static void main(String[] args) throws IOException {
        Campeonato campeonato= new Campeonato();
        int cantidadJugadoresFutbol= 5;                  
    
        //LEE LOS ARCHIVOS
        
        List<Deportista> datosFutbol = campeonato.leerArchivo("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Universidad\\3er año\\Primer Semestre\\Paradigmas de Lenguajes\\Programación Objetos\\Ej2_P3\\inscriptosFutbol.csv");
        List<Deportista> datosPinPon = campeonato.leerArchivo("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Universidad\\3er año\\Primer Semestre\\Paradigmas de Lenguajes\\Programación Objetos\\Ej2_P3\\inscriptosPinPon.csv");
        List<IDeporte> equiposFut = campeonato.creaEquipos(datosFutbol, cantidadJugadoresFutbol);
        campeonato.numerar(equiposFut);
        System.out.println("\n");
        System.out.println("Equipos de Futsal: ");
        campeonato.mostrar(equiposFut);

        List<IDeporte> parejasPinPon = campeonato.creaParejas(datosPinPon);
        campeonato.numerar(parejasPinPon);
        System.out.println("\n");
        System.out.println("Equipos de PinPon: ");
        campeonato.mostrar(parejasPinPon);

    }      


    
}