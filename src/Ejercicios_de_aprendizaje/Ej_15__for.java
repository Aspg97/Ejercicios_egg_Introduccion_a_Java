package Ejercicios_de_aprendizaje;

/*TODO Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.*/

public class Ej_15__for {

	public static void main(String[] args) {
		int numeros[] = new int[100];
		for (int i = 0; i < 100; i++) {
			numeros[i] = i + 1;
		}
		for (int i = 99; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
	}
}
