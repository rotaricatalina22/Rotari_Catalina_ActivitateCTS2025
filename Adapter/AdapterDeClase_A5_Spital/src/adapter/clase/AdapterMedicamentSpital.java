package adapter.clase;
public class AdapterMedicamentSpital extends MedicamentSpital implements IMedicamentFarmacie{


    public AdapterMedicamentSpital(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
