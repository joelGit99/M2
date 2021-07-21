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
	private double salarioNeto;
	private double salarioAnual;
	private double salarioAnualNeto;
	private Object tipoEmpleado;
	private boolean esAyuda;
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
			if(salario <= 300) {
				String respuesta = JOptionPane.showInputDialog("El salario es una ayuda?");
				if(respuesta.equalsIgnoreCase("Si")) {
					this.salario = salario;
					esAyuda = true;
				}
			} else {
				this.salario = 0;
				esAyuda = false;
			}
		}
	}	

	public Empleado(String nombre, double salario, double salarioAnual, Object tipoEmpleado) {
		this.nombre = nombre;
		this.salario = salario;
		this.salarioAnual = salarioAnual;
		this.tipoEmpleado = tipoEmpleado;
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
				JOptionPane.showMessageDialog(null, "Salario actual: " + salario + "€");
				salario = salario + (salario * 0.1);
				JOptionPane.showMessageDialog(null, "Salario actualizado: " + salario + "€");
			} else if(object.equalsIgnoreCase("Boss")) {
				JOptionPane.showMessageDialog(null, "Salario actual: " + salario + "€");
				salario = salario + (salario * 0.5);
				JOptionPane.showMessageDialog(null, "Salario actualizado: " + salario + "€");
			} else {
				JOptionPane.showMessageDialog(null, "Salario actual: " + salario + "€");
				salario = 0;
				JOptionPane.showMessageDialog(null, "Salario actualizado: " + salario + "€");
			}
		} else if(tipoEmpleado instanceof Junior) {
			JOptionPane.showMessageDialog(null, "Salario actual: " + salario + "€");
			salario = salario - (salario * 0.15);
			JOptionPane.showMessageDialog(null, "Salario actualizado: " + salario + "€");
		} else if(tipoEmpleado instanceof Mid) {
			JOptionPane.showMessageDialog(null, "Salario actual: " + salario + "€");
			salario = salario - (salario * 0.10);
			JOptionPane.showMessageDialog(null, "Salario actualizado: " + salario + "€");
		} else {
			JOptionPane.showMessageDialog(null, "Salario actual: " + salario + "€");
			salario = salario - (salario * 0.05);
			JOptionPane.showMessageDialog(null, "Salario actualizado: " + salario + "€");
		}
	}
	/**
	 * Método para convertir el salario bruto mensual a neto
	 */
	public void convertiraSalarioNetoMensual() {
		// Dependiedno del tipo de empleado, se convierte diferente a neto
		if(tipoEmpleado instanceof String) {
			String object = (String)tipoEmpleado;
			if(object.equalsIgnoreCase("Manager")) {
				JOptionPane.showMessageDialog(null, "Salario bruto: " + salario + "€");
				salarioNeto = salario - (salario * 0.26);
				JOptionPane.showMessageDialog(null, "Salario neto: " + salarioNeto + "€");
			} else if(object.equalsIgnoreCase("Boss")) {
				JOptionPane.showMessageDialog(null, "Salario bruto: " + salario + "€");
				salarioNeto = salario - (salario * 0.32);
				JOptionPane.showMessageDialog(null, "Salario neto: " + salarioNeto + "€");
			} 
		} else if(tipoEmpleado instanceof Junior) {
			JOptionPane.showMessageDialog(null, "Salario bruto: " + salario + "€");
			salarioNeto = salario - (salario * 0.02);
			JOptionPane.showMessageDialog(null, "Salario neto: " + salarioNeto + "€");
		} else if(tipoEmpleado instanceof Mid) {
			JOptionPane.showMessageDialog(null, "Salario bruto: " + salario + "€");
			salarioNeto = salario - (salario * 0.15);
			JOptionPane.showMessageDialog(null, "Salario neto: " + salarioNeto + "€");
		} else {
			JOptionPane.showMessageDialog(null, "Salario bruto: " + salario + "€");
			salarioNeto = salario - (salario * 0.24);
			JOptionPane.showMessageDialog(null, "Salario neto: " + salarioNeto + "€");
		}
	}
	/**
	 * Método para convertir el salario bruto anual a neto
	 */
	public void convertiraSalarioNetoAnual() {
		// Dependiedno del tipo de empleado, se convierte diferente a neto
		if(tipoEmpleado instanceof String) {
			String object = (String)tipoEmpleado;
			if(object.equalsIgnoreCase("Manager")) {
				JOptionPane.showMessageDialog(null, "Salario bruto anual: " + salarioAnual + "€");
				salarioAnualNeto = salarioAnual - (salarioAnual * 0.26);
				JOptionPane.showMessageDialog(null, "Salario neto anual: " + salarioAnualNeto + "€");
			} else if(object.equalsIgnoreCase("Boss")) {
				JOptionPane.showMessageDialog(null, "Salario bruto anual: " + salarioAnual + "€");
				salarioAnualNeto = salarioAnual - (salarioAnual * 0.32);
				JOptionPane.showMessageDialog(null, "Salario neto anual: " + salarioAnualNeto + "€");
			} 
		} else if(tipoEmpleado instanceof Junior) {
			JOptionPane.showMessageDialog(null, "Salario bruto anual: " + salarioAnual + "€");
			salarioAnualNeto = salarioAnual - (salarioAnual * 0.02);
			JOptionPane.showMessageDialog(null, "Salario neto anual: " + salarioAnualNeto + "€");
		} else if(tipoEmpleado instanceof Mid) {
			JOptionPane.showMessageDialog(null, "Salario bruto anual: " + salarioAnual + "€");
			salarioAnualNeto = salarioAnual - (salarioAnual * 0.15);
			JOptionPane.showMessageDialog(null, "Salario neto anual: " + salarioAnualNeto + "€");
		} else {
			JOptionPane.showMessageDialog(null, "Salario bruto anual: " + salarioAnual + "€");
			salarioAnualNeto = salarioAnual - (salarioAnual * 0.24);
			JOptionPane.showMessageDialog(null, "Salario neto anual: " + salarioAnualNeto + "€");
		}
	}
	
	/**
	 * Método para aumentar un 10% el sueldo de los empleados, exceptuando voluntarios
	 * @param array
	 */
	public void sueldoBonus(Empleado[] array) {
		for (int i = 0; i < array.length; i++) {
			if(array[i].getTipoEmpleado() instanceof Volunteer) {
				salario = salario + 0;
			} else {
				salario = salario + (salario * 0.1);
				JOptionPane.showMessageDialog(null, array[i].getNombre() + ": " + array[i].getSalario() + "€");
			}
		}
	}

	@Override
	public String toString() {
		if(tipoEmpleado instanceof Volunteer) { 
			return "Empleado [nombre=" + nombre + ", salario=" + salario + "€" + "(Ayuda)" + ", Tipo empleado=" + tipoEmpleado + "]";
		} else {
			return "Empleado [nombre=" + nombre + ", salario=" + salario + "€" + ", Tipo empleado=" + tipoEmpleado + "]";
		}

	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalarioNeto() {
		return salarioNeto;
	}

	public void setSalarioNeto(double salarioNeto) {
		this.salarioNeto = salarioNeto;
	}

	public double getSalarioAnual() {
		return salarioAnual;
	}

	public void setSalarioAnual(double salarioAnual) {
		this.salarioAnual = salarioAnual;
	}

	public Object getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(Object tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

}
