package Ejercicios_de_aprendizaje;

import java.util.Scanner;

/* TODO Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.*/

public class Ej_11_do_while {

	public static void main(String[] args) {
		int op;
		char opSalir='n';
		Scanner leer = new Scanner(System.in);

		do {
			System.out.println("------------- MENU -------------");
			System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\n*Elija una opcion*");
			System.out.println("--------------------------------");
			op = leer.nextInt();
			switch (op) {
			case 1:
				Operacion(op,leer);
				break;
			case 2:
				Operacion(op,leer);
				break;
			case 3:
				Operacion(op,leer);
				break;
			case 4:
				Operacion(op,leer);
				break;
			case 5:
				System.out.println("¿Está seguro que desea salir del programa (S/N)?");
				opSalir=leer.next().charAt(0);
				break;
			default:
				System.out.println("Ingrese una opcion valida");
			}
		} while (opSalir == 'n' || opSalir == 'N');
		System.out.println("FIN");
	}
	
	public static void Operacion(int op, Scanner leer) {
		double num1,num2;
		System.out.println("Ingrese los numeros a operar");
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		switch (op) {
		case 1:
			System.out.println("El resultado de la suma es: "+(num1+num2));
			break;
		case 2:
			System.out.println("El resultado de la resta es: "+(num1-num2));
			break;
		case 3:
			System.out.println("El resultado de la multiplicacion es: "+(num1*num2));
			break;
		case 4:
			System.out.println("El resultado de la division es: "+num1/num2);
		}
	}

}
