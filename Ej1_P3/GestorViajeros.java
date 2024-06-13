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
       //Agregar cantidad 
        System.out.println("VIAJERO CARGADO");
    }

    public ViajeroFrecuente buscarViajeroNro(){
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese número del Viajero: ");
        int num= in.nextInt();
        ViajeroFrecuente viaj=null;

        for(ViajeroFrecuente viajero: viajeros){
            if (viajero.getnumero()==num){
                viaj = viajero;
            }
        }
        return viaj;
    }

    public ViajeroFrecuente buscarViajeroDNI(){
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese DNI del Viajero: ");
        String dni= in.nextLine();
        ViajeroFrecuente viaj=null;
        for(ViajeroFrecuente viajero: viajeros){
            if (viajero.getdni().equals(dni)){
                viaj=viajero;
            }
        }
        return viaj;
    }

    public ViajeroFrecuente mejorViajero(){
        Integer max= 0;
        ViajeroFrecuente mejorViaj=null;
        for (ViajeroFrecuente viajero: viajeros){
            if(viajero.getmillas()>max){
                max=viajero.getmillas();
                mejorViaj=viajero;
            }
        }
        return mejorViaj;
    }

    
}