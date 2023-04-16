package Manos_a_la_obra;

import java.util.Scanner;

public class Mao_06_condicional_if_else {
	
	public static void main(String[] args) {
		int num1,num2;
		Scanner leer  = new Scanner(System.in);
		System.out.println("Ingrese dos numeros");
		
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		
		if((num1 > 25) || (num2 > 25)) {
			System.out.println("UNO de los numeros ingresados es mayor a 25");
		}else {
			System.out.println("NINGUNO de los numeros ingresador es mayor a 25");
		}
	}

}
