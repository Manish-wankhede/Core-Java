import java.util.*;

class Customer{
    String name;
    double phone_no;

    Scanner s = new Scanner(System.in);

    void accept(){
        System.out.print("\n Enter the Customer name: ");
        name = s.nextLine();

        System.out.print("\n Enter the customer phone no: ");
        phone_no = s.nextDouble();
    }

    void display(){
        System.out.println("\n Name = "+name);
        System.out.println("\n Phone no = "+phone_no);
    }
}

class Depositor extends Customer{
    double acc_no;
    double balance;

    void accep1(){
        System.out.print("\n Enter your Accout no: ");
        acc_no = s.nextDouble();

        System.out.print("\n Enter the balance: ");
        balance = s.nextDouble();
    }

    void display1(){
        System.out.println("\n Account No = "+acc_no);
        System.out.println("\n Balance = "+balance);
    }
}

class Borrower extends Depositor{
    int loan_no;
    int loan_amount;

    void accep2(){
        System.out.print("\n Enter the loan number: ");
        loan_no = s.nextInt();

        System.out.print("\n Enter the loan amount: ");
        loan_amount = s.nextInt();
    }

    void display2(){
        System.out.println("\n Loan Number = "+loan_no);
        System.out.println("\n Loan Amount = "+loan_amount);
    }
}

public class CustomerInfo {
    public static void main(String[] args) {
        Borrower b = new Borrower();

        System.out.println("\n Provides details");
        b.accept();
        b.accep1();
        b.accep2();

        System.out.println("\n Displaying details");
        b.display();
        b.display1();
        b.display2();
    }   
}