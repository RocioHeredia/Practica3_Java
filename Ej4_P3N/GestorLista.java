import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/**
 * GestorLista
 */
public class GestorLista {

    private List<ViajeroFrecuente> listaViajero;

    public GestorLista(){
        this.listaViajero = new ArrayList<>();
    }

    public void agregarViajero(ViajeroFrecuente nuevoViajero){
        listaViajero.add(nuevoViajero);
    }

    
    public List<ViajeroFrecuente> ViajOrdenadoPorMilla(){
        return listaViajero.stream()
                        .sorted(Comparator.comparing(ViajeroFrecuente::getmillas))
                        .collect(Collectors.toList());
    }

   public List<String> ViajeroConMas200(){
        return listaViajero.stream()
                .filter(v-> v.getmillas()>200)
                .map(ViajeroFrecuente :: getnombre)
                .collect(Collectors.toList());
    }

    public ViajeroFrecuente obtenermasmillas(){
        return listaViajero.stream()
                .max(Comparator.comparingInt(ViajeroFrecuente :: getmillas))
                .orElse(null);
    }
   
}