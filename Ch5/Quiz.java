
public class Quiz {
	
    
	public static void main(String[] args) {
		
		// First True or False question
		Question question_tf1 = new TrueFalseQuestion(
		"1. Ethiopia is located in Eastern Africa.","TRUE");
		
		// Second True or False question
		Question question_tf2 = new TrueFalseQuestion(
		"2. In Java programming language key words can be used as variables.","FALSE");
		
		// Third True or False question
		Question question_tf3 = new TrueFalseQuestion(
		"3. Concrete subclasses of an abstract class must define all abstract methods of their parent class.","TRUE");
		
		// Fourth True or False question
		Question question_tf4 = new TrueFalseQuestion(
		"4.The default value of Java instance variable of type int is null.","FALSE");
		
		// Fifth True or False question
		Question question_tf5 = new TrueFalseQuestion(
		"5. In Java a parent class variable can be used to reference a subclass object","TRUE");		
		
		// First multiple choice question 
		Question question = new MultipleChoiceQuestion(
				"6. What is the largest planet among the following?",
				 "Mercury",
				 "Venus",
				 "Earth",
				 "Mars",
				 "Jupiter",
				 "e"
				 );
		
		
		// Second multiple choice question
		Question question2 = new MultipleChoiceQuestion(
				"7. What is the smallest even and prime number?",
				 "10",
				 "3",
				 "4",
				 "2",
				 "None of the above",
				 "D"   // 2 is the smallest even and prime number
				  );
				
		//Third multiple choice question
		Question question3 = new MultipleChoiceQuestion(
				"8. What is the largest sized animal among the following?",
				 "Ant",
				 "Elephant",
				 "Dog",
				 "Cat",
				 "Butterfly",
				 "B"   // Elephant is the largest sized animal among the list
				  );
		
		//Fourth multiple choice question
		Question question4 = new MultipleChoiceQuestion(
				"9. What is the most common compound on earth?",
				"Sodium Chloride (common salt)",
				"Oxygen",
				"Water",
				"Hydrogen",
				"Silicon Oxide",
				"C"
				  );
		
		//Fifth multiple choice question
		Question question5 = new MultipleChoiceQuestion(
				"10. Which of the following is NOT a premitive data type in Java?",
				"string",
				"float",
				"double",
				"boolean",
				"int",
				"A"
				  );
		
		//calling the check method for each True or false question
		question_tf1.check();
		question_tf2.check();
		question_tf3.check();
		question_tf4.check();
		question_tf5.check();
		//calling the check method for each multiple choice question
		question.check();
		question2.check();
		question3.check();
		question4.check();
		question5.check();
		
		
		//question.showResults();//calling showResults method using object question (option 1)
		MultipleChoiceQuestion.showResults(); //calling showResults method using the class name (option 2)
				
		
		}// end of main method
			
	}//end of public class Quiz

