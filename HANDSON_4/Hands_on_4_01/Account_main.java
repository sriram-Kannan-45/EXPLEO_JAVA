package Hands_on_4_01;

public class Account_main {

	public static void main(String[] args) {
		
		Account acc1 = new Account("A101", "Sriram");
        Account acc2 = new Account("A102", "Titoo", 5000);

        
        acc1.credit(2000);

        
        acc2.debit(1000);

        
        acc2.transferTo(acc1, 2000);

        
        System.out.println("Details of the acc1");
        System.out.println(acc1.toString());

        System.out.println("Details of the acc2");
        System.out.println(acc2.toString());

	}

}
