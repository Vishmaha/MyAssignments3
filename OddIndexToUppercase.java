package week3_Assignment;

import java.util.Arrays;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] arr = test.toCharArray();
		for(int i =0; i<arr.length;i++) {
			if(i%2!=0) {
				arr[i]=Character.toUpperCase(arr[i]);
				
			}
		}
		String st = new String (arr);
		System.out.println(st);
	
		
	}

}
