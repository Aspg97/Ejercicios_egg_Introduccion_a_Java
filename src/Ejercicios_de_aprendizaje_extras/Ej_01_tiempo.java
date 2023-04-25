package Ejercicios_de_aprendizaje_extras;

import java.util.Scanner;

/*TODO Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/

public class Ej_01_tiempo {

	public static void main(String[] args) {
		int tiempo,dia,hora;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de minutos");
		tiempo = leer.nextInt();
		dia= (int)(tiempo/1440);
		hora=(int)(tiempo-(1440*dia))/60;
		System.out.println(tiempo+" minutos equivalen a: "+dia+" dias, "+hora+" horas");
	}

}
