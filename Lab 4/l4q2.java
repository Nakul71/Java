class Customer {
    private double balance = 0.0;
    public void addBalance(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added balance: $" + amount);
        }
    }
    public void addBalance(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added balance (int): $" + amount);
        }
    }
    protected void deductBalance(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Deducted balance: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount to deduct.");
        }
    }
    void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}
class CustomerModifier {
    public void performDeduction(Customer customer, double amount) {
        customer.deductBalance(amount);
    }
}

public class l4q2 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        
        customer.addBalance(100.50);  
        customer.addBalance(50);     
        customer.showBalance();
        
        CustomerModifier modifier = new CustomerModifier();
        modifier.performDeduction(customer, 30.75);
        
        customer.showBalance();
    }
}
