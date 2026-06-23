package entidades;

public class Empleados extends Persona {

    private String cargo;
    private double salario;

    public Empleados(String cargo, double salario) {
        this.cargo = cargo;
        this.salario = salario;
    }

    public Empleados(String numeroIdentificacion, String nombreCompleto, String telefono, String correo, String cargo, double salario) {
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
}
