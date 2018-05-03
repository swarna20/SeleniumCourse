package week2.day3;

public class Operations {
	
	public int addNumers(int x, int y){
		int z=x+y;
		
		return z;
	}
	
	public void evenOrOdd(int a){
		int b=a%2;
		
		if (b==0)
			System.out.println("Given number is Even: " +b);
		
		else
			System.out.println("Given number is Odd: " +b);

	}
	public String evenOdd(int a){
		int b=a%2;
		
		if (b==0)
			return "Given number is Even";
		
		else
			return "Given number is Odd";

	}

}
