package EJERCICIO1;

public class Empleado extends Persona {

	private final int legajo;
	private String puesto;
	private static int contadorLegajo = 1000;
	
	public Empleado() {
		super();
		this.legajo = contadorLegajo;
		contadorLegajo++;
		this.puesto = "sin puesto";
	}

	
	@Override
	public String toString() {
		return "Legajo del empleado:" + legajo + ", Puesto del empleado:" + puesto;
	}


	public int getLegajo() {
		return legajo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public static int getContadorLegajo() {
		return contadorLegajo;
	}
	 
}
