package Ejercicios_de_aprendizaje;

public class pruebas {

	public static void main(String[] args) {
		boolean h = true;
		int x = 0;
		cambiar(h,x);
		System.out.println(h+" "+x);
	}
	
	public static void cambiar(boolean h,int x) {
		h = false;
		x = 5;
		
		System.out.println(h+" "+x);
	}
}
