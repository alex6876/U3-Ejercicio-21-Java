public class EmpleadoPorHora extends Empleado {

    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, String dni, int legajo,
                           double tarifaPorHora, int horasTrabajadas) {

        super(nombre, dni, legajo);

        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return tarifaPorHora * horasTrabajadas;
    }

}
