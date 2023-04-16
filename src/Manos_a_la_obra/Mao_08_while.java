package Manos_a_la_obra;

import java.util.Scanner;

public class Mao_08_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner leer  = new Scanner(System.in);
		System.out.println("Ingrese un numero entre 0 y 10");
		num = leer.nextInt();
		
		while((num>10)||(num<0)) {
			System.out.println("Intentalo de nuevo");
			num = leer.nextInt();
		}
		
		
	}

}
