package ctci;

public class MainClass {

	public static void main(String[] args)
	{
		//String Permutations
		boolean result = Permutations.permutation("DOLL", "OLDL");
		System.out.println("result :"+result);
		
		//Rotate Matrix
		int[][] matrix = {{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
		UniqueCharacters obj = new UniqueCharacters();
		obj.rotate(matrix,4);
		
		//Check Unique characters in String
		int a =255;
		System.out.println(Integer.toBinaryString(a<<24));
		obj.checkUnique("asdfgh");
		
		//Replace spaces with '%20'
		ReplaceSpaceInString rep = new ReplaceSpaceInString();
		String inputString = "kruti s pandya lives in San Jose";
		int len=inputString.length();
		char[] str = inputString.toCharArray();
		/*for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		System.out.println("length of input string "+len);*/
		//rep.replaceSpaces(str, len);
		FindDuplicates fd = new FindDuplicates();
		char[] resultDup =fd.findDuplicates("adadadadffgfgfrhnj");
		System.out.println(resultDup);
	}
}

