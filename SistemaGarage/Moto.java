package SistemaGarage;

import SistemaGarage.Rueda;

import java.util.ArrayList;

public class Moto extends Vehiculo {

    private boolean pie;
    private int cilindradas;


    public Moto(String motor, String marca, String matricula, double cantidadCombustible, boolean estado, double kilometraje, ArrayList<Rueda> ruedas, boolean pie, int cilindradas) {
        super(motor, marca, matricula, cantidadCombustible, estado, kilometraje, ruedas);
        this.pie = pie;
        this.cilindradas = cilindradas;
    }

    public boolean isPie() {
        return pie;
    }

    public void setPie(boolean pie) {
        this.pie = pie;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "SistemaGarage.Moto{" +
                "pie=" + pie +
                ", cilindradas=" + cilindradas +
                '}';
    }
}
