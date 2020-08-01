package test;

import java.util.Scanner;

class leetReverse {
    public int reverse(int x) {
    	int reverseNo = 0;
    	int INT_MAX =2147483647;
    	int INT_MIN =-2147483648;
    	
    	 while(  x != 0 )
         {
    		 if (reverseNo > INT_MAX/10 || (reverseNo == INT_MAX / 10 && x%10 > 7)) return 0;
             if (reverseNo < INT_MIN/10 || (reverseNo == INT_MIN / 10 && x%10 < -8)) return 0;
    		 reverseNo = reverseNo * 10;
    		 reverseNo = reverseNo + x%10;
             x = x/10;
         }
    	return reverseNo;
        
    }
       public static void main(String[] args) {
    	   leetReverse s= new leetReverse();
	    	 Scanner scr=new Scanner(System.in);
	    	 System.out.println("Enter the number");
	    	 int num = scr.nextInt();
           int reverseNo= s.reverse(num);
           System.out.println(reverseNo);
}
}