package entidades;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class Reserva {

    private String codigoReserva;
    private Vector<Huesped> huespedes;
    private Habitacion habitacion;
    private LocalDate fechaIngreso;
    private int cantidadNoches;


    public Reserva( Vector<Huesped> huespedes, Habitacion habitacion, LocalDate fechaIngreso, int cantidadNoches) {
        this.codigoReserva = generarCodigoReserva();
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

    public Vector<Huesped> getIdHuespedes() {
        return huespedes;
    }

    public void setIdHuespedes(Vector<Huesped> huespedes) {
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

    @Override
    public String toString() {
        return "Reserva{" +
                "codigoReserva='" + codigoReserva + '\'' +
                ", habitacion=" + habitacion +
                ", fechaIngreso=" + fechaIngreso +
                ", cantidadNoches=" + cantidadNoches +
                '}';
    }



    public String generarCodigoReserva(){
        String codigo = "";
        Random random = new Random();
        char[] letras = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };
        for (int i = 0; i < 10; i++) codigo += letras[random.nextInt(0, letras.length - 1)];


        return codigo;
    }
}
