public class Alumno extends Socio{
    private String registro;
    private String carrera;

    public Alumno(String nombre, float cuota, String estado, String reg, String carre){
        super(nombre, cuota, estado);
        this.registro=reg;
        this.carrera=carre;
    }

    public String getreg() {
        return registro;
    }

    public void setreg(String nuevo_reg) {
        this.registro = nuevo_reg;
    }

    public String getcarrera() {
        return carrera;
    }

    public void setcarrera(String nuevo_carre) {
        this.carrera = nuevo_carre;
    }

    @Override
    public String toString(){
        return super.toString() + " Registro:" + this.registro;
    }

    
    
}
