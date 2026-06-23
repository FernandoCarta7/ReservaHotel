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






}
