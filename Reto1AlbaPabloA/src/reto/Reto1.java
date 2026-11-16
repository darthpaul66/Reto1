package reto;

import java.util.Scanner;

import reto.Funciones1;
import reto.Funciones2;

public class Reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eleccion = 9;
		String chiaki = "";
		int n1 = 0;
		int n2 = 0;
		int r1 = 0;
		int r2 = 0;
		int f1 = 0;
		int f2 = 0;
		int d1 = 0;
		int d2 = 0;
		
		while (eleccion != 0) {
			System.out.println("Elige la operación");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. División");
			System.out.println("5. Par");
			System.out.println("6. Impar");
			System.out.println("7. Positivo");
			System.out.println("8. Negativo");
			System.out.println("0. Salir");
			chiaki = sc.nextLine();
			eleccion = Integer.parseInt(chiaki);
		switch (eleccion) {
		case 0: {
			break;
		} case 1: {
			System.out.println("Dime el primer sumando: ");
			 chiaki = sc.nextLine();
			 n1 = Integer.parseInt(chiaki);
			 System.out.println("Dime el segundo sumando: ");
			 chiaki = sc.nextLine();
			 n2 = Integer.parseInt(chiaki);
			 System.out.println(n1 +" + "+ n2+ " = " + Funciones1.suma(n1,n2));
			 break;
			
		} case 2: {
			System.out.println("Dime el minuendo: ");
			 chiaki = sc.nextLine();
			 r1 = Integer.parseInt(chiaki);
			 System.out.println("Dime el sustraendo: ");
			 chiaki = sc.nextLine();
			 r2 = Integer.parseInt(chiaki);
			 System.out.println(r1 +" - "+ r2+ " = " + Funciones1.resta(r1,r2));
			 break;
			
		} case 3: {
			System.out.println("Dime el primer factor: ");
			 chiaki = sc.nextLine();
			 f1 = Integer.parseInt(chiaki);
			 System.out.println("Dime el segundo factor: ");
			 chiaki = sc.nextLine();
			 f2 = Integer.parseInt(chiaki);
			 System.out.println(f1 +" x "+ f2+ " = " + Funciones2.multiplicar(f1,f2));
			 break;
		} case 4: {
			System.out.println("Dime el dividendo: ");
			 chiaki = sc.nextLine();
			 d1 = Integer.parseInt(chiaki);
			 d2 = 0;
			 while (d2 == 0) {
			 System.out.println("Dime el divisor: ");
			 chiaki = sc.nextLine();
			 d2 = Integer.parseInt(chiaki);
			 }
			 System.out.println(d1 +" / "+ d2+ " = " + Funciones2.division(d1,d2));
			 break;
			 
		} case 5: {
			System.out.println("Dime un número: ");
			 chiaki = sc.nextLine();
			 n1 = Integer.parseInt(chiaki);
			 if (Funciones1.esPar(n1) == true) {
				 System.out.println("Sí, es par");
			 } else {
				 System.out.println("No es par");
			 }
			 break;
		} case 6: {
			System.out.println("Dime un número: ");
			 chiaki = sc.nextLine();
			 n1 = Integer.parseInt(chiaki);
			 if (Funciones1.esImpar(n1) == true) {
				 System.out.println("Sí, es impar");
			 } else {
				 System.out.println("No es impar.");
			 }
			 break;
		} case 7: {
			System.out.println("Dime un número: ");
			 chiaki = sc.nextLine();
			 n1 = Integer.parseInt(chiaki);
			 if (Funciones2.esPositivo(n1) == true) {
				 System.out.println("Sí, es positivo");
			 } else {
				 System.out.println("No es positivo.");
			 }
			 break;
		} case 8: {
			System.out.println("Dime un número: ");
			 chiaki = sc.nextLine();
			 n1 = Integer.parseInt(chiaki);
			 if (Funciones2.esNegativo(n1) == true) {
				 System.out.println("Sí, es Negativo");
			 } else {
				 System.out.println("No es negativo.");
			 }
			 break;
		}
		default:
			System.out.println("El número tiene que ser de la lista anterior.");
		}
		}
		
	}

}
