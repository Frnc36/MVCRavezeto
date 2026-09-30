package app;

import java.util.ArrayList;
import java.util.List;


public class MVC_Program {

    public static void main(String[] args) {

        Filmek filmek = new Filmek();
        List<Film> modFilmek = filmek.getFilmek();
        for (Film film : modFilmek) {
            System.out.println(film);
        }
        
        modFilmek.add(new Film("Null"));
                
        
        List<Film> eFilmek = filmek.getFilmek();
        for (Film film : eFilmek) {
            System.out.println(film);
        }
        
    }//main

}//class
