package adapter.program;

import adapter.clase.AdapterMedicamentSpital;
import adapter.clase.Farmacie;
import adapter.clase.IMedicamentFarmacie;
import adapter.clase.MedicamentFarmacie;

public class MainAdapter {
    public static void main(String[] args) {

        Farmacie farmacie= new Farmacie(" Catena");
        IMedicamentFarmacie medicamentFarmacie= new MedicamentFarmacie("Advil",12.34f, true);
        medicamentFarmacie.cumparaMedicament();

        AdapterMedicamentSpital adapter = new AdapterMedicamentSpital("Paracetamol",12.12f);
        farmacie.vindeMedicament(adapter);
        adapter.achizitioneazaMedicament();
    }
}
