package Com.Exceptions;

public class NullpointException {
	
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		
		
	String s=null;
	
	
	try {
		System.out.println(s.length());
	}catch(NullPointerException ee){  
		
		ee.printStackTrace();	
		
	}
	
	System.out.println("Second Statement");
		

	}

}
