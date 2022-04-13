package com.crm.qa.base;

import java.util.Arrays;
import java.util.Scanner;

public class TestRun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner sc=new Scanner(System.in);
		
//		String a1=sc.nextLine();
//		String a2=sc.nextLine();
		
		String a1="FIRED";
		String a2="FRIED";
		
		
		
		if(a1.length()==a2.length()) {
			char[] c1=a1.toCharArray();
			char[] c2=a2.toCharArray();
			 // sort the char array
		      Arrays.sort(c1);
		      Arrays.sort(c2);
		      boolean result = Arrays.equals(c1,c2);
		      if(result) {
		          System.out.println(a1 + " and " + a2 + " are anagram.");
		        }
		        else {
		          System.out.println(a1 + " and " + a2 + " are not anagram.");
		        }
		}
		
		else {
			System.out.println("Not Anagram");
		}
		
		}	

	}


