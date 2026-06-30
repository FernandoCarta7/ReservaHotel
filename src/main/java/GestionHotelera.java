import Servicio.EmpleadoServicio;
import Servicio.HabitacionServicio;
import Servicio.HuespedServicio;
import Servicio.ValidacionServicio;
import entidades.Empleado;
import entidades.Habitacion;
import entidades.Huesped;

public static void main() {
    int opcion = -1;
    Scanner scanner = new Scanner(System.in);


    //EMPLEADOS
    EmpleadoServicio empleadoServicio = new EmpleadoServicio();
    Vector<Empleado> listadoEmpleados = new Vector<>();
    String numeroDocumentoEmpleado = "";
    int indiceEmpleadoActualizar = -1;
    //HABITACIONES
    HabitacionServicio habitacionServicio = new HabitacionServicio();
    Vector<Habitacion> habitaciones = new Vector<>();

    //HUESPEDES
    HuespedServicio huespedServicio = new HuespedServicio();
    Vector<Huesped> listadoHuespedes = new Vector<>();
    String numeroDocumentoHuesped = "";
    int indiceHuespedActualizar = -1;


    ValidacionServicio validacionServicio = new ValidacionServicio();


    String mensajeSolicitarOpcion = "\t****\tPor favor ingrese una opcion\t****";
    String mensajeOpcionInvalida = "\t********\tOpcion Invalida\t********";
    String mensajeMenu = "\t-----\tBienvenidos hotel Fundamentos\t-----" +
            "\n\t1.  Registrar huesped" +
            "\n\t2.  Listado de huespedes" +
            "\n\t3.  Buscar huesped por documento" +
            "\n\t4.  Actualizar informacion de huesped" +
            "\n\t5.  Registar empleado" +
            "\n\t6.  Consultar listado de empleados registrados" +
            "\n\t7.  Buscar empleado por identificacion" +
            "\n\t8.  Actualizar informacion de empleado" +
            "\n\t9.  Registrar habitacion" +
            "\n\t10. Consultar habitaciones disponibles" +
            "\n\t11. Consultar habitaciones ocupadas" +
            "\n\t12. Buscar habitacion por numero" +
            "\n\t13. Cambiar el estado de una habitacion" +
            "\n\t14. Registrar reserva" +
            "\n\t15. Consultar reservas" +
            "\n\t16. Buscar reservas por codigo" +
            "\n\t17. Cancelar resesrva" +
            "\n\t18. Finalizar reservas";


    do {
        System.out.println(mensajeMenu);
        System.out.println(mensajeSolicitarOpcion);
        opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                Huesped huespedNuevo = huespedServicio.crearHuesped();
                listadoHuespedes.add(huespedNuevo);
                listadoHuespedes.sort((a,b)-> a.getNumeroIdentificacion().compareTo(b.getNumeroIdentificacion()));
                break;

            case 2:
                huespedServicio.imprimirHuesped(listadoHuespedes);
                break;
            case 3:
                Huesped huespedBuscado = huespedServicio.buscarPorDocumento(listadoHuespedes, numeroDocumentoHuesped);
                if (huespedBuscado != null) System.out.println(huespedBuscado.toString());
                break;

            case 4:
                huespedServicio.imprimirHuesped(listadoHuespedes);
                System.out.println("Ingrese posicion del huesped ");
                indiceHuespedActualizar = scanner.nextInt();
                indiceHuespedActualizar--;
                listadoHuespedes.get(indiceHuespedActualizar - 1).setNombreCompleto(validacionServicio.validarNombre());
                listadoHuespedes.get(indiceHuespedActualizar - 1).setTelefono(validacionServicio.validarTelefono());
                listadoHuespedes.get(indiceHuespedActualizar - 1).setVIP(false);
                listadoHuespedes.get(indiceHuespedActualizar - 1).setCorreo(validacionServicio.validarCorreo());
                listadoHuespedes.get(indiceHuespedActualizar - 1).setNumeroIdentificacion(validacionServicio.validarNumeroIdentificacion());
                listadoHuespedes.sort((a,b)-> a.getNumeroIdentificacion().compareTo(b.getNumeroIdentificacion()));
                break;
            case 5:
                //REGISTRAR EMPLEADO
                Empleado empleado = empleadoServicio.crearEmpleado();
                listadoEmpleados.add(empleado);
                break;

            case 6:
                empleadoServicio.imprimirEmpleado(listadoEmpleados);
                break;
            case 7:
                numeroDocumentoEmpleado = validacionServicio.validarNumeroIdentificacion();
                Empleado empleado1 = empleadoServicio.buscarPorDocumento(listadoEmpleados,numeroDocumentoEmpleado);
                empleadoServicio.imprimirEmpleado(listadoEmpleados);
                System.out.println("Ingrese posicion del empleado ");
                indiceEmpleadoActualizar = scanner.nextInt();
                indiceEmpleadoActualizar--;
                listadoEmpleados.get(indiceEmpleadoActualizar).setCargo(validacionServicio.validarCargo());
                listadoEmpleados.get(indiceEmpleadoActualizar).setCorreo(validacionServicio.validarCorreo());
                listadoEmpleados.get(indiceEmpleadoActualizar).setTelefono(validacionServicio.validarTelefono());
                listadoEmpleados.get(indiceEmpleadoActualizar).setNombreCompleto(validacionServicio.validarNombre());
                listadoEmpleados.get(indiceEmpleadoActualizar).setSalario(validacionServicio.validarSalario());



                break;

            case 8:

                break;
            case 9:

                break;

            case 10:

                break;
            case 11:

                break;

            case 12:

                break;
            case 13:

                break;

            case 14:

                break;
            case 15:

                break;

            case 16:

                break;
            case 17:

                break;

            case 18:

                break;
            default:
                System.out.println(mensajeOpcionInvalida);
                break;
        }




    } while (opcion != -1);


}

