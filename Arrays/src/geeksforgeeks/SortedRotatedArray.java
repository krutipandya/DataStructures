/**
 * 
 */
package geeksforgeeks;

/**
 * @author G500s
 *
 */
public class SortedRotatedArray {
	
	public static int findEleInPivotedAndRotatedArray(int[] input, int searchEle)
	{
		int pivot=0;
		for(int i=0;i< input.length-1;i++)
		{
			if(input[i]>input[i+1])
			{
				pivot = i;
				System.out.println(pivot);
				break;
			}
		}
		int[] leftArr = new int[input.length];
		int[] rightArr = new int[input.length];
		for (int i=0;i<=pivot;i++)
		{
			leftArr[i] = input[i];
			System.out.println(" left array "+leftArr[i]);
		}
		for (int i=pivot+1;i<input.length;i++)
		{
			rightArr[i] = input[i];
			System.out.println(" right array "+rightArr[i]);
		}
		int result = -1;
		if(searchEle >=leftArr[0])
		{
			// binary search in left array
			result = binarySearchRecursive(leftArr, searchEle, 0, leftArr.length-1);
			System.out.println("left side "+result);
			return result;
		}
		else
		{
			// binary search in right array
			result = binarySearchRecursive(rightArr, searchEle, 0, rightArr.length-1);
			System.out.println("right side "+result);
			return result;
		}
	}
	public static int binarySearchRecursive(int[] a, int x, int low, int high)
	{
		if(low > high) return -1;
		int mid = (low + high)/2;
		if(a[mid]<x)
			return binarySearchRecursive(a, x, mid+1, high);
		else if(a[mid]>x)
			return binarySearchRecursive(a, x, low, mid-1);
		else 
			return mid;
	}
	public static void main(String[] args)
	{
		int[] A = {-4,-3,-2,-1,0,1,3,5,9,-10,-8,-5};
		int res = findEleInPivotedAndRotatedArray(A,-10);
		System.out.println(res);
	}

}
