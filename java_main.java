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
        b1.login();
        b1.sign_up();
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
        
        if (pin >= 0000 && pin <= 9999 ){
            System.out.println("---------");
        }

        System.out.println("acc ");
        int acc_num = sc.nextInt();

        details.put(name,new account(acc_num,name,pin,passkey,balance));
    }
    void login(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String name = sc.nextLine();

        System.out.println("Enter PIN: ");
        String pin = sc.nextLine();
        
        account acc = details.get(pin);
        if (acc.details.containsKey(pin) == true){
            System.out.println("Login Successful!");

            System.out.println("Banking Menu:\n" + 
" Deposit Money\n" + "Withdraw Money\n" +" Check Balance\n" +" Transaction History !\n" + " Transfer Money\n" +"Logout\n");
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
