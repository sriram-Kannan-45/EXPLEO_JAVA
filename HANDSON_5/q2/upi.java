package q2;

class upi extends payment
{
	String upiId ;
	String upiPin ;
	public upi(String transactionId, double amount,
			String customerName,String upiId, String upiPin)
	{
		super(transactionId , amount , customerName);
		this.upiId = upiId;
		this.upiPin = upiPin;
	}
	
	boolean validPayment()
	{
		if ( upiId.length() == 14 && upiPin.length() == 6)
		{
			return true ;
		}
		
		return false ;
	}
	
	boolean processPayment()
	{
		System.out.println("Processing upi Payment...");
        return true;
	}
}
