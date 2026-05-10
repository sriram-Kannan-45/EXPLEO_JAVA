package q4;

class SBI extends RBI {

    SBI(Customer c, Account a) {
        super(c, a);
    }

    double getInterestRate() {
        return 5.5;
    }

    double getWithdrawalLimit() {
        return 40000;
    }
}