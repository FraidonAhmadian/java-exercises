package helloworldtesting;
import java.util.Scanner;
import java.util.Arrays;

public class HelloWorld {

	
	
	public static void main(String[] args) {

		int[] A = {9,5,6,7,8,10};
		int[] B = {2,4,1};
		
		// Call merge and sort functions
		int[] m = Merge(A,B);
		
		// update Array A with first values
		for(int x=0; x < A.length; x++) {
			A[x] = m[x];
		}
		
		
		// Update array B with other values
		for(int x=0; x < B.length; x++) {
			B[x] = m[A.length+x];
		}
		
		// Print final messages
		System.out.println("++++++++ Mine is done! +++++");
		
		System.out.println("Arry A:");
		for(int e:A) {
			System.out.print(e + " ");
		}
		
		System.out.println("");
		System.out.println("Arry B:");
		
		for(int e:B) {
			System.out.print(" "+e);
		}
		
	}
	
// Merging function to merge 2 arrays together
	public static int [] Merge(int[] First, int[] second) {
		
		int[] m = new int[First.length+second.length];
		
		int counter = 0;
		
		for(int e1:First) {
			m[counter] = e1;
			counter++;
		}
		
		int starofsecond = First.length;
		
		for(int e2:second) {
			m[starofsecond] = e2;
			
			starofsecond++;
		}
		// Call sort function to sort the merged array.
		int [] msorted = Sort(m);
		
		// Return the sorted Array.
		return msorted;
	}
	
	
	static int[] Sort(int[] arr) {
		int len = arr.length;
		
		for(int i = 0; i< len - 1; i++) {
			for(int j = 0; j < len-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
	
}


	


