package test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokens {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s.trim();
        String delimiter=" !,?._'@]+";
        StringTokenizer str=new StringTokenizer(s,delimiter);
        int noOfTokens= str.countTokens();
        System.out.println(noOfTokens);
        
        while (str.hasMoreElements()) {
            String token = str.nextElement().toString();
            System.out.println(token);
        }
          scan.close();  
        } 
        
    }

