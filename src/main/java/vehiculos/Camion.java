package vehiculos;

public class Camion extends Vehiculo {
    private int ejes;

    public Camion(String placa, String nombre, int peso, int precio,
                  Fabricante fabricante, int puertas){
        super(placa,puertas,0,nombre,precio,peso,"",fabricante);
        super.setPuertas(2);
        super.setVelocidadMaxima(80);
        super.setTraccion("4X2");
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
}
