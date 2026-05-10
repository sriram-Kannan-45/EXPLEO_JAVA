package q4;

class RBI {

    Customer c;
    Account a;

    RBI(Customer c, Account a) {
        this.c = c;
        this.a = a;
    }

    double getInterestRate() {
        return 4.0;
    }

    double getWithdrawalLimit() {
        return 25000;
    }

    void display() {
        c.displayCustomer();
        a.displayAccount();

        System.out.println("Interest Rate: " + getInterestRate() + "%");
        System.out.println("Withdrawal Limit: " + getWithdrawalLimit());
    }
}