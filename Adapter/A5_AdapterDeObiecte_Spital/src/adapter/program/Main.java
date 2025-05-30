package adapter.program;

import adapter.clase.AdapterMedicament;
import adapter.clase.MedicamentFarmacie;
import adapter.clase.MedicamentSpital;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        System.out.println("/nFarmacia noastra va ofera medicamentul: ");
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie1= new MedicamentFarmacie("Paracetamol",12.23f, true);
        MedicamentFarmacie medicamentFarmacie2= new MedicamentFarmacie("Parasinus",13.21f,true);

        vindeMedicament(medicamentFarmacie1);
        vindeMedicament(medicamentFarmacie2);

        MedicamentSpital medicamentSpital1= new MedicamentSpital("Advil",23.23f);
        MedicamentSpital medicamentSpital2= new MedicamentSpital("Aspirina",14.24f);
        vindeMedicament( new AdapterMedicament(medicamentSpital1));
        vindeMedicament(new AdapterMedicament(medicamentSpital2));

    }

}
