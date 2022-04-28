package LabAss;

public class LabAss5 {
	public static void main(String[] args) {
		int n = 12, sum=0;
		for(int j=2; j<=n; j++) {
			int count = 0;
			for(int i=1; i<=j; i++) {
				if(j%i==0)
					count++;
				if(count==2)
					sum = sum+j;
				}
		}
		System.out.println(sum);
	}

}
