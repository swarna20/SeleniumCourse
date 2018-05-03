package collections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class RemoveDuplicatesFromIntArray {

	@Test
	public void removeDuplicate() {
		Integer[] data = { 8, 9, 4, 3, 3, 4, 8 };

		Set<Integer> set123 = new LinkedHashSet<Integer>();

		for (Integer int1 : data) {
			set123.add(int1);

		}
		System.out.println("Values aAfter Remove the duplicates: " +set123);

	}
	
	

}
