package regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LearnRegExp {

	public static void main(String[] args) {

		String email = "swarnav.valluru123@gmail.com";
		String patern = "[a-z]+.[a-z]+@[a-z]+.[com]+";
		
		Pattern pat = Pattern.compile(patern);
		Matcher match = pat.matcher(email);
		System.out.println(match.matches());
		
		
	}

}
