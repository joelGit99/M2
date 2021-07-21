
public class M2App {

	public static void main(String[] args) {
		// Creo los empleados para hacer las pruebas
		Empleado empleado = new Empleado("Joel", 9000, 108000, "Boss");
		System.out.println(empleado);
		Junior junior = new Junior("Hugo", 1000, "Junior");
		Empleado empleado2 = new Empleado("Hugo", 1000, 12000, junior);
		System.out.println(empleado2);
		empleado2.salarioAumentado();
		Senior senior = new Senior("Álvaro", 3000, "Senior");
		Empleado empleado3 = new Empleado("Álvaro", 3000, 36000, senior);
		System.out.println(empleado3);
		empleado2.salarioAumentado();
		empleado.salarioAumentado();
		empleado3.salarioAumentado();
		empleado.convertiraSalarioNetoAnual();
		empleado2.convertiraSalarioNetoAnual();
		empleado3.convertiraSalarioNetoAnual();
		empleado.convertiraSalarioNetoMensual();
		empleado2.convertiraSalarioNetoMensual();
		empleado3.convertiraSalarioNetoMensual();
		Empleado[] arrayEmpleados = {empleado, empleado2, empleado3};
		empleado3.sueldoBonus(arrayEmpleados);
	}

}
