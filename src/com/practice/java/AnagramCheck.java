package com.practice.java;

public class AnagramCheck {

	public static boolean isAnagram(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}

		char[] word1CharArray = word1.toCharArray();
		for (char ch : word1CharArray) {
			int index = word2.indexOf(ch);
			if (index != -1) {
				word2 = word2.substring(0, index) + word2.substring(index + 1, word2.length());
			} else {
				return false;
			}
		}
		return word2.isEmpty();
	};

	public static void main(String[] args) {
		System.out.println(isAnagram("stop", "post"));
	}

}
