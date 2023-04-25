package Ejercicios_de_aprendizaje_extras;

import java.util.Scanner;

/*TODO Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.*/
public class Ej_07_maximo_minimo_promedio {

	public static void main(String[] args) {
		int cant,vectorNum[];
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de numeros que va a registrar");
		cant = leer.nextInt();
		vectorNum = new int[cant];
		mientras(vectorNum,cant,leer);
		hacerMientras(vectorNum,cant,leer);
	}
	
	public static void mientras (int vectorN[],int cant,Scanner leer) {
		System.out.println("************ METODO WHILE ***********");
		int mayor=0,menor,i=0,cont=0;
		while(i<cant) {
			System.out.println("Ingrese el elemento #"+(i+1));
			vectorN[i]=leer.nextInt();
			
			if(mayor<vectorN[i]) {
				mayor=vectorN[i];
			}
			cont+=vectorN[i];
			i++;
		}
		i=0;
		menor = mayor;
		while(i<cant) {
			if(menor>vectorN[i]) {
				menor=vectorN[i];
			}
			i++;
		}
		System.out.println("El numero maximo es: "+mayor+"\nEl numero minimo es: "+menor+"\nEl promedio es: "+(double)(cont/cant));
	}
	
	public static void hacerMientras(int vectorN[],int cant,Scanner leer) {
		System.out.println("************ METODO DO-WHILE ***********");
		int mayor=0,menor,i=0,cont=0;
		do {
			System.out.println("Ingrese el elemento #"+(i+1));
			vectorN[i]=leer.nextInt();
			if(mayor<vectorN[i]) {
				mayor=vectorN[i];
			}
			cont+=vectorN[i];
			i++;
		}while(i<cant);
		i=0;
		menor = mayor;
		do {
			if(menor>vectorN[i]) {
				menor=vectorN[i];
			}
			i++;
		}while(i<cant);
		System.out.println("El numero maximo es: "+mayor+"\nEl numero minimo es: "+menor+"\nEl promedio es: "+(double)(cont/cant));
	}

}
