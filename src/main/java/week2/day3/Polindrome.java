package week2.day3;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = scan.nextInt();
		int sum=0, r=0, temp=num;
		scan.close();
		
		while(num>0){
			r=num%10;
			sum= sum*10+r;
			num=num/10;
		}
		
		if(temp==sum){
			System.out.println("Given number " +temp+ " is polindrome");
		}
		else{
			System.out.println("Given number " +temp+ " is not polindrome");

		}
	}

}
