//Create a GradeBook object and invoke its determineClassAverage method.



public class GradeBookTest {

	//main method begins program execution
	public static void main(String[] args) {
		//create a GradeBook object myGradeBook and
		//pass course name to constructor
		
		GradeBook myGradeBook =  new GradeBook(
				"CS101 Introduction to Java Programming");
		
		myGradeBook.displayMessage();//display welcome message
		myGradeBook.inputGrades();//find average of 10 grades
		myGradeBook.displayGradeReport();//display report based on grades
		
		
			
		

	}//end main

}//end class GradeBookTest
