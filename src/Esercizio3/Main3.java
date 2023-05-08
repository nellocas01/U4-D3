package Esercizio3;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String str = "";
		
		while (!str.equals(":q")) {
			System.out.println("inserisci una stringa: ");
			str = scanner.nextLine();
			
			if(!str.equals(":q")) {
				strDivise.separazione(str)
			}
		}
		scanner.close();
	}

}
