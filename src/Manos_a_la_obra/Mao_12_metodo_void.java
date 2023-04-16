package Manos_a_la_obra;

import java.util.Scanner;

public class Mao_12_metodo_void {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese dos numeros para determinar si son multiplos o no");

		num1 = leer.nextInt();
		num2 = leer.nextInt();
		
		multiplo(num1,num2);

	}

	public static void multiplo(int num1, int num2) {
		
		if(num1%num2==0) {
			System.out.println("Son multiplos");
		}else {
			System.out.println("No son multiplos");
		}
	}

}
