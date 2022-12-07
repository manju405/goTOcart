package array;

import java.util.Scanner;

public class bestDayToBuySTOCK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		
		int[] arr=new int[x];
		
		//input to array 
		
		for(int i=0; i<x;i++) {
			arr[i]=sc.nextInt();
		}
		
		// create variables for low and max prices 
		
		int l=0,r=1,max=0;
		
		for(int i=0; r<x; i++) {
			if(arr[l]>arr[r]) {
				l=r;
				r=l+1;
			}
			else {
				if((arr[r]-arr[l])>max ) {
					max=arr[r]-arr[l];
					
				}
					
				r++;
				
			}
			
			
		}
		
		System.out.println(max);
		
		
		
		

	}

}
