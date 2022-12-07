package Leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class twoSUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int x = 0;
		int find = 0 ;
		x=sc.nextInt();
		int target=sc.nextInt();
		int a[]=new int[x];
	
		ArrayList<Integer>arr=new ArrayList<Integer>();
		
		for(int i=0;i<x;i++) {
			a[i]=sc.nextInt();
			
			
		}
		arr.add(a[0]);
		

		for(int i=1 ; i<x; i++) {

			find=target-a[i];
			
			if(arr.contains(find)) {
				
				System.out.print(arr.indexOf(find) +" ");
				System.out.println(i);

			}
			
			else {
				arr.add(a[i]);
			}
			
			
		}
		
	

	

		
		
		
		
		
		
		

	}

}
