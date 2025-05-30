package AdapterCinematograf.program;

import AdapterCinematograf.clase.Film;
import AdapterCinematograf.clase.IFilm;
import AdapterCinematograf.clase.PeliculaAdaptata;

public class Adapter {
    public static void ruleazaFilm(IFilm film){
        film.pornesteFilm();
        film.opresteFilm();
    }

    public static void main(String[] args) {
        IFilm film = new Film("Ursul");
        IFilm pelicula= new PeliculaAdaptata("Apele tac");
        ruleazaFilm(film);
        ruleazaFilm(pelicula);
    }
}
