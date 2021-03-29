import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName, idNumber);
        this.testScores = new int[scores.length]; //defint length of testScores
        for(int i = 0; i < scores.length; i++) {  // manaul copy of array
            this.testScores[i] = scores[i];
        } 
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate () {
        char grade = 'T'; //minimum score
        double sum = 0;
        
        for(int i = 0; i < this.testScores.length; i++) {
            sum += this.testScores[i];
        }
        double average = sum / this.testScores.length;
        if (average >= 90 && average <= 100) {
            grade = 'O';
        } else if (average >= 80 && average < 90) {
            grade = 'E';
        } else if (average >= 70 && average < 80) {
            grade = 'A';
        } else if (average >= 55 && average < 70) {
            grade = 'P';
        } else if (average >= 40 && average < 55) {
            grade = 'D';
        } 
        return grade;
    }

}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
