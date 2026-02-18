// Output cases:

// Welcome to Python Bank!

// Signup
// Login
// Exit
// Choose an option:

// if Choose an option: 1

// Enter Username:
// Enter Password:
// Set a 4-digit PIN:
// Account Created Successfully!

// Signup
// login
// Exit
// Choose an option:

// if Choose an option: 2
// Enter Username:
// Enter Password:
// Login Successful!

// Banking Menu:
// Deposit Money
// Withdraw Money
// Check Balance
// Transaction History !
// Transfer Money
// Logout

// Choose an option:
import java.util.*;

class java_main{
    public static void main(String[] args){
        bank b1 = new bank();
        while (true) {
            System.out.println("1.Signup\n2.Login");
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose an option");
            Integer op = sc.nextInt();
        switch(op){
            case 1:
                b1.sign_up();
                break;
            case 2:
                b1.login();
                break;
        }
        Scanner
        System.out.println("Do you want to continue (yes/no)?");
        if (op.equals("No")){
            break;
        }
        }
    }
}
class bank{
    HashMap<String,account> details =new HashMap<>();
    void sign_up(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String name = sc.nextLine();

        System.out.println("Enter Password: ");
        String passkey = sc.nextLine();

        System.out.println("Enter Initial Balance: ");
        int balance = sc.nextInt();

        System.out.println("Set a 4-digit PIN:");
        int pin = sc.nextInt();

        if (pin >= 0000 && pin > 9999 ){
            System.out.println("---------");
        }

        System.out.println("ACCOUNT NUMBER: ");
        int acc_num = sc.nextInt();

        details.put(name,new account(acc_num,name,pin,passkey,balance));
    }
    void login(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String name = sc.nextLine();

        System.out.println("Enter PIN: ");
        String pin = sc.nextLine();

        account acc = details.get(name);
        if (acc.details.containsKey(name) == true){
            System.out.println("Login Successful!");
        }
    }
}
class account extends bank{
    Integer account_number;
    String user_name;
    Integer PIN;
    String password;
    Integer balance;

    account(Integer account_number,String user_name,Integer PIN,String password,Integer balance){
        this.balance = balance;
        this.account_number = account_number;
        this.PIN = PIN;
        this.password = password;
        this.user_name = user_name;
    }
    void display_info(){
        System.out.println("Balance: "+this.balance+
                "\nAccount Number: "+this.account_number+
                "\nPIN: "+this.PIN +
                "\nPassword: "+this.password+
                "\nName: "+this.user_name);
    }
    void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter deposit amount:");
        int am = sc.nextInt();
        this.balance+=am;
    }
    void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit:");
        int am = sc.nextInt();
        if (am<=balance){
            this.balance-=am;
            System.out.println("-------");
        }
    }
}
