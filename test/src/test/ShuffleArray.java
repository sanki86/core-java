package test;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {


public int[] shuffle(int[] nums, int n) {
	
	int a[]=new int[n];
	int b[]=new int[n];
	int resultArray[]=new int[nums.length];
	
	for(int i=0;i<nums.length;i++){
		if(i<a.length) {
			 a[i]=nums[i];
		}
		else {
			 b[i-a.length]=nums[i];
		}
		
	}
	int i = 0, j = 0, k = 0;
	while( i<a.length) {
		
		resultArray[k++]=a[i++];
		resultArray[k++]=b[j++];
	}
	
	 while (i < a.length) 
		 resultArray[k++] = a[i++]; 
   

     while (j < b.length) 
    	 resultArray[k++] = b[j++];

	return resultArray;
    
}
public static void main(String[] args) {
	ShuffleArray shuffleArray= new ShuffleArray();
    	 Scanner scr=new Scanner(System.in);
    	 System.out.println("Enter the length of the array:");
    	 int length = scr.nextInt();
         int [] myArray = new int[length];
         System.out.println("Enter the elements of the array:");

         for(int i=0; i<length; i++ ) {
            myArray[i] = scr.nextInt();
         }
         System.out.println("Enter n :");
         int n=scr.nextInt();
         System.out.println(Arrays.toString(myArray));
         int[] sArray= shuffleArray.shuffle(myArray,n);
         System.out.println(Arrays.toString(sArray));
}
}