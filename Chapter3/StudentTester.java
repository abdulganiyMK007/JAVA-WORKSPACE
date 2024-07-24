package Chapter3;



public class StudentTester {


  public static void main(String[] args) {
  
  	Student st = new Student("Harry Potter");
  	st.addQuiz(10);
  	st.addQuiz(20);
  	st.addQuiz(30);
  	
  	st.scorePrinter();
  	
  	st.addQuiz(50);
  	st.addQuiz(40);
  	
  	st.scorePrinter();
  	

  }

}
