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
	private Object tipoEmpleado;
	// Constructores
	public Empleado(String nombre, int salario, Object tipoEmpleado) {
		this.nombre = nombre;
		this.tipoEmpleado = tipoEmpleado;
		// Si es String, se comprobará si es Boss o Manager
		// y a partir de ahí, se comprobará que el salario
		// cumpla los requisitos dependiendo del tipo
		if(tipoEmpleado instanceof String) {
			String object = (String)tipoEmpleado;
			if(object.equalsIgnoreCase("Boss")) {
				if(salario > 8000) {
					this.salario = salario;
				} else {
					this.salario = 0;
				}
			} else if(object.equalsIgnoreCase("Manager")) {
				if(salario > 3000 && salario < 5000) {
					this.salario = salario;
				} else {
					this.salario = 0;
				}
			}
		// Si es Senior, Mid, o Junior, se comprobará que el salario
		// cumpla los requisitos dependiendo del tipo
		// Si es voluntario, se tiene que comprobar que el salario es 0
		} else if(tipoEmpleado instanceof Senior) {
			if(salario > 2700 && salario < 4000) {
				this.salario = salario;
			} else {
				this.salario = 0;
			}
		} else if(tipoEmpleado instanceof Mid) {
			if(salario > 1800 && salario < 2500) {
				this.salario = salario;
			} else {
				this.salario = 0;
			}
		} else if(tipoEmpleado instanceof Junior) {
			if(salario > 900 && salario < 1600) {
				this.salario = salario;
			} else {
				this.salario = 0;
			}
		} else {
			if(salario != 0) {
				this.salario = 0;
			} else {
				this.salario = salario;
			}
		}
	}

	// Métodos
	/**
	 * Método para aumentar el salario según el tipo de empleado
	 */
	public void salarioAumentado() {
		// Dependiedno del tipo de empleado, se le aumenta o reduce el salario
		if(tipoEmpleado instanceof String) {
			String object = (String)tipoEmpleado;
			if(object.equalsIgnoreCase("Manager")) {
				JOptionPane.showMessageDialog(null, "Salario actual: " + salario);
				salario = salario + (salario * 0.1);
				JOptionPane.showMessageDialog(null, "Salario actualizado: " + salario);;
			} else if(object.equalsIgnoreCase("Boss")) {
				JOptionPane.showMessageDialog(null, "Salario actual: " + salario);
				salario = salario + (salario * 0.5);
				JOptionPane.showMessageDialog(null, "Salario actualizado: " + salario);
			} else {
				JOptionPane.showMessageDialog(null, "Salario actual: " + salario);
				salario = 0;
				JOptionPane.showMessageDialog(null, "Salario actualizado: " + salario);
			}
		} else if(tipoEmpleado instanceof Junior) {
			JOptionPane.showMessageDialog(null, "Salario actual: " + salario);
			salario = salario - (salario * 0.15);
			JOptionPane.showMessageDialog(null, "Salario actualizado: " + salario);
		} else if(tipoEmpleado instanceof Mid) {
			JOptionPane.showMessageDialog(null, "Salario actual: " + salario);
			salario = salario - (salario * 0.10);
			JOptionPane.showMessageDialog(null, "Salario actualizado: " + salario);
		} else {
			JOptionPane.showMessageDialog(null, "Salario actual: " + salario);
			salario = salario - (salario * 0.05);
			JOptionPane.showMessageDialog(null, "Salario actualizado: " + salario);
		}
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + "€" + ", Tipo empleado=" + tipoEmpleado + "]";
	}

	// Getters y setters

}
