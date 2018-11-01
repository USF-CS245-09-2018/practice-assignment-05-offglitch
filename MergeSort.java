public class MergeSort implements SortingAlgorithm {
	
	 private int[] arr;
	 private int[] target;
	   
	
	
	public void sort(int arr[]) {
		 this.arr = arr;
	     this.target = new int[arr.length];
		mergeSort( 0 , arr.length-1);
	}
	  
    private void mergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
           
            mergeSort(lowerIndex, middle);
            
            mergeSort(middle + 1, higherIndex);
  
            merge(lowerIndex, middle, higherIndex); 
        }
    }
	 
	    private void merge(int low, int mid, int high) {
	 
	        for (int i = low; i <= high; i++) {
	        	target[i] = arr[i];
	        }
	        int i = low;
	        int j = mid + 1;
	        int k = low;
	        while (i <= mid && j <= high) {
	            if (target[i] <= target[j]) {
	                arr[k] = target[i];
	                i++;
	            } 
	            else {
	                arr[k] = target[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= mid) {
	            arr[k] = target[i];
	            k++;
	            i++;
	        }
	 
	    }
		
}