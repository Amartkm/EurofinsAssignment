package LabAssIntermidiate;

public class LabInt9 {
	public static void main(String[] args) {
		int n = 370, m = n, sum = 0,pow=0,tem=m;
		while(n!=0) {
			pow++;
			n=n/10;
			
		}
		while(m!=0) {
			int rem = m%10, res=1;
			for(int i =0; i<pow; i++) 
				res = res*rem;
			sum += res;
			m = m/10;
				
			
		}
		System.out.println(tem==sum?"armstrong":"n0t armstrong");
	}
}


