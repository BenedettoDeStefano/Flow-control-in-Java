package Es4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//

		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci un numero intero");

		int numero = scanner.nextInt();

		System.out.println("Conto alla eovescia");

		for (int i = numero; i >= 0; i--) {
			System.out.println(i);
			scanner.close();
		}
	}

}
