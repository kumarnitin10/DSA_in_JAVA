package com.kumarnitin.conditionals;

import java.util.Scanner;

public class ConditionalsHomeWork {

	public static void main(String[] args) {
		
		
        // 1. Take age input and print if he/she is eligible to vote or not
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("You are eligible to vote.");
		}else {
			System.out.println("You are not eligible to vote.");
		}
		
		
		// 2. Take input 5 subject's marks and print the overall percentage of student
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the marks obtained in all 5 subjects: ");
		int totalMarks = 0;
		for(int i = 1; i <= 5; i++) {
			totalMarks += sc.nextInt();
		}
		System.out.println("Percentage Marks: " + (totalMarks/500.0)*100);
		
		
		// 3. Take input a lowercase character and print its uppercase version		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the letter in lowercase letter: ");
		char letter = sc.next().charAt(0);
		System.out.println((char)(letter - 32));
		
		
		// 4. Take input a uppercase character and print its lowercase version
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the letter in uppercase letter: ");
		char letter = sc.next().charAt(0);
		System.out.println((char)(letter + 32));

		
		// 5. Take input 5 subject's marks, drop the least one and calculate the overall percentage considering only the top 4 marks, print it
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int minValue = Integer.MAX_VALUE;
		System.out.println("Please enter the marks in each subject: ");
		for(int i = 1; i <= 5; i++) {
			
			int n = sc.nextInt();
			sum += n;
			
			if(n < minValue) {
				minValue = n;
			}
			
		}
		System.out.println("Overall Percentage: " + (sum-minValue)/4.0);
	}

}
