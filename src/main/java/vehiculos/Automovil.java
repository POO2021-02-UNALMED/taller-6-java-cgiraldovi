package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;

    public Automovil(String placa, String nombre,
                     int peso, int precio,
                     Fabricante fabricante, int puertas){
        super(placa,puertas,0,nombre,precio,peso,"",fabricante);
        super.setPuertas(4);
        super.setVelocidadMaxima(100);
        super.setTraccion("FWD");
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}
