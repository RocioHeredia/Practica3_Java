import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Finanzas {

    private List<Inmueble> inmuebles;
    private List<Automotor> automotores;

    public Finanzas(){
        this.inmuebles = new ArrayList<>();
        this.automotores = new ArrayList<>();
    }

    public void agregar_Inmuebles(Inmueble nuevo_inmueble){
        this.inmuebles.add(nuevo_inmueble);
    }

    public void agregar_Automotor(Automotor nuevo_automotor){
        this.automotores.add(nuevo_automotor);
    }

    public List<String> exceptuados(){
        List<String> excep=Stream.concat(inmuebles.stream().map(x->x.getNumCatastro()),
                                            automotores.stream().map(x->x.getpatente()))
                                .collect(Collectors.toList());
        
        return excep;
    }

    public int totalAutomotores(){
        return (int) automotores.stream().filter(x->x.getmodelo()==2023).count();
    }

    public List<String> megaInmueble(){
        List<String> lista=inmuebles.stream()
                            .filter(x-> x.impuesto()>100000)
                            .map(x->x.getNumCatastro())
                            .collect(Collectors.toList());
        
        return lista;
    }


}