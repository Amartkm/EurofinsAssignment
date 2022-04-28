package LabAssIntermidiate;

class LabInt11 {
	public static void main(String[] args) {
		int n = 0, n1= 1, n2;
		int count =20;
		for(int i=2;i<count;i++)    
		 {    
		  n2=n+n1;
		  System.out.print(" "+n2);
		  n=n1;    
		  n1=n2;  
		
		 }    
	}

}
