package q4;

class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer("Sriram", "C101");

        Account a1 = new Account("ACC1001", 50000);

        RBI bank;

        bank = new SBI(c1, a1);

        System.out.println("------ SBI ------");
        bank.display();

        bank = new ICICI(c1, a1);

        System.out.println("\n------ ICICI ------");
        bank.display();

        bank = new PNB(c1, a1);

        System.out.println("\n------ PNB ------");
        bank.display();
    }
}
