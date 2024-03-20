package controller;

import java.util.concurrent.Semaphore;

public class PratosController extends Thread {

	private int id;
	private Semaphore semaforo;

	public PratosController(int id, Semaphore semaforo) {
		this.id = id;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		verificaPrato();
	}

	private void verificaPrato() {
		int min, max;
		switch (id % 2) {
		case 0:// 0,6 a 1,2seg
				// 1,2seg => 1200mSeg
			max = 1200;
			// 0,6seg => 600mSeg
			min = 600;
			cozinhaLasanhaBolonhesa(max, min);
			break;
		default:// 0,5 a 0,8 segundos
			// 0,8seg => 800mSeg
			max = 800;
			// 0,5seg => 500mSeg
			min = 500;
			cozinhaSopaCebola(max, min);
		}
	}

	private void cozinhaSopaCebola(int max, int min) {
		String receita = "Sopa de Cebola";
		int tempo = (int) (Math.random() * (max + 1) + min);
		int percentual;
		double tempoTotal;
		tempoTotal = tempo / 1000;
		System.out.println("O prato #" + id + " iniciou o preparo para: " + receita);

		try {
			sleep(tempo);
			for (double i = 0.1; i <= tempoTotal; i = i + 0.1) {
				percentual = (int) (tempoTotal / i);
				System.out.println("O prato #" + id + " está " + percentual + "% cozido");
			}
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		} finally {
			entregaPrato(receita);
		}

	}

	private void cozinhaLasanhaBolonhesa(int max, int min) {
		String receita = "Lasanha Bolonhesa";
		int tempo = (int) (Math.random() * (max + 1) + min);
		int percentual;
		double tempoTotal;
		tempoTotal = tempo / 1000;

		System.out.println("O prato #" + id + " iniciou o preparo para: " + receita);

		try {
			sleep(tempo);
			for (double i = 0.1; i <= tempoTotal; i = i + 0.1) {
				percentual = (int) (tempoTotal / i);
				System.out.println("O prato #" + id + " está " + percentual + "% cozido");
			}
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		} finally {

			entregaPrato(receita);
		}

	}

	private void entregaPrato(String receita) {
		int tempo = 500;
		try {
			semaforo.acquire();
			System.out.println("O prato #" + id + ", com " + receita + ", está pronto!");
			sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		} finally {
			semaforo.release();
			System.out.println("O prato #" + id + ", com " + receita + ", foi entregue!");
		}
	}

}
