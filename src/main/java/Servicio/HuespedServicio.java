package Servicio;

import entidades.Huesped;

import java.util.Scanner;
import java.util.Vector;

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
    public void imprimirHuesped(Vector<Huesped> huespedes){
        try {
            for (int i = 0; i < huespedes.size(); i++) {
                System.out.println( (i + 1) + " - " + huespedes.get(i).toString());
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
    /*
    *
    *
    *             BUSCAR POR DOCUMENTO, PRIMERO SE DEBE DE ORDERNAR EL
    *                          VECTOR DE HUESPEDES
    *
    *
    * */
    public Huesped buscarPorDocumento(Vector<Huesped> huespedes, String documento) {

        int izquierda = 0;
        int derecha = huespedes.size() - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            int comparacion = huespedes.get(medio)
                    .getNumeroIdentificacion()
                    .compareTo(documento);

            if (comparacion == 0) {
                return huespedes.get(medio);
            } else if (comparacion < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return null; // No encontrado
    }

    public Huesped actualizarHuesped ( Huesped huespedActualizar ){
        String numeroIdentificacion = huespedActualizar.getNumeroIdentificacion();
        System.out.println("Actualizar candidato con documento: " + numeroIdentificacion);

        String nombreCompleto = validacionServicio.validarNombre();

        String telefono = validacionServicio.validarTelefono();

        String correo = validacionServicio.validarCorreo();

        huespedActualizar = new Huesped(
                numeroIdentificacion,
                nombreCompleto,
                telefono,
                correo,
                false);

        return huespedActualizar;
    }


}
