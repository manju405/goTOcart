package Exception;

import java.util.Scanner;

class insufficientBalance extends Exception{                      // user defined exception class
	
	static String msg;
	
	insufficientBalance(String msg){
		this.msg=msg;
	}
	
	public String get() {
		return msg;
	}
	
}


public class CHECKED {

	
	
	
	static void payment() throws insufficientBalance {
		int balance=5000;
		Scanner sc= new Scanner(System.in);
		int amount = sc.nextInt();
		
		if(amount<balance) {
			System.out.println("payment is processing");
		}
		
		else {
			throw new insufficientBalance("insufficient Balance");
		}
	}
	
	
	static void recharge() throws insufficientBalance {
		System.out.println("recharge page");
		payment();
	}
	
	
	
	static void homepg() throws insufficientBalance {
		System.out.println("home page");
		recharge();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			homepg();
		} catch (insufficientBalance e) {
			// TODO Auto-generated catch block
			System.out.println(e.get());                          //insufficientBalance e= new insufficientBalance("insufficient Balance");
		}
		
		

	}

}
