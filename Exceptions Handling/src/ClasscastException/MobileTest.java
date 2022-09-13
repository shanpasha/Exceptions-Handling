package ClasscastException;

public class MobileTest {
	public static void main(String[] args) {
		
		
			
		
		Mobiles m1=new Realme("note 8pro", 18000); //child obj to parent type
		Mobiles m2 =new Redmi("Realme5", 9999);    //child obj to parent type
		
		Redmi r1= (Redmi) new Mobiles("5pro", 7800); //parent obj to child type -->type classcast exception
	
		System.out.println(m1);
		System.out.println(r1);
		System.out.println(m2);
	}
	
	

}
