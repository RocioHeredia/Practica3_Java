public class Agente extends Socio{
    
    private String cuil;
    private String domicilio;

    public Agente(String nombre, float cuota, String estado, String cuil, String dom) {
        super(nombre, cuota, estado);
        this.cuil=cuil;
        this.domicilio=dom;
    }

    public String getcuil(){
        return this.cuil;
    }

    public String getdom(){
        return this.domicilio;
    }

    public void setcuil(String nuevo_cuil){
        this.cuil=nuevo_cuil;
    }

    public void setdom(String nuevo_dom){
        this.domicilio=nuevo_dom;
    }
    @Override
    public String toString(){
        return super.toString() + " Cuil:"+ this.cuil + " Domicilio:"+ this.domicilio + " \n";

    }
}