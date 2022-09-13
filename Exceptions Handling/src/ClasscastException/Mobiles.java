package ClasscastException;

public class Mobiles {
	
	String mobileName;
	int price;
	public Mobiles(String mobileName, int price) {
		super();
		this.mobileName = mobileName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobiles [mobileName=" + mobileName + ", price=" + price + "]";
	}
	

}
