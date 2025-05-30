package strategy.program;

import strategy.clase.Calator;
import strategy.clase.CardCalatorie;
import strategy.clase.IMetodaPlata;
import strategy.clase.PlataSMS;

public class MainStrategy {
    public static void main(String[] args) {
        IMetodaPlata cardCalatorii= new CardCalatorie(2);
        IMetodaPlata plataSMS= new PlataSMS();

        Calator calator= new Calator("Maria");
        calator.platesteCalatorie(3);

        calator.setMetodaPlata(cardCalatorii);
        calator.platesteCalatorie(3);
        calator.platesteCalatorie(3);
        calator.platesteCalatorie(3);

        calator.setMetodaPlata(plataSMS);
        calator.platesteCalatorie(3);
    }
}
