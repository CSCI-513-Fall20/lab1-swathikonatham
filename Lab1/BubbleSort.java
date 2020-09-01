
public class BubbleSort implements SortStrategy {
	long startTime = 0;
	long endTime   = 0;
	long totalTime = 0;
	
	public long[] sort(long[] ar) {
		startTime = System.currentTimeMillis();
		   for (int i = (ar.length - 1); i >= 0; i--)
		   {
		      for (int j = 1; j <= i; j++)
		      {
		         if (ar[j-1] > ar[j])
		         {
		              long temp = ar[j-1];
		              ar[j-1] = ar[j];
		              ar[j] = temp;
		         } 
		       } 
		    }
		   endTime = System.currentTimeMillis();
		   totalTime = endTime - startTime;
		   return ar;
	}
	
	public long getSortTime() {
		return totalTime;
	}
	
	/*public void resetTimer() {
		startTime = 0;
		endTime = 0;
	}*/
	
	public String strategyName() {
		return "BubbleSort";
	}

}