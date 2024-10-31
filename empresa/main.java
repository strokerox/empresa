// Ubicación: empresa/Main.java
package empresa;

import empresa.salarios.Gerente;
import empresa.salarios.Vendedor;
import empresa.salarios.Obrero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gerente
        Gerente gerente = new Gerente();
        System.out.println("El salario del gerente es: $" + gerente.calcularSalario());

        // Vendedor
        System.out.print("Ingrese las ventas totales del vendedor: ");
        double ventasTotales = scanner.nextDouble();
        Vendedor vendedor = new Vendedor(ventasTotales);
        System.out.println("El salario del vendedor es: $" + vendedor.calcularSalario());

        // Obrero
        System.out.print("Ingrese las horas trabajadas del obrero: ");
        int horasTrabajadas = scanner.nextInt();
        Obrero obrero = new Obrero(horasTrabajadas);
        System.out.println("El salario del obrero es: $" + obrero.calcularSalario());

        scanner.close();
    }
}
