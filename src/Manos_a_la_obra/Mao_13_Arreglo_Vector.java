package Manos_a_la_obra;

import java.util.Scanner;

public class Mao_13_Arreglo_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cant;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de companeros para ingresar sus nombres");
		cant=leer.nextInt();
		String nombres[] = new String[cant];
		
		for(int i = 0 ; i<cant ; i++) {
			System.out.println("Ingrese el nombre " + (i+1));
			nombres[i]=leer.next();
		}
		
		
		for(int i=0 ; i<cant ; i++) {
			System.out.println(nombres[i]);
		}
	}

}
