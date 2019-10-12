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
	
	public static void search(int[] arr, int val)
	{ int flag=0;
	  for(int i=0;i<arr.length();i++)
	    { if(arr[i]==val)
	          { System.println.out("FOUND");
		    flag=1;
		  }
	    }
	  if(flag==0)
	     { System.println.out("NOT FOUND");
	     }
	}
	public static void main(String[] args) {
		
		
		int[] arr = takeInput();
		printArray(arr);
		
		int l = largest(arr);
		System.out.println(l);

	}

}
