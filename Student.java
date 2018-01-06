/**
 *  Adam Ely
 *  Project 2
 *  02/23/2015
 */
 public class Student {
	//Creating private instance variables
	private String studentsName;
	private int studentId = 99999;
	private int totalCreditHours = 45;
	private int totalNumberOfGradePoints = 100;
	
	//Creating get/set methods for the instance variables
	public String getStudentsName() {
		return studentsName;
	}
	
	public void setStudentsName(String studentsName) {
		this.studentsName = studentsName;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	} 
	
	public int getTotalCreditHours() {
		return totalCreditHours;
	}
	
	public void setTotalCreditHours(int totalCreditHours) {
		this.totalCreditHours = totalCreditHours;
	}
	
	public int getTotalNumberOfGradePoints() {
		return totalNumberOfGradePoints;
	}
	
	public void setTotalNumberOfGradePoints(int totalNumberOfGradePoints) {
		this.totalNumberOfGradePoints = totalNumberOfGradePoints;
	}
	
	//Creating method to calculate the gpa
	public float calculateGradePointAverage() {
		//calculation for the gpa
		float gpa = (float) totalNumberOfGradePoints / totalCreditHours;
		
		return gpa;
	}
	
	//Creating a method to display student grade information
	public void displayStudentGradeInfo() {
		//Output for student grade information
		System.out.println("Students name is : " + studentsName);
		System.out.println("Student ID is: " + studentId); 
		System.out.println("Total number of credits hours taken by student: " + totalCreditHours);
		System.out.println("Total number of grade points earned by the student is: " + totalNumberOfGradePoints);
		System.out.println("The GPA of the student is : " + calculateGradePointAverage());
		System.out.println("-----------------------------------------------------------");
	}
 }