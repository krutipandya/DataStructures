/**
 * 
 */
package ctci;

/**
 * @author G500s
 *
 */
public class FindMissingNumber {
	
	public static int findMissingNo(int[] a)
	{
		int x1 = a[0];
		int x2 = 1;
		for(int i=1;i<a.length;i++)
		{
			x1 = x1 ^ a[i];
			System.out.println(i+" - "+x1);
		}
		for(int j=2; j<= a.length+1;j++)
		{
			x2 = x2 ^ j;
			System.out.println(j+" - "+x2);
		}
		return x1^x2;
	}

	public static void main(String[] args)
	{
		System.out.println(1^2);
		int[] a = {1,2,3,1,2,3,3};
		int result = findMissingNo(a);
		System.out.println("result :" + result);
	}
}
