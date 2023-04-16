package Ejercicios_de_aprendizaje;

import java.util.Scanner;

/* TODO Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/

public class Ej_12_cadena {

	public static void main(String[] args) {
		int contInco = 0, contCorrec = 0;
		String cadena;
		Scanner leer = new Scanner(System.in);
		do {
			System.out.println("Ingrese una cadena de texto de hasta 5 caracteres");
			cadena = leer.nextLine();
			
			switch (cadena) {
			case "&&&&&":
				System.out.println("FIN");
				break;
			default:
				if ((cadena.length() == 5) && (cadena.substring(0, 1).equals("X")) && (cadena.substring(4, 5).equals("O"))) {
					System.out.println(cadena.substring(0, 1)+","+cadena.substring(4, 5)+","+cadena.length());
					contCorrec++;
				} else {
					contInco++;
				}
			}
		} while (!cadena.equals("&&&&&"));

		System.out.println("Se ingresaron " + (contCorrec + contInco) + " cadenas en total\n" + contCorrec
				+ " son CORRECTAS\n" + contInco + " son INCORRECTAS");
	}
}
