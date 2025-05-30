package flyweight.clase;

public class Sala {
    private int numarSala;

    public int getNumarSala() {
        return numarSala;
    }

    public void setNumarSala(int numarSala) {
        this.numarSala = numarSala;
    }

    public Sala(int numarSala) {
        this.numarSala = numarSala;
    }

    public Sala() {
        this.numarSala=8;
    }

    @Override
    public String toString() {
        return "Sala [numarSala="+numarSala+"]";
    }
}
