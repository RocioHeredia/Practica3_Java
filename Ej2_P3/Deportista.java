package Ej2_P3;

public class Deportista {

    private String nombre;
    private String dni;
    private Integer numeroJugador;

    // Constructor
    public Deportista(String nombre, String dni){
        this.nombre=nombre;
        this.dni=dni;
    }

    // Getter
    public String getNombre(){
        return this.nombre;
    }

    public String getDni(){
        return this.dni;
    }

    public Integer getNumeroJugador(){
        return this.numeroJugador;
    }

    public void setNumeroJugador(Integer num){
        this.numeroJugador=num;
    }

    @Override
    public String toString(){
        return "Deportista: [nombre: " + nombre + ",DNI: " + dni + ",Numero Jugador:"+ numeroJugador + " ]";
    }
}