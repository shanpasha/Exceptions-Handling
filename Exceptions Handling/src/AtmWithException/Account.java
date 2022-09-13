package AtmWithException;

public class Account {
	
	long accountNum;
	String customerName;
     double acbalance;
	public Account(long accountNum, String customerName, double acbalance) {
		
		this.accountNum = accountNum;
		this.customerName = customerName;
		this.acbalance = acbalance;
	}
	
	public double CashWithdrawal(double withdrawAmmount) {
		
		if(this.acbalance>withdrawAmmount) {
			
			this.acbalance-=withdrawAmmount;
			
			}
			if(this.acbalance<withdrawAmmount) {
				
			throw new InsufficientFunds("Insufficent Funds...! please check your balance");
			}
			return  this.acbalance;
	}
	
	public double CashDeposit(double CashDeposit) {
		try {
		if(100<=CashDeposit)  {
			
			this.acbalance+=CashDeposit;
		}
		if (CashDeposit<100) {
			
			throw new InvalidEntry("please enter more than 100...!");
		}
		}catch (InvalidEntry ss) {
			ss.printStackTrace();
			
		}
		
		return this.acbalance;
		
	}

	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", customerName=" + customerName + ", acbalance=" + acbalance
				+ "]";
	}
	
}
