package AtmWithException;

public class Atmtest {
	public static void main(String[] args) {
		
		
		Account raj=new Account(7569642122l,"raj", 1000);
		System.out.println(raj);
		
		System.out.println(raj.CashDeposit(150));
		System.out.println(raj.CashDeposit(50));
		System.out.println(raj.CashDeposit(100));
		System.out.println(raj.CashWithdrawal(10000));
	}

}
