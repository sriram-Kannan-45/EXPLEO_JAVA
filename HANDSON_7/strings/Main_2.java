package strings;

public class Main_2 {
	static void  trim(StringBuilder str) {
		int i = 0;
		int j = str.length() - 1;

		while (true) {
			char start = str.charAt(i);
			char end = str.charAt(j);

			if (Character.isLetter(start) && Character.isLetter(end)) {
				break ;
			}

			if (start == ' ') {
				i++;
			}

			if (end == ' ') {
				j--;
			}
		}
		
		System.out.println(str.substring(i, j + 1));
	}

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder(" Welcome to Java ");
		
		trim(str);

		
	}
}
