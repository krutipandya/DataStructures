package ctci;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Permutations {

	public static boolean permutation(String s,String t){
		if(s.length()!=t.length())
		{
			return false;
		}
		int[] letters = new int[256];
		char[] sArray = s.toCharArray();
		for(char c : sArray)
		{
			letters[c]++;
		}
		
		for(int i=0;i<t.length();i++)
		{
			int c = (int)t.charAt(i); // letters converted to ASCII code
			if(--letters[c]<0){
				return false;
			}
		}
		
		return true;
	}
	public int demoIt()
	{
		List<String> l = new ArrayList<String>();
		
			l.add("abc");
			l.add("def");
			l.add("ghi");
		
		Iterator<String> it = l.iterator();
		//ListIterator<String> li = l.listIterator();
		//Vector v = new Vector();
		int count=1;
		while(it.hasNext())
			{
			try{	
			if(it.next().toString()=="abc")
				{
					
					count--;
					
					System.out.println("inside abc"+it.next());
				}
				else
				{
					count++;
					System.out.println("inside else");
				}
			
			}catch(Exception e)
			{
				e.getMessage();
			}
			
		}
		return count;
	}
	
}

