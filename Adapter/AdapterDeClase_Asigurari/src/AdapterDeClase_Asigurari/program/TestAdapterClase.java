package AdapterDeClase_Asigurari.program;

import AdapterDeClase_Asigurari.clase.AdaptorEvaluareContract;
import AdapterDeClase_Asigurari.clase.Contract;
import AdapterDeClase_Asigurari.clase.IEvaluareContractAsiguratorB;

public class TestAdapterClase {
    public static void main(String[] args) {
        int[] costuriAchizitie= new int[]{1000,2000,20000,1000,5000};
        Contract contract= new Contract("XYX S.A.", 5,costuriAchizitie);
        IEvaluareContractAsiguratorB evaluareContractB= new AdaptorEvaluareContract();
        evaluareContractB.analizaContractB(contract);
    }
}
