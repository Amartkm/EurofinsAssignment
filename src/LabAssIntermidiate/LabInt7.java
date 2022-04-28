package LabAssIntermidiate;

public class LabInt7 {
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6};
		int sum =0;
		int s = arr.length;
		for(int i=0; i<s; i++) {
			sum = sum +arr[i];	
		
		}
		System.out.println(sum);
		double avg = sum/arr.length;
		 System.out.println("avg= "+avg);
	
			
	}

}
