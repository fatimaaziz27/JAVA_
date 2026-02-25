import java.util.*;

import javax.print.DocFlavor.STRING;
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

        //  Enter your choice:
        booking_system b = new booking_system();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose an option");
            Integer op = sc.nextInt();
            switch(op){
                case 1:
                    b.view_buses_Schedules();
                    break;
                case 2:
                    b.ticket_booking();
                    break;
                case 3:
                    b.cancel_booking();
                    break;
                case 4:
                    b.View_My_Bookings();
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
    HashMap<String,booking_system> bus_schedules = new HashMap<>();
    HashMap<Integer,booking_system> routes = new HashMap<>();
    HashMap<String,booking_system> customer_details = new HashMap<>();

    routes.put(ID_i, new booking_system(route_i,time_i,fare_i));
    routes.put(ID_j, new booking_system(route_j,time_j,fare_j));
    routes.put(ID_k, new booking_system(route_k,time_k,fare_k));

    }

    class booking_system extends data{

    //  Attributes ------>

    String customer_name;
    String route;
    String time;
    Integer seats;
    Integer total_fare;

    Integer ID_i = 1;
    String route_i = "north nazimabad - power house";
    String time_i = "09:00 AM";
    Integer fare_i = 500;
    
    Integer ID_j = 1;
    String route_j = "north nazimabad - power house";
    String time_j= "09:00 AM";
    Integer fare_j = 500;
    
    Integer ID_k = 1;
    String route_k = "north nazimabad - power house";
    String time_k = "09:00 AM";
    Integer fare_k = 500;

    //  constructor ------>

    booking_system(String name, String route, String time, Integer seats, Integer fare,Integer ID_i,String route_i,String time_i,Integer fare_i,Integer ID_j,String route_j,String time_j,Integer fare_j,Integer ID_k,String route_k,String time_k,Integer fare_k) {
        
        this.customer_name = name;
        this.route = route;
        this.seats = seats;
        this.time = time;
        this.total_fare = fare;
        
        this.ID_i = ID_i;
        this.route_i = route_i;
        this.time_i = time_i;
        this.fare_i = fare_i;
        
        this.ID_j = ID_j;
        this.route_j = route_j;
        this.time_j = time_j;
        this.fare_j = fare_j;

        this.ID_k = ID_k;
        this.route_k = route_k;
        this.time_k = time_k;
        this.fare_k = fare_k;
        
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

    void View_My_Bookings(){

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




