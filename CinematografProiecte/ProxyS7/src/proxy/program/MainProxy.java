package proxy.program;

import proxy.clase.IRezervare;
import proxy.clase.ProxyNumeClient;
import proxy.clase.Rezervare;
import proxy.clase.RezervareProxy;

public class MainProxy {
    public static void main(String[] args) {
        IRezervare rezervare= new Rezervare();
        IRezervare proxy= new RezervareProxy(rezervare);
        proxy.reaizaeazaRezervare("Mihai Popescu", 2);
        proxy.reaizaeazaRezervare("Ana Banica", 5);

        IRezervare proxyCompus = new ProxyNumeClient(proxy);
        proxyCompus.reaizaeazaRezervare("Pop Irina",2);
        proxyCompus.reaizaeazaRezervare("Pop", 5);
        proxyCompus.reaizaeazaRezervare("Pop Irina", 5);
    }
}
