package LabAss;

import java.util.Scanner;

public class LabAss2 {
	 public static void main(String[] args) {  
	       int a, b, t;   
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of X and Y");  
	       a = sc.nextInt();  
	       b = sc.nextInt();  
	       System.out.println("before swapping numbers: "+a +"  "+ b);  
	       t = a;  
	       a = b;  
	       a = t;  
	       System.out.println("After swapping: "+b +"   " + a);  
	       System.out.println( );  
	    }    


}
