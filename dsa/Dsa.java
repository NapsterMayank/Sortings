package dsa;

public class Dsa {
	
	public static void main(String args[]) {
		
		int arr[] = {78,67,98,102,5886,1,4562,89,99,0,2,6554,3,775,5674,886,1004,0001,7883,-12};
		int n = arr.length;
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr);
		bs.printBubble(arr);
		bs.time(arr);

		InsertionSort is = new InsertionSort();
		is.Insertionsort(arr);	
		is.Print(arr);
		is.time(arr);
		SelectionSort ss = new SelectionSort();
		ss.Selectionsort(arr);		
		ss.printSelection(arr);
		ss.time(arr);
		
		QuickSort quick = new QuickSort();
		quick.Quicksort(arr, 0, n-1);
		quick.Print(arr, n);
		quick.time(arr);
		}
}
