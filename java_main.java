//import java.util.*;
//class main{
//
//
//// 0. Exit
//// 1. View Bus Schedules
//// 2. Book Ticket
//// 3. Cancel Booking
//// 4. View My Bookings
//// Enter your choice: 1
//
//// --- Available Bus Schedules ---
//// ID: 1 | Route: north nazimabad - power house | Time: 09:00 AM | Fare: 500 | Seats Left: 30
//// ID: 2 | Route: kda - gulshan | Time: 12:00 PM | Fare: 700 | Seats Left: 30
//// ID: 3 | Route: ayesha manzil - bahria | Time: 05:00 PM | Fare: 600 | Seats Left: 30
//
//// 0. Exit
//// 1. View Bus Schedules
//// 2. Book Ticket
//// 3. Cancel Booking
//// 4. View My Bookings
//// Enter your choice: 2
//
//// --- Available Bus Schedules ---
//// ID: 1 | Route: north nazimabad - power house | Time: 09:00 AM | Fare: 500 | Seats Left: 30
//// ID: 2 | Route: kda - gulshan | Time: 12:00 PM | Fare: 700 | Seats Left: 30
//// ID: 3 | Route: ayesha manzil - bahria | Time: 05:00 PM | Fare: 600 | Seats Left: 30
//
//// Enter Bus ID to book: 2
//// Enter your name: yusra
//// Enter number of seats: 3
//// Booking successful! Total Fare: 2100
//
//// 0. Exit
//// 1. View Bus Schedules
//// 2. Book Ticket
//// 3. Cancel Booking
//// 4. View My Bookings
//// Enter your choice: 4
//
//// --- Booked Tickets ---
//// Name: yusra, Route: kda - gulshan, Time: 12:00 PM, Seats: 3, Total Fare: 2100
//
//// 0. Exit
//// 1. View Bus Schedules
//// 2. Book Ticket
//// 3. Cancel Booking
//// 4. View My Bookings
//// Enter your choice: 3
//// Enter your name to cancel booking: yusra
//// Booking cancelled successfully!
//
//// 0. Exit
//// 1. View Bus Schedules
//// 2. Book Ticket
//// 3. Cancel Booking
//// 4. View My Bookings
//// Enter your choice: 0
//// Exiting Bus Ticket Booking System...
//
//// === Code Execution Successful ===
//
//
//
//    public static void main(String[] args){
//
//        //  Enter your choice:
//        booking_system b = new booking_system();
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Choose an option");
//            Integer op = sc.nextInt();
//            switch(op){
//                case 1:
//                    b.view_buses_Schedules();
//                    break;
//                case 2:
//                    b.ticket_booking();
//                    break;
//                case 3:
//                    b.cancel_booking();
//                    break;
//                case 4:
//                    b.View_My_Bookings();
//                    break;
//            }
//            Scanner choice = new Scanner(System.in);
//            System.out.println("Do you want to continue (yes/no)?");
//            if (op.equals("No")){
//                System.out.print("====== Exiting Bus Ticket Booking System ======");
//                break;
//            }
//        }
//    }
//}
//
//
//class data{
//    HashMap<String,booking_system> bus = new HashMap<>();
//    HashMap<String,booking_system> route = new HashMap<>();
//    HashMap<String,booking_system> details = new HashMap<>();
//}
//class booking_system extends data{
//
//    //  Attributes ------>
//
//    String customer_name;
//    String route;
//    String time;
//    Integer seats;
//    Integer total_fare;
//    Integer ID;
//    //  constructor ------>
//
//    booking_system(String name, String route, String time, Integer seats, Integer fare,Integer ID) {
//        this.customer_name = name;
//        this.route = route;
//        this.seats = seats;
//        this.time = time;
//        this.total_fare = fare;
//        this.ID = ID;
//    }
//
////  1. View Bus Schedules method
//
//    void view_buses_Schedules(){
//
//        System.out.println("--- Available Bus Schedules ---"
//                +"ID: 1 | Route: north nazimabad - power house | Time: 09:00 AM | Fare: 500 | Seats Left: "+this.seats
//                +"ID: 2 | Route: kda - gulshan | Time: 12:00 PM | Fare: 700 | Seats Left: "+this.seats
//                +"ID: 3 | Route: ayesha manzil - bahria | Time: 05:00 PM | Fare: 600 | Seats Left: "+this.seats);
//    }
//
////  2. Book Ticket method
//
//    void ticket_booking(){
//
//// Enter Bus ID to book: 2
//// Enter your name: yusra
//// Enter number of seats: 3
//// Booking successful! Total Fare: 2100
//
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter Bus ID: ");
//        Integer booking_id = sc.nextInt();
//
//        sc.nextLine();
//        System.out.println("Enter your name: ");
//        String cus_name = sc.nextLine();
//
//        System.out.println("Enter number of seats: ");
//        Integer seat_num = sc.nextInt();
//
//        data d1 = details.get(ID);
//        if (details.containsKey(booking_id)){
//            if(details.containsKey(seat_num)){
//                if(this.seats == seat_num || this.seats >= seat_num)
//                    this.seats-=seat_num;
//            }
//            else{
//                System.out.println("only "+this.seats+"left seats");
//            }
//        }
//        else{
//            System.out.println("Invalid ID");
//        }
//
//        if (booking_id == 1){
//            int f1 = 500*seat_num;
//            this.total_fare+=f1;
//        }
//        else if(booking_id == 2){
//            int f2 = 700*seat_num;
//            this.total_fare+=f2;
//        }
//        else if(booking_id == 3){
//            int f3 = 700*seat_num;
//            this.total_fare+=f3;
//        }
//        else{
//            System.out.println("Invalid ID");
//        }
//
//        System.out.println();
//        System.out.println(" ======  Your booking details  ======\n"
//                +"ID: "+ booking_id
//                +" | Name: "+ cus_name
//                +" | Route: "+ this.route
//                +" | Time: "+ this.time
//                +" | Fare: "+ this.total_fare
//                +" | Seats: "+ seat_num);
//    }
//
////  3. Cancel Booking
//
//    void cancel_booking(){
//
//        // Enter your name to cancel booking: yusra
//        // Booking cancelled successfully!
//
//        data d1 = details.get(customer_name);
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter your name: ");
//        String cus_name = sc.nextLine();
//
//        if (details.containsKey(cus_name)){
//            details.remove(customer_name);
//
//        }
//    }
//
////  4. View My Bookings
//
//    void View_My_Bookings(){
//
//        // Name: yusra, Route: kda - gulshan, Time: 12:00 PM, Seats: 3, Total Fare: 2100
//
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter your name: ");
//        String cus_name = sc.nextLine();
//        System.out.println(" ======  Your booking details  ======\n"
//                +" | Name: "+ cus_name
//                +" | Route: "+ this.route
//                +" | Time: "+ this.time
//                +" | Seats: "+ this.seats
//                +" | Fare: "+ this.total_fare);
//
//    }
//}
//
//// create a method for route:
//
//// for route we can add a method with if/else
//// if id is 1st then this route will be displayed
//// and if id is 2nd then this route will be displayed
//// and then else for 3rd route


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

