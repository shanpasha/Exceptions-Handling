  package Com.Exceptions;

public class ArrayBoundOfException {
	public static void main(String[] args) {
		

	
	int [] a= {1,2,5,8,5,6};
	
	try {
	for (int i=0;i<=7;i++) {
		
		System.out.println(a[i]);
		
	}
	}catch(ArrayIndexOutOfBoundsException e){
		
		e.printStackTrace();
		
	}
	
	System.out.println("hello");
	}
	


}