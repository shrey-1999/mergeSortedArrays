package Arrays;

import java.util.Scanner;

public class ArraysAndFunctions {

	
	public static int[] takeInput() {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] input = new int[n];
		for(int i=0;i<n;i++) {
			input[i] = s.nextInt();
		}
		
		return input;
	}
	public static int largest(int[] arr) {
		int l = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > l) {
				l = arr[i];
			}
		}
		return l;
		
	}

	public static void printArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		int[] arr = takeInput();
		printArray(arr);
		
		int l = largest(arr);
		System.out.println(l);

	}

}
