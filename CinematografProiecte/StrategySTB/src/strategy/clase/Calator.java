package strategy.clase;

public class Calator {
    private String nume;
    private IMetodaPlata metodaPlata;

    public Calator(String nume) {
        this.nume = nume;
        this.metodaPlata= new CardCalatorie(10);
    }

    public Calator(IMetodaPlata metodaPlata, String nume) {
        this.metodaPlata = metodaPlata;
        this.nume = nume;
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteCalatorie(float pretBilet){
        metodaPlata.plateste(pretBilet);
    }
}
