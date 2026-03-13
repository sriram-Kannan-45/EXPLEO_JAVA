package LEVEL_1;

public class L1_F2
{

	 public static void main(String[] args) {
	        printPrimes();
	    }

	    public static void printPrimes() {

	        for (int num = 2; num <= 100; num++) {

	            boolean isPrime = true;

	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime) {
	                System.out.print(num + " ");
	            }
	        }
	    }
}
