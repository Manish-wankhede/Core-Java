import java.util.*;

class Customer{
    String name;
    int phone_no;

    Scanner s = new Scanner(System.in);

    void accept1(){
        System.out.println("Enter Your Name: ");
        name = s.nextLine();

        System.out.println("\n Enter Your Phone No: ");
        phone_no = s.nextInt();
    }

    void display1(){
        System.out.println("\n Name = "+name);
        System.out.println("\n Phone No = "+phone_no);
    }
}
class Depositor extends Customer{
    
    long account_no;
    double balance;

    void accept2(){

        System.out.println("\n Enter Your A/n: ");
        account_no = s.nextLong();

        System.out.println("\n Enter Your Balance: ");
        balance = s.nextDouble();
    }

    void display2(){

        System.out.println("Account No = "+account_no);
        System.out.println("Balance = "+balance);
    }
}
class Borrower extends Depositor{

    int loan_no;
    double loan_ammount;

    void accept3(){

        System.out.println("Enter Your Loan No: ");
        loan_no = s.nextInt();

        System.out.println("Enter Your Loan Ammount: ");
        loan_ammount = s.nextDouble();
    }

    void display3(){

        System.out.println("Loan No = "+loan_no);
        System.out.println("Loan Ammount = "+loan_ammount);
    }
}
class CustomerInfo{

    public static void main(String args[]){

        Borrower B = new Borrower();

        //Accept
        System.out.println("Provide Details");
        B.accept1();
        B.accept2();
        B.accept3();

        System.out.println("Displaying Details");
        B.display1();
        B.display2();
        B.display3();
    }
}
