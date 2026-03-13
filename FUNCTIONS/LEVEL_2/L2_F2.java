package LEVEL_2;

import java.util.Scanner;

public class L2_F2 {
	
	public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void printPrimes(int x, int y) {

        if (x > y) {
            System.out.println("Provide valid input");
            return;
        }

        for (int i = x; i <= y; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        printPrimes(x, y);
    }

}
