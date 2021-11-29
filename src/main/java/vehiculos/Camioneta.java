package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;
    public Camioneta(String placa, int puertas, String nombre, int peso,
                     int precio, Fabricante fabricante, Boolean volco){
        super(placa,puertas,0,nombre,precio,peso,"",fabricante);
        super.setVelocidadMaxima(90);
        super.setTraccion("4X4");
        //contador
        super.setCantidadCamionetas();
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
}
