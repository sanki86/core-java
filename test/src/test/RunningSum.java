package test;

import java.util.Arrays;
import java.util.Scanner;

class RunningSum {
    public int[] runningSum(int[] nums) {
    	int sum=0;
       	int[] sumArray=new int[nums.length];
       	/*1st method*/
		/*
		 * for(int i=0;i<nums.length;i++) { sum += nums[i]; sumArray[i] = sum;
		 * 
		 * }
		 */
    	/*2nd method*/
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
    	return nums;
    }
    public static void main(String[] args) {
    	RunningSum sum= new RunningSum();
	    	 Scanner scr=new Scanner(System.in);
	    	 System.out.println("Enter the length of the array:");
	    	 int length = scr.nextInt();
	         int [] myArray = new int[length];
	         System.out.println("Enter the elements of the array:");

	         for(int i=0; i<length; i++ ) {
	            myArray[i] = scr.nextInt();
	         }
	         
	         System.out.println(Arrays.toString(myArray));
	         int[] sumArray= sum.runningSum(myArray);
	         System.out.println(Arrays.toString(sumArray));
}
}