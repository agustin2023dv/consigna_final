import Mundial.*;
import SistemaGarage.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Equipo argentina = new Equipo("Argentina");
        Equipo mexico = new Equipo("Mexico");
        Equipo polonia = new Equipo("Polonia");
        Equipo arabia = new Equipo("Arabia");

        Equipo francia = new Equipo("Francia");
        Equipo holanda = new Equipo("Holanda");
        Equipo italia = new Equipo("Italia");
        Equipo uruguay = new Equipo("Uruguay");

        Equipo camerun = new Equipo("Camerun");
        Equipo rusia = new Equipo("Rusia");
        Equipo brasil = new Equipo("Brasil");
        Equipo eeuu = new Equipo("EEUU");

        Equipo canada = new Equipo("Canada");

        Partido p1G1 = new Partido(new Date(2022, 10, 10), argentina, arabia);
        Partido p2G1 = new Partido(new Date(2022, 10, 9), argentina, polonia);
        Partido p3G1 = new Partido(new Date(2022, 10, 8), argentina, mexico);
        Partido p4G1 = new Partido(new Date(2022,10,7),mexico,polonia);
        Partido p5G1 = new Partido(new Date(2022,10,7),arabia,polonia);
        Partido p6G1 = new Partido(new Date(2022,10,11),mexico,arabia);


        Resultado rP1G1 = new Resultado(2,0);
        Resultado rP2G1 = new Resultado(3,2);
        Resultado rP3G1 = new Resultado(3,2);
        Resultado rP4G1 = new Resultado(0,0);
        Resultado rP5G1 = new Resultado(3,4);
        Resultado rP6G1 = new Resultado(3,8);

        p1G1.setResultado(rP1G1);
        p2G1.setResultado(rP2G1);
        p3G1.setResultado(rP3G1);
        p4G1.setResultado(rP4G1);
        p5G1.setResultado(rP5G1);
        p6G1.setResultado(rP6G1);


        Grupo g1 = new Grupo();
        Grupo g2 = new Grupo();
        Grupo g3 = new Grupo();
        Grupo g4 = new Grupo();
        Grupo g5 = new Grupo();
        Grupo g6 = new Grupo();
        Grupo g7 = new Grupo();
        Grupo g8 = new Grupo();

        g1.addPartido(p1G1);
        g1.addPartido(p2G1);
        g1.addPartido(p3G1);
        g1.addPartido(p4G1);
        g1.addPartido(p5G1);
        g1.addPartido(p6G1);



        g1.addEquipoQueAvanza(arabia);
        g1.addEquipoQueAvanza(argentina);

        System.out.print(g1.getEquiposQueAvanzan());


        Llave lOctavos = new Llave("Octavos de final del toreno");
        Llave lCuartos = new Llave("Cuartos de final del torneo");
        Llave lSemis = new Llave("Semifinales del torneo");
        Llave lFinal = new Llave("Etapa final del torneo");










    }
}
