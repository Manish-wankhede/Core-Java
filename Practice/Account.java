// WAP to accept the user in account details

import java.util.*;

class Account{
    String name;
    int number;
    float balance;

    Account(String n,int a,float b){
        name = n;
        number = a;
        balance = b;
    }
    void display(){
        System.out.print("\n Account Name = "+name);
        System.out.print("\n Account Number = "+number);
        System.out.print("\n Account Balance = "+balance);
    }
    public static void main(String args[]) throws Exception{
        String name;
        int number;
        float balance;

        Scanner s = new Scanner(System.in);

        System.out.print("\n Account - 1");

        System.out.print("\n Account Name: ");
        name = s.nextLine();

        System.out.print("\n Account Number: ");
        number = s.nextInt();

        System.out.print("\n Account Balance: ");
        balance = s.nextFloat();
                  s.nextLine();

        Account A1 = new Account(name, number, balance);

        System.out.print("\n Account - 2");

        System.out.print("\n Account Name: ");
        name = s.nextLine();

        System.out.print("\n Account Number: ");
        number = s.nextInt();

        System.out.print("\n Account Balance: ");
        balance = s.nextFloat();

        Account A2 = new Account(name, number, balance);

        System.out.print("\n Account - 1");
        A1.display();

        System.out.print("\n\n Account A2");
        A2.display();

        s.close();
    }

}