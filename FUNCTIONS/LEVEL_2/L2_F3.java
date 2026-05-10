package LEVEL_2;

public class L2_F3 

{
	
	static double overtimePay(int hours) {

        if (hours > 40)
            return (hours - 40) * 15.0;
        else
            return 0;
    }

    public static void main(String[] args) {

        int[] hoursWorked = {45, 50, 38, 60, 42};

        for (int i = 0; i < hoursWorked.length; i++) {

            double pay = overtimePay(hoursWorked[i]);

            System.out.println("Employee " + (i + 1) + " Overtime Pay: Rs." + pay);
        }
    }

}
