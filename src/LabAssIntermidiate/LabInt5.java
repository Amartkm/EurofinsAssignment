package LabAssIntermidiate;

public class LabInt5 {
	public static void main(String[] args) {
		 int i, j, pri, n;
	        for (i = 2; i <= 100; i++) {
	            pri = 0;

	            for (j = 2; j <= i / 2; j++) {
	                if (i % j == 0) {
	                    pri = 1;
	                    break;
	                }
	            }
	 
	            if (pri == 0)
	                System.out.print(i+" ");
	        }
	 
	    }

}
