package lt.codeacademy.studies.javabasica.secondweek.operators;

import java.util.Scanner;


public class Uzduotis1 {

	static String SEPARATOR = " ";

	public static void main(String[] args) {

		String sakinys = ivesti();
		int indeksas1 = 0;
		int indeksas2 = sakinys.indexOf(SEPARATOR); // pakeisti

		String z1 = sakinys.substring(indeksas1, indeksas2);

		System.out.println("\nPirmas zodis sakinio: " + z1 + "!\n");
		System.out.println("Pirmas sakinio žodis: " + sakinys.split(SEPARATOR)[0] + ".");
	}

	private static String ivesti() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

}
