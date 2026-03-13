package LEVEL_2;

public class L1_1
{
	
	 public static int sumOdd(int lower, int upper) {
	        int sum = 0;
	        for (int i = lower; i <= upper; i++) {
	            if (i % 2 != 0) sum += i;
	        }
	        return sum;
	    }

	    public static int sumEven(int lower, int upper) {
	        int sum = 0;
	        for (int i = lower; i <= upper; i++) {
	            if (i % 2 == 0) sum += i;
	        }
	        return sum;
	    }

	    public static void main(String[] args) {

	        int lower = 1;
	        int upper = 1000;

	        int oddSum = sumOdd(lower, upper);
	        int evenSum = sumEven(lower, upper);

	        System.out.println("The sum of odd numbers from 1 to 1000 is: " + oddSum);
	        System.out.println("The sum of even numbers from 1 to 1000 is: " + evenSum);
	        System.out.println("The absolute difference is: " + Math.abs(oddSum - evenSum));
	    }

}
