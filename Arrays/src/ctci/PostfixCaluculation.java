/**
 * 
 */
package ctci;

/**
 * @author G500s
 *
 */
import java.util.ArrayList;
import java.util.Stack;


public class PostfixCaluculation {

	public static void main(String[] args)
	{
		String problem = "13+62*7+*";
		Integer result = getPostfixResult(problem);
		System.out.println("Answer: "+result);
		//Assumption: It is assumed that postfix string is prepared correctly. If postfix string is not proper, this code will not work as per the expectation.
		
		
	}
	
	public static Integer getPostfixResult(String problem)
	{
		if(problem.length() > 0)
		{
			ArrayList<Character> operators = new ArrayList<Character>();
			operators.add('+');
			operators.add('*');
			operators.add('*');
			operators.add('/');
			
			Stack<Integer> values = new Stack<Integer>();
			for(Character c:problem.toCharArray())
			{
				if(operators.contains(c))
				{
					Integer val1 = values.pop();
					Integer val2 = values.pop();
					Integer ans = 0;
					switch(c)
					{
					case '+' : ans = val2 + val1;break;
					case '-' : ans = val2 - val1;break;
					case '*' : ans = val2 * val1;break;
					case '/' : ans = val2 / val1;break;
					}
					values.push(ans.intValue());
				}
				else
				{
					values.push(Character.getNumericValue(c));
				}
			}
			
			if(values.size()==1)
				return values.pop();
			else
				{
				System.out.println("Something wrong happened.");
				return -1;
				}
		}
		else
		{
			//Empty string
			return -1;
		}
	}
}
