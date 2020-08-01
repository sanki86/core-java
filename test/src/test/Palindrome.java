package test;


import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String output="No";
        /* Enter your code here. Print output to STDOUT. */
        byte[] byteArray=A.getBytes();
        byte[] resultArray= new byte[byteArray.length];

        for(int i=0;i<byteArray.length;i++){
            resultArray[i]=byteArray[byteArray.length-i-1];
        }
        String reverseOfA=new String(resultArray);
        System.out.println(reverseOfA);
        if(A.equals(reverseOfA)){
           output="Yes";
        }

    System.out.println(output);
        
    }
}



