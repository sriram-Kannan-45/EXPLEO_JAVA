package LEVEL_3;

public class L3_F1

{

	static double incrementSalary(double salary, double rating) {

		if (salary <= 0 || rating < 1 || rating > 10)
			return -1;

		if (rating >= 1 && rating <= 4)
			return salary + (salary * 0.10);

		else if (rating >= 4.1 && rating <= 7)
			return salary + (salary * 0.25);

		else
			return salary + (salary * 0.30);
	}

	public static void main(String[] args) {

		double salary = 80000;
		double rating = 3;

		double result = incrementSalary(salary, rating);

		if (result == -1)
			System.out.println("Invalid Input");
		else
			System.out.println(result);
	}
}
