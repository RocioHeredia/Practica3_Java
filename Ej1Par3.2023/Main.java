import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        Finanzas finanzas = new Finanzas();

        Inmueble I1 = new Inmueble("1500", 100, "Casa");
        Inmueble I2 = new Inmueble("6485", 250, "Departamento");
        Inmueble I3 = new Inmueble("3645", 500, "Oficina");
        Automotor A1 = new Automotor("Jeep", 2023);
        Automotor A2 = new Automotor("Ford", 2000);
        Automotor A3 = new Automotor("Toyota", 2023);

        //AGREGAR A LAS LISTAS
        finanzas.agregar_Inmuebles(I1);
        finanzas.agregar_Inmuebles(I2);
        finanzas.agregar_Inmuebles(I3);
        finanzas.agregar_Automotor(A1);
        finanzas.agregar_Automotor(A2);
        finanzas.agregar_Automotor(A3);


        //EXCEPTUADOS
        System.out.println("----EXCEPTUADOS----");
        List<String> lista=finanzas.exceptuados();
        lista.forEach(System.out::println);

        //CANTIDAD DE AUTOMOTORES
        System.out.println("");
        int cant = finanzas.totalAutomotores();
        System.out.println("TOTAL DE AUTOMOTORES: " + cant);

        //INMUEBLES CON IMPUESTO MAYOR A 100000
        System.out.println("");
        System.out.println("----INMUEBLES CON IMPUESTO MAYOR A 100000----");
        List<String> lista2=finanzas.megaInmueble();
        lista2.forEach(System.out::println);
    }
}
