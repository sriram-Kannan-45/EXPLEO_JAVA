package Level_Arr_1;

public class L1_5 
{
	
	public static void main(String[] args) {

        int[][] A = {
            {10, 25, 7},
            {45, 3, 18},
            {9, 50, 2}
        };

        int max = A[0][0];  // assume first element is max

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                }
            }
        }

        System.out.println("Greatest element is: " + max);
    }

}
