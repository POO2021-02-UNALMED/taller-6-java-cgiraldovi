package vehiculos;

public class Pais {
    private String nombre;
    //contador

    public Pais(String nombre){
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor(){
        Pais noUso = new Pais("pa");
        return noUso;
    }
}
