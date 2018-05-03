package collections;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OneTimeOccurenceValues {

	@Test
	public void OneTimeOccurence() {
		Integer[] data = { 8, 9, 4, 3, 3, 4, 8 };
		int count=1;
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (Integer c : data) {
			if (map.containsKey(c)) {
				count = map.get(c) + 1;
	     	}
			map.put(c, count);
			count = 1;
			
			
		}
		System.out.println("After Duplicates Removed:" +map);
		


		for (Entry<Integer, Integer> map1 : map.entrySet()) {
			if(map1.getValue()==1){
				System.out.println("Single time occurance value: " +map1.getKey() );

			}
			
		for (Entry<Integer, Integer> map2 : map.entrySet()) {
				if(map1.getValue()>1){
					//System.out.println(map2.getKey() );
				}
		}	
   				

	
		}
		
	}
	
}
	
		
		


