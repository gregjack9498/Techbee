package com.techbeeP1class;

import java.util.Scanner;

public class Vowels {
	int count = 0;
	
	String [] vowels = {"a","e","i","o","u"};
	
	
	public static void main (String [] args) {
		int count = 0;
		System.out.println("Please enter a phrase");
		Scanner sc = new Scanner(System.in);
		String phrase = sc.nextLine();
		for(int i=0; i<phrase.length(); i++) {
			char ch = phrase.charAt(i);
			if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ) {
			count ++;	
			}
		}
		System.out.println("the amount of values is "+count);
		
	}
}
