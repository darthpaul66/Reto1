package reto;

public class Funciones2 {
	public static int multiplicar(int a, int b) {
		int resultado = a*b;
		
		return resultado;
	}
	public static int division(int a, int b) {
		int resultado = a/b;
		
		return resultado;
	}
	public static boolean esPositivo(int num) {
		boolean positivo = true;
		if (num < 0) {
			positivo = false;
		}
		
		return positivo;
	}
	public static boolean esNegativo(int num) {
		boolean negativo = false;
		if (num < 0) {
			negativo = true;
		}
		
		return negativo;
	}
}

