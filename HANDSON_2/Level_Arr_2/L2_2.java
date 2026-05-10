package Level_Arr_2;

import java.util.Random;

public class L2_2 

{
	
	public static void main(String[] args) {

        Random r = new Random();

        int[] freq = new int[7];

        for (int i = 0; i < 100; i++) {

            int dice = r.nextInt(6) + 1;

            freq[dice]++;
        }

        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " occurred " + freq[i] + " times");
        }
    }

}
