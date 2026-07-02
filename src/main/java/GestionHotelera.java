import Servicio.*;
import entidades.Empleado;
import entidades.Habitacion;
import entidades.Huesped;
import entidades.Reserva;

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
    Vector<Habitacion> listadoHabitaciones = new Vector<>();
    Habitacion buscarHabitacion = null;
    short numeroHab = 0;
    int indiceHabitacion;

    //HUESPEDES
    HuespedServicio huespedServicio = new HuespedServicio();
    Vector<Huesped> listadoHuespedes = new Vector<>();
    String numeroDocumentoHuesped = "";
    Habitacion habitacion = null;
    int indiceHuespedActualizar = -1;

    //RESERVAS
    ReservaServicio reservaServicio = new ReservaServicio();
    Vector<Reserva> reservas = new Vector<>();
    Reserva reserva = null;


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
            "\n\t17. Cancelar reserva" +
            "\n\t18. Salir";


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
                empleadoServicio.imprimirEmpleado(listadoEmpleados);
                System.out.println("Ingrese posicion del empleados ");
                indiceEmpleadoActualizar = scanner.nextInt();
                indiceHuespedActualizar--;
                listadoEmpleados.get(indiceEmpleadoActualizar - 1).setNombreCompleto(validacionServicio.validarNombre());
                listadoEmpleados.get(indiceEmpleadoActualizar - 1).setTelefono(validacionServicio.validarTelefono());
                listadoEmpleados.get(indiceEmpleadoActualizar - 1).setCorreo(validacionServicio.validarCorreo());
                listadoEmpleados.get(indiceEmpleadoActualizar - 1).setNumeroIdentificacion(validacionServicio.validarNumeroIdentificacion());
                listadoEmpleados.get(indiceEmpleadoActualizar - 1 ).setSalario( validacionServicio.validarSalario() );
                listadoEmpleados.get(indiceEmpleadoActualizar - 1).setCargo(validacionServicio.validarCargo());

                listadoEmpleados.sort((a,b)-> a.getNumeroIdentificacion().compareTo(b.getNumeroIdentificacion()));

                break;
            case 9:

                String tipo = validacionServicio.validarTipoHabitacion();
                boolean estaDisponible = true;
                habitacion = new Habitacion(tipo,estaDisponible);
                listadoHabitaciones.add(habitacion);

                break;

            case 10:
                //HABITACIONES DISPONIBLES
                habitacionServicio.imprimirHabitacionesDisponible(listadoHabitaciones);
                break;
            case 11:
                //HABITACIONES DISPONIBLES
                habitacionServicio.imprimirHabitacionesNODisponible(listadoHabitaciones);
                break;

            case 12:
                listadoHabitaciones.sort( (a,b ) -> Short.compare(a.getNumeroHabitacion(), b.getNumeroHabitacion())  );
                System.out.println("Ingrese el numero de habitacion a buscar: ");
                numeroHab = scanner.nextShort();
                buscarHabitacion= habitacionServicio.buscarPorNumero(listadoHabitaciones, numeroHab);
                System.out.println(buscarHabitacion.toString());
                break;
            case 13:
                //Cambiar el estado de una habitacion
                System.out.println("Ingrese el numero de habitacion a cambiar estado: ");
                numeroHab = scanner.nextShort();
                indiceHabitacion= habitacionServicio.buscarPorNumeroIndice(listadoHabitaciones, numeroHab);
                if (indiceHabitacion == -1) System.out.println("Habitacion no encontrada");
                else if (listadoHabitaciones.get(indiceHabitacion).estaDisponible())
                    listadoHabitaciones.get(indiceHabitacion).setEstaDisponible(false);
                else
                    listadoHabitaciones.get(indiceHabitacion).setEstaDisponible(true);
                System.out.println("Estado cambiado: \n " + listadoHabitaciones.get(indiceHabitacion).toString());
                break;

            case 14:
                //REGISTRAR RESERVA
                if (listadoHuespedes.isEmpty()) System.out.println("NO HAY HUESPEDES REGISTRADOS, DEBE REGISTRAR PRIMERO UN HUESPED");
                if ( listadoHabitaciones.isEmpty() ) System.out.println("NO HAY HABITACIONES REGISTRADAS, DEBE REGISTRAR PRIMERO AL MENOS UNA HABITACION");
                boolean hayMasHuesped = false;
                Vector<Huesped> huespedesReserva = new Vector<>();
                huespedServicio.imprimirHuesped(listadoHuespedes);
                short cantidadHuespedes = 0;

                do {
                    //Registro de huesped
                    System.out.println("*****\t\tIngrese numero de documento del huesped para la reserva:\t\t*****");
                    numeroDocumentoHuesped = validacionServicio.validarNumeroIdentificacion();

                    Huesped huesped = huespedServicio.buscarPorDocumento(listadoHuespedes, numeroDocumentoHuesped);
                    huespedesReserva.add(huesped);
                    cantidadHuespedes++;



                    System.out.println("Desea ingresar otro huesped? \n\tS.\tSi \n\t N.\tNo");
                    String respuesta = scanner.nextLine().toUpperCase();
                    respuesta = respuesta.substring(0,1);
                    if (respuesta.compareTo("S") == 0) hayMasHuesped = true;
                    else hayMasHuesped = false;

                }while (hayMasHuesped && cantidadHuespedes < 6);




                //Registro de habitacion
                System.out.println("*****\t\tIngrese numero de habitacion para la reserva:\t\t*****");
                habitacionServicio.imprimirHabitacionesDisponible(listadoHabitaciones);
                numeroHab = scanner.nextShort();
                Habitacion habitacionReserva = habitacionServicio.buscarPorNumero(listadoHabitaciones, numeroHab);
                int cantidadNoches = validacionServicio.validarCantidadNoches();

                reserva = new Reserva(huespedesReserva, habitacionReserva, LocalDate.now(),cantidadNoches);
                reservas.add(reserva);
                break;
            case 15:
                reservaServicio.imprimirReservas(reservas);
                break;

            case 16:
                //BUSCAR RESERVA POR CODIGO
                reservaServicio.imprimirReservas(reservas);
                System.out.println("Ingrese el codigo de reserva: ");
                String codigoReservaBuscar = scanner.nextLine();
                reservas.sort((a,b) ->a.getCodigoReserva().compareTo(b.getCodigoReserva()));
                reservaServicio.buscarPorCodigo(reservas,codigoReservaBuscar);
                break;
            case 17:
                //CANCELAR RESERVA
                reservaServicio.imprimirReservas(reservas);
                System.out.println("Ingrese el codigo de reserva a cancelar: ");
                String codigoReservaCancelar = scanner.nextLine();
                reservas.sort((a,b) ->a.getCodigoReserva().compareTo(b.getCodigoReserva()));
                int indiceCancelarReserva = reservaServicio.buscarPorNumeroIndice(reservas,codigoReservaCancelar);
                if (indiceCancelarReserva != -1 ) {
                    short habitacionCancelar = reservas.get(indiceCancelarReserva).getHabitacion().getNumeroHabitacion();
                    int indiceHabCancelar = habitacionServicio.buscarPorNumeroIndice(listadoHabitaciones,habitacionCancelar);
                    listadoHabitaciones.get(indiceHabCancelar).setEstaDisponible(true);
                    reservas.remove(indiceCancelarReserva);
                }
                break;

            case 18:
                System.out.println("Hasta luego");
                opcion = -1;
                break;
            default:
                System.out.println(mensajeOpcionInvalida);
                break;
        }




    } while (opcion != -1);


}

