/**
 * 
 */
package geeksforgeeks;



/**
 * @author G500s
 *
 */
public class MaxSum {

	public static void maxSum(int[] arr)
	{
		int max=arr[0];
		int temp=0;
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				temp=max;
				max=arr[i];
			}
		}
		System.out.println(temp+max);
	}
	public static int sumClosestToX(int[] A,int X)
	{
		int dif = Integer.MAX_VALUE;
		int a2=0;
		int i=0,j=A.length-1;
		while(j>i)
		{
			
			if((Math.abs(A[i]+A[j]-X)) < dif)
			{
				a2=A[j];
				dif = Math.abs(A[i]+A[j]-X);
				System.out.println(dif);
			}
			else if(A[i]+A[j]>X)
			{
				System.out.println(A[j]);
				j--;
			}
			else
				i++;
		}
		return a2;
	}
	public static int[] deleteEle(int[] arr,int x)
	{
		int i;
		for(i=0;i<arr.length;)
		{
			if(arr[i]==x)
			{
				for(int k=i;k<arr.length-1;k++)
				{
					arr[i]=arr[k+1];
					i++;
				}
			}
			else
			{
				i++;
			}
		}
		return arr;
	}
	public static void main(String[] args)
	{
		int[] arr = {10,22,28,29,30,45};
		maxSum(arr);
		int result = sumClosestToX(arr,54);
		System.out.println(result);
		/*int[] result = deleteEle(arr, 28);
		System.out.println(Arrays.toString(result));*/
	}
}
