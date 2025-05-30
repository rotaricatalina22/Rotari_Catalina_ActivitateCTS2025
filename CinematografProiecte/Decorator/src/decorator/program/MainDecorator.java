package decorator.program;


import decorator.clase.AFilmImbunatatit;
import decorator.clase.Film;
import decorator.clase.FilmImbunatatit;
import decorator.clase.IFilm;

public class MainDecorator {
    public static void main(String[] args) {
        IFilm film = new Film("Titanic");
        film.pornesteFilm();
        film.opresteFilm();

        AFilmImbunatatit filmImbunatatit = new FilmImbunatatit(film);
        filmImbunatatit.pornesteFilm();
        filmImbunatatit.pauza();
        filmImbunatatit.resume();
        filmImbunatatit.opresteFilm();
    }
}
