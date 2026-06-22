
    PROYECTO FINAL: SISTEMA DE GESTIÓN Y RESERVAS DE HOTEL

    --------------------    DESCRIPCIÓN GENERAL     --------------------
        Una cadena hotelera requiere un sistema que permita gestionar la información de huéspedes, empleados, 
        habitaciones y reservas. Actualmente, muchos de sus procesos se realizan de forma manual, lo que genera errores 
        en la asignación de habitaciones, dificultades para consultar la disponibilidad y problemas en el control 
        de las reservas.

    --------------------        OBJETIVO           --------------------
        Desarrollar una aplicación en Java que permita administrar huéspedes, empleados, habitaciones y reservas de un 
        hotel mediante un menú interactivo por consola.


    --------------------FUNCIONALIDADES DEL SISTEMA--------------------

    MÓDULO 1: GESTIÓN DE HUÉSPEDES
        - Registrar huéspedes.
        - Consultar la información de un huésped.
        - Listar todos los huéspedes registrados.
        - Buscar huéspedes por número de identificación.
        - Actualizar la información de un huésped.

    Información del huésped:
        - Identificación
        - Nombre completo
        - Teléfono
        - Correo electrónico

    MÓDULO 2: GESTIÓN DE EMPLEADOS
        - Registrar empleados.
        - Consultar empleados registrados.
        - Buscar empleados por identificación.
        - Actualizar información de empleados.

    Información del empleado:
        - Identificación
        - Nombre completo
        - Teléfono
        - Correo electrónico
        - Cargo
        - Salario

    MÓDULO 3: GESTIÓN DE HABITACIONES
        - Registrar habitaciones.
        - Consultar habitaciones disponibles.
        - Consultar habitaciones ocupadas.
        - Buscar una habitación por número.
        - Cambiar el estado de una habitación.

    Información de la habitación:
        - Número
        - Tipo (Sencilla, Doble, Suite)
        - Precio por noche
        - Estado (Disponible u Ocupada)

    MÓDULO 4: GESTIÓN DE RESERVAS
        - Crear reservas.
        - Consultar reservas.
        - Buscar reservas por código.
        - Cancelar reservas.
        - Finalizar reservas.

    Información de la reserva:
        - Código de reserva
        - Huésped asociado
        - Habitación asignada
        - Fecha de ingreso
        - Cantidad de noches
        - Valor total

    MÓDULO 5: FACTURACIÓN
        - Generar factura de una reserva.
        - Calcular automáticamente el valor total.
        - Mostrar resumen de la reserva.

    

    Hotel
    Responsable de gestionar huéspedes, empleados, habitaciones y reservas.

    Main
    Contiene el menú principal de la aplicación.
