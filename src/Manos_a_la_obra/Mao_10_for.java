package Manos_a_la_obra;

import java.util.Scanner;

public class Mao_10_for {
	public static void main(String[] args) {
		
		int num;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese 4 numeros");
		
		for(int i = 0 ; i<4 ; i++) {
			
			System.out.println("Ingrese el #"+(i+1));
			num = leer.nextInt();
			while(num<0 || num>20) {
				System.out.println("Ingresa valores comprendidos entre 0 y 20");
				num = leer.nextInt();
			}
			System.out.print(num + " ");
			for(int j = 0 ; j<num ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
