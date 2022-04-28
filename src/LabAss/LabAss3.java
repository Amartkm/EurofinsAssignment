package LabAss;


import java.util.Scanner;

public class LabAss3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Digit ");
		int n = scan.nextInt();
		int larg=0;
		while(n!=0) {
			int rem = n%10;
			if(rem>larg) {
				larg = rem;
				n=n/10;
				System.out.println("largest no");
				System.out.print(larg);
		
				
			}		   
	}

	}

}
