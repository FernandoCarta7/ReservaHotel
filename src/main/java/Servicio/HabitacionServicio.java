package Servicio;

import entidades.Habitacion;

import java.util.Scanner;

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
    public void imprimirHabitacion(Habitacion [] habitacions){
        try {
            for (int i = 0; i < habitacions.length; i++) {
                System.out.println(habitacions[i].toString());
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }


    /*
     *
     * ORDENAMIENTO DE HABITACIONES POR TIPO DE HABITACION
     *
     * */

    public void quickSortHabitaciones(Habitacion[] habitacions, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particionPorDocumento(habitacions, inicio, fin);

            quickSortHabitaciones(habitacions, inicio, pivote - 1);
            quickSortHabitaciones(habitacions, pivote + 1, fin);
        }
    }

    private int particionPorDocumento(Habitacion[] habitacions, int inicio, int fin) {
        String pivote = habitacions[fin].getTipo();
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (habitacions[j].getTipo().compareTo(pivote) <= 0) {
                i++;
                intercambiar(habitacions, i, j);
            }
        }

        intercambiar(habitacions, i + 1, fin);
        return i + 1;
    }

    private void intercambiar(Habitacion[] habitacions, int i, int j) {
        Habitacion temp = habitacions[i];
        habitacions[i] = habitacions[j];
        habitacions[j] = temp;
    }


    
}
