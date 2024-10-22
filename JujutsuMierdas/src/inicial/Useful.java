package inicial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Useful {
	public static final String	SANE				= "\u001B[0m";

	public static final String	HIGH_INTENSITY		= "\u001B[1m";
	public static final String	LOW_INTENSITY		= "\u001B[2m";

	public static final String	ITALIC				= "\u001B[3m";
	public static final String	UNDERLINE			= "\u001B[4m";
	public static final String	BLINK				= "\u001B[5m";
	public static final String	RAPID_BLINK			= "\u001B[6m";
	public static final String	REVERSE_VIDEO		= "\u001B[7m";
	public static final String	INVISIBLE_TEXT		= "\u001B[8m";

	public static final String	BLACK				= "\u001B[30m";
	public static final String	RED					= "\u001B[31m";
	public static final String	GREEN				= "\u001B[32m";
	public static final String	YELLOW				= "\u001B[33m";
	public static final String	BLUE				= "\u001B[34m";
	public static final String	MAGENTA				= "\u001B[35m";
	public static final String	CYAN				= "\u001B[36m";
	public static final String	WHITE				= "\u001B[37m";

	public static final String	BACKGROUND_BLACK	= "\u001B[40m";
	public static final String	BACKGROUND_RED		= "\u001B[41m";
	public static final String	BACKGROUND_GREEN	= "\u001B[42m";
	public static final String	BACKGROUND_YELLOW	= "\u001B[43m";
	public static final String	BACKGROUND_BLUE		= "\u001B[44m";
	public static final String	BACKGROUND_MAGENTA	= "\u001B[45m";
	public static final String	BACKGROUND_CYAN		= "\u001B[46m";
	public static final String	BACKGROUND_WHITE	= "\u001B[47m";
	
	public static final String ABC = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ1234567890";
	public static final String MENSAJE_INICIAL = "Bienvenido a este juego, basado en Jujutsu Kaisen, a continuacion"
			+ " empezaremos con el juego, listo? (S,N)";
	
	public static final String MENU = "Seleccione una opción (0-4): \n1º JUGAR\n2º REGLAS DEL JUEGO"
			+ "\n3º INFORMACIÓN\n4º APARTADO ABIERTO\n0º SALIR";

	public static final String REGLAS = Useful.GREEN+"Bienvenido a este juego, las reglas son simples...\n"
			+ "Este juego esta ambientado en Jujustu Kaisen y esta completamente basado en el combate, como una "
			+ "especie de ajedrez, deberas ser mas inteligente que tu oponente para ganar\n"
			+ "Primero hay una pequeña prueba de habilidad, dependiendo de que tan bueno seas (y un factor suerte) "
			+ "obtendras una mejor o peor categoria de hechicero, cada uno con sus habilidades!\n"
			+ "Domina el mundo de la hechiceria para poder derrotar a tus enemigos y ser el hechicero mas fuerte"
			+ Useful.WHITE;

	public static final String SPECIAL_GRADE_ROOSTER = "Habilidades a elegir de grado especial:\n"
			+ "01: Ilimitado\n02: Cocina\n03: Copia\n04: 10 sombras\n";

	public static final String GRADE1_ROOSTER = "Habilidades a elegir de grado 1:\n"
			+ "11: Manipulacion \n12: Masa\n13: Comediante\n14: Dragon ambar\n15: Mecha\n";

	public static final String GRADE2_ROOSTER = "Habilidades a elegir grado 2:\n"
			+ "21: vudu\n22: Boogie woogie\n23: Discurso maldito\n24: Hielo\n25: Gambler\n";

	public static final String GRADE3_ROOSTER = "Habilidades a elegir grado 3:\n"
			+ "31: Restriccion Celestial\n32: Kukasuave\n33: Support\n34: Medusa\n35: Igualitario\n";
	
	public static final Tecnica[] CTLIST = {new Tecnica("01"),new Tecnica("02"),new Tecnica("03"),new Tecnica("04"),
			new Tecnica("11"),new Tecnica("12"),new Tecnica("13"),new Tecnica("14"),new Tecnica("15"),
			new Tecnica("21"),new Tecnica("22"),new Tecnica("23"),new Tecnica("24"),new Tecnica("25"),
			new Tecnica("31"),new Tecnica("32"),new Tecnica("33"),new Tecnica("34"),new Tecnica("35")};
}

