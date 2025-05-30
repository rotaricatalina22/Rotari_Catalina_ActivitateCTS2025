package composite.clase;
public class Film implements  INod{
    private String numeFilm;

    public Film(String numeFilm) {
        super();
        this.numeFilm = numeFilm;
    }

    @Override
    public void printeazaDescriere(String spaatii) {
        System.out.println(spaatii+ " Filmul: "+numeFilm);
    }

    @Override
    public void adaugaNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public INod getNod(int i) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(INod nod) {
        throw new UnsupportedOperationException();
    }
}
