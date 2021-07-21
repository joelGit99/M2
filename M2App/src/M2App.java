
public class M2App {

	public static void main(String[] args) {
		// Creo los empleados para hacer las pruebas
		Empleado empleado = new Empleado("Joel", 9000, "Boss");
		System.out.println(empleado);
		Junior junior = new Junior("Hugo", 1000, "Junior");
		Empleado empleado2 = new Empleado("Hugo", 1000, junior);
		System.out.println(empleado2);
		empleado2.salarioAumentado();
		// Modifico y muestro el salario
		empleado.salarioAumentado();
	}

}
