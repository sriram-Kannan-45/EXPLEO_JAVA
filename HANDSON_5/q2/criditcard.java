package q2;

class criditcard extends payment  
{
	String cardNumber ;
	String cvv;
	String expriyDate;
	public criditcard(String transactionId, double amount, String customedName,  String cardNo , String cvv , String date)
	{
		super(transactionId, amount, customedName);
		this.cardNumber = cardNo;
		this.cvv = cvv;
		this.expriyDate = date;
	}
	
	boolean validPayment() 
	{
		if ( cvv.length() == 3 && cardNumber.length() == 16 && Integer.parseInt(expriyDate) >= 2026 )
		{
			return true ;
		}
		
		return false ;
	}
	
	boolean processPayment()
	{
		System.out.println("Processing Credit Card Payment...");
        return true;
	}
	
	
}
