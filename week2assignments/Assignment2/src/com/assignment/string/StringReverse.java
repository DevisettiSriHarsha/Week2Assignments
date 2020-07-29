package com.assignment.string;

public class StringReverse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Capgemini";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}
