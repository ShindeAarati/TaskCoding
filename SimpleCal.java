package com.test;

import java.util.Scanner;

public class SimpleCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// First Enter 2 number
		System.out.println("Enter the First Number");
		
		double number=sc.nextDouble();
		
		System.out.println("Enter the Second Number");
		
		double num2=sc.nextDouble();
		// Then choice 1 operator
		System.out.println("Enter an Operator(+,-,*,/)");
		
		char operator = sc.next().charAt(0);
		//To store the result
		double result;
		//Using Switch Case
		switch(operator) {
		
		case '+':
			result =number+num2;
			System.out.println("The result is: " + result);
            break;
        case '-':
            result = number - num2;
            System.out.println("The result is: " + result);
            break;
        case '*':
            result = number * num2;
            System.out.println("The result is: " + result);
            break;
        case '/':
            if (num2 != 0) {
                result = number / num2;
                System.out.println("The result is: " + result);
            } else {
                System.out.println("Error! Division by zero.");
            }
            break;
        default:
            System.out.println("Invalid operator! Please enter one of +, -, *, /.");
            break;
    }
    
   
}

		
	}

