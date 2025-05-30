package ro.cts.clase;

public class Client {
    private String nume;
    private String nr_telefon;
    private String mail;

    public Client(String nume, String nr_telefon, String mail) {
        this.nume = nume;
        this.nr_telefon = nr_telefon;
        this.mail = mail;
    }

    public Client(String nume) {
        super();
        this.nume = nume;
        this.nr_telefon=null;
        this.mail=null;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNr_telefon() {
        return nr_telefon;
    }

    public void setNr_telefon(String nr_telefon) {
        this.nr_telefon = nr_telefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
