package q4;

class Customer {

    String customerName;
    String customerId;

    Customer(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
    }
}