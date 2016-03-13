package ctci;

import java.util.Arrays;


public class UniqueCharacters {

	 public void rotate(int[][] matrix, int n) {
		 for (int layer = 0; layer < n / 2; ++layer) {
			 /* if even layers then n/2 else for odd layers int(n/2)*/
			 System.out.println("layer "+layer);
		  int first = layer;
		  int last = n - 1 - layer;
		 for(int i = first; i < last; ++i) {
		 int offset = i - first;
		 // save top
		  int top =  matrix[first][i];
		  System.out.println("top "+top);
		  // left -> top
		  matrix[first][i] = matrix[last-offset][first];
		  System.out.println("matrix[first][i] "+matrix[first][i]);
		  // bottom -> left
		  matrix[last-offset][first] = matrix[last][last - offset];
		 
		  // right -> bottom
		  matrix[last][last - offset] = matrix[i][last];
		 
		  // top -> right
		  matrix[i][last] = top;
		 }
		 }
		System.out.println("result "+Arrays.deepToString(matrix)); 
	 }
	 public boolean checkUnique(String str)
	 {
		 int check=0;
		 for(int i=0; i<str.length();i++)
		 {
			 int val = str.charAt(i)-'a';
			 if((check & (1 << val)) >0)
			 {
				 return false;
			 }
			 check |= (1<<val);
			 System.out.println("check "+Integer.toBinaryString(check));
		 }
		 return true;
	 } 
}
