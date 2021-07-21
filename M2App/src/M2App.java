
public class M2App {

	public static void main(String[] args) {
		// Creo un empleado
		Empleado empleado = new Empleado("Joel", 1500, "Manager");
		System.out.println(empleado);
		// Modifico y muestro el salario
		empleado.salarioAumentado();
	}

}
