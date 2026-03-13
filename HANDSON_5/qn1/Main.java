package qn1;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new PermanentEmployee("E101", "Arun", 50000, 5000);
        Employee e2 = new ContractEmployee("E102", "Kiran", 40000, 0.10, 2000);
        Employee e3 = new Intern("E103", "Meena", 15000);

        System.out.println(e1);
        System.out.println("--------------");
        System.out.println(e2);
        System.out.println("--------------");
        System.out.println(e3);
    }
}
