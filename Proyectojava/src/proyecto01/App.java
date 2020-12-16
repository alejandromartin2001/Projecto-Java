package proyecto01;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		System.out.println("Introduce tu nombre");
		String result = leerStringPorConsola();
		System.out.println("HOLA, "+result.toUpperCase());
	}

	
	
	public static String leerStringPorConsola() {
		Scanner sc = new Scanner (System.in);
		String result = sc.next();
		sc.close();
		return result;
	}
	
}
