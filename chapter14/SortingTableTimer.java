package chapter14;

public class SortingTableTimer {
	
	private long maxValue;
	private long minValue;
	private int numOfInterval;
	private long[][] table;
	
	private static final int N_MAX = 200;
	private static final int N_TIMES = 10;
	
	public void getMaxValue(long maxValue) {
		this.maxValue = maxValue;
	}
	
	public void getMinValue(long minValue) {
		this.minValue = minValue;
	}
	
	public void getNumOfInterval(int numOfinterval) {
		this.numOfInterval = numOfinterval;
	}
	
	
	
	
	private long getTime(int[] a) {
		StopWatch timer = new StopWatch();
		timer.start();
		SelectionSorter.sort(a);
		timer.stop();
		return timer.getElapsedTime();
	}
	
	
	private long[][] getTable() {
		table = new long[numOfInterval + 1][2];
		int size = 0;
		long sum = 0;
		int interval = (int) ((maxValue - minValue) / numOfInterval);
		
		for (int i = 0; i <= numOfInterval; i++) {
			size = (int) ((i * interval) + minValue);
			int[] array = ArrayUtil.randomIntArray(size, N_MAX);
			
			sum = 0;
			for (int j = 0; j < N_TIMES; j++) 
				sum += getTime(array);			
			
			table[i][1] = sum / N_TIMES;
//			table[i][1] = getTime(array);
			table[i][0] = size;
			
			
		}
		
		return table;
	}
	
	
	public void printTable() {
		getTable();
		
		System.out.printf("%15s | %-15s \n", "N", "Milliseconds");
		for (int i = 0; i <= numOfInterval; i++) {
			System.out.printf("%15d | %-15d \n", table[i][0], table[i][1]);
		}
		
	}
	
	
}





