public class sort_mehtod_1 {
	// √∞≈›≈≈–Ú
	private static int[] bubbleSort(int[] array) {
		if(array.length == 0)
			return array;
		int tmp = 0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		return array;
	}
	
	// —°‘Ò≈≈–Ú
	private static int[] SelectionSort(int[] array) {
		if(array.length == 0)
			return array;
		for(int i=0;i<array.length;i++) {
			int minIndex = i;
			for (int j = i; j < array.length; j++) {
				if(array[j]<array[minIndex]) 
					minIndex = j;
			}
			int tmp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = tmp;		
		}
		return array;
	}
	
	// ≤Â»Î≈≈–Ú
	private static int[] insertionSort(int[] array) {
		if(array.length == 0)
			return array;
		int current;
		for(int i=0;i<array.length-1;i++) {
			current = array[i+1];
			int preIndex = i;
			while(preIndex>=0 && current<array[preIndex]) {
				array[preIndex+1] = array[preIndex];
				preIndex--;
			}
			array[preIndex+1] = current;
		}
		return array;
	}
	
	// πÈ≤¢≈≈–Ú∑®
	
	
	// øÏÀŸ≈≈–Ú∑®
	
	// ∂—≈≈–Ú∑®
	
	public static void main(String[] args) {
		int[] array = {21,23,5,67,8};
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		array = insertionSort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
