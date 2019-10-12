package MergeSortedArrays;

public class Merge {

	public static int[] merge(int[] arr1,int[] arr2) {

		int[] arr3 = new int[arr1.length + arr2.length];
		int i=0;
		int j=0;
		int k=0;

		while(i<arr1.length && j<arr2.length) {

			if(arr1[i] <=arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			}else {
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}

		while(i<arr1.length) {
			arr3[k] = arr1[i];
			k++;
			i++;
		}

		while(j<arr2.length) {
			arr3[k] = arr2[j];
			k++;
			j++;
		}

		return arr3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] arr1 = { 1,2,5,6,7,9};
		int [] arr2 = {3,4,6,8,10,12,13};

		int[] mergedArray = merge(arr1,arr2);
		for(int i=0;i<mergedArray.length;i++) {
			System.out.println(mergedArray[i]);
		}

	}

}
