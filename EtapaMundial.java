import java.util.ArrayList;

public class EtapaMundial{

    private String descripcionEtapa;
    private ArrayList<Partido> partidos;
    private ArrayList<Equipo> equiposQueAvanzan;

    public EtapaMundial() {
        super();
        this.partidos= new ArrayList<Partido>();
        this.equiposQueAvanzan = new ArrayList<Equipo>();

    }

    public EtapaMundial(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
        this.partidos= new ArrayList<Partido>();
        this.equiposQueAvanzan = new ArrayList<Equipo>();
    }

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    @Override
    public String toString() {
        return "EtapaMundial [descripcionEtapa=" + descripcionEtapa + ", partidos=" + partidos + "]";
    }

    public void addPartido(Partido partido) {
        this.partidos.add(partido);
    }

    public void addEquipoQueAvanza(Equipo equipo){
        this.equiposQueAvanzan.add(equipo);
    }
    public ArrayList<Equipo> getEquiposQueAvanzan(){

        return equiposQueAvanzan;
    }

}
