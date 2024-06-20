import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Biblioteca {

    private ArrayList<Socio> lista;
    
    public Biblioteca(){
        this.lista= new ArrayList<>();
    }

    public void agregarSocio(Socio nuevo_socio){
        this.lista.add(nuevo_socio);
    }

    
    
    public List<Socio> mostrarDatos(){
        return  lista.stream()
                .collect(Collectors.toList());
    }

    public List<String> morosos(){
        return lista.stream()
                .filter(x->x.estado().equals("DEUDOR"))
                .map(x->x.getnom()) //.map(Socio :: getnom)
                .collect(Collectors.toList());
    }

    public int totalSocios(){
        return lista.size();
    }

    public List<Socio> exceptuados(){
        return lista.stream()
                .filter(x->x.cuota()==0)
                .collect(Collectors.toList());
        
       
    }

}