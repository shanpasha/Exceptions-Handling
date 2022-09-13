package CustamizedException;

import javax.management.RuntimeErrorException;

public class TestBankAccount {
	
	
	public static  void getByBank (String name) {
		
		
	BankAccount a=new BankAccount("sbi", "sbin00634", "Sri", 454885631219l);
	BankAccount a1=new BankAccount("sbi", "sbin006345", "", 4548856345454l);
	BankAccount a2=new BankAccount("sbi", "sbin006346", "kumar",0);
    //BankAccount a3=new BankAccount(null, null, null, 454885634468l);
  
    BankAccount [] list= {a,a1,a2};
	
  for (BankAccount account : list) {
	  
	
	  if(account.getAccountHolderName().equalsIgnoreCase(name)) {
		  
	  
		  System.out.println(account);
	  
		  
	  }
	  
		  if(account.getAccountHolderName().isEmpty()||account.getBankName().isEmpty()||account.getIsfcCode().isEmpty()
				  ||account.getAccountHolderName().isBlank()||account.getBankName().isBlank()||account.getIsfcCode().isBlank()){
				
			 
			//  throw new EnterValidCustomerDetails("Please enter a valid Details");
		//	 throw new cus("hii");
			
			  
		  }
		  
		  
	
		 
		  
		  
			  
		  }
}
		
	


	
	
	

	public static void main(String[] args) {
	
	TestBankAccount.getByBank("sri");
	
	TestBankAccount.getByBank("kumar");
	
	}
}
