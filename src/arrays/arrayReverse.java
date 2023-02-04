package arrays;

//program to reverse an array

public class arrayReverse {
	public static void main(String args[]) {
	int start = 0;
	int end = 5;
	int arr[] = {1,2,3,4,5,6};
	while(start <end ) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	for(int i = 0; i<arr.length; i++) {
		System.out.println(arr[i]+ " ");
		System.out.println();
		
	}
	}
}