import java.util.*;
import java.time.*;

class mainN{
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
            Scanner choice = new Scanner(System.in);
            System.out.println("Do you want to continue (yes/no)?");
            String o = choice.nextLine();
            if (o.equals("No")){
                break;
            }
        }
    }
}
class bank{
    HashMap<String,account> details = new HashMap<>();
    void sign_up() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String name = sc.nextLine();

        System.out.println("Enter Password: ");
        String passkey = sc.nextLine();

        System.out.println("Enter Initial Balance: ");
        int balance = sc.nextInt();

        sc.nextLine();
        System.out.println("Set a 4-digit PIN:");
        String pin;
        while (true) {
            pin = sc.nextLine();

            if (pin.length() == 4) {
                break;
            }
            System.out.println("PIN should be of 4 digits!!");
        }
        System.out.println("ACCOUNT NUMBER: ");
        int acc_num = sc.nextInt();

        details.put(name, new account(acc_num, name, pin, passkey, balance));
    }
    void login(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String name = sc.nextLine();

        System.out.println("Enter PIN: ");
        String pin = sc.nextLine();

        account acc = details.get(name);

        if (acc.details.containsKey(name) == true) {
            if (pin.equals(acc.PIN)) {
                System.out.println("Login Successful!");


                while (true) {
                    System.out.println("Banking Menu:\n" +
                            "1. Deposit Money\n" +
                            "2. Withdraw Money\n" +
                            "3. Check Balance\n" +
                            "4. Transaction History !\n" +
                            "5. Transfer Money");

                    System.out.println("Enter your choice: ");
                    Integer choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Enter deposit amount:");
                            int am = sc.nextInt();
                            acc.deposit(am);
                            break;
                        case 2:
                            System.out.println("Enter the amount you want to withdraw:");
                            int am1 = sc.nextInt();
                            acc.withdraw(am1);
                            break;
                        case 3:
                            acc.display_info();
                            break;
                        case 4:
                            System.out.println("Transfer History");
                            break;
                        case 5:
                            sc.nextLine();
                            System.out.println("Enter account name: ");
                            String acc_name = sc.nextLine();
                            account acc_n = details.get(acc_name);
                            if (acc_name != null) {
                                System.out.println("Enter the amount you want to transfer: ");
                                int transfer_amount = sc.nextInt();
                                acc.transfer_money(acc_n, transfer_amount);
                            }
                            break;
                    }
                    sc.nextLine();
                    System.out.println("Do you want to Logout (yes/no)?");
                    String exit = sc.nextLine();

                    if (exit.equals("yes")) {
                        System.out.println("Logout successful!");
                        break;
                    }
                }
            }

        }
    }
}

