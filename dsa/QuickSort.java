package dsa;

public class QuickSort {
	
	  void swap (int arr[], int i , int j) {
		
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	  int partition(int arr[], int start, int end)
	 {
	     int pivot = arr[end];
	     int i = (start - 1);  
	     for(int j = start; j <= end - 1; j++)
	     {    
	         if (arr[j] < pivot)
	         {
	             i++;
	             swap(arr, i, j);
	         }
	     }
	     swap(arr, i + 1, end);
	     return (i + 1);
	 }
	   void Quicksort(int arr[],int start,int end) {
	 		
	 		if(start<end ) {
	 			
	 		int part =	partition(arr, start, end);
	 		
	 		Quicksort(arr,start,part-1);
	 		Quicksort(arr,part+1,end);
	 		}
	 		
	 	}
	 	
	   void Print(int arr[],int size) {
	 		for(int i =0;i<size;i++)
	 			System.out.print(arr[i] + " ");
	 	}
	   void time (int arr[]) {
			System.out.println("\nAfter using Quicksort Sort");
			long start = System.nanoTime();
			Quicksort(arr, 0, 0);
			long end = System.nanoTime();
			long execution = (end - start);
			System.out.println("Execution time of QuickSort is: " + execution + " nanoseconds");
			
		}
	 	
//	 	public static void main(String args[]) {
//	 		
//	 		QuickSort quick = new QuickSort();
//	 		int arr[] = {23,45,65,32,1};
//	 		int n= arr.length;
//	 		
//	 		
//	 		Quicksort(arr,0,n-1);
//	 		
//	 		System.out.println("After using QuickSort");
//	 		
//	 		Print(arr,n);
//	 		QuickSort.time(arr);
//	 		
//	 	}
	 	
}
