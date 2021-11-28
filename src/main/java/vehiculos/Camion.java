package vehiculos;

public class Camion extends Vehículo{
    private int ejes;

    public Camion(){
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
