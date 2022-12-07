package String;

import java.util.ArrayList;

public class GETpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Facebook helps you connect and share with the 'people' in your life.";
		int size = str.length();
		
		String[] s1 = str.split("'"); // 2 string = s1[0]=Facebook helps you connect and share with the '
		                                         // s2[1]=people' in your life
		
		s1=s1[1].split("'");// 2 string = s1[0]=people
                                       // s2[1]=' in your life
		
		System.out.println(s1[0]);   //now we get only [people]



	}

}
