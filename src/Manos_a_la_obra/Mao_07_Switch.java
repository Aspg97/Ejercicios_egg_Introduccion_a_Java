package Manos_a_la_obra;

import java.util.Scanner;

public class Mao_07_Switch {
	public static void main(String[] args) {
		
		int tipoMotor;
		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese el tipo de motor");
		tipoMotor = leer.nextInt();

		switch (tipoMotor) {
		case 1:
			System.out.println("“La bomba es una bomba de agua”.");
			break;
		case 2:
			System.out.println("“La bomba es una bomba de gasolina”.");
			break;
		case 3:
			System.out.println("“La bomba es una bomba hormigón”.");
			break;
		case 4:
			System.out.println("“La bomba es una bomba de pasta alimenticia”.");
			break;
		default:
			System.out.println("“No existe un valor válido para tipo de bomba”.");
		}
	}
}
