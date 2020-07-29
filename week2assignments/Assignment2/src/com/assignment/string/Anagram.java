package com.assignment.string;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String args[]) {
	      String str1 = "Dormitory";
	      String str2 = "Dirty room";

	      if (str1.length()==str2.length()) {
	    	  
	         char[] arr1 = str1.toCharArray();
	         Arrays.sort(arr1);
	         System.out.println(Arrays.toString(arr1));
	         
	         char[] arr2 = str2.toCharArray();
	         Arrays.sort(arr2);
	         System.out.println(Arrays.toString(arr2));
	         
	         System.out.println(Arrays.equals(arr1, arr2));
	         
	         if(arr1.equals(arr2))
	            System.out.println("Given strings are anagrams");
	         else {
	            System.out.println("Given strings are not anagrams");
	         }
	      }
	   }

}
