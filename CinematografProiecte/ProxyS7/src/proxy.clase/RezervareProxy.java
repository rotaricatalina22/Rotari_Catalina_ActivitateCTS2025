package proxy.clase;

public class RezervareProxy implements IRezervare{
   private IRezervare rezervare;

    public RezervareProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void reaizaeazaRezervare(String numeClient, int numarPersoane) {
        if(numarPersoane>=4){
            rezervare.reaizaeazaRezervare(numeClient,numarPersoane);
        }
        else {
            System.out.println("Nu este nevoie de rezervare!");
        }
    }
}
