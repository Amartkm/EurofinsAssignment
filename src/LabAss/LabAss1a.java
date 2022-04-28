package LabAss;

import java.util.Scanner;

public class LabAss1a {
	public static void main(String[] args) {
		double p= 20000, R= 10, T=2;
		double simple_intrest;
		Scanner scan = new Scanner(System.in);
		System.out.println("principal");
		p=scan.nextDouble();
		System.out.println("rate of intrest");
		R=scan.nextDouble();
		System.out.println("Time");
		T= scan.nextDouble();
		
		simple_intrest = (p*R*T)/100;
		
	System.out.println(simple_intrest);
	}


}
