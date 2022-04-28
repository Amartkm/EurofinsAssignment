package LabAss;

import java.util.Scanner;

class LabAss1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("enter the no ");
		int n = scan.nextInt();
		if(n%2==0) {
			System.out.println("this is even no ");
		}
		else {
			System.out.println("this is odd no");
		}
		
	}
	
}
