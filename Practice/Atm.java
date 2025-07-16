import java.util.Scanner;

class Atm 
{
    static Scanner s = new Scanner(System.in);
    static int balance = 5000;

    public static void main(String[] args) 
    {
        System.out.println("\n Welcome to the ATM!");
        System.out.print("\n Please enter your PIN: ");
        int pin = s.nextInt();
        
        if (pin == 1234)
        {
            System.out.println("\n PIN accepted. What would you like to do?");
            showMenu();
        } 
        else 
        {
            System.out.println("\n Invalid PIN. Please try again.");
        }
    }

    private static void showMenu() 
    {
        System.out.println("\n 1. Transaction history");
        System.out.println("\n 2. Withdraw");
        System.out.println("\n 3. Deposit");
        System.out.println("\n 4. Transfer");
        System.out.println("\n 5. Quit");

        System.out.print("\n Enter your choice: ");
        int choice = s.nextInt();
        
        switch (choice) 
        {
            case 1:
                showTransactionHistory();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                deposit();
                break;
            case 4:
                transfer();
                break;
            case 5:
                System.out.println("\n Thank you for using the ATM!");
                System.exit(0);
            default:
                System.out.println("\n Invalid choice. Please try again.");
                showMenu();
                break;
        }
    }

    private static void showTransactionHistory() 
    {
        System.out.println("\n Transaction history:");
        // TODO: implement transaction history
        showMenu();
    }

    private static void withdraw() 
    {
        System.out.print("\n Enter amount to withdraw: ");
        int amount = s.nextInt();
        
        if (amount > balance) 
        {
            System.out.println("\n Insufficient funds. Please try again.");
        } 
        else 
        {
            balance -= amount;
            System.out.println("\n Withdrawal successful. Current balance: " + balance);
        }
        
        showMenu();
    }

    private static void deposit() 
    {
        System.out.print("\n Enter amount to deposit: ");
        int amount = s.nextInt();
        
        balance += amount;
        System.out.println("\n Deposit successful. Current balance: " + balance);
        
        showMenu();
    }

    private static void transfer() 
    {
        System.out.print("\n Enter recipient's account number: ");
        @SuppressWarnings("unused")
        int accnumber = s.nextInt();

        System.out.print("\n Enter amount to transfer: ");
        int amount = s.nextInt();
        
        if (amount > balance) 
        {
            System.out.println("\n Insufficient funds. Please try again.");
        } 
        else 
        {
            balance -= amount;
            System.out.println("\n Transfer successful. Current balance: " + balance);
        }
        
        showMenu();
    }
}
