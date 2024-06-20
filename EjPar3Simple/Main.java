public class Main {
    
    public static void main(String[] args) {
        Biblioteca gest = new Biblioteca();
        Agente Agen1= new Agente("Juan", 0, "ACTIVO", "29-7854-45", "AV.lopez 454(o)");
        Agente Agen2= new Agente("Emilse", 4586, "DEUDOR", "27-5565-56", "AV.pe 58(e)");
        Alumno Alum1= new Alumno("Mario", 1200, "DEUDOR", "E020-48", "Letras");
        Alumno Alum2= new Alumno("Estela", 0, "ACTIVO", "E029-8", "Ingeniera Civil");
        
        //AGREGAR DATOS
        gest.agregarSocio(Agen1);
        gest.agregarSocio(Agen2);
        gest.agregarSocio(Alum1);
        gest.agregarSocio(Alum2);
        
        //MOSTRAR DATOS
        //gest.mostrarDatos();
        gest.morosos();
        gest.totalSocios();
        System.out.println("");
        gest.exceptuados();
    }   
}
