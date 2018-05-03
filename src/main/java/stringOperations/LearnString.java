package stringOperations;

public class LearnString {

	public static void main(String[] args) {

		String str = " india PVT Ltd ";
		String str1 = "chennai";

		char ch[] = str.toCharArray();
		System.out.println(ch);
		System.out.println("Length of String is: " + (str.length()));
		System.out.println("character of position 4" + (str.charAt(3)));
		System.out.println("position of i letter from starting " + (str.indexOf('i')));
		System.out.println("position of i letter from last " + (str.lastIndexOf('i')));

		System.out.println("String in upper case letter: " + (str.toUpperCase()));
		System.out.println("String in lower case letter: " + (str.toLowerCase()));
		System.out.println("String  after trim: " + (str.trim()));
		String[] split1 = str.split(" ");
		for (int i = 0; i <= split1.length - 1; i++) {
			System.out.println(split1[i]);
		}
		System.out.println("Merging of str1 & str2 is : " + (str.concat(str1)));
		

	}

}
