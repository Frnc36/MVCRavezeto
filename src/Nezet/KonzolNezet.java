package Nezet;

import Modell.Film;
import Modell.Filmek;

public class KonzolNezet {

    private Filmek modell;

    public KonzolNezet(Filmek modell) {
        this.modell = modell;
    }

    //gettere a Modellnek
    public void kiir() {
        for (Film film : modell.getFilmek()) {
            System.out.println(film);
        }
    }

}//class
