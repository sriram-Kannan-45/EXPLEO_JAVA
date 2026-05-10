package Level_Arr_3;

public class L3_3 

{
	
	 static void processArray(int[] arr) {

	        for (int i = 0; i < arr.length; i++) {

	            if (arr[i] % 7 == 0 && arr[i] % 8 == 0)
	                arr[i] = -6;

	            else if (arr[i] % 7 == 0)
	                arr[i] = -2;

	            else if (arr[i] % 8 == 0)
	                arr[i] = -9;
	        }
	    }

	    public static void main(String[] args) {

	        int[] arr = {84, 13, 96, 56};

	        processArray(arr);

	        for (int num : arr)
	            System.out.println(num);
	    }

}
