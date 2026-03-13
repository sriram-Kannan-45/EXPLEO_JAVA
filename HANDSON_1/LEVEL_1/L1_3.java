package LEVEL_1;

import java.util.Scanner;

public class L1_3
{

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        switch (ch) {

            
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;

            default:
                if ((ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z')) {
                    System.out.println("Consonant");
                } else {
                    System.out.println("Symbol");
                }
        }

        sc.close();
    }
}
