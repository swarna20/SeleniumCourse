package collections;

import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class PrintDuplicateValues {
	
	@Test
	public void printDuplicate() {
		Integer[] data = { 8, 9, 4, 3, 3, 4, 8 };

		Set<Integer> set123 = new LinkedHashSet<Integer>();
			
		Set<Integer> set12 = new LinkedHashSet<Integer>();

		for (Integer int1 : data) {
			if(set123.contains(int1)){
				set12.add(int1);
			}
			set123.add(int1);


		}
		System.out.println("Duplicates values are: " +set12);

	}

}
