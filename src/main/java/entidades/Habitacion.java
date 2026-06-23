package entidades;

public class Habitacion {

    private short numeroHabitacion;
    private String tipo; //SENCILLA, DOBLE, SUITE
    private double precioNoche;
    private boolean estaDisponible;

    public Habitacion(short numeroHabitacion, String tipo, double precioNoche, boolean estaDisponible) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.estaDisponible = estaDisponible;
    }

    public short getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(short numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }
}
