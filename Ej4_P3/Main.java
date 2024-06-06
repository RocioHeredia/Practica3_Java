
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Gestor gestor = new Gestor();

        ViajeroFrecuente viajero1 = new ViajeroFrecuente(1, "45778645","Juan","Perez",2000);
        ViajeroFrecuente viajero2 = new ViajeroFrecuente(2, "69498596","Pablo","Lopez",5000);
        ViajeroFrecuente viajero3 = new ViajeroFrecuente(3, "55611556","Pedro","Gonzalez",9000);
        gestor.agregarViajero(viajero1);
        gestor.agregarViajero(viajero2);
        gestor.agregarViajero(viajero3);
        Integer opcion;
        do{
            System.out.print("\n");
            System.out.println("----------- Menu de Opciones -----------");
            System.out.println("1: Agregar viajeros al gestor.");
            System.out.println("2: Mostrar los datos de los viajeros ordenados por la cantidad de millas.");
            System.out.println("3: Mostrar los nombres de los viajeros que tienen mas de 200 millas.");
            System.out.println("4: Obtener el viajero que tiene mas millas.");
            System.out.println("5: Salir.");
            System.out.print("Ingrese una opci'on: ");
            opcion = in.nextInt();
            in.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("----CARGANDO VIAJERO NUEVO----");
                    System.out.print("\n");
                    System.out.println("Ingrese Numero del nuevo viajero: ");
                    int numero= in.nextInt();
                    in.nextLine();
                    System.out.println("Ingrese Nombre del nuevo viajero: ");
                    String nombre= in.nextLine();
                    System.out.println("Ingrese Apellido del nuevo viajero: ");
                    String apellido= in.nextLine();
                    System.out.println("Ingrese DNI del nuevo viajero: ");
                    String dni=in.nextLine();
                    System.out.println("Ingrese Millas del nuevo viajero: ");
                    int millas= in.nextInt();

                    ViajeroFrecuente nuevoViajero= new ViajeroFrecuente(numero, dni, nombre, apellido, millas);
                    gestor.agregarViajero(nuevoViajero);
                    break;
                
                case 2: 
                    System.out.print("----Mostrar los datos de los viajeros ordenados por la cantidad de millas----");
                    System.out.print("\n");
                    List<ViajeroFrecuente> viajerosOrdenados = gestor.obtenerViajerosOrdenadosPorMillas();
                    viajerosOrdenados.forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("----Mostrar los nombres de los viajeros que tienen mas de 200 millas----");
                    System.out.print("\n");
                    List<String> nombresConMasDe200Millas = gestor.obtenerNombresConMasDe200Millas();
                    nombresConMasDe200Millas.forEach(System.out::println);
                    break;

                case 4:
                    System.out.print("----Obtener el viajero que tiene mas millas----");
                    System.out.print("\n");
                    ViajeroFrecuente viajeroConMasMillas = gestor.obtenerViajeroConMasMillas();
                    System.out.println(viajeroConMasMillas);
                    break;
                case 5: 
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);   
    }
}    