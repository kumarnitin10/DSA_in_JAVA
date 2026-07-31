package com.kumarnitin.array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		/*
		// declaration
		int arr[];
		
		// allocation
		arr = new int[5];
		
		*/
		// init
		int brr[] = {10,20,30};
		
		/*
		System.out.println("Value at 0th index: " + brr[0]);
		System.out.println("Value at 1st index: " + brr[1]);
		System.out.println("Value at 2nd index: " + brr[2]);
		*/
		
		/*
		for(int index = 0; index < brr.length; index++) {
			System.out.println("Value at " + index + " index: " + brr[index]);
		}
		*/
		
		/*
		for(int value : brr) {
			System.out.println(value);
		}
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter the value for index " + i + " : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array contains: ");
		for(int value : arr) {
			System.out.println(value);
		}
		*/
		
		
		
		int arr[] = {12, 14, 1245};
		
		/*
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		
		/*
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of numbers in array: " + sum);
		*/
		
		/*
		int product = 1; 
		
		for(int i = 0; i < arr.length; i++) {
			product *= arr[i];
		}
		System.out.println("Product of numbers in array: " + product);
		*/
		
		/*
		int maxValue = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		System.out.println("Maximum value in the array is: " + maxValue);
		*/
		
		
		int minValue = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		System.out.println("Minimum value in the array is: " + minValue);
	}
}
