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
    }

//  3. Cancel Booking

class cancel_booking(){

// Enter your name to cancel booking: yusra
// Booking cancelled successfully!

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String cus_name = sc.nextLine();
        if (data.containsKey(cus_name) == true){
            data.remove(cus_name);
        }
    }

//  4. View My Bookings

class display_info(){

        // Name: yusra, Route: kda - gulshan, Time: 12:00 PM, Seats: 3, Total Fare: 2100

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String cus_name = sc.nextLine();
        if (data.containsKey(cus_name) == true){
            System.out.println("hehe");
        }
}


