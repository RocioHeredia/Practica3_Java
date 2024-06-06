import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Gestor {
    private List<ViajeroFrecuente> viajeros;

    public Gestor() {
        this.viajeros = new ArrayList<>();
    }

    public void agregarViajero(ViajeroFrecuente viajero) {
        viajeros.add(viajero);
    }

    public List<ViajeroFrecuente> obtenerViajerosOrdenadosPorMillas() {
        return viajeros.stream()
                .sorted(Comparator.comparingInt(ViajeroFrecuente::getmillas))
                .collect(Collectors.toList());
    }

    public List<String> obtenerNombresConMasDe200Millas() {
        return viajeros.stream()
                .filter(v -> v.getmillas() > 200)
                .map(ViajeroFrecuente::getnombre)
                .collect(Collectors.toList());
    }

    public ViajeroFrecuente obtenerViajeroConMasMillas() {
        return viajeros.stream()
                .max(Comparator.comparingInt(ViajeroFrecuente::getmillas))
                .orElse(null);
    }
}