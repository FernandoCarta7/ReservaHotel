package Servicio;

import entidades.*;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Vector;

public class ReservaServicio {

    HabitacionServicio habitacionServicio = new HabitacionServicio();
    Scanner scanner = new Scanner(System.in);


    public Reserva crearReserva(String[] idHuespedes, Vector<Habitacion> habitaciones){
        Reserva reserva = null;
        short numeroHabitacion = 0;
        Habitacion habitacion = null;
        habitaciones.sort((a,b) -> a.getNumeroHabitacion());
        System.out.println();

        do {
            System.out.println("Indique numero de habitacion: ");
            numeroHabitacion = scanner.nextShort();
            habitacion = habitacionServicio.buscarPorNumero(habitaciones, numeroHabitacion);
            habitacionServicio.imprimirHabitacion(habitaciones);
            if (habitacion == null) {
                System.out.println("No se encontro habitacion con numero: " + numeroHabitacion);
            }
        } while ( habitacion != null );



        return reserva;
    }

    public void imprimirReserva(Reserva reserva){
        System.out.println(reserva.toString());
    }

    public void imprimirReservas(Vector<Reserva> reservas) {
        for (int i = 0; i < reservas.size(); i++) {
            imprimirReserva(reservas.get(i));
        }
    }

    public String generarCodigoReserva(String tipoHabitacion, String idHuesped){
        String codigo = "";
        LocalDate fecha = LocalDate.now();

        codigo = tipoHabitacion.substring(0,3);
        codigo = codigo + fecha.getDayOfMonth() + fecha.getMonthValue() + fecha.getYear();
        codigo = codigo + idHuesped.substring(0,3);

        return codigo;
    }


    public Reserva buscarPorCodigo(Vector <Reserva> reservas, String codigoReserva) {

        int izquierda = 0;
        int derecha = reservas.size() - 1;
        String comparacion;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            comparacion = reservas.get(medio).getCodigoReserva();

            if (comparacion.compareTo(codigoReserva) == 0) {
                return reservas.get(medio);
            } else if (comparacion.compareTo(codigoReserva) < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return null; // No encontrado
    }

    public int buscarPorNumeroIndice(Vector <Reserva> reservas, String codigoReserva) {

        int izquierda = 0;
        int derecha = reservas.size() - 1;
        String comparacion;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            comparacion = reservas.get(medio).getCodigoReserva();

            if (comparacion.compareTo(codigoReserva) == 0 ) {
                return medio;
            } else if (comparacion.compareTo(codigoReserva) < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1; // No encontrado
    }
}
