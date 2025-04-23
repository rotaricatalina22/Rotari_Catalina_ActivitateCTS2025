package ro.cts.clase;

public class EvaluareContractAsiguratorA implements IEvaluareaContractAsiguratorA {
    @Override
    public void analizaContractA(int costTotalAchixitii) {
        System.out.println("Metoda analiza Contract de catre Firma A");
        double costAsigurare =0;
        costAsigurare=costTotalAchixitii*0.05;
        System.out.println("Costul Aferent contractului este "+costAsigurare);
    }
}
