package Hands_on_4_01;

class Account {

    
    private String id;
    private String name;
    private int balance;

    // Constructor 1 
    public Account(String id, String name)
    {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    // Constructor 2 
    public Account(String id, String name, int balance) 
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter Methods
    public String getId() 
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getBalance() 
    {
        return balance;
    }

    
    public int credit(int amount) 
    {
        balance += amount;
        return balance;
    }

    
    public int debit(int amount) 
    {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("low balance");
        }
        return balance;
    }

    
    public int transferTo(Account another, int amount)
    {
        if (amount <= balance)
        {
            this.balance -= amount;
            another.balance += amount;
        } else
        {
            System.out.println("Low balance");
        }
        return balance;
    }

    
    public String toString() 
    {
        return "Account ID: " + id +
               " Name: " + name +
               " Balance: " + balance;
    }
}

