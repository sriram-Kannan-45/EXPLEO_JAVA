package Level_Arr_2;

public class L2_3 

{
	
	  public static void main(String[] args) {

	        int[] arr = {2, 5, 7, 2, 4};

	        int duplicate = 0;
	        int unique = 0;

	        for (int i = 0; i < arr.length; i++) {

	            int count = 0;

	            for (int j = 0; j < arr.length; j++) {

	                if (arr[i] == arr[j])
	                    count++;
	            }

	            if (count > 1)
	                duplicate++;
	            else
	                unique++;
	        }

	        System.out.println("Duplicate Elements: " + duplicate / 2);
	        System.out.println("Unique Elements: " + unique);
	    }

}
