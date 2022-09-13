package CustamizedException;

public class BankAccount {
	
	String bankName;
	String isfcCode;
	String accountHolderName;
	//Address address;
	long acNo;
	public BankAccount(String bankName, String isfcCode, String accountHolderName,long acNo) {
		
		
			
		 	
			
		
		
		this.bankName = bankName;
		this.isfcCode = isfcCode;
		this.accountHolderName = accountHolderName;
		//this.address = address;
		this.acNo = acNo;
		
		

	
	
	
	
	}
	
	
	
	public String getBankName() {
		return bankName;
	}



	public void setBankName(String bankName) {
		this.bankName = bankName;
	}



	public String getIsfcCode() {
		return isfcCode;
	}



	public void setIsfcCode(String isfcCode) {
		this.isfcCode = isfcCode;
	}



	public String getAccountHolderName() {
		return accountHolderName;
	}



	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}



	public long getAcNo() {
		return acNo;
	}



	public void setAcNo(long acNo) {
		this.acNo = acNo;
	}



	@Override
	public String toString() {
		return "BankAccount [bankName=" + bankName + ", isfcCode=" + isfcCode + ", accountHolderName="
				+ accountHolderName + ", acNo=" + acNo + "]";
	}

}
