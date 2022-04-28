package LabAss;

import java.util.Scanner;

public class LabAss4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the No:");
		int n = scan.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++) {
		if(i%2!=0) {
			sum = sum+ i;	
		
		}
	}
		System.out.println("sum of odd no is "+sum);

}
}
