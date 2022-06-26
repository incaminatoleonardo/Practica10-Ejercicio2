package tp10.ejercicio2.aplicacion;

import tp10.incaminato.framework.Accion;

public class Salir implements Accion {

	@Override
	public void ejecutar() {
		System.out.println("Gracias por utilizar nuestro programa");

	}

	@Override
	public String nombreItemMenu() {

		return "Salir. ";
	}

	@Override
	public String descripcionItemMenu() {

		return "Salir del programa";
	}

}
