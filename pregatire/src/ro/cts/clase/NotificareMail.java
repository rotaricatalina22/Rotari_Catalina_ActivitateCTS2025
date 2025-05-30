package ro.cts.clase;

public class NotificareMail extends ANotificare{
    @Override
    public void notificare(Client client, String mesaj) {
        if(client.getMail()!=null)
            System.out.println(client.getNume()+" ai un mail cu mesajul "+mesaj);
        else
            super.operatiaUrmatoare.notificare(client,mesaj);
    }
}
