package Esercizio3;

public class String {

	public static void separazione(String stringa) {
		
		String[] caratteri = stringa.split("");
		
		for(int i = 0; i < caratteri.length; i++) {
			
			System.out.println(caratteri[i]);
			
			if(i<caratteri.length -1) {
				
				System.out.print(",");
			}
		}
			System.out.println();
	}

}
