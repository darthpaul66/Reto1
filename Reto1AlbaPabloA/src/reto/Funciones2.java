package reto;

public class Funciones2 {
	public static int Multiplicar(int a, int b) {
		int resultado = a*b;
		System.out.println(a + " x " + b + " = "+resultado);
		
		return resultado;
	}
	public static double Multiplicar(double a, double b) {
		double resultado = a*b;
		System.out.println(a + " x " + b + " = "+resultado);
		
		return resultado;
	} 
	
	public static int Division(int a, int b) {
		int resultado = a/b;
		
		return resultado;
	}
	public static double Division(double a, double b) {
		double resultado = a/b;
		
		return resultado;
	} 
	public static boolean Positivo(int num) {
		boolean positivo = true;
		if (num < 0) {
			positivo = false;
		}
		
		return positivo;
	}
	public static boolean Positivo(double num) {
		boolean positivo = true;
		if (num < 0) {
			positivo = false;
		}
		
		return positivo;
	}
	public static boolean Negativo(int num) {
		boolean negativo = false;
		if (num < 0) {
			negativo = true;
		}
		
		return negativo;
	}
	public static boolean Negativo(double num) {
		boolean negativo = false;
		if (num < 0) {
			negativo = true;
		}
		
		return negativo;
	}
}