class account extends bank{
    Integer account_number;
    String user_name;
    String PIN;
    String password;
    Integer balance;

    account(Integer account_number,String user_name,String PIN,String password,Integer balance){
        this.balance = balance;
        this.account_number = account_number;
        this.PIN = PIN;
        this.password = password;
        this.user_name = user_name;
    }

    void display_info(){
        System.out.println("\nName: "+this.user_name+
                "Balance: "+this.balance+
                "\nAccount Number: "+this.account_number);
    }

    void deposit(int amm){
        int am = amm;
        this.balance+=am;
    }

    void withdraw(int amm){
        int am = amm;

        if (am<=balance){
            this.balance-=am;
            System.out.println("Withdraw complete");
        }
    }

    void transfer_money(account acc_reciever,int amount){
        if (amount<=balance){
            this.withdraw(amount);
            acc_reciever.deposit(amount);

            System.out.println("Transfered: "+amount+"to "+acc_reciever.getuser_name());
        }
        else{
            System.out.println("Invalid transfer or Insufficient Funds");
        }
    }
    public String getuser_name(){
        return user_name;
    }
    public String getPassword(){
        return password;
    }
    public String getPIN(){
        return PIN;
    }

}

import java.util.*;
class main{


// 0. Exit
// 1. View Bus Schedules
// 2. Book Ticket
// 3. Cancel Booking
// 4. View My Bookings
// Enter your choice: 1

// --- Available Bus Schedules ---
// ID: 1 | Route: north nazimabad - power house | Time: 09:00 AM | Fare: 500 | Seats Left: 30
// ID: 2 | Route: kda - gulshan | Time: 12:00 PM | Fare: 700 | Seats Left: 30
// ID: 3 | Route: ayesha manzil - bahria | Time: 05:00 PM | Fare: 600 | Seats Left: 30

// 0. Exit
// 1. View Bus Schedules
// 2. Book Ticket
// 3. Cancel Booking
// 4. View My Bookings
// Enter your choice: 2

// --- Available Bus Schedules ---
// ID: 1 | Route: north nazimabad - power house | Time: 09:00 AM | Fare: 500 | Seats Left: 30
// ID: 2 | Route: kda - gulshan | Time: 12:00 PM | Fare: 700 | Seats Left: 30
// ID: 3 | Route: ayesha manzil - bahria | Time: 05:00 PM | Fare: 600 | Seats Left: 30

// Enter Bus ID to book: 2
// Enter your name: yusra
// Enter number of seats: 3
// Booking successful! Total Fare: 2100

// 0. Exit
// 1. View Bus Schedules
// 2. Book Ticket
// 3. Cancel Booking
// 4. View My Bookings
// Enter your choice: 4

// --- Booked Tickets ---
// Name: yusra, Route: kda - gulshan, Time: 12:00 PM, Seats: 3, Total Fare: 2100

// 0. Exit
// 1. View Bus Schedules
// 2. Book Ticket
// 3. Cancel Booking
// 4. View My Bookings
// Enter your choice: 3
// Enter your name to cancel booking: yusra
// Booking cancelled successfully!

// 0. Exit
// 1. View Bus Schedules
// 2. Book Ticket
// 3. Cancel Booking
// 4. View My Bookings
// Enter your choice: 0
// Exiting Bus Ticket Booking System...

// === Code Execution Successful ===



