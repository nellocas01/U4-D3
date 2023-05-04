package Esercizio4;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci un numero intero: ");
		int number = scanner.nextInt();
		for (int i = number; i >= 0; i--) {
			System.out.println(i);
		}
		scanner.close();
	}

}
