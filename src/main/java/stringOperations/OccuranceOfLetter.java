package stringOperations;

public class OccuranceOfLetter {

	public static void main(String[] args) {
    
		String input = "WIPRO INDIA LIMITED";
		int j=0;
		
		
		for(int i=0; i<=input.length()-1; i++){
			if(input.charAt(i)=='I'){
				j++;
							}
			
		}
		
		   System.out.println("Occurance of I letter is: " +j);

	}

}
