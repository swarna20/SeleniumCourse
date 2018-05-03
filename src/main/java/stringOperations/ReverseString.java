package stringOperations;

public class ReverseString {

	
	public static void main(String[] args) {

		String input="Hexaware";
		char[] strChar = input.toCharArray();
		int length = strChar.length;

		for(int i=length-1; i>=0; i--){
			System.out.print(strChar[i]);
		}
		
		
	   
		
		

		
	}

}
