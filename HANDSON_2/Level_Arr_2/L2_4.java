package Level_Arr_2;

import java.util.LinkedHashSet;
import java.util.Set;

public class L2_4
{

	
	    public static void main(String[] args) {

	        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6};

	        Set<Integer> uniqueSet = new LinkedHashSet<>();

	        for (int num : arr) {
	            uniqueSet.add(num);
	        }

	        System.out.println("Unique elements:");
	        for (int num : uniqueSet) {
	            System.out.print(num + " ");
	        }
	    }
	}

