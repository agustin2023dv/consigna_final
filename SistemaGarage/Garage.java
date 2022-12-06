package SistemaGarage;

import java.util.ArrayList;

public class Garage {

    private int capacidad;
    private String direccion;
    private double precioDia;
    private ArrayList<Vehiculo> vehiculos;

    public Garage(int capacidad, String direccion, double precioDia, ArrayList<Vehiculo> vehiculos) {
        this.capacidad = capacidad;
        this.direccion = direccion;
        this.precioDia = precioDia;
        this.vehiculos = vehiculos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean verCapacidad(){
        if(getCapacidad()==this.vehiculos.size()){
            return false;
        }
        else{
            return true;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        if(!this.verCapacidad()) return;
        this.vehiculos.add(vehiculo);
    }

    public void sacarVehiculo(){
        int indexOfLastElement = this.vehiculos.size() - 1;
        this.vehiculos.remove(indexOfLastElement);
    }

    public double kilometrajeMedio(){
        double km_medio = 0;

        for(int i=0; i<this.vehiculos.size(); i++){
            km_medio += this.vehiculos.get(i).getKilometraje();
        }
        km_medio = km_medio/this.vehiculos.size();

        return km_medio;
    }

    public double kilometrajeTotal(){
        double km_total = 0;

        for(int i=0; i<this.vehiculos.size(); i++){
            km_total += this.vehiculos.get(i).getKilometraje();
        }

        return km_total;
    }

    public int contadorVehiculo(){
        int contadorV= this.vehiculos.size();
        return contadorV;
    }

    public int contadorAuto(){
        int contadorA= 0;

        for(int i=0; i<this.vehiculos.size();i++){
            if (this.vehiculos.get(i) instanceof Auto){
                contadorA ++;
            }
            return contadorA;
        }
        return contadorA;
    }
    public int contadorMoto(){
        int contadorM= 0;

        for(int i=0; i<this.vehiculos.size();i++){
            if (this.vehiculos.get(i) instanceof Moto){
                contadorM ++;
            }
            return contadorM;
        }
        return contadorM;
    }
}
