package LEVEL_1;

public class L1_5 
{
	public static void main(String[] args) {

        for (char first = 'a', last = 'z'; 
             first <= 'z' && last >= 'a'; 
             first++, last--) {

            System.out.print("" + first + last + " ");
        }
    }
}
