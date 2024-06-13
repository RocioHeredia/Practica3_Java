package Ej2_P3;
import java.util.List;

/*Clase Equipo */
public class Equipo implements IDeporte {

    private String nombre;
    private List<Deportista> integrantes;

    public Equipo(String nombre){
        this.nombre=nombre;
    }

    /* Aca se armar los equipos*/
    @Override
    public boolean conformar(List<Deportista> integrantes, int cantidad){
        if(integrantes.size() >= cantidad){
            this.integrantes=integrantes;
            return true;
        }
        return false;
    }

    /*Aca se lmuestra al equipo*/
    @Override
    public void mostrar(){
        System.out.println("" + nombre);
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