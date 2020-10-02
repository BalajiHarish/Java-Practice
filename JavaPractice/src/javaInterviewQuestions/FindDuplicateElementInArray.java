package javaInterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {

		String[] str = { "Testing", "Manual", "Automation", "Testing", "Selenium", "Automation" };

		//compare each element (Time complexity O(nxn))
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {

				if (str[i].equals(str[j])) {
					System.out.println("Duplicate Element is : " + str[i]);
				}
			}
		}
		
		//using HashSet: part of JavaCollections - Stores unique values
		Set<String> store = new HashSet<String>();
		for(String name : str) {
			
			if(store.add(name) == false) {
				System.out.println("Duplicate Element is : " + name);
			}
		}
		
		//using HashMap: 
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for (String name : str) {
			Integer count = storeMap.get(name);
			if(count == null) {
				storeMap.put(name, 1);
			}else {
				storeMap.put(name, ++count);
			}
		}
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() > 1) {
				System.out.println("Duplicate Element is : " + entry.getKey());
			}
		}

	}

}
