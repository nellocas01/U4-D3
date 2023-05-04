package esempio.student;

public class Student {
	char genere;
	String firstName;
	String lastName;
	double[] arrayVoti;
	
	public Student(char genere, String firstName, String lastName, double[]arrayVoti) {
		this.genere = genere;
		this.firstName = firstName;
		this.lastName = lastName;
		this.arrayVoti = arrayVoti;
	}
	
	public double mediaVoti() {
		double totale = 0;
		for(int i = 0; i < arrayVoti.length; i++) {
			totale +=arrayVoti[i];
		}
		return totale/arrayVoti.length;
	}
	
	public static Student bestStudent(Student[] studenti) {
		double maxAverageRate;
		for(int i = 0; i < studenti.length; i++) {
			if(studenti[i].genere == 'M' ) {
				//return
			}
		}
	}
}
