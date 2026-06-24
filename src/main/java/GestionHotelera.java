import Servicio.HuespedServicio;
import entidades.Huesped;

public static void main() {
    HuespedServicio huespedServicio = new HuespedServicio();

    Huesped huesped = huespedServicio.crearHuesped();
    huespedServicio.imprimirHuesped(huesped);

    Huesped[] huespedes = {
            new Huesped("1234512345", "Carlos Pérez", "2021234123", "carlos@test.com", false),
            new Huesped("5432101010", "Ana Gómez", "3040123432", "ana@test.com", true),
            new Huesped("8972638491", "Juan Rodríguez", "30012367489", "juan@test.com", false),
            new Huesped("1234567890", "Camila Gutierrez", "2021234123", "Camila@test.com", false),
            new Huesped("7263489123", "Samantha Smith", "3013001111", "Samantha@test.com", false),
            new Huesped("6712349173", "Fernando Carta", "3001234567", "Fernando@test.com", true)
    };


}

