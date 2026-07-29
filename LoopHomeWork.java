package com.kumarnitin.loops;

import java.util.Scanner;

public class LoopHomeWork {
	
	public static void main(String[] args) {
		
		
		// 1. Print counting from 1 to n
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the value of n: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		
		
		// 2. Print counting from n to 1
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the value of n: ");
		int n = sc.nextInt();
		
		for(int i = n; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		
		
		// 3. Print the 10 multiples of n
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the value of n: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.print((n*i) + " ");
		}
		
		
		// 4. Print your name 100 times
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();
		
		for(int i = 1; i <= 100; i++) {
			System.out.println(name);
		}
		
		
		// 5. Print all prime numbers from 1 to 100
		for(int i = 2; i <= 100; i++) {
			boolean flag = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.print(i + " ");
			}
		}
		
		
		// 6. Print all even numbers from 1 to 100
		for(int i = 2; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		
		
		// 7. Print the sum of all the numbers from 1 to n
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the value of n: ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		// 8. Print all integers in range from 50 to 100, that are perfectly divisible by 7
		for(int i = 50; i <= 100; i++) {
			if(i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
