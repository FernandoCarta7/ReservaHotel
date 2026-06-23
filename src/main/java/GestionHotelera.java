import Servicio.HuespedServicio;
import entidades.Huesped;

public static void main() {
    HuespedServicio huespedServicio = new HuespedServicio();

    Huesped huesped = huespedServicio.crearHuesped();
    huespedServicio.imprimirHuesped(huesped);

}

