package entidades;

public class Empleado extends Persona {

    private String cargo;
    private double salario;

    public Empleado(String cargo, double salario) {
        this.cargo = cargo;
        this.salario = salario;
    }

    public Empleado(String numeroIdentificacion, String nombreCompleto, String telefono, String correo, String cargo, double salario) {
        super(numeroIdentificacion, nombreCompleto, telefono, correo);
        this.cargo = cargo;
        this.salario = salario;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
