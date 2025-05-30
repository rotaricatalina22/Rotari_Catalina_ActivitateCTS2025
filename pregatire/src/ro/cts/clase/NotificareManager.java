package ro.cts.clase;

public class NotificareManager extends ANotificare{
    @Override
    public void notificare(Client client, String mesaj) {
        System.out.println(client.getNume()+" Hotelul nu are acest contact");
    }
}
