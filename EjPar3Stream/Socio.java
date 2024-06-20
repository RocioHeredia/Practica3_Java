/**
 * Socio
 */
public class Socio implements ISocio {

    private String nombre;
    private float cuota;
    private String estado;
    public Socio(String nombre, float cuota, String estado){
        this.nombre=nombre;
        this.cuota=cuota;
        this.estado=estado;
    }

    @Override
    public float cuota() {
        return cuota;
    }

    @Override
    public String estado() {
        return estado;
    }

    public String getnom(){
        return this.nombre;
    }

    public void setnom(String nuevo_nom){
        this.nombre=nuevo_nom;
    }
    
    public void setcuota(float nuevo_cuota){
        this.cuota=nuevo_cuota;
    }

    public void setestado(String nuevo_estado){
        this.nombre=nuevo_estado;
    }

    @Override
    public String toString(){
        return "Nombre:"+ this.nombre;
    }

       
}