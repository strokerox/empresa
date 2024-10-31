package empresa.salarios;

public class Obrero extends Empleado {
    private int horasTrabajadas;

    public Obrero(int horasTrabajadas) {
        super(0); // El obrero no tiene salario base fijo
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * 5; // $5 por hora trabajada
    }
}
