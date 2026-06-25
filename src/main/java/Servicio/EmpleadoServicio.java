package Servicio;

import entidades.Empleado;

import java.util.Scanner;

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
    public void imprimirEmpleado(Empleado [] empleados){
        try {
            for (int i = 0; i < empleados.length; i++) {
                System.out.println(empleados[i].toString());
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

    public void quickSortEmpleadoes(Empleado[] empleados, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particionPorDocumento(empleados, inicio, fin);

            quickSortEmpleadoes(empleados, inicio, pivote - 1);
            quickSortEmpleadoes(empleados, pivote + 1, fin);
        }
    }

    private int particionPorDocumento(Empleado[] empleados, int inicio, int fin) {
        String pivote = empleados[fin].getNumeroIdentificacion();
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (empleados[j].getNumeroIdentificacion().compareTo(pivote) <= 0) {
                i++;
                intercambiar(empleados, i, j);
            }
        }

        intercambiar(empleados, i + 1, fin);
        return i + 1;
    }

    private void intercambiar(Empleado[] empleados, int i, int j) {
        Empleado temp = empleados[i];
        empleados[i] = empleados[j];
        empleados[j] = temp;
    }

    /*
     *
     *
     *             BUSCAR POR DOCUMENTO, PRIMERO SE DEBE DE ORDERNAR EL
     *                          VECTOR DE HUESPEDES
     *
     *
     * */
    public Empleado buscarPorDocumento(Empleado[] empleados, String documento) {

        int izquierda = 0;
        int derecha = empleados.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            int comparacion = empleados[medio]
                    .getNumeroIdentificacion()
                    .compareTo(documento);

            if (comparacion == 0) {
                return empleados[medio];
            } else if (comparacion < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return null; // No encontrado
    }

    public Empleado actualizarEmpleado ( Empleado empleadoActualizar ){
        String numeroIdentificacion = empleadoActualizar.getNumeroIdentificacion();
        System.out.println("Actualizar candidato con documento: " + numeroIdentificacion);

        String nombreCompleto = validacionServicio.validarNombre();

        String telefono = validacionServicio.validarTelefono();

        String correo = validacionServicio.validarCorreo();

        System.out.println("Ingrese el cargo para el empleado");
        String cargo = scanner.nextLine();

        double salario = validacionServicio.validarSalario();

        empleadoActualizar = new Empleado(
                numeroIdentificacion,
                nombreCompleto,
                telefono,
                correo,
                cargo,
                salario);

        return empleadoActualizar;
    }
    
    
    
    
    
    
    
    
}
