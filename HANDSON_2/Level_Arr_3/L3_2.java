package Level_Arr_3;

public class L3_2 {

	public static void main(String[] args)
	{
		
		int arun[] = {5, 6, 2, 1, 2, 5, 6, 3, 4, 2};
		
		int naveen[] = {5, 5, 4, 3, 3, 5, 6, 2, 1, 1};
		
		int count_ar = 0;
		
		int count_nav = 0;
		
		for (int i=0 ; i<10 ; i++)
		{
			count_ar += arun[i];
			
			count_nav += naveen[i];
		}
		
		String res =(count_ar < count_nav) ? "Arun Wins!!!" :
            (count_nav < count_ar) ? "Naveen Wins!!!" :
            "Draw!!!";
		
		System.out.println(res);

	}

}
