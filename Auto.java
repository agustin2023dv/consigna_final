import java.util.ArrayList;

public class Auto extends Vehiculo{

    private int cantidadPuertas;

    public Auto(String motor, String marca, String matricula, double cantidadCombustible, boolean estado, double kilometraje, ArrayList<Rueda> ruedas, int cantidadPuertas) {
        super(motor, marca, matricula, cantidadCombustible, estado, kilometraje, ruedas);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void desplazarse(double km) {
        this.setKilometraje(km);

    }

    @Override
    public String toString() {
        return "Auto{" +
                "cantidadPuertas=" + cantidadPuertas +
                '}';
    }
}
