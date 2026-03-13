package q2;

abstract class payment 
{

	protected String transactionId;
	protected double amount;
	protected String customedName;
	protected String paymentStatus = " pending ";
	public payment(String transactionId, double amount, String customedName)
	{
		
		this.transactionId = transactionId;
		this.amount = amount;
		this.customedName = customedName;

	}
	
	abstract boolean validPayment();
	
	abstract boolean processPayment();
	
	public void executeTransaction()
	{
		if (validPayment())
		{
			if (processPayment())
			{
				setPaymentStatus("Success");
			}
			
			else
			{
				setPaymentStatus("Failed");
			}
		}
		
		else
		{
			setPaymentStatus("Validation Failed");
		}
		
		generateReceipt();
		
	}
	
	
	public double getAmount()
	{
		return amount;
	}

	public String getTransactionId()
	{
		return transactionId;
	}

	public String getPaymentStatus()
	{
		return paymentStatus;
	}

	public void setPaymentStatus ( String sts )
	{
		this.paymentStatus = sts ;
	}
	public void generateReceipt()
	{
		System.out.println("TRANSATION ID - "+ transactionId);
		System.out.println("NAME - "+customedName);
		System.out.println("AMOUNT - "+amount);
		System.out.println("PAYMENT TRANSACTION - "+paymentStatus);
	}
	
}
