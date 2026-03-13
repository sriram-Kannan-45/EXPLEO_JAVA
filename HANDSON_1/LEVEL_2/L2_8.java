package LEVEL_2;

import java.util.Scanner;

public class L2_8 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=n;
        int count=0;
        int num=n;
        while(num>0) {
            num = num / 10;
            count++;
        }
        int ams=0;
        while(n>0){
            int rem=n%10;
            ams+=Math.pow(rem,count);
            n=n/10;
        }
        if(ams==n1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

}
