public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();

        myAcc.unsername = "manish";
        myAcc.setPassword("abcd");
    }
}

class BankAccount{
    public String unsername;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}
