package ro.cts.clase;

public class NotificareSms extends  ANotificare{

    @Override
    public void notificare(Client client, String mesaj) {
        if(client.getNr_telefon()!=null)
            System.out.println(client.getNume()+" ai un sms cu mesajul "+mesaj);
        else
            super.operatiaUrmatoare.notificare(client,mesaj);
    }
}
