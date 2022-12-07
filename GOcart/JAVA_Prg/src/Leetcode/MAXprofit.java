package Leetcode;

import java.util.Scanner;

public class MAXprofit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0;
		
		
		Scanner sc=new Scanner(System.in);
		
		x=sc.nextInt();
		int[] arr=new int[x];
		for(int i=0; i<x;i++) {
			arr[i]=sc.nextInt();
		}
		
		 
		//2pointer solution
		
		int max = 0,L=0;
		
		
		for(int r=1;r<x;r++) {
		   
			if(arr[L]>arr[r]) {             
				L=r;	
				continue;
			}
			
			
			
			if(arr[r]-arr[L] > max) {
				
				max=arr[r]-arr[L];
				
			}
			
		
			
			
		}
		
		System.out.println(max);

	}

}
