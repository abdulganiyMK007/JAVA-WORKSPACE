package Chapter7;


public class SequenceTester {

  public static void main(String[] args) {
  
  	
  
  	Sequence seq = new Sequence(9);
  	seq.set(0, 1);
  	seq.set(1, 4);
  	seq.set(2, 9);
  	seq.set(3, 16);
  	seq.set(4, 9);
  	seq.set(5, 7);
  	seq.set(6, 4);
  	seq.set(7, 9);
  	seq.set(8, 11);
  	
  	
  	Sequence s = new Sequence(9);
  	s.set(0, 11);
  	//s.set(1, 4);
  	//s.set(2, 9);
  	s.set(3, 16);
  	s.set(4, 9);
  	s.set(5, 7);
  	s.set(6, 4);
  	s.set(7, 9);
  	s.set(8, 1);
  	
  	
  	seq.toString();
  	s.toString();
  	
  	System.out.println(s.sameValues(seq));
  	
  	/*
  	System.out.println("Equal: "+ s.equals(seq));
  	seq.sum(s).toString();
  	
  	System.out.println("Permutation: "+ seq.isPermutationOf(s));
  	*/
  	
  	
  }

}
