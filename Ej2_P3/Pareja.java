package Ej2_P3;

import java.util.List;
/* Clase Pareja*/
public class Pareja implements IDeporte {

    private List<Deportista> integrantes;

    public Pareja() {}

    @Override
    public boolean conformar(List<Deportista> integrantes, int cantidad){
        if(integrantes.size() == cantidad){
            this.integrantes=integrantes;
            return true;
        }
        return false;
    }
    
    public boolean conformar(List<Deportista> integrantes) {
        return conformar(integrantes, 2);
    }

    /*Aca se lmuestra al equipo*/
    @Override
    public void mostrar(){
        System.out.println("Pareja: ");
        for(Deportista depo: integrantes){
            System.out.println(depo);            
        }
    }

    /*Aca se le asigna numero al deportista */
    @Override
    public void numeroDeportista(){
        for (int i = 0; i < integrantes.size(); i++) {
            integrantes.get(i).setNumeroJugador(i+1);
        }
    }

    
}