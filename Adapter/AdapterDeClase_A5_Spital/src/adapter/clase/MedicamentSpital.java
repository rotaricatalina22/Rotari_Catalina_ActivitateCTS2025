package adapter.clase;
public class MedicamentSpital {
    private String denumire;
    private float pret;

    public MedicamentSpital(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public void prezintaReteta(){
        System.out.println("Reteta pentru medicamentul "+denumire);
    }
    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("Medicament achizitionat la pretul "+pret+" RON");
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPret() {
        return pret;
    }
}
