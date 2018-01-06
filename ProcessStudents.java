/**
 *  Adam Ely
 *  Project 2
 *  02/23/2015
 */
 public class ProcessStudents {
	
	//Create instance variable for an array of students
	Student[] student;
	
	public void runStudentProcessing() {
		
		//Calling the create students method
		createStudents();
		
		//Calling the display students method
		displayStudents();
		
	}
		
	public void createStudents() {
		
		//Creating an array of 3 student object references
		student = new Student[3];
		
		//Instantiate three student objects and assigning them to the elements of the array
		student[0] = new Student();
		student[1] = new Student();
		student[2] = new Student();
		
		//Setting the student objects with values 
		student[0].setStudentsName("Jim");
		student[0].getStudentId();
		student[0].getTotalCreditHours();
		student[0].getTotalNumberOfGradePoints();
		
		student[1].setStudentsName("Rick");
		student[1].setStudentId(99998);
		student[1].setTotalCreditHours(30);
		student[1].setTotalNumberOfGradePoints(95);
		
		student[2].setStudentsName("Sara");
		student[2].setStudentId(99997);
		student[2].setTotalCreditHours(33);
		student[2].setTotalNumberOfGradePoints(94);
	}
		
	public void displayStudents() {
		
		//Loop through the array of students and display them
		for(Student currentStudent : student) {
			currentStudent.displayStudentGradeInfo();
        }			
	}
 }