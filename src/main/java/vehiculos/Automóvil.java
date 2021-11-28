package vehiculos;

public class Automóvil extends Vehículo{
    private int puestos;

    public Automóvil(){
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
