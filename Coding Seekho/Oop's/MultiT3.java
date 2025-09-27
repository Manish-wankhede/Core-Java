import java.util.Scanner;

class Account {

    int bal;

    Account(int b) {
        bal = b;
    }

    boolean isSufficientBal(int w) {
        if (bal > w) {
            return true;
        } else {
            return false;
        }
    }

    void withdraw(int w) {
        bal = bal - w;
        System.out.println("Transaction Successful");
        System.out.println("Current Balance is : " + bal);
    }
}

class Customer implements Runnable {

    Account h1;
    String name;

    Customer(Account g1, String s1) {
        h1 = g1;
        name = s1;
    }

    public void run() {

        Scanner s = new Scanner(System.in);

        // System.out.println(name + " Enter amount: ");
        // int amt = s.nextInt();

        // if (h1.isSufficientBal(amt)) {
        // h1.withdraw(amt);
        // } else {
        // System.out.println("InSufficient amount");
        // }

        synchronized (h1) {
            System.out.print(name + " Enter amount: ");
            int amt = s.nextInt();

            if (h1.isSufficientBal(amt)) {
                h1.withdraw(amt);
            } else {
                System.out.println(name + " InSufficient amount");
            }
        }

    }
}

class MultiT3 {
    public static void main(String[] args) {
        Account a1 = new Account(1000);

        Customer c1 = new Customer(a1, "payal");
        Customer c2 = new Customer(a1, "nidhi");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
