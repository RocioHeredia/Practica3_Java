public class Automotor implements Tributo{

    private String patente;
    private int modelo;

    public Automotor(String patente, int modelo){
        this.patente=patente;
        this.modelo=modelo;
    }

    public String getpatente(){
        return this.patente;
    }

    public int getmodelo(){
        return this.modelo;
    }

    public void setpatente(String nueva_patente){
        this.patente=nueva_patente;
    }

    public void setmodelo(int nuevo_modelo){
        this.modelo=nuevo_modelo;
    }

    @Override
    public float impuesto(){
        return 1000 * 0.5f;
    }
}