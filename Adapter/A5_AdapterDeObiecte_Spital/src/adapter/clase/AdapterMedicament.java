package adapter.clase;

public class AdapterMedicament extends MedicamentFarmacie {


    private MedicamentSpital medicament;

    public AdapterMedicament(String denumire, float pret, boolean esteInStoc) {
        super(denumire, pret, esteInStoc);
    }

    public AdapterMedicament( MedicamentSpital medicament) {
        super(medicament.getDenumire(), medicament.getPret(), true);
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament() {
        medicament.achizitioneazaMedicament();
    }
}
