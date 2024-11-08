package Vista;

import java.util.Scanner;

public class Vista {
	public static int LeerNumero() {
		System.out.println("Introduce un numero: ");
		try (Scanner sc = new Scanner(System.in)) {
			return sc.nextInt();
		}
	}

	public static void mostrar(int numero, String tipo, int tope) {
		System.out.println(tipo);
		int indice = numero;
		while (indice >= tope) {
			System.out.println(indice);
			indice -= 2;
		}
	}

}
