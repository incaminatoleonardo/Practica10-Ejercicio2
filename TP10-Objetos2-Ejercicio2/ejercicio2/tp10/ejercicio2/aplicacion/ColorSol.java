package tp10.ejercicio2.aplicacion;

import tp10.incaminato.framework.Accion;

public class ColorSol implements Accion {

	@Override
	public String descripcionItemMenu() {

		return "Te dice de que color es el sol";
	}

	@Override
	public void ejecutar() {
		System.out.println("El Color del Sol es Amarillo");

	}

	@Override
	public String nombreItemMenu() {

		return "Color del sol. ";
	}

}
