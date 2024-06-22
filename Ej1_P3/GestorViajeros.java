package Ej1_P3;
import Ej1_P3.ViajeroFrecuente;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorViajeros {
    private Integer cant;
    private ArrayList<ViajeroFrecuente> viajeros;

    public GestorViajeros() {
        viajeros = new ArrayList<>();
        this.cant = 0;
    }

    public Integer getCant(){
        return this.cant;
    }

    public void cargarviajero(ViajeroFrecuente viajero){
        this.viajeros.add(viajero);
        this.cant ++;
        System.out.println("VIAJERO CARGADO");
    }

    public ViajeroFrecuente buscarViajeroNro(){
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese número del Viajero: ");
        int num= in.nextInt();
        ViajeroFrecuente viaj=null;
        int i=0;
        while (i<viajeros.size()) {
            if (((ViajeroFrecuente) viajeros.get(i)).getnumero() == num) { // Comparamos el número de viajero con el número proporcionado
                viaj = (ViajeroFrecuente) viajeros.get(i); // Asignamos el viajero encontrado a la variable 'viaj'
                return viaj;
            }
            i++;
        }
        return null;
    }
    
    public ViajeroFrecuente buscarViajeroDNI(){
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese DNI del Viajero: ");
        String dni= in.nextLine();
        int i=0;
        ViajeroFrecuente viaj=null;
        while (i<viajeros.size()) {
            if (((ViajeroFrecuente) viajeros.get(i)).getdni().equals(dni)){
                viaj=(ViajeroFrecuente) viajeros.get(i);
                return viaj;
            }
            i++;
        }
        return null;
    }

    public ViajeroFrecuente mejorViajero(){
        Integer max= 0;
        ViajeroFrecuente mejorViaj=null;
        for (int i=0; i < viajeros.size(); i++){
            
            if(((ViajeroFrecuente) viajeros.get(i)).getmillas()>max){
                max=((ViajeroFrecuente) viajeros.get(i)).getmillas();
                mejorViaj=(ViajeroFrecuente) viajeros.get(i);
            }
        }
        return mejorViaj;
    }

   
}