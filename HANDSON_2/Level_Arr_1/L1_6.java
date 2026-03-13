package Level_Arr_1;

import java.util.HashSet;

public class L1_6 
{
	
	public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 5, 3};
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("Duplicate number is: " + num);
                break;
            } else {
                set.add(num);
            }
        }
    }

}
