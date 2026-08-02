// Count consonants in a string
/*
package com.kumarnitin.string;

public class StringHomeWork {
	
	public static int countConsonants(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if((ch != 'a') && (ch != 'e') && (ch != 'i') && (ch != 'o') && (ch != 'u') && (ch != 'A') && (ch != 'E') && (ch != 'I') && (ch != 'O') && (ch != 'U')) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "Nitin";
		System.out.println("Number of consonants in the given string: " + countConsonants(str));

	}

}
*/

// Convert string to uppercase without using method
/*
package com.kumarnitin.string;

public class StringHomeWork {
	
	public static String toUpperString(String str) {
		char[] ch = str.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			if((ch[i] >= 'a') && (ch[i] <= 'z')) {
				ch[i] -= 32;
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		String str = "Nitin";
		System.out.println("String in Upper Case: " + toUpperString(str));

	}

}
*/

// Find frequency of a Character
/*
package com.kumarnitin.string;

public class StringHomeWork {
	
	public static int frequencyOfCharacter(String str, char ch) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "Nitin";
		System.out.println("Count of given character is: " + frequencyOfCharacter(str, 'i'));

	}

}
*/

// Remove all spaces from String
/*
package com.kumarnitin.string;

public class StringHomeWork {

	public static void main(String[] args) {
		String str = "  N i t  in    ";
//		System.out.println("String after removing spaces: " + str.replaceAll(" ", ""));
		System.out.println("String after removing spaces: " + str.replaceAll("\\s+", ""));

	}

}
*/

// Check if string contains only digits
/*
package com.kumarnitin.string;

public class StringHomeWork {

	public static void main(String[] args) {
		String str = "12345678910a";
		boolean flag = true;
		
		for(int i = 0; i < str.length(); i++) {
			if((str.charAt(i) >= '0') && (str.charAt(i) <= '9')) {
				continue;
			}else {
				flag = false;
				break;
			}
		}
		
		System.out.println("String contains only digits. " + flag);

	}

}
*/

// Count words in a sentence
/*
package com.kumarnitin.string;

public class StringHomeWork {

	public static void main(String[] args) {
		String str = " My Name is Kumar Nitin";
		str = str.trim();
		int count = 0;

		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("Number of words in string is: " + ++count);

	}

}
*/

