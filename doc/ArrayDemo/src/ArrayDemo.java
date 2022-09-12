/**
 * @author vlangner
 *
 * This class shows how to create an array and put integers into it, and then displays the content of the array.
 */
public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// how to define a 2D array (pg 142)
		int table[][] = new int[3][4];		// 3 rows and 4 columns
		
		int r, c;		// variables for indices of table: r is rows / c is columns
		
		// outer for loop for controlling rows of the table
		for(r = 0; r <= 2; r++) {
			// inner for loop for controlling columns of the table
			for(c = 0; c <= 3; c++) {
				table[r][c] = (r * 4) + c + 1;			// assign right number at index [r][c]
				System.out.print(table[r][c] + " ");	// print the value at index [r][c]
			}
			System.out.println();
		}
		
		
		
		
		/*
		// find the smallest and biggest number from a list of numbers given using Array
		int min;
		int max;
		
		// an array named nums of numbers is given
		int nums [] = {99, -10000, 100123, 18, -978, 5623, 463, -9, 287, 49, 111, 222, 23344, 10, 89};
		
		min = nums[0];		// let min be the first number in the array nums
		max = nums[0];		// let max be the first number in the array nums
		
		// an algorithm for finding the smallest number in a list of numbers
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("The smallest number is " + min);
		
		// an algorithm for finding the biggest number in a list of numbers
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("The biggest number is " + max);
		
		
		
		
		
		
		/*
		// create an array that holds integers
		int [] sample = new int [6];		// the [] on left hand side indicates we are creating an array; int means the thing inside array is of type int
											// [6] on right hand side shows the length of the array, 6
		
		
		// initialize the array: sample
		sample[0] = 0;
		sample[1] = 1;
		sample[2] = 4;
		sample[3] = 9;
		sample[4] = 16;
		sample[5] = 25;
		
		
		// initialize the array: sample (using for loop)
		for(int i = 0; i < sample.length; i++) {
			// sample[i] = i * i;		// the number in slot i is i squared
			// sample[i] = i * i * i;		// the number in slot i is i cubed
			
			// show how to use methods inside the built in class Math
			sample[i] = Math.pow( i , 2.0 );		// the number in slot i is i squared
		}
		
		// verify that I did the right job
		for(int i = 0; i < sample.length; i++) {
			System.out.println("The number at index " + i + " is: " + sample[i]);
			
		}
		*/
		

	}
}
