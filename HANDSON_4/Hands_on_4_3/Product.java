package Hands_on_4_3;

public class Product
{

	private int productId;
	private String productName;
	private double price;
	private int quantity;
	
	Product(int id , String name , double price )
	{
		this.price = price;
		this.productId = id;
		this.productName = name;
		
	}
	
	public int getProductId() 
	{
		return productId;
	}

	public void setProductId(int productId)
	{
		this.productId = productId;
	}

	public String getProductName() 
	{
		return productName;
	}

	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public String getProductDetails()
	{
		return "Product ID : "+productId+" Product Name : "+productName+" price : "+price+" Qunatity : "+quantity;
	}
	
	void setQunatity(int qunatity)
	{
		this.quantity = qunatity ;
	}
	
	double calculateTotal()
	{
		return price*quantity;
	}
}
