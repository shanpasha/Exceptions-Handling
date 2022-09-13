package Com.Exceptions;

public class NullException {
	
	
String name;
int id;
public NullException(String name, int id) {
	
	this.name = name;
	this.id = id;
}


@Override
public String toString() {
	return "NullException [name=" + name + ", id=" + id + "]";
}


public static void main(String[] args) {
	
	NullException n=new NullException("shan",456);
	
	System.out.println(n.toString());
	
	try {
		NullException n1=null;
		System.out.println(n1.toString());
	}catch(NullPointerException nn){
		nn.printStackTrace();
		
		
	}
	
	
	NullException n2= new NullException("Sriman", 458);
	
	
	
	
	System.out.println(n2.toString());
	
	
	
	
}


}
