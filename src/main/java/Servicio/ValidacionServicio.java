package Servicio;

import entidades.Huesped;

import java.util.Scanner;
import java.util.Vector;

public class ValidacionServicio {

    Scanner scanner = new Scanner(System.in);

    public String validarNumeroIdentificacion(){
        String numero = "";
        do {
            System.out.println("\tIngrese un número de identificación valido " +
                    "\n\t\tQue NO contenga letras " +
                    "\n\t\tQue su longitud sea igual a 10");
            numero = scanner.nextLine();
        } while ( !(numero != null && numero.matches("\\d{10}")) );

        return numero;
    }

    public String validarNombre(){

        String nombre = "";
        String nombreSinEspacio = "";

        do {
            System.out.println("Ingrese el nombre completo del huesped, sin caracteres especiales o números");
            nombre = scanner.nextLine();
            nombreSinEspacio = nombre.replaceAll(" ", "");
        } while ( !(nombreSinEspacio != null && nombreSinEspacio.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) );


        return nombre.toUpperCase();

    }

    public String validarTelefono(){
        String numero = "";
        do {
            System.out.println("\tIngrese un número de telefono valido " +
                    "\n\t\tQue NO contenga letras " +
                    "\n\t\tQue su longitud sea igual a 10");
            numero = scanner.nextLine();
        } while ( !(numero != null && numero.matches("\\d{10}")) );

        return numero;

    }

    public String validarCorreo(){
        String correo = "";

        do {

            System.out.println("Ingrese un correo valido" +
                    "\n\t FORMATO VALIDO: ejemplo@correo.com");
            correo = scanner.nextLine();

        } while ( !( correo != null &&
                correo.matches(
                        "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")
        )
        );




        return correo.toLowerCase();
    }

    public double validarSalario(){

        String salarioString = "";

        do {
            System.out.println("Ingrese un salario valido \n");


        } while ( ! ( salarioString != null
                && salarioString.matches("-?\\d+(\\.\\d+)?")
                )
            );

        return Double.parseDouble(salarioString);
    }

    public String validarTipoHabitacion(){
        String [] tipoDeHabitacion = {"Sencilla","Doble","Suite"};
        int posicion = -1;

        do {
            System.out.println("Seleccione el tipo de habitacion: ");

            for (int i = 0; i < tipoDeHabitacion.length; i++) {
                System.out.println( "\t " +  (i + 1) + "\t" + tipoDeHabitacion[i] );
            }
            posicion = scanner.nextInt();


        }while (posicion < 0 || posicion > tipoDeHabitacion.length);


        return tipoDeHabitacion[posicion - 1].toUpperCase();
    }

    public String validarCargo(){
        boolean bandera = true;
        int opcion = -1;
        String [] cargos = {"ADMINISTRADOR","LIMPIEZA","RECEPCIONISTA","CONCERJE","COCINA"} ;
        do {
            System.out.println("\t\tIngrese opcion [ 1 - 5 ] del empleado: " +
                    "\n1. ADMINISTRADOR" +
                    "\n2. LIMPIEZA" +
                    "\n3. RECEPCIONISTA" +
                    "\n4. CONCERJE" +
                    "\n5. COCINA");
            opcion = scanner.nextInt();
            if (opcion > 0 && opcion <= cargos.length ) {
                bandera = false;
            }
        }while ( bandera );



        return cargos[opcion - 1];
    }

    public int validarCantidadNoches(){
        int noches = -1;

        do {
            System.out.println("<----------INGRESE CANTIDAD DE NOCHES---------->\n<----------RANGO PERMITIDO [ 1 - 7 ]---------->");
            noches = scanner.nextInt();
        }while ( noches > 0 && noches < 7);

        return noches;
    }


}
