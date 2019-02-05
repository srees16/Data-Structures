package DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CoreJavaWorkout2 { //This is only to practice the difficult methods that I faced in the original CoreJavaWorkout

	//Find the duplicate/repeat characters in a string
	private static void findRepeatCharacters(String word) {
		Map<Character, Integer> charCountMap = new HashMap<>();
		char characters[] = word.toCharArray();
		for(char ch : characters) {
			if(charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch) + 1);
			} else {
				charCountMap.put(ch, 1);
			}
		}
		Set<Character> keys = charCountMap.keySet();
		for(char ch : keys) {
			if(charCountMap.get(ch) > 1) {
				System.out.println("The character '" + ch + "' is repeated " + charCountMap.get(ch) + " times");
			}
		}
	}
	
	
	//Find the non duplicate/non repeat characters in a string
	private static void findNonRepeatCharacters(String word) {
		Map<Character, Integer> charCountMap = new HashMap<>();
		char characters[] = word.toCharArray();
		for(char ch : characters) {
			if(charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch) + 1);
			} else {
				charCountMap.put(ch, 1);
			}
		}
		Set<Character> keySet = charCountMap.keySet();
		for(char ch : keySet) {
			if(charCountMap.get(ch) == 1) {
				System.out.println("Character '" + ch + "' did not repeat");
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		findRepeatCharacters("assassination");
		findNonRepeatCharacters("assassination");
	}

}