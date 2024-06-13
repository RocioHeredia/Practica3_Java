
public class ViajeroFrecuente {
    private Integer numero;
    private String dni;
    private String nombre;
    private String apellido;
    private Integer millas;

    public ViajeroFrecuente(Integer numero, String dni, String nombre, String apellido, Integer millas) {
        this.numero= numero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.millas = millas;
    }

    
    @Override
    public String toString() {
        return "ViajeroFrecuente [numero=" + numero + ", dni=" + dni + ", nombre=" + nombre + 
                ", apellido=" + apellido + ", millas=" + millas + "]";
    }


    public Integer getnumero() {
        return numero;
    }

    public void setnumero(Integer numero) {
        this.numero = numero;
    }

    public String getdni() {
        return dni;
    }

    public void setdni(String dni) {
        this.dni = dni;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getmillas() {
        return millas;
    }

    public void setmillas(Integer millas) {
        this.millas = millas;
    }


    public Integer acumularMillas(Integer millasAcum) {
        this.millas += millasAcum;
        return millas;
    }

    public Integer canjearMillas(Integer millasCanje) {
        if (this.millas> millasCanje) {
            this.millas -= millasCanje;
        } else {
            System.out.println("Error: la cantidad de millas a canjear supera las millas acumuladas.");
        }
        return this.millas;
    }
}