    public static void main(String[] args){

        methods m1 = new methods ();

        //  Enter your choice:

        while (true) {
            System.out.println("1. View Bus Schedules\n"
                    +"2. Book Ticket"
                    +"\n3. Cancel Booking"
                    +"\n4. View My Bookings");

            Scanner sc = new Scanner(System.in);
            System.out.println("Choose an option");
            Integer op = sc.nextInt();
            switch(op){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
            }
            Scanner choice = new Scanner(System.in);
            System.out.println("Do you want to continue (yes/no)?");
            if (op.equals("No")){
                System.out.print("====== Exiting Bus Ticket Booking System ======");
                break;
            }
        }
    }
}


class data{
    HashMap<String,booking_system> details = new HashMap<>();
}
class booking_system extends data{

    //  Attributes ------>

    String customer_name;
    String route;
    String time;
    Integer seats;
    Integer total_fare;
    Integer ID;
    //  constructor ------>

    booking_system(String name, String route, String time, Integer seats, Integer fare,Integer ID) {
        this.customer_name = name;
        this.route = route;
        this.seats = seats;
        this.time = time;
        this.total_fare = fare;
        this.ID = ID;
}

//  1. View Bus Schedules method

    void view_buses_Schedules(){

        System.out.println("--- Available Bus Schedules ---"
                +"ID: 1 | Route: north nazimabad - power house | Time: 09:00 AM | Fare: 500 | Seats Left: "+this.seats
                +"ID: 2 | Route: kda - gulshan | Time: 12:00 PM | Fare: 700 | Seats Left: "+this.seats
                +"ID: 3 | Route: ayesha manzil - bahria | Time: 05:00 PM | Fare: 600 | Seats Left: "+this.seats);
    }

//  2. Book Ticket method

    void ticket_booking(){
        
// Enter Bus ID to book: 2
// Enter your name: yusra
// Enter number of seats: 3
// Booking successful! Total Fare: 2100

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Bus ID: ");
        Integer booking_id = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter your name: ");
        String cus_name = sc.nextLine();

        System.out.println("Enter number of seats: ");
        Integer seat_num = sc.nextInt();

        data d1 = details.get(ID);
        if (details.containsKey(booking_id)){
            if(details.containsKey(seat_num)){
                if(this.seats == seat_num || this.seats >= seat_num)
                this.seats-=seat_num;
            }
            else{
                System.out.println("only "+this.seats+"left seats");
            }
        }
        else{
            System.out.println("Invalid ID");
        }

        if (booking_id == 1){
            int f1 = 500*seat_num;
            this.total_fare+=f1;
        }
        else if(booking_id == 2){
            int f2 = 700*seat_num;
            this.total_fare+=f2;
        }
        else if(booking_id == 3){
            int f3 = 700*seat_num;
            this.total_fare+=f3;
        }
        else{
            System.out.println("Invalid ID");
        }

        System.out.println();
        System.out.println(" ======  Your booking details  ======\n"
        +"ID: "+ booking_id
        +" | Name: "+ cus_name
        +" | Route: "+ this.route
        +" | Time: "+ this.time
        +" | Fare: "+ this.total_fare
        +" | Seats: "+ seat_num);
    }

//  3. Cancel Booking

    void cancel_booking(){

    // Enter your name to cancel booking: yusra
    // Booking cancelled successfully!

    data d1 = details.get(customer_name);
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String cus_name = sc.nextLine();

    if (details.containsKey(cus_name)){
        details.remove(customer_name);

    }
    }

//  4. View My Bookings

    void display_info(){

        // Name: yusra, Route: kda - gulshan, Time: 12:00 PM, Seats: 3, Total Fare: 2100

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String cus_name = sc.nextLine();
        System.out.println(" ======  Your booking details  ======\n"
        +" | Name: "+ cus_name
        +" | Route: "+ this.route
        +" | Time: "+ this.time
        +" | Seats: "+ this.seats
        +" | Fare: "+ this.total_fare);
        
}

}

// create a method for route:

// for route we can add a method with if/else
// if id is 1st then this route will be displayed
// and if id is 2nd then this route will be displayed
// and then else for 3rd route
