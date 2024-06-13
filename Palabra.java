
public class Palabra {

    private String palabra;
    private int cantidadVeces;

    public Palabra(String palabra){
        this.palabra = palabra.toLowerCase();;
        this.cantidadVeces=1;
    }

    

    public String getPalabra() {
        return palabra;
    }



    public int getCantidadVeces() {
        return cantidadVeces;
    }

    public void incremento(){
        this.cantidadVeces++;
    }



    @Override
    public String toString(){
        return "Palabra: {" + palabra + ", Cantidad: " + cantidadVeces +"}";
    }
}