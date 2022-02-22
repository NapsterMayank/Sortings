package dsa;

public class SelectionSort {
	
	
	void Selectionsort(int arr[]) {
		int n = arr.length;
		
		for(int i=0;i< n-1;i++) {
		
			int min= i;
			
			for(int j =i+1;j<n;j++) {
				if(arr[j]< arr[min])
					min =j;

				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] =temp;
			}			
		}
	}
	void printSelection (int arr[]) {

		int n= arr.length;
		for(int i=0;i<n;++i) {
			System.out.print(arr[i]+ " ");
		}
	}
	void time (int arr[]) {
		System.out.println("\nAfter using Selection Sort");
		long start = System.nanoTime();
		Selectionsort(arr);
		long end = System.nanoTime();
		long execution = (end - start);
		System.out.println("Execution time of SelectionSort is: " + execution + " nanoseconds");
		
	}
	
	
	public static void main(String args[]) {
		
		SelectionSort obj = new SelectionSort();
		int arr[] = {11,3,14,61,76,1,90,2};
		obj.Selectionsort(arr);
		
		obj.printSelection(arr);
		obj.time(arr);
		
	}
}


