package Chapter7;



public class SequenceListTester {

  public static void main(String[] args) {
  
  	SequenceList value = new SequenceList();
  	value.add(1);
  	value.add(4);
  	value.add(9);
  	value.add(16);
  	
		SequenceList other = new SequenceList();
		other.add(9);
		other.add(7);
		other.add(4);
		other.add(9);
		other.add(11);
		other.add(11);
		other.add(11);
		
		
		System.out.println("Value: "+ value.toString());
		
		System.out.println(value.mergeSorted(other).toString());
		
		/*
		SequenceList appender = new SequenceList();
		appender = value.append(other);
		
		
		System.out.println("Merge: "+ value.merge(other).toString());
		System.out.println("Append: "+ appender.toString());
		
		System.out.println("Value: "+ value.toString());
		System.out.println("Other: "+ other.toString());
		*/
  }

}
