package LEVEL_2;

import java.util.Scanner;

public class L2_F4
{

	public static boolean isEligible(int age, int weight) {
        return (age > 18 && age <= 55 && weight > 45);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = sc.nextInt();

        System.out.println("Enter weight:");
        int weight = sc.nextInt();

        if (isEligible(age, weight))
            System.out.println("Eligible for blood donation");
        else
            System.out.println("Not eligible for blood donation");
    }
}
