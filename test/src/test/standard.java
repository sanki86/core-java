package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class standard {

    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        int lineNo=1;
        while(scr.hasNext()){
            System.out.println(lineNo+" "+scr.nextLine());
            lineNo++;
        }
    }
}

