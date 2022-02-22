package dsa;

public class BinarySearch {
	
int binarySearch(int arr[],int start,int end,int search) {


			while(start<=end) {
				int  mid = start+(end-start)/2;
				 if(arr[mid] == search ) {
					 return mid;
				 }
				 else if(arr[mid]<search) {
					 start = mid+1;
				 }
				 else {
					 end=mid-1;
				 }
				 	
		}
			return -1;
	}
	
	public static void main(String[] args) {
		
		BinarySearch bs= new BinarySearch();
		int arr[] = {10,20,30,40,50,};		
		int	start = 0;
		int end = arr.length-1;
		int search = 70;
		int result = bs.binarySearch(arr, start, end, search);
		
		if(result==-1) {
			System.out.println("The Element you search is not found in the array");
			
		}
		else {
			System.out.println("the element you search is at " + result);
		}
	 
		}
	}

	 
