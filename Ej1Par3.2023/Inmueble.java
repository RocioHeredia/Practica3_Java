public class Inmueble implements Tributo{

    private String numCatastro;
    private float superficie;
    private String zona;

    
    public Inmueble(String numCatastro, float superficie, String zona) {
        this.numCatastro = numCatastro;
        this.superficie = superficie;
        this.zona = zona;
    }


    public String getNumCatastro() {
        return numCatastro;
    }


    public void setNumCatastro(String nuevo_numCatastro) {
        this.numCatastro = nuevo_numCatastro;
    }


    public float getSuperficie() {
        return superficie;
    }


    public void setSuperficie(float nueva_superficie) {
        this.superficie = nueva_superficie;
    }


    public String getZona() {
        return zona;
    }


    public void setZona(String nueva_zona) {
        this.zona = nueva_zona;
    }


    @Override
    public float impuesto(){
        float imp=0;
        if (this.superficie <= 100){
                imp= 2000+(0.1f*2000);
        }else if (this.superficie>100 && this.superficie<500){
                imp= 5000+(0.2f*5000);
        }else{
                imp = 100000+(0.5f*100000);
        }
        return imp;
    }
}