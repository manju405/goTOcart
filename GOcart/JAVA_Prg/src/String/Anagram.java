package String;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s=sc.next();
		
		String t=sc.next();
	/*	
		char a,b;
		
		for(int i=0;i<s.length();i++) {
			a=s.charAt(i);
			
			for(int j=0;j<t.length();j++) {
				b=t.charAt(j);
				
				if(a==b) {
				t=t.replaceFirst(""+a+"", "");
				
				
				}
			}
		}
		
		if(t.length()==0) {
			System.out.println("true");
		}
		else System.out.println("false");
		
		
*/
		if(s.length()==t.length()) {
		int count;
		
		HashMap<Character, Integer>map=new HashMap<>();
	
		for(int i=0 ; i<s.length();i++) {
			
			if(map.containsKey(s.charAt(i))) {
				
				count=map.get(s.charAt(i))+1;
				map.put(s.charAt(i),count);
			}
			
			else {
				map.put(s.charAt(i),1);
				
			}
		}
		HashMap<Character, Integer>map1=new HashMap<>();

		for(int i=0 ; i<t.length();i++) {
			
			if(map1.containsKey(t.charAt(i))) {
				
				count=map1.get(t.charAt(i))+1;
				map1.put(t.charAt(i),count);
			}
			
			else {
				map1.put(t.charAt(i),1);
				
			}
		}
		
		System.out.println(map);
		System.out.println(map1);
		
		
			
			if(map1.equals(map)) {
				System.out.println("true");
				
			}
			else System.out.println("false");
			

		}
		
		else {
			System.out.println("false");
		}
	}

}
