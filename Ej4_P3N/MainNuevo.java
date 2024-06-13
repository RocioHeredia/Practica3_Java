import java.util.List;
import java.util.Scanner;

/**
 * MainNuevo
 */
public class MainNuevo {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        GestorLista gestor = new GestorLista();

        ViajeroFrecuente viajero1 = new ViajeroFrecuente(1, "45778645","Juan","Perez",2000);
        ViajeroFrecuente viajero2 = new ViajeroFrecuente(2, "69498596","Pablo","Lopez",5000);
        ViajeroFrecuente viajero3 = new ViajeroFrecuente(3, "55611556","Pedro","Gonzalez",9000);
        gestor.agregarViajero(viajero1);
        gestor.agregarViajero(viajero2);
        gestor.agregarViajero(viajero3);
        int opc;
        do{
            System.out.print("\n");
            System.out.println("----------- Menu de Opciones -----------");
            System.out.println("1: Agregar viajeros al gestor.");
            System.out.println("2: Viajeros Ordenados por Millas.");
            System.out.println("3: Mostrar los nombres de los viajeros que tienen más de 200 millas.");
            System.out.println("4: Obtener el viajero que tiene más millas.");
            opc= in.nextInt();
            in.nextLine();

            switch (opc) {
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
                    System.out.println("VIAJEROS ORDENADOS POR MILLAS");
                    List <ViajeroFrecuente> listaordenada=gestor.ViajOrdenadoPorMilla();
                    listaordenada.forEach(System.out :: println); 
                    break;
                
                case 3:
                    System.out.println("VIAJEROS QUE TIENEN MÁS DE 200 MILLAS");
                    List <String> masde200=gestor.ViajeroConMas200();
                    masde200.forEach(System.out :: println);
                    break;
                
                case 4:
                    System.out.println("VIAJERO QUE TIENE MÁS MILLAS");
                    ViajeroFrecuente tienemas=gestor.obtenermasmillas();
                    System.out.println(tienemas);
                    break;

                default:
                    break;
            }
        } while (opc!= 5);
    }
}