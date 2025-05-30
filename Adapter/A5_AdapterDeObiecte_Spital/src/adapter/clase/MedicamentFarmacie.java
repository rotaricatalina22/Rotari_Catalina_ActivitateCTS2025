package adapter.clase;

public class MedicamentFarmacie {
    private String denumire;
    private float pret;
    private boolean esteInStoc;

    public MedicamentFarmacie(String denumire, float pret, boolean esteInStoc) {
        this.denumire = denumire;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
    }

    public void cumparaMedicament(){
        if(esteInStoc){
            System.out.println("se cumpara medicamentul "+denumire+" la pretul "+pret+" RON");
        }
        else {
            System.out.println("Medicamentul "+denumire+" nu este in stocul Farmaciei");
        }
    }
}
