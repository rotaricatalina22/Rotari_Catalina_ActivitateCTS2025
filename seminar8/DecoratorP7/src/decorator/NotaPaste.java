package decorator;

import models.Nota;

public class NotaPaste extends NotaDecorata{
    public NotaPaste(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Paste fericit!");
    }
}
