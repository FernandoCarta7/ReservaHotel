package Servicio;

import java.util.Scanner;

public class ValidacionServicio {

    Scanner scanner = new Scanner(System.in);

    public String validarNumeroIdentificacion(){
        String numero = "";
        do {
            System.out.println("Ingrese un número de identificación valido " +
                    "\nQue NO contenga letras " +
                    "\nQue su longitud sea igual a 10");
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
            System.out.println("Ingrese un número de telefono valido " +
                    "\nQue NO contenga letras " +
                    "\nQue su longitud sea igual a 10");
            numero = scanner.nextLine();
        } while ( !(numero != null && numero.matches("\\d{10}")) );

        return numero;

    }

    public String validarCorreo(){
        String correo = "";

        do {

            System.out.println("Ingrese un correo valido" +
                    "\n\t FORMATO VALIDO: ejemplo@correo.com");


        } while ((   correo != null &&
                correo.matches(
                        "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")
        )
        );




        return correo.toLowerCase();
    }


}
