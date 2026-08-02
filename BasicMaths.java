package com.kumarnitin.basicmaths;

public class BasicMaths {
	
	public static void printDigits(int num) {
		while(num > 0) {
			System.out.println(num % 10);
			num = num / 10;
		}
	}
	
	public static int countDigits(int num) {
		int count = 0;
		while(num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}
	
	public static int sumOfDigits(int num) {
		int sum = 0;
		while(num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		return sum;
	}
	
	public static int reverseANumber(int num) {
		int sum = 0;
		while(num > 0) {
			sum = (sum * 10) + num % 10;
			num = num / 10;
		}
		return sum;
	}
	
	public static boolean isPalindrome(int num) {
		
		if(num == reverseANumber(num)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isPrime(int num) {
		if(num == 1) {
			return false;
		}
		
		for(int i = 2; i*i <= num; i++) {
			if(num % i == 0) {
				return false;
			}
			
		}
		return true;
	}
	
	public static int greatestCommonDivisor(int num1, int num2) {
		
		int gcd = 1;
		int smaller = Integer.MIN_VALUE;
		if(num1 < num2) {
			smaller = num1;
		}else {
			smaller = num2;
		}
		
		for(int i = 1; i <= smaller; i++) {
			if((num1 % i == 0) && num2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	public static int leastCommonMultiple(int num1, int num2) {
		int i = 1;
		while(true) {
			if((num1 * i) % num2 == 0) {
				return num1 * i;
			}else {
				i++;
			}
		}
	}
	
	public static boolean armstrongNumber(int num) {
		int numCopy = num;
		int sum = 0;
		while(num > 0) {
			int temp = num % 10;
			sum = sum + temp*temp*temp;
			num = num / 10;
		}
		if(numCopy == sum) {
			return true;
		}
		return false;
	}
	
	// A perfect number is a positive whole number that equals the sum of its positive proper divisors, 
	// excluding the number itself
	
	public static boolean perfectNumber(int num) {
		
		int sum = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		if(sum == num) {
			return true;
		}
		return false;
	}
	
	public static void primeNumbers(int num) {
		System.out.print("Prime Numbers till " + num + " ");
		for(int i = 2; i <= num; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static int power(int x, int y) {
		int product = 1;
		for(int i = 1; i <= y; i++) {
			product *= x;
		}
		return product;
	}
	
	public static int factorial(int x) {
		int product = 1;
		for(int i = 1; i <= x; i++) {
			product *= i;
		}
		return product;
	}
	
	
	

	public static void main(String[] args) {
		//printDigits(12345);
		//System.out.println("Number of digits in the given number: " + countDigits(12345));
		//System.out.println("Sum of digits: " + sumOfDigits(12345));
		//System.out.println("Reverse Number: " + reverseANumber(12345));
		//System.out.println("The given number is a palindrome? "+ isPalindrome(12321));
		//System.out.println("The given number is Prime? " + isPrime(7));
		//System.out.println("GCD of given two numbers: " + greatestCommonDivisor(18, 12));
		//System.out.println("LCM of given numbers: " + leastCommonMultiple(5,6));
		//System.out.println("The given number is an armstrong number? " + armstrongNumber(153));
		//System.out.println("The given number is a perfect number? " + perfectNumber(28));
		//primeNumbers(100);
		//System.out.println((int)(Math.pow(2,3)));
		//System.out.println(power(2,3));
		//System.out.println("Factorial of given number is: " + factorial(5));
	}
}
