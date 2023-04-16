package Ejercicios_de_aprendizaje;

import java.util.Scanner;

/* TODO Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/

public class Ej_14_tranformacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cantMoneda;
		String moneda;
		boolean op=false;
		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de euros a convertir");
		cantMoneda = leer.nextInt();
		
		do {			
			System.out.println("Ingrese el tipo de moneda al que se convertira");
			System.out.println("- Dolares\n- Yenes\n- Libra\n- Salir");
			moneda = leer.next();
			
			switch (moneda) {
			case "Dolares":
				conversor(cantMoneda, moneda);
				break;
			case "Yenes":
				conversor(cantMoneda, moneda);
				break;
			case "Libras":
				conversor(cantMoneda, moneda);
				break;
			case "Salir":
				op = true;
				System.out.println("**Saliendo**");
				break;
			default:
				System.out.println("Elije una opcion valida");
			}
		} while (op == false);

		System.out.println("FIN");
	}

	public static void conversor(double cantidad, String moneda) {
		switch (moneda) {
		case "Dolares":
			System.out.println(cantidad + " Euros a Dolares es: " + (cantidad * 1.28611));
			break;
		case "Yenes":
			System.out.println(cantidad + " Euros a Yenes es: " + (cantidad * 129.852));
			break;
		case "Libras":
			System.out.println(cantidad + " Euros a Libras es: " + (cantidad * 0.86));
			break;
		}
	}

}
