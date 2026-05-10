package q4;

class PNB extends RBI {

    PNB(Customer c, Account a) {
        super(c, a);
    }

    double getInterestRate() {
        return 5.0;
    }

    double getWithdrawalLimit() {
        return 30000;
    }
}