package com.practice.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringDuplicatesCount {

	public static void main(String[] args) {
		printDuplicateCharacters("Java");
		printDuplicateCharacters("programming");
	}

	private static void printDuplicateCharacters(String word) {
		char[] charArray = word.toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();
		for (Character ch : charArray) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println( entry.getKey()+" is the character having count : "+  entry.getValue());
			}
		}

	}

}
