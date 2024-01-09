public class Empleado {
    public String nombre;
    public double salario;
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public void calcularSalario() {
        System.out.printf("Hola %s!, tu salario es %f", nombre, salario);
    }
}
class Gerente extends Empleado{
    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

}
class Desarrollador extends Empleado{
    public Desarrollador(String nombre, double salario) {
        super(nombre, salario);
    }
}