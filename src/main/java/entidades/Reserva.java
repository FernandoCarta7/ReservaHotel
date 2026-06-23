package entidades;

import java.time.LocalDate;

public class Reserva {

    private String codigoReserva;
    private Huesped [] huespedes;
    private Habitacion habitacion;
    private LocalDate fechaIngreso;
    private int cantidadNoches;

    public Reserva(String codigoReserva, Huesped[] huespedes, Habitacion habitacion, LocalDate fechaIngreso, int cantidadNoches) {
        this.codigoReserva = codigoReserva;
        this.huespedes = huespedes;
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

    public Huesped[] getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(Huesped[] huespedes) {
        this.huespedes = huespedes;
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
}
