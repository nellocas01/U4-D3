package Esercizio2;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci un numero intero: ");
		
		int num = scanner.nextInt();;
		switch(num) {
		case 0:{
			System.out.println("zero");
			break;
		}
		case 1:{
			System.out.println("uno");
			break;
		}
		case 2:{
			System.out.println("due");
			break;
		}
		case 3:{
			System.out.println("tre");
			break;
		}
		default:
			System.out.println("ERRor");
		}
		scanner.close();
	}
}
