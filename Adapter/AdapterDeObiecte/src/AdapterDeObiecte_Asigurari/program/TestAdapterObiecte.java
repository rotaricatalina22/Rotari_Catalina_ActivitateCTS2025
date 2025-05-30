package AdapterDeObiecte_Asigurari.program;


import AdapterDeObiecte_Asigurari.clase.AdaptorEvaluareContract;
import AdapterDeObiecte_Asigurari.clase.Contract;
import AdapterDeObiecte_Asigurari.clase.EvaluareContractAsiguratorA;

public class TestAdapterObiecte {
    public static void main(String[] args) {
        int[] costuriAchizitie = new int[]{1000, 2000, 20000, 1000, 5000};
        Contract contract = new Contract("XYX S.A.", 5, costuriAchizitie);

        EvaluareContractAsiguratorA evaluareAsiguratorA= new EvaluareContractAsiguratorA();
        AdaptorEvaluareContract evaluareContract=new AdaptorEvaluareContract(evaluareAsiguratorA);

        evaluareContract.analizaContractB(contract);
    }
}
