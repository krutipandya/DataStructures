package test;

//import java.util.Arrays;

/* we take 2 pointers, one set on left most position and other on the right most position
 * move both at a time inside and encounter the element at that position. 
 * if its zero swap it with the element on the left*/
public class MoveZerosRight {

	public void moveZeros(int[] arr)
	{
		
		//int[] newArr = new int[arr.length];
		int temp=0;
		for(int i=0,k=arr.length-1; i<arr.length;)
		{
			if(arr[i]==0 && arr[k]!=0)
			{
				temp = arr[k];
				arr[k]=arr[i];
				arr[i]=temp;
				i++;k--;
			}
			else
			{
				if(arr[i]!=0)
					i++;
				if(arr[k]==0)
					k--;
			}
		}
		for(int newarr : arr)
		{
			System.out.println(newarr);
		}
		
	}
	public void findRepetition(int[][] arr)
	 {
	  int index[]=new int[arr.length];
	  int frontNumber[]=new int[arr.length];
	  int length[]=new int[arr.length];
	 // System.out.println("length "+arr.length);
	  for(int i=0;i<arr.length;++i)
	  {
		  
	   length[i]=arr[i].length;
	  }
	  boolean modified=true;
//	  while(modified)
//	  {
//	   modified=false;
	   for(int i=0;i<arr.length;i++)
	   {
		  // System.out.println("index "+i+" index[i] "+index[i]+" length [i] "+length[i]);
	    if(index[i]<length[i])
	    {
	    	System.out.println("index "+index[i]);
	     modified=true;
	     frontNumber[i]=arr[i][index[i]];
	    // System.out.println("frontnumber "+frontNumber[i]);
	    }
	    else
	    {
	     frontNumber[i]=Integer.MAX_VALUE;
	    }
	    System.out.println("@ "+frontNumber[i]);
	   }
	   int min=frontNumber[0];
	   int minIndex=0;
	   for(int i=1;i<arr.length;++i)
	   {
	    if(frontNumber[i]==min)
	    {
	    	//System.out.println("frontnumber "+frontNumber[i]+" min "+min);
	     if(frontNumber[i]!=Integer.MAX_VALUE)
	     // System.out.println(frontNumber[i]);
	     index[i]++;
	    }
	    else if(frontNumber[i]<min)
	    {
	     min=frontNumber[i];
	     minIndex=i;
	    }
	   }
	   index[minIndex]++;
	  }
	 //}
	/* Method to search element in a sorted 2D array 
	 * We look for the element in a way that if the first element of the first row is smaller than the search element, we continue in that row
	 * else if its larger than the search element we go to next row till we find the element
	 * input - int[][] array and search element
	 * output - boolean value 
	 * complexity O(N)*/
	public boolean searchNumberSortedArray(int [][] arr, int num)
	{
		int row = arr.length;
		int col = arr[0].length;
		int currRow = 0;
		int currCol = col-1;
		while(currRow != row && currCol != -1)
		{
			System.out.println("inside while"+currRow);
			if(arr[currRow][currCol]==num)
				return true;
			else if(arr[currRow][currCol]>num)
				{currCol--;
				System.out.println("currCol "+currCol);}
			else if(arr[currRow][currCol]<num)
				{currRow++;
				System.out.println("currRow "+currRow);}
			
		}
		return false;
	}
}
class zeroMain{
public static void main(String[] args)
{
	MoveZerosRight m = new MoveZerosRight();
	
	int[][]arr={{5,12,13,16},
		    {7,14,16,23},
		    {8,36,37,44},
		    {9,37,45,48}};
		//  m.findRepetition(arr);
	boolean result = m.searchNumberSortedArray(arr, 48);
	System.out.println(result);
}
}