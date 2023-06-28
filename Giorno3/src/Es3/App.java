package Es3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);


		String input = " ";
	
		while (!input.equals("q")) {
			System.out.println(
					"Inserisci una stringa per suddividerla; Oppure inserisci la lettera (q) per terminare il prog");
			input = scanner.nextLine();

			if (!input.equals("q")) {
				StringBuilder output = new StringBuilder();

				for (int i = 0; i < input.length(); i++) {
					output.append(input.charAt(i));
					if (i < input.length() - 1) {
						output.append(",");
					}
				}

				System.out.println("Stringa suddivisa: " + output.toString());
			}
		}
		System.out.println("Programma terminato.");
		scanner.close();
	}

}
