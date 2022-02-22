package dsa;

public class BubbleSort {
	
	void  bubbleSort(int arr[]) {
		int n = arr.length;	
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {

					int temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp ;
				}
			}
		}

	}
	void printBubble (int arr[]) {
		
		int n= arr.length;
		for(int i=0;i<n;++i) {
			
			System.out.print(arr[i]+ " ");
			
		}
	}
	void time (int arr[]) {
		System.out.println("\nAfter using Bubble Sort");
		long start = System.nanoTime();
		bubbleSort(arr);
		long end = System.nanoTime();
		long execution = (end - start);
		System.out.println("Execution time of Bubble Sort is: " + execution + " nanoseconds");
		
	}
//public static void main(String[] args) {
//		
//		BubbleSort bs = new BubbleSort();
//		
//		int arr[] = {6,5,9,11,65,2,1};
//		
//		bs.printBubble(arr);
//		System.out.println("Before using Bubble Sort");
//		
//		bs.bubbleSort(arr);
//		bs.printBubble(arr);
//		System.out.println("after using bubble sort");
//		
//	}

}
