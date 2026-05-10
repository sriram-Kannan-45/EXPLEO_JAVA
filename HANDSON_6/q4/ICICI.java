package q4;

class ICICI extends RBI {

    ICICI(Customer c, Account a) {
        super(c, a);
    }

    double getInterestRate() {
        return 6.0;
    }

    double getWithdrawalLimit() {
        return 50000;
    }
}