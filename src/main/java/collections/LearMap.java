package collections;

import java.util.LinkedHashMap;
import java.util.Map;

import java.util.Map.Entry;
import java.util.Scanner;

public class LearMap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string:");
		String s = input.nextLine();
		int count = 1;
		
		char[] ch = s.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char c : ch) {
			if (map.containsKey(c)) {
				count = map.get(c) + 1;
	     	}
			map.put(c, count);
			count = 1;
		}

		for (Entry<Character, Integer> map1 : map.entrySet()) {
			System.out.println(map1.getKey() + "---->" + map1.getValue());

		}
		input.close();

	}

}
