package String;

import java.util.Scanner;

public class getWTasked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		
		Scanner sc = new Scanner(System.in);
		
		s=sc.next();      //test1234
	/*	
		// print only 1234
		
		String[] prt = s.split("t");
		
		
		System.out.println(prt[2]);*/
		
		// get only digits... s=efkfknf12ekek25 
		s=s.replaceAll("[^0-9]", ""); // Replacing every non-digit number
		
		System.out.println(s);  // 1225
	
		
	
		

	}

}
