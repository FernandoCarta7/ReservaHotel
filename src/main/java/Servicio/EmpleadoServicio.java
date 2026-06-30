package Servicio;

import entidades.Empleado;

import java.util.Scanner;
import java.util.Vector;

public class EmpleadoServicio {


    Scanner scanner = new Scanner(System.in);
    ValidacionServicio validacionServicio = new ValidacionServicio();

    //Crear empleado
    public Empleado crearEmpleado(){
        Empleado empleadoNuevo = null;

        String numeroIdentificacion = validacionServicio.validarNumeroIdentificacion();

        String nombreCompleto = validacionServicio.validarNombre();

        String telefono = validacionServicio.validarTelefono();

        String correo = validacionServicio.validarCorreo();

        System.out.println("Ingrese el cargo del empleado");
        String cargo = scanner.nextLine();

        double salario = validacionServicio.validarSalario();

        empleadoNuevo = new Empleado(
                numeroIdentificacion,
                nombreCompleto,
                telefono,
                correo,
                cargo,
                salario
                );

        return empleadoNuevo;
    }

    //Imprimir empleado
    public void imprimirEmpleado(Empleado empleado) {
        empleado.toString();
    }


    //Imprimir listado de huspedes
    public void imprimirEmpleado(Vector<Empleado> empleados){
        try {
            for ( int i = 0; i < empleados.size(); i++ ) {
                System.out.println( (i + 1) + " - " + empleados.get(i).toString());
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
    public Empleado buscarPorDocumento( Vector <Empleado> empleados, String documento) {

        int izquierda = 0;
        int derecha = empleados.size() - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            int comparacion = empleados.get(medio)
                    .getNumeroIdentificacion()
                    .compareTo(documento);

            if (comparacion == 0) {
                return empleados.get(medio);
            } else if (comparacion < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return null; // No encontrado
    }
    
}
