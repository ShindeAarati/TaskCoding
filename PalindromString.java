package com.test;
import java.util.Scanner;
public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 //Enter The User string
	        System.out.println("Enter a string: ");
	        String str=sc.next();
	        //to store reverse
	        String rev="";
	        
	        for(int i=0;i<str.length();i++) {
	        	rev=str.charAt(i) +rev;
	        	
	        }
	        if(str.equalsIgnoreCase(rev)) {
	        	System.out.println("Palindrom Word");
	        }
	        else {
	        	System.out.println("Not Palidrom Word");
	        }
	        	
	        
	        

	      
	       
	 
	}

}
