public class QuickSort implements SortingAlgorithm {
	
	private int array[];
	
    public void sort(int[] arr) {
        this.array = arr;
        quickSort(0, arr.length - 1);
    }
 
    private void quickSort(int lower, int high) {
         
        int i = lower;
        int j = high;
        
        int pivot = array[lower+(high-lower)/2]; 
        
        while(i <= j) {
            while(array[i] < pivot) {
                i++;
            }
            while(array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);  
                i++;
                j--;
            }
        }
        if (lower < j) {
            quickSort(lower, j);
        }
        if (i < high) {
            quickSort(i, high);
        }
    }
 

	private void swap( int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}