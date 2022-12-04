import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Partido> partidosJugados;

    private int puntajeEtapaGrupo;

    public Equipo(String nombre){
        this.nombre = nombre;
        this.partidosJugados = new ArrayList<Partido>();
        this.puntajeEtapaGrupo = 0;
    }

    public Equipo(String nombre, ArrayList<Partido> partidosJugados) {
        this.nombre = nombre;
        this.partidosJugados = partidosJugados;
        this.puntajeEtapaGrupo = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void ganaPartido(){
        this.puntajeEtapaGrupo += 3;
    }
    public void empataPartido(){
        this.puntajeEtapaGrupo += 1;
    }
    public void addPartidoJugado(Partido partido){
        this.partidosJugados.add(partido);
    }


    public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPuntajeEtapaGrupo() {
        return puntajeEtapaGrupo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
