package propagation;

public class prop {
	
	public void m1() {
		System.out.println("m1");
		try {
			
			
		System.out.println(10/0);
		System.out.println(20/0);
		
		}catch(ArithmeticException ss){
			System.out.println(ss.getMessage());
			
			
	}}
	
public void m2() {
	 m1();
		
	System.out.println("m2");
	}
public void m3() {
	m2();
	
	
	
}
public void m4() {
	m3();
	System.out.println("m4");
	
}
public static void main(String[] args) {
	
	prop p =new prop();
	
	
		p.m4();
	
		
	}
		
		
		
		
	
	
	
}

