package Exception;

public class Runtime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int i=10;
			int x=1;
			
			System.out.println(i/x);
			
			System.out.println("ok");
		}
		
		catch(Exception e){
			System.out.println("addressed");
			
		}
		
		System.out.println("Go on");

	}

}
