public class Main {

    public static void main(String[] args) {

        EmpleadoAsalariado empleado1 = new EmpleadoAsalariado(
                "Juan", "40111222", 1001, 850000
        );

        EmpleadoPorHora empleado2 = new EmpleadoPorHora(
                "Pedro", "42123456", 1002, 5000, 120
        );

        System.out.println("=== EMPLEADO ASALARIADO ===");

        empleado1.mostrarInformacion();
        System.out.println("Salario: $" + empleado1.calcularSalario());

        System.out.println("\n=== EMPLEADO POR HORA ===");

        empleado2.mostrarInformacion();
        System.out.println("Salario: $" + empleado2.calcularSalario());
    }
}
