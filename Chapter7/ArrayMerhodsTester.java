package Chapter7;


public class ArrayMerhodsTester {

  public static void main(String[] args) {
  
  	int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
  	ArrayMethods arr = new ArrayMethods(array);
  
  	//arr.swapFirstAndLast();
  	//arr.shiftLeft();
  	//arr.shiftRight();
  	//arr.zeroAllEven();
  	//arr.replaceWithLargerBound();
  	//arr.removeMiddleElem();
  	//arr.moveEvenToFront();
  	//arr.containAdjacentDuplicate();
  	//arr.isSorted();
		arr.containDuplicate();
		
  }

}
