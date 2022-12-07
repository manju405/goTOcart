package String;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		Scanner sc=new Scanner(System.in);
		
		s=sc.next();
		
		String r="";
		
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
		}
		
		if(r.equals(s)) {
			System.out.println("TRUE");
		}
		
		else {
			System.out.println("FALSE");
		}

	}

}
