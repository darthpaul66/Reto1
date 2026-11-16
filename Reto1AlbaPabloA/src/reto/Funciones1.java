package reto;

import java.util.Scanner;

public class Funciones1 {
	
	public static int suma(int n1, int n2) {
		int resultado = n1 + n2;
		return resultado;
	}
	
	public static int resta(int n1, int n2) {
		int resultado = n1 + n2;
		return resultado;
	}
	
	public static boolean esPar(int n1) {
		boolean kyoko = false;
		
		if (n1%2==0) {
			kyoko = true;
		}
		
		return kyoko;
	}
	
	public static boolean esImpar(int n1) {
		boolean kyoko = false;
		
		if (n1%2!=0) {
			kyoko = true;
		}
		
		return kyoko;
	}
}
