package facade.clase;

public class Cinematograf {
    private Film film;
    private Sala sala;
    private Public publicul;

    public Cinematograf() {
    }

    public void difuzareFilmInSala(String numeSala, String numeFilm){
        sala= new Sala(numeSala);
        publicul= new Public(3);
        film=new Film(numeFilm);
        sala.deschideUsa();
        sala.aprindeLumina();
        publicul.publiculIntraInSala();
        sala.inchideUsa();
        sala.stingeLumina();
        film.play();

    }
}
