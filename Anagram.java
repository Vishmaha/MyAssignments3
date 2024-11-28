package week3_Assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";
		int length = text1.length();
		int length2 = text2.length();

		if (length == length2) {
			System.out.println("Length is equal");
		} else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");

		}

		char[] chararr = text1.toCharArray();
		char[] chararr1 = text2.toCharArray();

		Arrays.sort(chararr);
		Arrays.sort(chararr1);
		for (int i = 0; i < chararr.length; i++) {
			System.out.print(chararr[i]);
		}
		System.out.println("");

		for (int i = 0; i < chararr1.length; i++) {
			System.out.print(chararr1[i]);
		}
		System.out.println("");

		if (Arrays.equals(chararr, chararr1)) {

			System.out.println("The given strings are Anagram.");
		} else {

			System.out.println("The given strings are not an Anagram.");

		}

	}

}
