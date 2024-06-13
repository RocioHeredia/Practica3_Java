public class Main {

    public static void main(String[] args) {
        ConjuntoPalabras conjuntoPalabras1 = new ConjuntoPalabras();
        ConjuntoPalabras conjuntoPalabras2 = new ConjuntoPalabras();

        MiHilo hilo1 = new MiHilo("texto1.txt", conjuntoPalabras1);
        MiHilo hilo2 = new MiHilo("texto2.txt", conjuntoPalabras2);
        hilo1.start();
        hilo2.start();
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        conjuntoPalabras1.fusionar(conjuntoPalabras2);
        conjuntoPalabras1.mostrar();
    }

}