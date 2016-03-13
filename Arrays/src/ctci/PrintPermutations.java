/**
 * 
 */
package ctci;

/**
 * @author G500s
 *
 */
public class PrintPermutations {
	
	public static String[] per(String input){
		
	if(input.length() == 0){
	String[] output = {""};
	return output;
	}
	String[] smallerOutput = per(input.substring(1));
	String[] output = new String[input.length()*((smallerOutput.length==0)?1:smallerOutput.length)];
	int i = 0;
	for(String s : smallerOutput){
	for(int j = 0;j <= s.length(); j++){
	output[i] = s.substring(0, j)+input.charAt(0)+s.substring(j,s.length());
	i++;
	}
	}
	return output; 
	}
	public static void main(String[] args) {
	String input = "abcd";
	String[] arr = per(input);
	for(String s : arr){
	System.out.println(s);
	}
	}

}
