package entidades;

import java.time.LocalDate;
import java.util.Arrays;

public class Reserva {

    private String codigoReserva;
    private String [] idHuespedes;
    private Habitacion habitacion;
    private LocalDate fechaIngreso;
    private int cantidadNoches;


    public Reserva(String codigoReserva, String[] idHuespedes, Habitacion habitacion, LocalDate fechaIngreso, int cantidadNoches) {
        this.codigoReserva = codigoReserva;
        this.idHuespedes = idHuespedes;
        this.habitacion = habitacion;
        this.fechaIngreso = fechaIngreso;
        this.cantidadNoches = cantidadNoches;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String[] getIdHuespedes() {
        return idHuespedes;
    }

    public void setIdHuespedes(String[] idHuespedes) {
        this.idHuespedes = idHuespedes;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getCantidadNoches() {
        return cantidadNoches;
    }

    public void setCantidadNoches(int cantidadNoches) {
        this.cantidadNoches = cantidadNoches;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "codigoReserva='" + codigoReserva + '\'' +
                ", idHuespedes=" + Arrays.toString(idHuespedes) +
                ", habitacion=" + habitacion +
                ", fechaIngreso=" + fechaIngreso +
                ", cantidadNoches=" + cantidadNoches +
                '}';
    }
}
