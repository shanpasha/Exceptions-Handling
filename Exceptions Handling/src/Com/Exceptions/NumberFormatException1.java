package Com.Exceptions;

public class NumberFormatException1 {
	
	public static void main(String[] args) {
		
		String s="Shan";
		String s2="12345";
		System.out.println("Shan");
		
		try {
			
		
			int b1= Integer.parseInt(s);
			System.out.println(b1);
			
			
		}catch (NumberFormatException nu) {
			
			
			System.out.println("can't convert into String to integer");
			System.out.println(nu.getMessage());
			//nu.printStackTrace();
		}
		int b= Integer.parseInt(s2);
		System.out.println(b);
		
		
		
	}
	
	
	

}
