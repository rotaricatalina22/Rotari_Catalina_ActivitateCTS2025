package strategy.clase;

public class CardCalatorie implements IMetodaPlata {
   private int numarCalorii;

    public CardCalatorie(int numarCalorii) {
        this.numarCalorii = numarCalorii;
    }

    @Override
    public void plateste(float pretBilet) {
        if(this.numarCalorii>0){
            this.numarCalorii--;
            System.out.println("Plata cu cardul de calatorii validata! "+this.numarCalorii+" calatorii ramase");
        }else {
            System.out.println("Eroare! Nu aveti calatorii ramase pe card");
        }
   }
}
