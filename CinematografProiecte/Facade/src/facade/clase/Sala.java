package facade.clase;

public class Sala {
    private String nume;

    public Sala(String nume) {
        this.nume = nume;
    }

    public void aprindeLumina(){
        System.out.println(" Se aprinde lumina in sala "+nume);
    }

    public void stingeLumina(){
        System.out.println(" Se stinge lumina in sala "+nume);
    }
    public void deschideUsa(){
        System.out.println("In sala "+nume+" se deschide usa");
    }

    public void inchideUsa(){
        System.out.println("In sala "+nume+" se inchide usa");
    }

}
