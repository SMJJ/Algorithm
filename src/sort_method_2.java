import java.util.Arrays;

public class sort_method_2 {
	
	// 归并排序
	// 1.递归拆分
	public static int[] MergeSort(int[] array) {
		if(array.length<2)
			return array;
		int mid = array.length/2;
		int[] left = Arrays.copyOfRange(array, 0, mid);
		int[] right = Arrays.copyOfRange(array, mid, array.length);
		return merge(MergeSort(left),MergeSort(right));
	}
	
	// 2.比较合并
	private static int[] merge(int[] left,int[] right) {
		int[] result = new int[left.length + right.length];
		for(int index=0,i=0,j=0;index<result.length;index++) {
			if(i>=left.length)
				result[index] = right[j++];
			else if(j>=right.length)
				result[index] = left[i++];
			else if(left[i]>right[j])
				result[index] = right[j++];
			else // left[i] <= right[j]
				result[index] = left[i++];
		}
		return result;
	}
	
	// 快速排序
	// 参考博客:https://www.e-learn.cn/content/java/1545532
	public static void QuickSort(int[] array,int low,int high) {
		int i,j,temp,t;
		if(low>high)
			return;
		i = low;
		j = high;
		
		// temp基准位
		temp = array[low];
		
		// 交换位置
		while(i<j) {
			while(temp<=array[j] && i<j)
				j--;
			while(temp>=array[i] && i<j)
				i++;
			if(i<j) {
				t = array[j];
				array[j] = array[i];
				array[i] = t;
			}
		}
		
		// 基准与i和j相等位置的数字交换
		array[low] = array[i];
		array[i] = temp;
		
		// 递归调用
		QuickSort(array, low, j-1);
		QuickSort(array, j+1, high);
	}
	
	// 堆排序
	
	public static void main(String[] args) {
		int[] array = {21,23,5,67,8,11};
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
//		array = MergeSort(array);
		QuickSort(array,0,array.length-1);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
