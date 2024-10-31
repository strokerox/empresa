// Ubicación: empresa/salarios/Vendedor.java
package empresa.salarios;

public class Vendedor extends Empleado {
    private double ventasTotales;

    public Vendedor(double ventasTotales) {
        super(50); // El salario base del vendedor es 50$
        this.ventasTotales = ventasTotales;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (ventasTotales * 0.15); // 15% de comisión
    }
}
