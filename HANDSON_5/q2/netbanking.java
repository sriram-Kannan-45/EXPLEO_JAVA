package q2;

class netbanking extends payment
{

	String bankName ;
	String accNo ;
	String ifscCode ;
	public netbanking(String transactionId, double amount, String customedName , String bankName , String accNo , String ifscCode)
	{
		
		super(transactionId, amount, customedName);
		
		this.bankName = bankName ;
		this.accNo = accNo ;
		this.ifscCode = ifscCode ;
	}
	
	boolean validPayment() 
	{
		if (  accNo.length() == 16 && ifscCode.length() == 6  )
		{
			return true ;
		}
		
		return false ;
	}
	
	boolean processPayment()
	{
		System.out.println("Processing net banking Payment...");
        return true;
	}
	
}
