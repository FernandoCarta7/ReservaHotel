package entidades;

public class Habitacion {

    private short numeroHabitacion = 1;
    private String tipo; //SENCILLA, DOBLE, SUITE
    private double precioNoche;
    private boolean estaDisponible;
    private final double precioSencilla = 75900.00;
    private final double precioDoble = 124500.00;
    private final double precioSuite = 318700.00;


    public Habitacion( String tipo, boolean estaDisponible) {
        this.numeroHabitacion = (short) (this.numeroHabitacion + 1);
        this.tipo = tipo;

        switch ( tipo ) {

            case "SENCILLA" :
                this.precioNoche = precioSencilla;
                break;

            case "DOBLE" :
                this.precioNoche = precioDoble;
                break;
            case "SUITE" :
                this.precioNoche = precioSuite;
                break;
        }


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

    @Override
    public String toString() {
        return "Habitacion{" +
                "numeroHabitacion=" + numeroHabitacion +
                ", tipo='" + tipo + '\'' +
                ", precioNoche=" + precioNoche +
                ", estaDisponible=" + estaDisponible +
                '}';
    }
}
