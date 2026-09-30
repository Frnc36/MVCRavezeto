package app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Filmek {

    private final ArrayList<Film> filmek;

    public Filmek() {
        filmek = new ArrayList<>();

        Film film1 = new Film("A keresztapa", "Francis Ford Coppola", 1972, 175);
        Film film2 = new Film("Eredet", "Christopher Nolan", 2010, 148);
        Film film3 = new Film("Pulp Fiction", "Quentin Tarantino", 1994, 154);

        Film[] filmek = {film1, film2, film3};
        for (Film film : filmek) {
            felvesz(film);
        }
    }

    private void felvesz(Film film) {
        filmek.add(film);
    }

//    public List<Film> getFilmek() {
//        return Collections.unmodifiableList(filmek);
//    }
    
    public List<Film> getFilmek() {
        List<Film> masolat = new ArrayList<>(filmek);
        return masolat;
    }

}//class
