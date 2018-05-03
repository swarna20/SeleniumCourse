package regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx4 {

	public static void main(String[] args) {
		
	/*	String value = "";
		String pat  = "[a-z]{3}";
		Pattern pattern = Pattern.compile(pat);
		Matcher match = pattern.matcher(value);
		System.out.println(match.matches());*/
		
		// Define the pattern
				String pattern = "\\w+";

				// Compile the pattern
				Pattern p = Pattern.compile(pattern);

				// Get the matcher
				Matcher match = p.matcher("Amazon has 12014 employees in India and 24500 in USA ");		

				// if multiple matches
				while (match.find()) {
					System.out.println(match.group());            
				}

	}

}
