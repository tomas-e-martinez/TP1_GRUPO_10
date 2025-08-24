package EJERCICIO1;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Empleado empleado1 = new Empleado();
			Empleado empleado2 = new Empleado();
			Empleado empleado3 = new Empleado();
			Empleado empleado4 = new Empleado();
			Empleado empleado5 = new Empleado();
			
			System.out.println("El proximo legajo será el: " + Empleado.devuelveProximoLegajo());
	}

}
