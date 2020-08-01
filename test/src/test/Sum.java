package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sum {
	
	 public int[] twoSum(int[] nums, int target) {
		 for (int i = 0; i < nums.length; i++) {
		        for (int j = i + 1; j < nums.length; j++) {
		            if (target == nums[j] + nums[i]) {
		                return new int[] { i, j };
		            }
		        }
		    }
	        throw new IllegalArgumentException("No two sum solution");
	    }
	     public static void main(String[] args) {
	    	 Sum s= new Sum();
	    	 Scanner scr=new Scanner(System.in);
	    	 System.out.println("Enter the length of the array:");
	    	 int length = scr.nextInt();
	    	 
	    	 int[] nums= new int[length];
	    	 for(int i=0; i<length; i++ ) {
	    		 nums[i] = scr.nextInt();
	          }

	    		int tar=scr.nextInt();	 
	        int[] a= s.twoSum(nums,tar);
	        System.out.println(Arrays.toString(a));
		/*
		 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 */
	        	
	         //System.out.println(Arrays.toString(a));
	}
}

