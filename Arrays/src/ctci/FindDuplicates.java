package ctci;

public class FindDuplicates {
	
	public char[] findDuplicates(String str)
	{
		
		char[] ch = str.toCharArray();
		char first = ch[0];
		
		char[] newCh = new char[ch.length];
		for(int i=0; i<ch.length;)
		{
			if(first==ch[i])
			{
				newCh[i]=ch[i];
				first=ch[i];
				i++;
			}
			else
			{
				i++;
			}
		}
		return newCh;
	}

}
