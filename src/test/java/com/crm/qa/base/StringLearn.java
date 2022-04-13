package com.crm.qa.base;

public class StringLearn {

	public static void main(String[] args) {
		String firstString = "Gaurav";
		String secondString = "Gaurav";
		String a=firstString.concat(secondString);
		String secondString1 = "Gaurav";
		String thirdString =  new String("Gaurav");
		System.out.println(firstString);
		System.out.println(secondString);
		System.out.println(thirdString);
		System.out.println(firstString.concat(secondString));
		
		String str1 = new String("abc");
		str1.concat("hi");
		
		System.out.println(str1);
		
		 // Two String objects
	     String str11 = "Hello";
	     String str2 = "World";
	  
	     /* Using concat() method, concat first string with second string and
	        storing into result string */
	      
	     String result = str11.concat(str2);
	  
	     // Print the result
	     System.out.println(result);
	     
	     //=====================================
	     
	     // Two String objects
	     String str111 = "Hello";
	     String str222 = "World";
	  
	     /* Using concat() method, concat first string with second string and
	        storing into result string */
	      
	     String resul222 = str111.concat(str222);
	  
	     // Print the result
	     System.out.println(resul222);

	}

}
