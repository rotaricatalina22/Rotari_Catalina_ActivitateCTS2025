package proxy.clase;

public class ProxyNumeClient implements IRezervare {
    private IRezervare rezervare;

    public ProxyNumeClient(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void reaizaeazaRezervare(String numeClient, int numarPersoane) {
        if(numeClient.length()>5){
            this.rezervare.reaizaeazaRezervare(numeClient, numarPersoane);
        }
        else
        {
            System.out.println("Nu va este permisa rezervarea");
        }
    }
}
