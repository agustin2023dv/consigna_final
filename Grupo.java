import java.util.ArrayList;


public class Grupo extends EtapaMundial{



    private ArrayList<Equipo> equiposGrupo;
    public Grupo() {
        this.equiposGrupo = new ArrayList<Equipo>();
    }

    public ArrayList<Equipo> getEquiposGrupo() {
        return equiposGrupo;
    }



    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return super.getEquiposQueAvanzan();
    }
}
