package LabAss;

import java.util.Scanner;

class LabAss6 {

	static void series1(int N)
	{
		int sum = 1 ,sign = 1;
		for(int i=1;i<=N;i++)
		{
			System.out.print(sum*sign+",");
			sign = sign * -1;
			sum =sum + (i*i);		
		}
		System.out.println();
	}
	
	//to print in the series of 4,16,36,64...
	static void series2(int N)
	{
		for(int i=1;i<=N;i++)
		{
			if(i%2==0)
				System.out.print(i*i+",");
		} 
		System.out.println();
	}
	
	//to print in the series of 1,1,2,3,5,8,13,...
	static void series3(int N)
	{
		int n1 = 0, n2 = 1,sum=0;
		System.out.print(n2+",");
		for(int i=2;i<=N;i++)
		{
			sum = n1+n2;
			System.out.print(sum+",");
			n1 = n2;
			n2 = sum;
		}
		System.out.println();
	}
	//to print in the series of 1,4,7,12,23,42,77.....N
	static void series4(int N)
	{
		int n1=1, n2=4, n3=7;
		int sum = 0;
		System.out.print(n1+","+n2+","+n3+",");
		for(int i=1;i<=N;i++)
		{
			sum = n3+n2+n1;
			System.out.print(sum+",");
			n1 = n2;
			n2 = n3;
			n3 =sum;
		} 
		System.out.println();
		
	}
	
	//to print in the series of 1,-2,4,-6,7,-10,10,-14....N
	static void series5(int N)
	{
		int x = 1,y = -2;
		System.out.print(x+","+y+",");
		for(int i=1;i<=N;i++) 
		{
			x = x + 3;
			y = y - 4;
			System.out.print(x+","+y+",");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args)
	{
	
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int N = scn.nextInt();
		scn.close();
		
		series1(N);
		series2(N);
		series3(N);
		series4(N);
		series5(N);
	}	
	
	
}
