package Level_Arr_2;

public class L2_6 

{
	
	 public static void main(String[] args) {

	        int[] arr = {1, 5, 7, 5, 9, 5, 2, 1};

	        int search = 5;

	        int count = 0;

	        for (int num : arr) {

	            if (num == search)
	                count++;
	        }

	        if (count > 0)
	            System.out.println(search + " found " + count + " times");
	        else
	            System.out.println("Number not found");
	    }

}
