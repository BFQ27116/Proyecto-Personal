package inicial;

import java.util.Random;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		start();
	}

	private static void start() {
		System.out.println(Useful.MENSAJE_INICIAL);
		String res = new Scanner(System.in).nextLine();
		
		switch (res) {
			case "S","s":
			try {
				menu();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			case "N","n":
				System.exit(0);
			default:
				System.out.println("Debes poner S o N");
				start();
		}
	}

	private static void menu() throws InterruptedException {
		int eleccion = 0;
		do {
			System.out.println("Seleccione una opción (0-4): \n1º JUGAR\n2º REGLAS DEL JUEGO"
					+ "\n3º INFORMACIÓN\n4º APARTADO ABIERTO\n0º SALIR");
			eleccion = new Scanner(System.in).nextInt();
			
			switch (eleccion) {
			case 0: 
				System.exit(0);
				break;
			case 1:
				System.out.println("\033[0;31m" + "Comienza el Juego" + "\033[0m");
				jugar();
				break;
			case 2:
				System.out.println(Useful.REGLAS);
				break;
			case 3:
				System.out.println("CositaBuena.co all rights reserved\nVersion 1.0 2024\n\nContact us: thisisnotamail@"
						+ "hotmail.com\n\nFrom the original 'Jujutsu Kaisen'\nAuthors: Nill Kiggers,"
						+ " Gege Akutami");
				break;
			case 4:
				System.out.println("\033[0;31m" + "Próximamente..." + "\033[0m");
				break;
			default:
				throw new IllegalArgumentException("Valor inesperado (debe ser 0-4): " + eleccion);
			}	
		} while (eleccion != 0);
		
	}

	private static void jugar() throws InterruptedException {
		System.out.println("Bienvenido a este mundo, preparate para la prueba de hechiceria!");
		System.out.println("3...");
		Thread.sleep(1000);
		System.out.println("2...");
		Thread.sleep(1000);
		System.out.println("1...");
		Thread.sleep(1000);
		new Game().pruebaHechiceria();
		
		
	}


	

}

