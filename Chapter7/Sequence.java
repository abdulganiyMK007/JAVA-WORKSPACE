package Chapter7;

import Chapter7.Sequence;
import java.util.Arrays;


public class Sequence {

	private int[] values;
	
	
	public Sequence(int size) {
		values = new int[size]; 
	}  
	
	
	public void set(int index, int value) {
		values[index] = value; 
	}


	public int get(int index) { 
		return values[index]; 
	}
	
	
	public int size() { 
		return values.length; 
	}  
	
	
	/* 
		Checks whether two sequences have the same 
		values in the same order.
	*/
	public boolean equals(Sequence other) {
	  if (size() != other.size()) return false;
	  
	  for (int i = 0; i < size(); i++) {
	    if (get(i) != other.get(i)) return false;
		}
		
		return true;
	}
	
	
	
	/*
		Checks whether two sequences have the same 
		values in some order, ignoring duplicates.
	*/
	public boolean sameValues(Sequence other) {
	  boolean isPresent = false;
	  
	  for (int i = 0; i < size(); i++) {
	  	for (int j = 0; j < other.size(); j++) {
	  		if (values[i] == other.get(j)) {
	  			isPresent = true;
	  			break;  
				}
	  	}
	  	if (!isPresent) return false;
	  	isPresent = false;
		}
	  
	  
	  for (int i = 0; i < other.size(); i++) {
	  	for (int j = 0; j < size(); j++) {
	  		if (values[j] == other.get(i)) {
	  			isPresent = true;
	  			break;  
				}
	  	}
	  	if (!isPresent) return false;
	  	isPresent = false;
		}
	  
	  return true;
	}
	
	
	/*
		Yields the sum of this sequence and another. 
		If the sequences don’t have the same length, 
		assume that the missing elements are zero.
	*/
	public Sequence sum(Sequence other) {
		int size = Math.max(size(), other.size());
		
		Sequence sumSeq = new Sequence(size);
		
		int val1, val2;
		val1 = val2 = 0;
		
		for (int i = 0; i < size; i++) {
			val1 = (i < size()) ? get(i) : 0;
			val2 = (i < other.size()) ? other.get(i) : 0;
			
			sumSeq.set(i, val1 + val2);
		}
		
	  return sumSeq;
	}
	
	/*
		Checks whether two sequences have the same values
		in some order, with the same multiplicities.
	*/
	public boolean isPermutationOf(Sequence other) {
		Sequence copyValue = clone();
	  Sequence copyOther = other.clone();
	  
	  copyValue.sort();
	  copyOther.sort();
	  
	  return copyValue.equals(copyOther);
	}
	

	public void sort() {
	  Arrays.sort(values);
	}
	

	public Sequence clone() {
	  Sequence copy = new Sequence(size());
	  
	  for (int i = 0; i < size(); i++) {
	  	copy.set(i, get(i));
	  }
	  
	  return copy;
	}
	
	
	public String toString() {
	  String result = "[";
	  
	  for (int i = 0; i < size() - 1; i++) {
	  	result += get(i) + ", ";
	  }
	  
	  result += get(size() - 1) + "]";
	  
	  System.out.println(result);
	  return result;
	}


}
