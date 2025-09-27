import java.util.Scanner;

class Account {
    int balance;

    Account(int b) {
        balance = b;
    }

    boolean isSufficiantBal(int w) {
        if (balance > w) {
            return true;
        } else {
            return false;
        }
    }

    void withdraw(int amount, String g1) {
        balance = balance - amount;
        System.out.println(g1 + "Transaction Successful.");
        System.out.println(g1 + "Current balance is: " + balance);
    }
}

class Customer implements Runnable {

    Account x1;
    String s1;

    Customer(Account j1, String k1) {
        x1 = j1;
        s1 = k1;
    }

    public void run() {

        Scanner s = new Scanner(System.in);

        synchronized (x1) {
            System.out.println("Enter ammount for withdraw for " + s1 + ":");
            int amount = s.nextInt();

            if (x1.isSufficiantBal(amount)) {
                x1.withdraw(amount, s1);
            } else {
                System.out.println("Insufficiant Ammount");
            }
        }
    }
}

class ThreadSyncSelf {
    public static void main(String[] args) {
        Account a1 = new Account(5000);

        Customer c1 = new Customer(a1, "Aman");
        Customer c2 = new Customer(a1, "Naman");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
