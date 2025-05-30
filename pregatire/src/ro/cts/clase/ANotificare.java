package ro.cts.clase;

public abstract class ANotificare {
    protected ANotificare operatiaUrmatoare;

    public void setOperatiuaUrmatoare(ANotificare operatia) {
        this.operatiaUrmatoare = operatia;
    }

    public abstract void notificare(Client client, String mesaj);
}
