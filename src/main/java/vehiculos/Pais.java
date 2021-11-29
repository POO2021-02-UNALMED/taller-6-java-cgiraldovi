package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    //metodo
    private static ArrayList<Fabricante> fabricantes = new ArrayList<>();
    private static ArrayList<Pais> paises = new ArrayList<>();
    private int contador;


    public Pais(String nombre) {
        setNombre(nombre);
        paises.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //metodo

    public static Pais paisMasVendedor() {
        Pais paismasvendedor = new Pais("");

        for (Fabricante fabricante : fabricantes) {

            for (Pais pais : paises) {
                if (fabricante.getPais() == pais){
                    pais.setContador();
                    break;
                }
            }
        }

        for (Pais pais: paises) {
            if(pais.getContador() >= paismasvendedor.getContador()){
                paismasvendedor = pais;
            }
        }

        return paismasvendedor;
    }

    public ArrayList<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public static void setFabricantes(Fabricante fabricante) {
        Pais.fabricantes.add(fabricante);
    }

    public int getContador() {
        return contador;
    }

    public void setContador() {
        this.contador ++;
    }
}
