package LabAssIntermidiate;

public class LabInt10 {
	public static void main(String[] args) {
		int a= 10, b=20, c=30;
		int smallest = c < (a < b ? a : b) ? c : ((a < b) ? a : b);  
		System.out.println(smallest);
	}

}
