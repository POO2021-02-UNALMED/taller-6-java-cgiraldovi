package vehiculos;

public class Camioneta extends Vehículo{
    private boolean volco;
    public Camioneta(){
        super.setVelocidadMaxima(90);
        super.setTraccion("4X4");
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
}
