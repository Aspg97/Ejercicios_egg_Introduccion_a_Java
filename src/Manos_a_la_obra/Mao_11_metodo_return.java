package Manos_a_la_obra;

import java.util.Scanner;

public class Mao_11_metodo_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase="";
		char letras;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese una frase letra por letra");
		
		do {
			
			letras = leer.next().charAt(0);
			frase = frase.concat(Character.toString(letras));
			
		}while(letras !='.');
		
		
		
		String retorno = nuevaFrase(frase);

		System.out.println("nueva frase: " + retorno);

	}

	public static String nuevaFrase(String frase) {

		for (int i = 0; i < frase.length(); i++) {

			String palabra = frase.substring(i++, i++);

			do {

				switch (palabra) {
				case "a":
					frase = frase.replace("a", "@");
				case "e":
					frase = frase.replace("e", "#");
				case "i":
					frase = frase.replace("i", "$");
				case "o":
					frase = frase.replace("o", "%");
				case "u":
					frase = frase.replace("u", "*");
				}

			} while (palabra.equals("."));
		}
		return frase;
	}
}
