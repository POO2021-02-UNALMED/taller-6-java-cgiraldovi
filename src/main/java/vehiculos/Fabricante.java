package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    //metodos
    private static ArrayList<Fabricante> fabricantes = new ArrayList<>();
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private int contador;

    public Fabricante(String nombre, Pais pais){
        setNombre(nombre);
        setPais(pais);
        //metodo
        Pais.setFabricantes(this);
        Fabricante.fabricantes.add(this);
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


    //metodos


    public static Fabricante fabricaMayorVentas(){
        Fabricante fabricaMayorVentas = new Fabricante("", new Pais(""));

        for (Fabricante fabricante : fabricantes) {

            for (Vehiculo vehiculo : vehiculos) {
                if (fabricante == vehiculo.getFabricante()){
                    fabricante.contador ++;
                    break;
                }
            }
        }

        for (Fabricante fabricante: fabricantes) {
            if(fabricante.contador >= fabricaMayorVentas.contador){
                fabricaMayorVentas = fabricante;
            }
        }

        return fabricaMayorVentas;

    }


    public static void setVehiculos(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }



}
