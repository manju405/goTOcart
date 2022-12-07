package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class dupicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		
		int[]arr=new int[x];
		
		String res = "false";
		
		HashSet<Integer>hash=new HashSet<>();

		
		
//input to array		
		for(int i=0;i<x;i++) {
			arr[i]=sc.nextInt();
			
			if(hash.contains(arr[i])) {
				res="true";
				
			}
			else {
				hash.add(arr[i]);
			}
			
		}

		System.out.println(res);
		
	

	}}


