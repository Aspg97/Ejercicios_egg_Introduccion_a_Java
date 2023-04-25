package Ejercicios_de_aprendizaje_extras;

import java.util.Scanner;

/* TODO Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio. */
public class Ej_05_importe_efectivo {

	public static void main(String[] args) {
		char tipoSocio;
		double descuento;
		double costoTratamiento;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingres el tipo de socio al que pertenece 'A','B'o'C'");
		tipoSocio = leer.next().charAt(0);
		tipoSocio = Character.toLowerCase(tipoSocio);
		switch (tipoSocio) {
		case 'a':
			descuento = 0.5;
			System.out.println("Ingrese el costo del tratamiento");
			costoTratamiento = leer.nextDouble();
			System.out.println(
					"Ud pertenece al socio tipo A por lo tanto tiene un descuento del 50% y valor a pagar es  $"
							+ (costoTratamiento * descuento));
			break;
		case 'b':
			descuento = 0.7;
			System.out.println("Ingrese el costo del tratamiento");
			costoTratamiento = leer.nextDouble();
			System.out.println(
					"Ud pertenece al socio tipo B por lo tanto tiene un descuento del 30% y valor a pagar es  $"
							+ (costoTratamiento * descuento));
			break;
		case 'c':
			System.out.println("Ingrese el costo del tratamiento");
			costoTratamiento = leer.nextDouble();
			System.out.println(
					"Ud pertenece al socio tipo C por lo tanto no tiene descuento en su tratamiento y su valor a pagar es $"
							+ costoTratamiento);
			break;
		default:
		}
	}

}
