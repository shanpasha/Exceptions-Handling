package Com.Exceptions;

public class ExceptionWithRetrun {
	
	
	public static int m1(int a,int b) {
		try {
		return a/b;
		}catch(ArithmeticException aa){
			System.out.println(0);
			return 0;
			
		}
		
	}
	public static void main(String[] args) {
		System.out.println(ExceptionWithRetrun.m1(22, 1));
	}

}
