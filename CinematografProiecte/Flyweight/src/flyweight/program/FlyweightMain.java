package flyweight.program;

import flyweight.clase.FabricaDeFilme;
import flyweight.clase.Film;
import flyweight.clase.Sala;

public class FlyweightMain {
    public static void main(String[] args) {
        FabricaDeFilme fabrica = new FabricaDeFilme();

        Sala sala1= new Sala(1);
        Sala sala2= new Sala(2);
        Sala sala3= new Sala(3);
        Sala sala4= new Sala(4);

        fabrica.getFilm("Titanic").ruleazaFilm(sala1);
        fabrica.getFilm("Titanic").ruleazaFilm(sala2);
        System.out.println("In lista exista: "+fabrica.dimensiuneListaFilme()+" filme");


        fabrica.getFilm("Ursul").ruleazaFilm(sala3);
        fabrica.getFilm("Ursul").ruleazaFilm(sala4);
        System.out.println("In lista exista: "+fabrica.dimensiuneListaFilme()+" filme");
    }

}
