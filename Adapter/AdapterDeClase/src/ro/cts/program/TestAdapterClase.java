package ro.cts.program;

import ro.cts.clase.AdaptorEvaluareContract;
import ro.cts.clase.Contract;
import ro.cts.clase.IEvaluareContractAsiguratorB;

public class TestAdapterClase {
    public static void main(String[] args) {
        int[] costuriAchizitii=new int[]{1000,2000,20000,1000,5000};
        Contract contract=new Contract("XYZ S.A.",5,costuriAchizitii);

        IEvaluareContractAsiguratorB evaluareContractB = new AdaptorEvaluareContract();
        evaluareContractB.analizaContractB(contract);
    }
}
