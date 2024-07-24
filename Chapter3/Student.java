package Chapter3;



/**
Implement a class Student. For the purpose of this exercise, a student has a name and a total quiz score. Supply an appropriate constructor and methods getName(), addQuiz(int score), getTotalScore(), and getAverageScore(). To compute the average, you also need to store the number of quizzes that the student took. Supply a StudentTester class that tests all methods.
*/

public class Student {

	private String name;
	private double totalScore;
	private int numOfQuiz;
	
	
	
	public Student(String name) {
		this.name = name;
		totalScore = 0;
		numOfQuiz = 0;
	} 


	public String getName() {
		return name;
	}
	
	public void addQuiz(int score) {
		totalScore += score;
		numOfQuiz++;
	}
	
	public double getTotalScore() {
		return totalScore;
	}
	
	public double getAverageScore() {
		return totalScore / numOfQuiz;
	}

	public void scorePrinter() {
		String text = "Name: "+ getName();
		text += "\nTotal Score: "+ getTotalScore();
		text += "\nNumber of quiz: "+ numOfQuiz;
		text += "\nAverage score: "+ getAverageScore();
		
		System.out.println(text);
	}






}
