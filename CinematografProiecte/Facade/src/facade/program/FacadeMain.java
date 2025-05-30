package facade.program;

import facade.clase.Cinematograf;

public class FacadeMain {
    public static void main(String[] args) {
        Cinematograf cinematograf= new Cinematograf();
        cinematograf.difuzareFilmInSala("Sergiu Nicolaescu","Titanic");
    }
}
