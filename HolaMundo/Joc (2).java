package Principal;

import Partida.*;

public class Joc {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Jugador 1");
        Jugador j2 = new Jugador("Jugador 2");

        Tirada t = new Tirada();

        String guanyador="";

        while (true) {
            if (j1.haGuanyat(t)) {
                guanyador = j1.getNom();
            }
            if (j2.haGuanyat(t)) {
                guanyador = j2.getNom();
            }
            if (j1.haGuanyat() || j2.haGuanyat()){
                break;
            }
        }

        if (j1.haGuanyat() && j2.haGuanyat()){
            if (j1.getPosicio() == j2.getPosicio())
                guanyador= j1.getNom() + " i " +j2.getNom();
            else
                if (j1.getPosicio() > j2.getPosicio()) guanyador = j2.getNom();
                else guanyador= j1.getNom();
        }

        System.out.println("Ha guanyat "+ guanyador +". Final de la partida.");
    }
}
