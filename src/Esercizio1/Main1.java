package Esercizio1;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stringPariDispari = "ciao";
		
		if(stringPariDispari.length() %2 == 0){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		int annoBisestile = 2016;
		if(annoBisestile %4 == 0) {
			System.out.println(true);
		}else if(annoBisestile % 100 == 0){
			System.out.println(true);
		}else if(annoBisestile % 400 == 0){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
