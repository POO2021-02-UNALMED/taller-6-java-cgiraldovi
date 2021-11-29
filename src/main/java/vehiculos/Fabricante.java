package vehiculos;

public class Fabricante {
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais){
        setNombre(nombre);
        setPais(pais);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }


    public static Fabricante fabricaMayorVentas(){
        return new Fabricante("no1", new Pais("n1"));
    }
}
