package Ejercicios_de_aprendizaje;

public class Ej_18_matrices {
	public static void main(String[] args) {
		int matriz[][] = new int[4][4];
		int matrizT[][] = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = (int) Math.round(Math.random() * 10);
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + ",");
			}
			System.out.println("");
		}
		System.out.println("///////////************///////////");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matrizT[i][j] = matriz[j][i];
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matrizT[i][j] + ",");
			}
			System.out.println("");
		}
	}
}
