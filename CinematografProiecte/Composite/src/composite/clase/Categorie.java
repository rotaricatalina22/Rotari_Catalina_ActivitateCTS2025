package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements INod{
    List<INod> subNoduri = new ArrayList<>();
    private  String numeCategorie;

    public Categorie(String numeCategorie) {
        super();
        this.numeCategorie = numeCategorie;
    }


    @Override
    public void printeazaDescriere(String spaatii) {
        System.out.println(spaatii+" Categorie "+numeCategorie+" contine: ");
        for(INod nod: subNoduri)
            nod.printeazaDescriere(spaatii+" ");
    }

    @Override
    public void adaugaNod(INod nod) {
        subNoduri.add(nod);
    }

    @Override
    public INod getNod(int i) {
        return subNoduri.get(i);
    }

    @Override
    public void stergeNod(INod nod) {
        subNoduri.remove(nod);
    }
}
