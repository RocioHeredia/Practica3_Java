import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Socio> lista;
    
    public Biblioteca(){
        this.lista= new ArrayList<>();
    }

    public void agregarSocio(Socio nuevo_socio){
        this.lista.add(nuevo_socio);
    }

    
    public void mostrarDatos(){
        for (Socio s: lista){
            System.out.print(s.toString());
        }
    }

    public void morosos(){
        for(Socio s: lista){
            if(s instanceof Alumno){
                if (s.estado().equals("DEUDOR")){
                    System.out.print(s.toString());
                }
            }else if (s instanceof Agente){
                if (s.estado().equals("DEUDOR")){
                    System.out.print(s.toString());
                }
            }
        }
    }

    public void totalSocios(){
        System.out.print(lista.size());
    }

    public void exceptuados(){
        for(Socio s: lista){
            if (s instanceof Alumno){
                if (s.cuota()==0){
                    Alumno alu=(Alumno) s;
                    System.out.println("Nombre: "+ s.getnom() +", Registro: " + alu.getreg());
                }
            }else if (s instanceof Agente){
                if (s.cuota()==0){
                    Agente alu=(Agente) s;
                    System.out.println("Nombre: "+ s.getnom() +", Cuil: " + alu.getcuil());
                }
            }
        }
    }
}