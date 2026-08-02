package com.kumarnitin.string;

import java.util.Scanner;

public class StringBasics {
	
	public static void printString(String str) {
		int n = str.length();
		for(int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}
	}
	
	public static void length(String str) {
		int count = 0;
		char[] arr = str.toCharArray();
		for(char ch : arr) {
			count++;
		}
		System.out.println("Length of String is " + count);
	}
	
	public static int countVowel(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')) {
				count++;
			}
		}
		return count;
	}
	
	public static String reverseString(String str) {
		String revString = "";
		for(int i = 0; i < str.length(); i++) {
			revString = str.charAt(i) + revString;
		}
		return revString;
	}
	
	public static boolean palindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		
		while(i <= j) {
			if(str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		//String str = "Nitin";
		//printString(str);
		//length(str);
		//System.out.println("Number of vowels in the string: " + countVowel(str));
		//System.out.println("Reversed String: " + reverseString(str));
		//System.out.println(palindrome(str));
		
		
//		String firstName = "Kumar";
//		String lastName = new String("Nitin");
//		System.out.println(firstName + " " + lastName);
//		System.out.println(firstName.length());
//		System.out.println(firstName.charAt(0));
		
		
//		String name1 = "Nitin";
//		String name2 = "NitiN";
		
		
		// comparing references
		/*
		if(name1 == name2) {
			System.out.println("Both strings are equal");
		}else {
			System.out.println("Both strings are not equal");
		}
		*/
		
		/*
		if(name1.equals(name2)) {
			System.out.println("Both strings are equal");
		}else {
			System.out.println("Both strings are not equal");
		}
		
		if(name1.equalsIgnoreCase(name2)) {
			System.out.println("Both strings are equal");
		}else {
			System.out.println("Both strings are not equal");
		}
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide the string content: ");
		String str = sc.nextLine();
		System.out.println("Value of nextLine: " + str);
		
		String str2 = sc.next();
		System.out.println("Value of next: " + str2);
		*/
		
		/*
		String str = "Nitin";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		String name = "NITIN";
		System.out.println(str.equals(name));
		System.out.println(str.equalsIgnoreCase(name));
		*/
		
		
		// empty -> length = 0
		// blank -> empty or only spaces
//		String str = "  ";
//		System.out.println(str.length());
//		System.out.println(str.isEmpty());
//		System.out.println(str.isBlank());
//		String name = "  Love    ";
//		System.out.println(name.length());
//		name = name.trim();
//		System.out.println(name.length());
		
//		String name = "nitin";
//		System.out.println(name.toUpperCase());
//		
//		String str = "NITIn";
//		System.out.println(str.toLowerCase());
		
		/*
		String str = "My name is Kumar Nitin";
		//beginIndex -> 3 -> inclusive
		//endIndex -> 6 -> exclusive
		System.out.println(str.substring(3,6));
		System.out.println(str.contains("Nitin"));
		System.out.println(str.contains("Nikhil"));
		*/
		
		
		
//		int num = 5123;
//		String str = String.valueOf(num);
//		System.out.println(num+1);
//		System.out.println(str + 1);
//		
//		String name = "Chaudhary Kumar Nitin";
//		System.out.println(name.startsWith("Chaudhary"));
//		System.out.println(name.endsWith("Nitin"));
		
		
		/*
		String name = "Babbar";
		char[] crr = name.toCharArray();
		
		// print the char array
		for(char ch : crr) {
			System.out.println(ch);
		}
		*/
		
		
		/*
		// split -> output -> String array
		String input = "My name is Kumar Nitin";
		String[] words = input.split(" ");
		for(String str: words) {
			System.out.println(str);
		}
		
		String name = "nitin";
		name = name.replace('n', 'l');
		System.out.println(name);
		*/
		
		
		
		
	}
}

