// 1.
/*
package com.kumarnitin.methods;

public class MethodsHw {
	
	public static void printWelcomeMessage(){
		System.out.println("Welcome to Nitin's World!!!");
	}

	public static void main(String[] args) {
		printWelcomeMessage();	
	}
}
*/


// 2. 
/*
package com.kumarnitin.methods;

public class MethodsHw {
	
	public static int add(int a, int b){
		return a + b;
	}

	public static void main(String[] args) {
		int sum = add(2,3);	
		System.out.println("a + " + "b = " + sum);
	}
}
*/


// 3.
/*
package com.kumarnitin.methods;

public class MethodsHw {
	
	public static boolean isEven(int a){
		return a % 2 == 0;
	}

	public static void main(String[] args) {
		int num = 8;
		System.out.println(num + " is Even -> " + isEven(num));
	}
}
*/


// 4.
/*
package com.kumarnitin.methods;

public class MethodsHw {
	
	public static int getMaximum(int a, int b){
		if(a < b) {
			return b;
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println(getMaximum(123, 89) + " is the maximum among the given two numbers.");
	}
}
*/


// 5.
/*
package com.kumarnitin.methods;

public class MethodsHw {
	
	public static float calculatePercentage(float obtained, float total){
		return (obtained / total) * 100;
	}

	public static void main(String[] args) {
		System.out.println("Percentage Marks: " + calculatePercentage(70.0f,100.0f) + "%");
	}
}
*/


// 6. 
/*
package com.kumarnitin.methods;

public class MethodsHw {
	
	public static void display(int number){
		System.out.println("Entered number is " + number);
	}
	
	public static void display(String name){
		System.out.println("Entered Name is " + name);
	}


	public static void main(String[] args) {
		display(5);
		display("Kumar Nitin");
	
	}
}
*/


// 7.
/*
package com.kumarnitin.methods;

public class MethodsHw {
	
	public static void updateValue(int x){
		System.out.println("The value of x is: " + x);
		x = x + 5;
		System.out.println("The value of x is: " + x);
	}


	public static void main(String[] args) {
		int x = 5;
		System.out.println("The value of x is: " + x);
		updateValue(x);
		System.out.println("The value of x is: " + x);
	}
}
*/