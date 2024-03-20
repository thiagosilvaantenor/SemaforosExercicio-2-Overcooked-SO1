package view;

import java.util.concurrent.Semaphore;

import controller.PratosController;

public class Cozinheiro {

	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(1);

		for (int i = 1; i <= 5; i++) {
			PratosController pratos = new PratosController(i, semaforo);
			pratos.start();
		}
	}

}
