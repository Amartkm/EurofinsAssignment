package LabAss;

public class labAss8 {
	public static void main(String[] args) {
		String s= "This ";
		String s1="";
		for (int i=0; i<s.length(); i++) {
			char x = s.charAt(i);
			if(x>='a' && x<='z'){
				x=(char)(x-32);
				s1 = s1+x;
			}
			else if 
				(x>='A'&& x<='Z'){
					x=(char)(x+32);
					s1= s1+ x;
				}
				else {
					s1= s1+x;
					
					
			}
			System.out.println(s1);
			}
		}
	}


