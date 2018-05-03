package regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {


	public static void main (String args[]){

		String regex = "(quick)|(lazy)|(dog)";
		String text = "the quick brown fox jumps over the lazy dog";

		// Obtain the required matcher
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		int groupCount = matcher.groupCount();
		System.out.println("Number of group = " + groupCount);

		// Find every match and print it
		while (matcher.find()) {
			for (int i = 0; i <= groupCount; i++) {
				// Group i substring
				System.out.println("Group " + i + ": " + matcher.group(i));
			}
		}

	}
}
