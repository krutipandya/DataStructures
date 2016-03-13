/**
 * 
 */
package geeksforgeeks;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author Kruti Pandya
 *
 */
public class IsomorphicStrings {

	public static boolean checkIsomorphicString(String a, String b)
	{
		
		char[] chA = a.toCharArray();
		char[] chB = b.toCharArray();
		
		if(chA.length!=chB.length)
			return false;
		
			HashMap<Character,Character> map = new HashMap<>();
			Character chb=null;
			for(int i=0;i<chA.length;i++)
			{
				
				for (Entry<Character, Character> entry : map.entrySet()) {
			        if (entry.getValue().equals(chB[i])) {
			            chb = entry.getKey();
			        }
				}
				System.out.println(chb);
				if(chb!=chA[i])
				{
					System.out.println("strings not isomorphic");
					return false;
				}
				if(map.containsKey(chA[i]))
				{
					if(map.get(chA[i])!=chB[i])
					{
						System.out.println("strings not isomorphic");
						return false;
					}
					else
					{
						map.put(chA[i], chB[i]);
					}
				}
			}
			return true;
	}
	public static void main(String[] args)
	{
		String str1 = "abcdxy";
		String str2 = "xyzwas";
		boolean flag = checkIsomorphicString(str1, str2);
		System.out.println(flag);
	}
}
