package FacadeRestaurant.clase;

public class Ospatar {
    public boolean esteAranjata(Masa masa){
        return masa.getNrMasa() % 4 == 0;
    }
}
