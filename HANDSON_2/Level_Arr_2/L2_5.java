package Level_Arr_2;

import java.util.HashMap;

public class L2_5
{

	public static void main(String[] args) {

        int[] my_record = {10,10,10,10,20,20,20,20,40,40,50,50,30};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : my_record) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency of elements:");
        for (int key : map.keySet()) {
            System.out.println(key + " appears " + map.get(key) + " times");
        }
    }
}
