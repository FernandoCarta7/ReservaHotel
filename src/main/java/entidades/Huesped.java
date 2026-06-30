package entidades;

public class Huesped extends Persona {

    private boolean isVIP;

    public Huesped(boolean isVIP) {
        this.isVIP = isVIP;
    }

    public Huesped(String numeroIdentificacion, String nombreCompleto, String telefono, String correo, boolean isVIP) {
        super(numeroIdentificacion, nombreCompleto, telefono, correo);
        this.isVIP = isVIP;
    }

    public boolean isVIP() {
        return isVIP;
    }


    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }

    @Override
    public String toString() {
        return "Huesped{" +
                "isVIP=" + isVIP +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
