/**
 * 
 */
package randomString;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

/**
 * @author Kruti
 * Method to return random String from a List/Map
 *
 */
public class RandomString {
	
	public static String returnRandomString(int n,HashMap<Integer,String> map)
	{
		String outputString="";
		if(map.size()>0 && !map.isEmpty())
		{
			Random r = new Random();
			for(int i=0; i<n; i++)
			{
				outputString =  outputString + map.get((r.nextInt(map.size()))) + "-";
			}
			return outputString.substring(0, outputString.length()-1);
			/*String[] strArr = step1.split("-");
			return strArr[r.nextInt(strArr.length)];*/
		}
		else{
			return "Hashmap is empty";
		}
	}
	public static String readFile(int noOfWords,String fileName)
	{
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("D:\\words.txt"));
			String lines; 
			HashMap<Integer,String> dictionary = new HashMap<Integer,String>();
			int i=0;
			while((lines = br.readLine())!=null)
			{
				String[] words = lines.split(" ");
				for(String w : words)
				{
					dictionary.put(i, w);
					i++;
				}
				lines = br.readLine();
				
			}
			if(!dictionary.isEmpty())
			{
				return returnRandomString(noOfWords,dictionary);
			}
			else
			{
				return "no words";
			}
			
		}
		catch (IOException e){
			e.printStackTrace();
		}
		return "no file read";
		
	}
	public static void main(String[] args)
	{
		
		String result = readFile(3, "nothing");
		System.out.println("result - "+result);
	}
}

