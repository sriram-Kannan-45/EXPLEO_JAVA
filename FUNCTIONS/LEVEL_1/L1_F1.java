package LEVEL_1;

public class L1_F1 {
	
	static int oddCount(int arr[])
	{
		int count = 0;
		
		for (int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] % 2 != 0)
			{
				count++;
			}
		}
		
		return count;
	}
	
	static int evenCount(int arr[])
	{
		int count = 0;
		
		for (int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] % 2 == 0)
			{
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("ODD COUNT : "+ oddCount(arr));
		
		System.out.println("EVEN COUNT : "+ evenCount(arr));
		
	}

}
