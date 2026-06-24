package Servicio;

import entidades.Huesped;

import java.util.Scanner;

public class HuespedServicio {

    Scanner scanner = new Scanner(System.in);
    ValidacionServicio validacionServicio = new ValidacionServicio();

    //Crear huesped
    public Huesped crearHuesped(){
        Huesped huespedNuevo = null;

        String numeroIdentificacion = validacionServicio.validarNumeroIdentificacion();

        String nombreCompleto = validacionServicio.validarNombre();

        String telefono = validacionServicio.validarTelefono();

        String correo = validacionServicio.validarCorreo();

        huespedNuevo = new Huesped(
                numeroIdentificacion,
                nombreCompleto,
                telefono,
                correo,
                false);

        return huespedNuevo;
    }

    //Imprimir huesped
    public void imprimirHuesped(Huesped huesped) {
       huesped.toString();
    }


    //Imprimir listado de huspedes
    public void imprimirHuesped(Huesped [] huespedes){
        try {
            for (int i = 0; i < huespedes.length; i++) {
                System.out.println(huespedes[i].toString());
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }


    /*
    *
    * ORDENAMIENTO DE HUESPEDES POR NUMERO DE DOCUMENTO
    *
    * */

    public static void quickSortHuespedes(Huesped[] huespedes, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particionPorDocumento(huespedes, inicio, fin);

            quickSortHuespedes(huespedes, inicio, pivote - 1);
            quickSortHuespedes(huespedes, pivote + 1, fin);
        }
    }

    private static int particionPorDocumento(Huesped[] huespedes, int inicio, int fin) {
        String pivote = huespedes[fin].getNumeroIdentificacion();
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (huespedes[j].getNumeroIdentificacion().compareTo(pivote) <= 0) {
                i++;
                intercambiar(huespedes, i, j);
            }
        }

        intercambiar(huespedes, i + 1, fin);
        return i + 1;
    }

    private static void intercambiar(Huesped[] huespedes, int i, int j) {
        Huesped temp = huespedes[i];
        huespedes[i] = huespedes[j];
        huespedes[j] = temp;
    }

    /*
    *
    *
    *             BUSCAR POR DOCUMENTO, PRIMERO SE DEBE DE ORDERNAR EL
    *                          VECTOR DE HUESPEDES
    *
    *
    * */
    public Huesped buscarPorDocumento(Huesped[] huespedes, String documento) {

        int izquierda = 0;
        int derecha = huespedes.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            int comparacion = huespedes[medio]
                    .getNumeroIdentificacion()
                    .compareTo(documento);

            if (comparacion == 0) {
                return huespedes[medio];
            } else if (comparacion < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return null; // No encontrado
    }



}
