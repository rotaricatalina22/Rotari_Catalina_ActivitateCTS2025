package proxy.clase;

public class Rezervare implements IRezervare{
    @Override
    public void reaizaeazaRezervare(String numeClient, int numarPersoane) {
        System.out.println("Rezervare realizata pentru "+numeClient+" - "+ numarPersoane+" persoane");
    }
}
