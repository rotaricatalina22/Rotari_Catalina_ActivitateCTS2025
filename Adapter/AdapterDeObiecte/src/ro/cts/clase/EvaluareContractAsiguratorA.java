package ro.cts.clase;

public class EvaluareContractAsiguratorA implements IEvaluareContractAsiguatorA{
    @Override
    public void analizaContractA(int costTotalAchizitii) {
        System.out.println("Metoda anliza Contract de catre Firma A");
        double costAsigurare=0;
        costAsigurare=costTotalAchizitii*0.05;
        System.out.println("Costul Aferent contractului este"+costAsigurare);

    }
}
