import java.util.ArrayList;

public abstract class Vehiculo {

    private String motor, marca, matricula;
    private double cantidadCombustible;
    private boolean estado;
    private double kilometraje;
    private ArrayList<Rueda> ruedas;

    public Vehiculo(String motor, String marca, String matricula, double cantidadCombustible, boolean estado, double kilometraje, ArrayList<Rueda> ruedas) {
        this.motor = motor;
        this.marca = marca;
        this.matricula = matricula;
        this.cantidadCombustible = cantidadCombustible;
        this.estado = estado;
        this.kilometraje = kilometraje;
        this.ruedas = ruedas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getCantidadCombustible() {
        return cantidadCombustible;
    }

    public void setCantidadCombustible(int cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public ArrayList<Rueda> getRuedas() {
        return ruedas;
    }

    public void setRuedas(ArrayList<Rueda> ruedas) {
        this.ruedas = ruedas;
    }

    public void desplazarse(double km){
        this.kilometraje += km;
        this.cantidadCombustible -= km*0.2;
    };

    @Override
    public String toString() {
        return "Vehiculo{" +
                "motor='" + motor + '\'' +
                ", marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                ", cantidadCombustible=" + cantidadCombustible +
                ", estado=" + estado +
                ", kilometraje=" + kilometraje +
                ", ruedas=" + ruedas +
                '}';
    }
}
