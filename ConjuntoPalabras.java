import java.util.ArrayList;

public class ConjuntoPalabras {
    private ArrayList<Palabra> palabras;

    public ConjuntoPalabras(){
        this.palabras= new ArrayList<>();
    }

    public void agregarPalabra(Palabra p){
        palabras.add(p);
    }

    public Palabra buscarPalabra(String palabra){
        for (Palabra p: palabras){
            if(p.getPalabra().equals(palabra)){
                return p;
            }
        }
        return null;
    }

    public void mostrar(){
        for (Palabra p:palabras){
            System.out.println(p);
        }
    }

    public void incrementar(Palabra p){
        p.incremento();
    }

    public void fusionar(ConjuntoPalabras otroConjunto) {
        for (Palabra palabra : otroConjunto.palabras) {
            String palabraMin = palabra.getPalabra().toLowerCase();
            Palabra p = this.buscarPalabra(palabraMin);

            if (p != null) {
                for (int i = 0; i < palabra.getCantidadVeces(); i++) {
                    this.incrementar(p);
                }
            } else {
                Palabra nuevaPalabra = new Palabra(palabraMin);
                for (int i = 1; i < palabra.getCantidadVeces(); i++) {
                    nuevaPalabra.incremento();
                }
                this.agregarPalabra(nuevaPalabra);
            }
        }
    }
}