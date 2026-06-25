import Servicio.EmpleadoServicio;
import Servicio.HuespedServicio;
import entidades.Empleado;
import entidades.Huesped;

public static void main() {

    //--------------------HUESPEDES--------------------
    HuespedServicio huespedServicio = new HuespedServicio();
    //Huesped huesped = huespedServicio.crearHuesped();
    Huesped[] huespedes = {
            new Huesped("1234512345", "Carlos Pérez", "2021234123", "carlos@test.com", false),
            new Huesped("5432101010", "Ana Gómez", "3040123432", "ana@test.com", true),
            new Huesped("8972638491", "Juan Rodríguez", "30012367489", "juan@test.com", false),
            new Huesped("1234567890", "Camila Gutierrez", "2021234123", "Camila@test.com", false),
            new Huesped("7263489123", "Samantha Smith", "3013001111", "Samantha@test.com", false),
            new Huesped("6712349173", "Fernando Carta", "3001234567", "Fernando@test.com", true)
    };
    //--------------------EMPLEADOS--------------------
    EmpleadoServicio empleadoServicio = new EmpleadoServicio();
    Empleado [] empleados = {
            new Empleado("1234561234", "Fernando Carta", "3001234567", "fernandocarta@correo.com", "ADMINISTRADOR",7000000),
            new Empleado("1234561664", "Camila Perez", "3001233367", "camilaperez@correo.com", "CONSERJE",3000000),
            new Empleado("1234561774", "Juana de Arco", "3001222567", "juanaarco@correo.com", "RECEPCIONISTA",3500000)

    };

    empleadoServicio.quickSortEmpleadoes(empleados,0, empleados.length - 1 );
    Empleado empleado = empleadoServicio.buscarPorDocumento(empleados,"1234561234");

}

