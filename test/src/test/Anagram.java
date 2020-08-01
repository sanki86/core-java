package test;



import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    	boolean anagram=false;
    	String A= a.toLowerCase();
    	String B= b.toLowerCase();
    	char ACharArray[]= A.toCharArray();
    	char BCharArray[]= B.toCharArray();
    	
    	java.util.Arrays.sort(ACharArray);
    	java.util.Arrays.sort(BCharArray);
    	 
    	if(A.length()==B.length()) {
        if( java.util.Arrays.equals((ACharArray),(BCharArray))){
    	    anagram=true;
         }
        }
    	
        return anagram;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}