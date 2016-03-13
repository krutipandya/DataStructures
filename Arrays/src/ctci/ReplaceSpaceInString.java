package ctci;

public class ReplaceSpaceInString {

	public void replaceSpaces(char[] str,int len)
	{
		int spaceCount=0, newLength;
		for(int i=0;i<len;i++)
		{
			if(str[i]==' ')
				spaceCount++;
		}
		newLength = len+spaceCount*2;
		str[newLength]='\0';
		//go from the end of the array to find the spaces and replacing the spaces
		for(int i=len-1;i>=0;i--)
		{
			if(str[i]==' ')
			{
				str[newLength-1]='0';
				str[newLength-2]='2';
				str[newLength-3]='%';
				newLength=newLength-3;
			}
			else
			{
				str[newLength-1]=str[i];
				newLength=newLength-1;
			}
			System.out.println("replaced string "+str[i]);
		}
		
	}
}
