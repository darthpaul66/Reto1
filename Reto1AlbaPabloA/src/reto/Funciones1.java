package reto;

import java.util.Scanner;

public class Funciones1 {
	
	public static int suma(Scanner sc) {
		System.out.println("Introduce un número: ");
		String iuno = sc.nextLine();
		int n1 = Integer.parseInt(iuno);
		System.out.println("Introduce otro número: ");
		String kyoko = sc.nextLine();
		int n2 = Integer.parseInt(kyoko);
		int resultado = n1 + n2;
		return resultado;
	}
}
