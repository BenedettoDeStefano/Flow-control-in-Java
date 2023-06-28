package Es1;

public class Main {

	public static void main(String[] args) {

		String str1 = "Ciao";
		String str2 = "Mondo";

		System.out.println("la lunghezza della stringa " + str1 + " è pari? " + Operazioni.stringaPariDispari(str1));
		System.out.println("la lunghezza della stringa " + str2 + " è dispari " + Operazioni.stringaPariDispari(str2));

		int anno1 = 2020;
		int anno2 = 2030;

		System.out.println("L'anno " + anno1 + " è bisestile? " + Operazioni.annoBisestile(anno1));
		System.out.println("L'anno " + anno2 + " è bisestile? " + Operazioni.annoBisestile(anno2));

	}

}
