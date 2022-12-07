package String;

import java.util.Scanner;

public class Palindrome_convert_and_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		s=s.toLowerCase();
		
		System.out.println(s);
	/*	correct but consume memory 
		System.out.println(s);
		
		String tar="";
		String rev="";
		
		for(int i=0 ; i<s.length();i++) {
		
       if(s.charAt(i)>=97 && s.charAt(i)<=122 || s.charAt(i)>=48 && s.charAt(i)<=57) {
    	   tar=tar+s.charAt(i); 
       }
		}
		
		System.out.println(tar);
		
		for(int i=tar.length()-1; i>=0;i--) {
			
			rev=rev+tar.charAt(i);
		      
		}
		
		if(tar.equals(rev)) {
			System.out.println("true");
		}
		else System.out.println("false");

*/
		
		
		// use 2 pointers = we have lowercase string 
		
		int r=0;
		int l=s.length()-1;
		int count=0;
		
		for(int i=0 ;r<=l; i++) {
			 if(s.charAt(r)>=97 && s.charAt(r)<=122 || s.charAt(r)>=48 && s.charAt(r)<=57) {
				 System.out.println(s.charAt(r));
				 
				 if(s.charAt(l)>=97 && s.charAt(l)<=122 || s.charAt(l)>=48 && s.charAt(l)<=57) {
					 System.out.println(s.charAt(l));

					 if(s.charAt(r)==s.charAt(l)) {
					
						 System.out.print(s.charAt(r));
						 System.out.println(s.charAt(l));
						 r++;
						 l--;

					 }
					 
					 else {
						 count--;
						 break;
					 }
				 }
				 
				 else l--;
			 }
			 
			 else r++;
		}
		
		if(count>=0 ) {
			System.out.println("true");
			
		}
		else System.out.println("false");
		
	}

}
