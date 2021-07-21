import javax.swing.JOptionPane;

/**
 * Clase para crear empleados
 * @author Joel
 *
 */

public class Empleado {
	// Atributos
	private String nombre;
	private double salario;
	private String tipoEmpleado;
	// Constructores
	public Empleado(String nombre, int salario, String tipoEmpleado) {
		this.nombre = nombre;
		this.salario = salario;
		this.tipoEmpleado = tipoEmpleado;
	}
	
	// Métodos
	/**
	 * Método para aumentar el salario según el tipo de empleado
	 */
	public void salarioAumentado() {
		if(tipoEmpleado.equalsIgnoreCase("Manager")) {
			JOptionPane.showMessageDialog(null, "Salario actual: " + salario);
			salario = salario + (salario * 0.1);
			JOptionPane.showMessageDialog(null, "Salario actualizado: " + salario);;
		} else if(tipoEmpleado.equalsIgnoreCase("Boss")) {
			JOptionPane.showMessageDialog(null, "Salario actual: " + salario);
			salario = salario + (salario * 0.5);
			JOptionPane.showMessageDialog(null, "Salario actualizado: " + salario);
		} else if(tipoEmpleado.equalsIgnoreCase("Employee")) {
			JOptionPane.showMessageDialog(null, "Salario actual: " + salario);
			salario = salario - (salario * 0.15);
			JOptionPane.showMessageDialog(null, "Salario actualizado: " + salario);
		} else {
			JOptionPane.showMessageDialog(null, "Salario actual: " + salario);
			salario = 0;
			JOptionPane.showMessageDialog(null, "Salario actualizado: " + salario);
		}
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + "€" + ", Tipo empleado=" + tipoEmpleado + "]";
	}
	
	// Getters y setters
	
}
