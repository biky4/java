
public class QuizUnit4 {
	
    
	public static void main(String[] args) {
		
		// First question
		MultipleChoiceQuestion question = new MultipleChoiceQuestion(
				"1. What is the largest planet among the following?",
				 "Mercury",
				 "Venus",
				 "Earth",
				 "Mars",
				 "Jupiter",
				 "e"
				 );
		
		
		// Second question
		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
				"2. What is the smallest even and prime number?",
				 "10",
				 "3",
				 "4",
				 "2",
				 "None of the above",
				 "D"   // 2 is the smallest even and prime number
				  );
				
		//Third question
		MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
				"3. What is the largest sized animal among the following?",
				 "Ant",
				 "Elephant",
				 "Dog",
				 "Cat",
				 "Butterfly",
				 "B"   // Elephant is the largest sized animal among the list
				  );
		
		//Fourth question
		MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
				"4. What is the most common compound on earth?",
				"Sodium Chloride (common salt)",
				"Oxygen",
				"Water",
				"Hydrogen",
				"Silicon Oxide",
				"C"
				  );
		
		//Fifth question
		MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
				"5. Which of the following is NOT a premitive data type in Java?",
				"string",
				"float",
				"double",
				"boolean",
				"int",
				"A"
				  );
		
		//calling the check method for each question
		question.check();
		question2.check();
		question3.check();
		question4.check();
		question5.check();
		
		//question.showResults();//calling showResults method using object question (option 1)
		MultipleChoiceQuestion.showResults(); //calling showResults method using the class name (option 2)
		
				
		
		}// end of main method
		
		
		
	}//end of public class QuizUnit4

