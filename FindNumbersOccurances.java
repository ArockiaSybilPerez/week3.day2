package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		/*
		 * Input array numbers, each occurances
		 * 
		 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
		 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
		 * 
		 * Order: Ascending Order
		 * 
		 */
		
		/*
		 * Psuedcode:
		 * 
		 * 1) Create Map -> TreeMap
		 * 2) For loop -> each number -> add to the map
		 * 3) If it is exist -> update it with + 1
		 * 	  Else -> new entry with 1 as value
		 * 
		 */
	    
		//Declare the array list
		int[] arrayList= {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		//create the map object
		Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
		
		//For loop -> each number -> add to the map
		for (int i = 0; i < arrayList.length; i++) {
			
	    //If it is exist -> update it with + 1
			int key=arrayList[i];
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}
				
	   //Else -> new entry with 1 as value
			else {
			map.put(key, 1);
			}
		

	}
		//print map entries
		System.out.println(map);
	}
}
