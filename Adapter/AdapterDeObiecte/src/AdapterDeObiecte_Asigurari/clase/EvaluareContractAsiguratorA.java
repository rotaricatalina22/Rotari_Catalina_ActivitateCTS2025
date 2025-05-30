package AdapterDeObiecte_Asigurari.clase;

public class EvaluareContractAsiguratorA implements IEvaluareContractAsiguratorA {
    @Override
    public void analizaContractA(int costTotalAchizitie) {
        System.out.println("Metoda analiza Contract de catre Firma A");
        double costAsigurare=0;
        costAsigurare=costTotalAchizitie*0.05;
        System.out.println("Costul aferent contractului este "+costAsigurare);
    }
}
