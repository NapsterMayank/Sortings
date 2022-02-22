package dsa;

public class InsertionSort {
	void Insertionsort(int arr[]){
		int n= arr.length;
		for(int i =1;i<n;i++) {
			int key= arr[i];
			int j= i-1;
			while( j>=0 && arr[j]>key) {
				arr[j+1] =arr[j];
				j=j-1;
			}
			arr[j+1] =key;
		}
	}
		void Print(int arr[]) {
		int n=arr.length;
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	void time (int arr[]) {
		System.out.println("\nAfter using Insertion Sort");
		long start = System.nanoTime();
		Insertionsort(arr);
		long end = System.nanoTime();
		long execution = (end - start);
		System.out.println("Execution time of Insertion Sort is: " + execution + " nanoseconds");
		
	}
//public static void main(String args[]) {
//	InsertionSort obj = new InsertionSort();
//	int arr[]= {34,21,56,76,87,2,1,90,45,65};
//	System.out.println("before using Insertion Sort");
//	obj.Print(arr);
//	obj.Insertionsort(arr);
//	System.out.println("\nafter Using Insertion Sort");
//	obj.Print(arr);
//}
}
