package inicial;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
	
	private int talentValue;
	private int grade;
	
	Hechicero player = null;
	
	public void pruebaHechiceria() {
		Random r = new Random();
		String test = "";
		for(int i = 0; i < 10; i++) {
			int letra = r.nextInt(0, 62);
			test = test+Useful.ABC.charAt(letra);
		}
		
		long time = comprobarCode(test);
		
		System.out.println("Has tardado "+(time/1000)+" segundos!");
		System.out.println(selectorRango(r));
		System.out.println(rangoHechicero((int) (time/1000)));
		String ct = selectorHechicero();
		int CE;
		switch (grade) {
		case 0: 
			CE = r.nextInt(500, 1000);
			break;
		case 1:
			CE = r.nextInt(400, 700);
			break;
		case 2:
			CE = r.nextInt(300, 500);
			break;
		case 3:
			if(ct == "31") {
				CE = 0;
			}else {
				CE = r.nextInt(200, 300);
			}
			
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + grade);
		}
		
		this.player = new Hechicero(ct,CE,talentValue);
		
		elegirModo();
	}

	private void elegirModo() {
		System.out.println("Elige un modo de juego");
		System.out.println("1: MODO DUNGEON\n2: JUEGOS DEL SACRIFICIO (PvP)");
		int eleccion = new Scanner(System.in).nextInt();
		
		if(eleccion  == 1) {
			new ModoHistoria(player).start();
		}else if(eleccion == 2) {
			new ArenaPVP(player).start();
		}else {
			elegirModo();
		}
		
	}

	public String rangoHechicero(int l) {
		System.out.println("Sabiendo tu potencial...y que tardaste "+l+" segundos...");
		String res;
		if(l-talentValue <= 3) {
			this.grade = 0;
			res = "WOW! Eres Grado ESPECIAL!! Increible";
		}else if(l-talentValue <= 4) {
			this.grade = 1;
			res = "Un grado 1?!? Impresionante!";
		}else if(l-talentValue <= 5) {
			this.grade = 2;
			res = "Un grado 2? No esta nada mal";
		}else {
			this.grade = 3;
			res = "Tal vez esto no es lo tuyo...grado 3";
		}
		
		return res;
	}

	public long comprobarCode(String test) {
		Scanner reader = new Scanner (System.in);
		boolean good = false;
		System.out.println("Escribe este codigo!");
		System.out.println(Useful.GREEN+test+Useful.WHITE);
		long time0 = System.currentTimeMillis();
		while(good == false) {
			if(reader.nextLine().equals(test))
				good = true;
			else{
				System.out.println("Incorrecto");
			}
		}
		
		long time1 = System.currentTimeMillis();
		
		return time1 - time0;
	}
	
	public String selectorRango(Random r) {
		int talentDetector = r.nextInt(0, 9);
		String rango;
		Scanner reader = new Scanner(System.in);
		System.out.println("Dime un numero del 0 al 9!");
		int guess = reader.nextInt();
		if(guess == talentDetector) {
			this.talentValue = 4;
		}else if(guess+1 == talentDetector || guess-1 == talentDetector) {
			this.talentValue = 3;
		}else if(guess+2 == talentDetector || guess-2 == talentDetector) {
			this.talentValue = 2;
		}else {
			this.talentValue = 1;
		}
		
		switch (talentValue) {
		case 4: 
			rango = "Wow, tienes el talento de un grado especial!";
			break;
		case 3:
			rango = "Wow, tienes el talento de un grado 1!";
			break;
		case 2:
			rango = "Tienes talento de un grado 2 ... no te desanimes!";
			break;
		case 1:
			rango = "Tienes el talento de un grado 3...tal vez esto no es lo tuyo";
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + talentValue);
		}
		
		return rango;
		
		
		
	}
	
	public String selectorHechicero() {
		List<String> ctCodes = new ArrayList<String>();
		String[] cts = {"01","02","03","04","11","12","13","14","15","21","22","23","24","25","31","32","33","34","35"};
		for(String ct : cts) {
			ctCodes.add(ct);
		}
		switch (grade) {
		case 0: 
			System.out.println("Un hechicero de grado especial necesita habilidades de su nivel");
			System.out.println("Elige la habilidad que mas te llama la atencion");
			System.out.println(Useful.SPECIAL_GRADE_ROOSTER+Useful.GRADE1_ROOSTER);
			System.out.println(Useful.GRADE2_ROOSTER+Useful.GRADE3_ROOSTER);
			break;
		case 1:
			System.out.println("Un hechicero grado uno necesita una buena tecnica para defenderse");
			System.out.println(Useful.GRADE1_ROOSTER+Useful.GRADE2_ROOSTER+Useful.GRADE3_ROOSTER);
			break;
		case 2:
			System.out.println("Elige tu tecnica grado 2");
			System.out.println(Useful.GRADE2_ROOSTER+Useful.GRADE3_ROOSTER);
			break;
		case 3:
			System.out.println("Elige tu tecnica grado 3");
			System.out.println(Useful.GRADE3_ROOSTER);
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + grade);
		}
		String myCT;
		if(!(ctCodes.contains(myCT = new Scanner(System.in).nextLine()))) {
			selectorHechicero();
		}
		
		return myCT;
		
	}
}

