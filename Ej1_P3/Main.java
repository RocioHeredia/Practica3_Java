package Ej1_P3;
import java.util.Scanner; 
import Ej1_P3.GestorViajeros;
import Ej1_P3.ViajeroFrecuente;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GestorViajeros gestor = new GestorViajeros();

        ViajeroFrecuente viajero1 = new ViajeroFrecuente(1, "45778645","Juan","Perez",2000);
        ViajeroFrecuente viajero2 = new ViajeroFrecuente(2, "69498596","Pablo","Lopez",5000);
        ViajeroFrecuente viajero3 = new ViajeroFrecuente(3, "55611556","Pedro","Gonzalez",9000);
        gestor.cargarviajero(viajero1);
        gestor.cargarviajero(viajero2);
        gestor.cargarviajero(viajero3);
        Integer opcion;
        do{
            System.out.print("\n");
            System.out.println("----------- Menú de Opciones -----------");
            System.out.println("1: Cargar viajero.");
            System.out.println("2: Mostrar viajero.");
            System.out.println("3: Consultar Cantidad de Millas.");
            System.out.println("4: Acumular Millas.");
            System.out.println("5: Canjear Millas.");
            System.out.println("6: Mejor viajero.");
            System.out.println("7: Salir.");
            System.out.print("Ingrese una opci'on: ");
            opcion = in.nextInt();
            in.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("----CARGANDO VIAJERO NUEVO----");
                    System.out.print("\n");
                    System.out.println("Ingrese Número del nuevo viajero: ");
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
                    gestor.cargarviajero(nuevoViajero);
                    break;
                
                case 2: 
                    System.out.print("----MOSTRAR VIAJERO----");
                    System.out.print("\n");
                    ViajeroFrecuente viaj = gestor.buscarViajeroNro();
                    if (viaj!=null){
                        System.out.println(viaj.toString());
                    }else{
                        System.out.println("Viajero no encontrado");
                    }
                    break;

                case 3:
                    System.out.print("----CONSULTAR MILLAS----");
                    System.out.print("\n");
                    viaj = gestor.buscarViajeroDNI();
                    if (viaj!=null){
                        System.out.println("La cantidad de millas del viajero ingresado son "+ viaj.getmillas());
                    }else{
                        System.out.println("Viajero no encontrado");
                    }
                    break;

                case 4:
                    System.out.print("----ACUMULAR MILLAS----");
                    System.out.print("\n");
                    viaj = gestor.buscarViajeroDNI();
                    System.out.print("Ingrese las millas que quiere acumular: ");
                    int mill = in.nextInt();
                    if(viaj!=null){
                        System.out.println("Millas acumuladas: " + viaj.acumularMillas(mill));
                    }else{
                        System.out.println("Viajero no encontrado");
                    }
                    break;

                case 5:
                    System.out.print("----CANJEAR MILLAS----");
                    System.out.print("\n");
                    viaj = gestor.buscarViajeroDNI();
                    System.out.print("Ingrese las millas que quiere canjear: ");
                    int millasCanje = in.nextInt();
                    if(viaj!=null){
                        System.out.println("Millas canjeadas: " + viaj.canjearMillas(millasCanje));
                    }else{
                        System.out.println("Viajero no encontrado");
                    }
                    break;

                case 6:
                    System.out.print("----MOSTRAR MEJOR VIAJERO----");
                    System.out.print("\n");
                    viaj = gestor.mejorViajero();
                    if(viaj!=null){
                        System.out.println("El mejor viajero es: "+ viaj);
                    }else {
                        System.out.println("Viajero no encontrado");
                    }
                    break;
                case 7: 
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 7);   
    }
}    