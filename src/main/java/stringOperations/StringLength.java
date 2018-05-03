package stringOperations;

public class StringLength {

	public static void main(String[] args) {
		String input="Amazon Development centre";
		int i=0, j=0;
				
		char ch[]  = input.toCharArray();

	   for(i=0; i<=ch.length-1; i++){
		   j++;
	   }
	   System.out.println("Length of string is: " +j);
	   
	
	}

}
