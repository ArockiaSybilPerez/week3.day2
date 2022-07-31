package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindMostDuplicate {
	public static void main(String[] args) {
		String input="abbaba";
		char[] ch1 = input.toCharArray();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for (int i = 0; i < ch1.length; i++) {
			if (map.containsKey(ch1[i])) {
				map.put(ch1[i], map.get(ch1[i])+1);				
			}
			else
				map.put(ch1[i], 1);				
		}
		System.out.println(map);
		int maxOcuurance=0;
		char maxOccuranceChar=0;
		for (Entry<Character,Integer> entry : map.entrySet()) {
			if(entry.getValue() > maxOcuurance)
			{
				maxOcuurance = entry.getValue();
				maxOccuranceChar = entry.getKey();
			}
			
		}
		System.out.println(maxOccuranceChar);
	}
}