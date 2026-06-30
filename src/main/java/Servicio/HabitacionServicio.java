package Servicio;

import entidades.Empleado;
import entidades.Habitacion;

import java.util.Scanner;
import java.util.Vector;

public class HabitacionServicio {

    Scanner scanner = new Scanner(System.in);
    ValidacionServicio validacionServicio = new ValidacionServicio();

    //Crear habitacion
    public Habitacion crearHabitacion(){
        Habitacion habitacionNueva = null;
        String tipoHabitacion = validacionServicio.validarTipoHabitacion();
        boolean estaDisponible = true;

        habitacionNueva = new Habitacion(tipoHabitacion, estaDisponible);


        return habitacionNueva;
    }

    //Imprimir habitacion
    public void imprimirHabitacion(Habitacion habitacion) {
        habitacion.toString();
    }


    //Imprimir listado de huspedes
    public void imprimirHabitacion(Vector<Habitacion> habitaciones){
        try {
            for (Habitacion habitacion : habitaciones) {
                System.out.println(habitacion.toString());
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }


    public Habitacion buscarPorNumero(Vector <Habitacion> habitaciones, short numeroHabitacion) {

        int izquierda = 0;
        int derecha = habitaciones.size() - 1;
        short comparacion;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            comparacion = habitaciones.get(medio).getNumeroHabitacion();

            if (comparacion == numeroHabitacion) {
                return habitaciones.get(medio);
            } else if (comparacion < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return null; // No encontrado
    }
    
}
