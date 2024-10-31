// Ubicación: empresa/salarios/Empleado.java
package empresa.salarios;

public class Empleado {
    private double salarioBase;

    public Empleado(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}
