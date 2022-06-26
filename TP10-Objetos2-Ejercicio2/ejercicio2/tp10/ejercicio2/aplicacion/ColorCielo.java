package tp10.ejercicio2.aplicacion;

import tp10.incaminato.framework.Accion;

public class ColorCielo implements Accion {

	@Override
	public String descripcionItemMenu() {

		return "Te dice de que color es el cielo";
	}

	@Override
	public void ejecutar() {
		System.out.println("El Cielo es Celeste");

	}

	@Override
	public String nombreItemMenu() {

		return "Color del cielo. ";
	}

}
