package ro.cts.clase;

public class Contract {
    private String numeFirma;
    private int nrMasini;
    private int[] costAchozotie;

    public Contract(String numeFirma, int nrMasini, int[] costAchozotie) {
        this.numeFirma = numeFirma;
        this.nrMasini = nrMasini;
        this.costAchozotie = costAchozotie;
    }

    public String getNumeFirma() {
        return numeFirma;
    }

    public int getNrMasini() {
        return nrMasini;
    }

    public int[] getCostAchozotie() {
        return costAchozotie;
    }
}

