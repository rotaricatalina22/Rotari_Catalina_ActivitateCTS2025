package decorator.clase;

public abstract class AFilmImbunatatit  implements IFilm{
    private IFilm film;

    public void setFilm(IFilm film) {
        this.film = film;
    }

    public AFilmImbunatatit(IFilm film) {
        this.film = film;
    }

    public IFilm getFilm() {
        return film;
    }

    @Override
    public String getNumeFilm() {
        return film.getNumeFilm();
    }

    @Override
    public void pornesteFilm() {
        film.pornesteFilm();
    }

    @Override
    public void opresteFilm() {
        film.opresteFilm();
    }

    //metode noi adaugate
    public  abstract void pauza();
    public  abstract  void resume();
}
