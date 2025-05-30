package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        ANotificare SMS= new NotificareSms();
        ANotificare mail= new NotificareMail();
        ANotificare manager= new NotificareManager();

        SMS.setOperatiuaUrmatoare(mail);
        mail.setOperatiuaUrmatoare(manager);

        Client c1 = new Client("Ionescu", "07896547", "ion@gmail.com");
        Client c2= new Client("Popescu");
        c2.setMail("po@gmail.com");

        Client c3 = new Client("Avramescu");
        String mesaj1= " Aveti camera 123 ";
        String mesaj2= " Aveti camera 135 ";
        String mesaj3= " Aveti camera 103 ";

        SMS.notificare(c1,mesaj1);
        SMS.notificare(c2,mesaj2);
        SMS.notificare(c3,mesaj3);
    }
}
