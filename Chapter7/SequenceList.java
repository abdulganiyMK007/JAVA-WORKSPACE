package Chapter7;

import java.util.*;


public class SequenceList {

	private ArrayList<Integer> values;
	  
	  
	public SequenceList() {
		values = new ArrayList<Integer>(); 
	}  


	public void add(int aValue) {
		values.add(aValue); 
	}
	  
	  
	public int get(int index) {
	  return values.get(index);
	}
	
	
	public int size() {
		return values.size();  
	}


	public String toString() {
		return values.toString();
	}
	

 public SequenceList append(SequenceList other) {
 	SequenceList appender = new SequenceList();
 	
 	for (int i = 0; i < size(); i++) {
     appender.add(get(i));
   }
 	
   for (int i = 0; i < other.size(); i++) {
     appender.add(other.get(i));
   }
   
   return appender;
 }
 
 
 public SequenceList merge(SequenceList other) {
   SequenceList merger = new SequenceList();
   
   int size = (size() > other.size()) ? size() : other.size();
   
   for (int i = 0; i < size; i++) {
     if (i < size()) merger.add(get(i));
     
     if (i < other.size()) merger.add(other.get(i));
   }
   
   return merger;
 }
 
	private void sort() {
  	Collections.sort(values);
	}


	public SequenceList mergeSorted(SequenceList other) {
	  SequenceList mergSorter = new SequenceList();
	  
	  for (int i = 0; i < size(); i++) {
      mergSorter.add(get(i));
  	}
 	
   for (int i = 0; i < other.size(); i++) {
     mergSorter.add(other.get(i));
   }
	  
	  mergSorter.sort();
	  return mergSorter;
	}



}
