/**
 * 
 */
package ctci;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author G500s
 *
 */
public class CommonElementsinArray {
	
	public static void getCommonElems(int[] a,int[] b)
	{
		HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
		for(int i : a)
			temp.put(i,0);
		for(int i : b)
			if(temp.containsKey(i))
				System.out.print(i + " ");
	}
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
	public static void findCommonElem(int[] a, int[] b)
	{
		quickSort(a,0,a.length-1);
		quickSort(b, 0, b.length-1);
		int i=0,j=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]==b[j])
			{
				System.out.println(a[i]);
				i++;j++;
			}
			else if(a[i]<b[j])
			{
				i++;
			}
			else
			{
				j++;
			}
		}
			
	}
	public static int[] mergeArrays(int[] a,int[] b)
	{
		quickSort(a, 0, a.length-1);
		quickSort(b, 0, b.length-1);
		int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;

	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])       
	            answer[k++] = a[i++];

	        else        
	            answer[k++] = b[j++];               
	    }

	    while (i < a.length)  
	        answer[k++] = a[i++];


	    while (j < b.length)    
	        answer[k++] = b[j++];

	    return answer;
		
	}
	public static void main(String[] args)
	{
		int[] a = {8, 5, 4 ,5 ,2, 7 ,1, 5};
		int[] b = {3, 6, 5, 2};
		//findCommonElem(a, b);
		getCommonElems(a,b);
		int[] result = mergeArrays(a,b);
		System.out.println(Arrays.toString(result));
	}

}

