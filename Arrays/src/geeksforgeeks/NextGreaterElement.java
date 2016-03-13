/**
 * 
 */
package geeksforgeeks;

import java.util.Stack;

/**
 * @author G500s
 *
 */
public class NextGreaterElement {

	public static void printNGE(int[] arr)
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(arr[0]);
		int temp,next;
		
		for(int i=1;i<arr.length;i++)
		{
			next = arr[i];
			
			if(!s.isEmpty())
			{
				temp = s.pop();
				
				while(temp< next)
				{
					System.out.println(temp+" has NGE as "+next);
					if(s.isEmpty())
						break;
					temp = s.pop();
				}
				if(temp>next)
					s.push(temp);
			}
			s.push(next);
		}
		while (!s.isEmpty())
	    {
	        temp = s.pop();
	        next = -1;
	        System.out.println(temp+" has NGE as "+-1);
	    }
	}
	public static void main(String[] args)
	{
		int[] arr = {4,5,2,23};
		printNGE(arr);
	}
}
