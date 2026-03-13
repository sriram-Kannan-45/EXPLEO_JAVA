package LEVEL_3;

import java.util.Scanner;

public class L3_F2 
{

	public static void checkHighest(int cs, int ec, int me) {

        // Check negative input
        if (cs < 0 || ec < 0 || me < 0) {
            System.out.println("Input is invalid");
            return;
        }

        // Check all equal
        if (cs == ec && ec == me) {
            System.out.println("None of the department has got the highest placement");
            return;
        }

        int max = Math.max(cs, Math.max(ec, me));

        System.out.print("Highest placement ");

        if (cs == max) System.out.print("CS ");
        if (ec == max) System.out.print("EC ");
        if (me == max) System.out.print("ME ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of students placed in CS:");
        int cs = sc.nextInt();

        System.out.print("Enter the no of students placed in EC:");
        int ec = sc.nextInt();

        System.out.print("Enter the no of students placed in ME:");
        int me = sc.nextInt();

        checkHighest(cs, ec, me);

        sc.close();
    }
}
