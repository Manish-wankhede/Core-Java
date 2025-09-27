import java.util.Scanner;   

class Account {
    int balance;

    Account(int b) {    // Constructor
        balance = b;
    }

    boolean isSufficiantBal(int w) {    // function isSufficiantBal
        if (balance > w) {
            return true;
        } else {
            return false;
        }
    }

    void withdraw(int amt, String g1) {
        balance = balance - amt;
        System.out.println(g1 + " Transaction Successfull.");
        System.out.println(g1 + " Current balance is: " + balance);
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
            System.out.println("Enter amount to withdraw for " + s1 + ":");
            int amt = s.nextInt();

            if (x1.isSufficiantBal(amt)) {
                x1.withdraw(amt, s1);
            } else {
                System.out.println("InSufficient Balance");
            }
        }

    }
}

class ThreadSynchro {
    public static void main(String[] args) {
        Account a1 = new Account(5000);

        Customer c1 = new Customer(a1, "amit");
        Customer c2 = new Customer(a1, "sumit");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
