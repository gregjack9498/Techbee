package com.techbeeP1class;

import java.util.Scanner;

public class Palindrome {
	public static void main (String [] args) {
	 System.out.print("Enter any string : ");
     Scanner in = new Scanner(System.in);
      
   
     String origString = in.nextLine();
      
 
     String reverseString = new StringBuilder(origString).reverse().toString();
      
    
     if (origString.equals(reverseString)) {
         System.out.println("String is a palindrome.");
     } else {
         System.out.println("String is not a palindrome.");
     }
 }
}



