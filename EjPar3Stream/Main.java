import java.util.List;
public class Main {
    
    public static void main(String[] args) {
        Biblioteca gest = new Biblioteca();
        Agente Agen1= new Agente("Juan", 1200, "DEUDOR", "29-7854-45", "AV.lopez 454(o)");
        Agente Agen2= new Agente("Emilse", 0, "ACTIVO", "27-5565-56", "AV.pe 58(e)");
        Alumno Alum1= new Alumno("Mario", 0, "DEUDOR", "E020-48", "Letras");
        Alumno Alum2= new Alumno("Estela", 3650, "ACTIVO", "E029-8", "Ingeniera Civil");
        
        //AGREGAR DATOS
        gest.agregarSocio(Agen1);
        gest.agregarSocio(Agen2);
        gest.agregarSocio(Alum1);
        gest.agregarSocio(Alum2);
        //MOSTRAR LOS SOCIOS CON ESTADO DEUDOR
        System.out.println("SOCIOS CON ESTADO DEUDOR: ");
        List<String> morosos=gest.morosos();
        morosos.forEach(System.out :: println);

        //TOTAL SOCIOS
        System.out.println("");
        System.out.println("TOTAL SOCIOS: " + gest.totalSocios());

        //EXCEPTUADOS CUOTA IGUAL A CERO
        System.out.println("");
        List<Socio> exceptuados= gest.exceptuados();
        exceptuados.forEach(System.out :: println);
    }   
}


/*//MOSTRAR DATOS
List<Socio>lista = gest.mostrarDatos();
lista.forEach(System.out :: println);
int opcion;
    
        do{
            System.out.print("\n");
            System.out.println("MENÚ DE OPCIONES: ");
            System.out.println("1.Agregar Socio.");
            System.out.println("2.Mostrar los Socios con estado DEUDOR.");
            System.out.println("3.Mostrar Total de Socios.");
            System.out.println("4.Mostrar Socios Exceptuados.");
            System.out.println("5.Mostrar Lista completa");
            opcion=in.nextInt();
            in.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("----CARGAR NUEVO SOCIO----");
                    System.out.println("\nIngrese el tipo:");
                    System.out.println("a.Alumno \nb.Agente");
                    String tipo = in.nextLine();
                    if (tipo.equals("a")){
                        System.out.println("Ingrese Nombre: ");
                        String nombre=in.nextLine();
                        System.out.print("Ingrese Cuota: ");
                        float cuota=in.nextFloat();
                        in.nextLine();
                        System.out.println("Ingrese Estado: ");
                        String est=in.nextLine();
                        System.out.println("Ingrese Registro: ");
                        String reg=in.nextLine();
                        System.out.println("Ingrese Carrera: ");
                        String carre=in.nextLine();

                        Alumno nuevo_alum = new Alumno(nombre, cuota, est, reg, carre);
                        gest.agregarSocio(nuevo_alum);
                        break;
                    }else if(tipo.equals("b")){
                        System.out.println("Ingrese Nombre: ");
                        String nombre=in.nextLine();
                        System.out.print("Ingrese Cuota: ");
                        float cuota=in.nextFloat();
                        in.nextLine();
                        System.out.println("Ingrese Estado: ");
                        String est=in.nextLine();
                        System.out.println("Ingrese Cuil: ");
                        String cuil=in.nextLine();
                        System.out.println("Ingrese Domicilio: ");
                        String dom=in.nextLine();

                        Agente agen= new Agente(nombre, cuota, est, cuil, dom);
                            gest.agregarSocio(agen);
                            break;
                    }else{
                        System.out.print("OPCION INVALIDA");
                        break;
                    }
                case 2:
                     //MOSTRAR LOS SOCIOS CON ESTADO DEUDOR
                    System.out.println("SOCIOS CON ESTADO DEUDOR: ");
                    List<String> morosos=gest.morosos();
                    morosos.forEach(System.out :: println);
                    break;

                case 3:
                    //TOTAL SOCIOS
                    System.out.println("");
                    System.out.println("TOTAL SOCIOS: " + gest.totalSocios());
                    break;

                case 4:         
                    //EXCEPTUADOS CUOTA IGUAL A CERO
                    System.out.println("");
                    System.out.println("EXCEPTUADOS: ");
                    List<Socio> exceptuados= gest.exceptuados();
                    exceptuados.forEach(System.out :: println);
                    break;
                
                case 5: 
                    //MOSTRAR DATOS
                    List<Socio>lista = gest.mostrarDatos();
                    lista.forEach(System.out :: println);
                    break;
                
                default:
                    break;
            }

        }while (opcion!= 6);*/
