package com.kumarnitin.array;

import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// declaration
		int[][] arr;
		
		// allocation
		arr = new int[3][4];
		
		
		// init
		/*
		int[][] brr = {
				{1,2}, {2,3}, {3,4}, {4,5}
		};
		*/
		
		// System.out.println(brr[0][0]);
		
		/*
		for(int i = 0; i < brr.length; i++) {
			for(int j = 0; j < brr[0].length; j++) {
				System.out.print(brr[i][j] + " ");
			}
			System.out.println();
		}
		*/

		
		/*
		int[][] brr = {
				{1,2}, {2,3,4,5}, {3,4,4,5,6,7}, {4}
		};
		
		for(int i = 0; i < brr.length; i++) {
			for(int j = 0; j < brr[i].length; j++) {
				System.out.print(brr[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		int[][] brr;
		brr = new int[3][4];
		
		for(int i = 0; i < brr.length; i++) {
			for(int j = 0; j < brr[i].length; j++) {
				System.out.print("Please enter the value at {" + i + ", " + j + "}: ");
				brr[i][j] = sc.nextInt();
			}
		}
		
		
		/*
		for(int i = 0; i < brr.length; i++) {
			for(int j = 0; j < brr[i].length; j++) {
				System.out.print(brr[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
		
		/*
		int sum = 0;
		for(int i = 0; i < brr.length; i++) {
			for(int j = 0; j < brr[i].length; j++) {
				sum += brr[i][j];
			}
		}
		System.out.println("Sum of all the elements in the array: " + sum);
		*/
		
		
		/*
		int product = 1;
		for(int i = 0; i < brr.length; i++) {
			for(int j = 0; j < brr[i].length; j++) {
				product *= brr[i][j];
			}
		}
		System.out.println("Product of all the elements in the array: " + product);
		*/
		
		/*
		int maxValue = Integer.MIN_VALUE;
		for(int i = 0; i < brr.length; i++) {
			for(int j = 0; j < brr[i].length; j++) {
				if(brr[i][j] > maxValue) {
					maxValue = brr[i][j];
				}
			}
		}
		System.out.println("Maximum value of all the elements in the array: " + maxValue);	
		*/
		
		
		int minValue = Integer.MAX_VALUE;
		for(int i = 0; i < brr.length; i++) {
			for(int j = 0; j < brr[i].length; j++) {
				if(brr[i][j] < minValue) {
					minValue = brr[i][j];
				}
			}
		}
		System.out.println("Minimum value of all the elements in the array: " + minValue);	
		
	}
}
