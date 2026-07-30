package com.kumarnitin.methods;

public class Methods {
	
	static void print2kaTable() {
		for(int i = 1; i <= 10; i++) {
			int ans = 2*i;
			System.out.println("-> " + ans);
		}
	}
	
	static void printSum(int x, int y) {
		System.out.println("Sum: " + (x+y));
	}
	
	static void printMultiplication(int a, int b) {
		int ans = a*b;
		System.out.println("Result: " + ans);
		return;
	}
	
	
	static int add(int p, int q) {
		int sum = p + q;
		return sum;
	}
	
	
	
	static int add(int p, int q, int r) {
		int ans = p+q+r;
		return ans;
	}
	
	
	
	static float add(int p, float q) {
		float ans = p + q;
		return ans;
	}
	
	
	
	
	static void solve(int num) {
		System.out.println("inside solve : " + num);
		num = num * 10;
		System.out.println("inside solve : " + num);
	}
	

	public static void main(String[] args) {
		/*
		int num = 5;
		System.out.println("inside main : " + num);
		solve(num);
		System.out.println("inside main : " + num);
		*/
		
		
//		int ans1 = add(1, 2);
//		System.out.println("ans1: " + ans1);
		
//		float ans2 = add(1,2.0f);
//		System.out.println("ans2: " + ans2);
		
//		int ans2 = add(1,2,3);
//		System.out.println("ans2: " + ans2);
		
//		int result = add(12,13);
//		System.out.println("Result: " + result);
		
//		printMultiplication(5,10);
		
//		printSum(5,10);
		
//		System.out.println("hi");
		
//		print2kaTable();
		
//		System.out.println("bye");

	}

}
