class Bank {
    int balance = 5000;

    synchronized void withdraw(int amount) {
        if (balance > amount) {
            System.out.println("Withdraw: " + amount);
            balance = balance - amount;
            System.out.println("Remaining: " + balance);
        } else {
            System.out.println("Insufficient balance: " + balance);
        }
    }
}

class Customer extends Thread {
    Bank bank;

    Customer(Bank b) {
        this.bank = b;
    }

    public void run() {
        bank.withdraw(4500);
    }
}

public class RealExample {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Customer c1 = new Customer(bank);
        Customer c2 = new Customer(bank);
        c1.start();
        c2.start();
    }
}
