package com.techbeeP1class;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//Use an Enum vowels
//use replace method for string
//for loops to count all of the stars
public class Consonants {
/*enum Vowels{
	a,
	e,
	i,
	o,
	u
}*/
public static void main(String [] args) {
	
	Scanner in = new Scanner(System.in);
    System.out.print("Enter your favorite song: ");
    String str = in.nextLine();
   
    int vcount = 0, ccount = 0;

    //converting all the chars to lowercase
    str = str.toLowerCase();
    for(int i = 0; i < str.length(); i++) {
    	char ch = str.charAt(i); 
    	if(ch == 'a' || ch == 'e' || ch == 'i'
    			|| ch == 'o' || ch == 'u')
    	{ vcount++; } else if
    	((ch >= 'a'&& ch <= 'z')) {
            ccount++;
        }
    }

   
    System.out.println("Number of Consonants: " + ccount);
    str = str.replaceAll("[BCDFGHJKLMNPQRSTVWXZY]", "*");
    System.out.println(str);
  
    
}

    	
    
	}

