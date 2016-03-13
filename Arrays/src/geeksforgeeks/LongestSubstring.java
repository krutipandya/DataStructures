/**
 * 
 */
package geeksforgeeks;

import java.util.HashMap;

/**
 * @author G500s
 *
 */
public class LongestSubstring {

	public static int solution(String s) {
		
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
	    if (s == null || s.length() == 0) return 0;
	    
	    if (s.length() == 1) return 1;
	    
	    int rightPointer = 0, leftPointer = rightPointer - 1, answer = 0;
	    
	    while (rightPointer != s.length()) {
	    	
	         Integer previousOccurrence = map.put(s.charAt(rightPointer), rightPointer);
	         System.out.println(" previousOccurrence "+previousOccurrence);
	         if (previousOccurrence != null) {
	             leftPointer = Math.max(leftPointer, previousOccurrence);
	             System.out.println(leftPointer);
	         }
	         answer = Math.max(answer, rightPointer - leftPointer);
	         rightPointer++;
	    }
	    return answer;
		}
	public static void main(String[] args)
	{
		int result = solution("aaafghdjskertaaappfsdf");
		System.out.println(result);
	}
}
