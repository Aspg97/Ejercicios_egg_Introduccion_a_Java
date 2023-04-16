package Manos_a_la_obra;

import java.util.Scanner;

public class Mao_09_do_while {
	public static void main(String[] args) {
		int num,sum=0,cont=1;
		Scanner leer = new Scanner(System.in);
		System.out.println("A continuacion debera ingresar 20 numeros");
		
		do {
			System.out.println("Ingrese el numero "+cont);
			num = leer.nextInt();
			if(num>0) {
				sum += num;
			}
			if(cont==20) {
				break;
			}
			cont++;
		}while(num!=0);
		
		System.out.println("La suma de los numeros ingresados es: "+sum);
	}
}
