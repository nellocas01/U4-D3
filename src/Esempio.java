import esempio.student.Student;

public class Esempio {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " \t");
			for(int j = 1; j <= 10; j++) {
				System.out.println(i*j + " \t"); 
			}
			System.out.println();
		}
		
		
		Student student1 = new Student('M', "Nello", "Casolla", new double[] {1, 5, 8});
		Student student2 = new Student('F', "Ornella", "Casolla", new double[] {1, 5, 8});
		Student student3 = new Student('M', "Ezio", "Casolla", new double[] {1, 5, 8});
		Student student4 = new Student('F', "Cinzia", "Casolla", new double[] {1, 5, 8});
		Student student5 = new Student('M', "Maurizio", "Casolla", new double[] {1, 5, 8});
		
		System.out.println(student1.mediaVoti());
	}
	
	

}
