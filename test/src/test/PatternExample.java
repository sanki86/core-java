package test;

import java.util.Scanner;

import java.util.regex.*;

public class PatternExample
{
	private static String REGEX = ":";
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		while(in.hasNextLine()&&testCases>0){
			String pattern = in.nextLine();
			 try{
	                Pattern.compile(pattern);
	                System.out.println("Valid");
	            }catch(Exception exception){
	                System.out.println("Invalid");
	            }
		}testCases--;
          
	}
}
