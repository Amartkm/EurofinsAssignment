package LabAss;

public class LabAss10 {
	public static void main(String[] args) {
		int sum =0;
		
		int j =0;
		for(int i=3;i<=7; i++ ) {
			for(j=1; j>=0; --j) {
				sum = sum +(i*j);
			}
		}
		System.out.println(sum);
	}

}
// o/p = 25
