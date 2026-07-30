package com.kumarnitin.loops;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {

		// 1
		/*
		 
		 *****
		 *****
		 *****
		 *****
		 *****
		 
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please provide the value of n: ");

		int n = sc.nextInt();

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// 2
		/*
		 
		 * * * 
		 * * * 
		 * * * 
		 * * * 
		 
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the length and breadth of the rectangular pattern: ");
		
		int l = sc.nextInt();
		int b = sc.nextInt();	
		
		for(int i = 1; i <= l; i++) {
			for (int j = 1; j <= b; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		// 3
		/*
		 
		 * 
		 * * 
		 * * * 
		 * * * * 
		 * * * * *
		 
		 */
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
		*/
		
		// 4
		/*
		 
		         * * * * * 
		       * * * * * 
		     * * * * * 
	       * * * * * 
		 * * * * *
		 
		 */
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= n; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		// 5
		/*
		 
		 * * * * * 
		 * * * * 
		 * * * 
		 * * 
		 * 
		 
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		// 6
		/*
		 
		* 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
		 
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			for(int l = 1; l <= i-1; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		// 7
		/*
		 
		* * * * * * * 
		  * * * * * 
		    * * * 
		      * 
		      
		*/
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i - 1; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= n-i+1; k++) {
				System.out.print("* ");
			}
			for(int l = 1; l <= n - i; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		// 8
		/*
		
		* * * * * * 
		*         * 
		*         * 
		* * * * * *
		
		*/
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and column: ");
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= cols; j++) {
				if(i == 1 || i == rows || j == 1 || j == cols) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		*/
		
		// 9
		
		/*
		 
		*
		* * 
		*   * 
		*     * 
		* * * * *
		
		*/
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		
		int n = sc.nextInt();
		
		System.out.println("*");
		for(int i = 1; i <= n-2; i++) {
			System.out.print("* ");
			for(int j = 1; j <= i-1; j++) {
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		
		for(int i = 1; i <= n; i++) {
			System.out.print("* ");
		}
		*/
		
		// 10
		
		/*
		 
		* 
      *   * 
    *       * 
  *           * 
* * * * * * * * * 
		 
		 */
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n-1; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			if(i != 1) {
				System.out.print("* ");
			}
			
			for(int k = 1; k <= i-1; k++) {
				System.out.print("  ");
			}
			for(int l = 1; l <= i-2; l++) {
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		for(int i = 1; i <= 2*n-1; i++) {
			System.out.print("* ");
		}
		*/
		
		// 11.
		/*
		 
	  * 
    * * * 
  * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      * 
      
		 */
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			for(int l = 1; l <= i-1; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 1; i <= n-1; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= n-i; k++) {
				System.out.print("* ");
			}
			for(int l = 1; l <= n-i-1; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		// 12
		
		/*
		 
	  * 
    *   * 
  *       * 
*           * 
  *       * 
    *   * 
      * 
		 
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			
			for(int k = 1; k <= 2*(i-1)-1; k++) {
				System.out.print("  ");
			}
			if(i == 1) {
				System.out.println();
			}else {
				System.out.println("* ");
			}
			
		}
		
		for(int i = 1; i <= n-1; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			for(int k = 1; k <= 2*(n-i-1)-1; k++) {
				System.out.print("  ");
			}
			if(i == n-1) {
				System.out.println();
			}else {
				System.out.println("* ");
			}
			
		}
		*/
			
		// 13
		/*
		 
*             * 
* *         * * 
* * *     * * * 
* * * * * * * * 
* * * * * * * * 
* * *     * * * 
* *         * * 
*             * 
		 
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for(int k = 1; k <= (n-i)*2; k++) {
				System.out.print("  ");
			}
			for(int l = 1; l <= i; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i+1; j++) {
				System.out.print("* ");
			}
			for(int k = 1; k <= (i-1)*2; k++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		// 14
		/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
		 
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		*/
		
		// 15
		
		/*
		 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
		 
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();
		
		int temp = 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println();
		}
		*/
		
		// 16.
		
		/*
		 
A 
A B 
A B C 
A B C D 
A B C D E 
		 
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			char temp = 'A';
			
			for(int j = 1; j <= i; j++) {
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println();
		}
		*/
		
		// 17.
		
		/*
		 
E 
E D 
E D C 
E D C B 
E D C B A

		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			char temp = 'E';
			for(int j = 1; j <= i; j++) {
				System.out.print(temp + " ");
				temp--;
			}
			System.out.println();
		}
		*/
		
		// 18.
		
		/*
		 
* * * * * * * 
  * * * * * 
    * * * 
      * 
    * * * 
  * * * * * 
* * * * * * *
		 
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= n-i+1; k++) {
				System.out.print("* ");
			}
			for(int l = 1; l <= n - i; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 1; i <= n-1; i++) {
			for(int j = 1; j <= n-1-i; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= i + 1; k++) {
				System.out.print("* ");
			}
			for(int l = 1; l <= i; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		// 19.
		
		/*
		 
	  1 
    1 2 1 
  1 2 3 2 1 
1 2 3 4 3 2 1
		 
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= i-1; k++) {
				System.out.print(k + " ");
			}
			for(int l = i; l >= 1; l--) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
		*/
		
		// 20
		
		/*
		 
	  1 
    2 2 2 
  3 3 3 3 3 
4 4 4 4 4 4 4
		 
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= 2*i - 1; k++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		*/
		
		// 21
		/*
		 
	  A 
    A B A 
  A B C B A 
A B C D C B A
		 
		 */
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			char temp = 'A';
			char revTemp = ' ';
			for(int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(temp + " ");
				revTemp = temp;
				temp++;
			}
			for(int l = 1; l <= i-1; l++) {
				System.out.print(--revTemp + " ");
			}
			System.out.println();
		}
		*/
	}
}
