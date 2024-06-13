package Ej2_P3;
import java.util.List;
public interface IDeporte {
    int cantidad_minima=2;

    boolean conformar(List<Deportista> integrantes, int cantidad);

    void mostrar();

    void numeroDeportista();

    
}