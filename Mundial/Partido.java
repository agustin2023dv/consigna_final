package Mundial;

import Mundial.Equipo;

import java.util.Date;

public class Partido {

    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;

    public Partido(Date fecha, Equipo local, Equipo visitante) {
        super();
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;


    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante)
    {
        this.visitante = visitante;
    }

    public Resultado getResultado()
    {
        return resultado;
    }

    public void setResultado(Resultado resultado)
    {
        this.resultado = resultado;
        this.local.addPartidoJugado(this);
        this.visitante.addPartidoJugado(this);

        if(this.getResultado().ganoLocal()){
            this.local.ganaPartido();
        }
        else if(this.getResultado().empate()){
            this.local.empataPartido();
            this.visitante.empataPartido();
        }
        else{
            this.visitante.ganaPartido();
        }

    }

    @Override
    public String toString() {
        return "Mundial.Partido [fecha=" + this.getFecha() + ", local=" + local.getNombre() + ", visitante=" + visitante.getNombre() + ", resultado=" + resultado.getGolesLocal()
                +"-"+ resultado.getGolesVisitante()+ "]";
    }



}