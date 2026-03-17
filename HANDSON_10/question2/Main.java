package question2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<String> set = new LinkedHashSet<>();

		String result = "";

		System.out.print("How many names do you want to input? : ");

		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.print("Elements in the Set : ");
			set.add(sc.nextLine());
		}

		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String str = it.next();
			System.out.println("Elements in the Set : " + str);
			result += str + " ";
		}

		System.out.println("Concatenated result: " + result);

		sc.close();
	}
}