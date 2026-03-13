package Level_Arr_1;

public class L1_3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int arr [] = {1,2,3,4,5,6,7,8,9,0};
		
		int max=0 , min = 0;
		
		for (int i=0 ; i<arr.length ; i++ )
		{
			if (arr[i] < min )
			{
				min = arr[i];
			}
			
			if (arr[i] > max )
			{
				max = arr[i];
			}
		}
		
		System.out.println("MAX : "+max+"\nMIN : "+min);

	}

}
