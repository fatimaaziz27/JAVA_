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

        // //  Enter your choice:
        // booking_system b = new booking_system();
        // while (true) {
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Choose an option");
        //     Integer op = sc.nextInt();
        //     switch(op){
        //         case 1:
        //             b.view_buses_Schedules();
        //             break;
        //         case 2:
        //             b.ticket_booking();
        //             break;
        //         case 3:
        //             b.cancel_booking();
        //             break;
        //         case 4:
        //             b.View_My_Bookings();
        //             break;
        //     }
        //     Scanner choice = new Scanner(System.in);
        //     System.out.println("Do you want to continue (yes/no)?");
        //     if (op.equals("No")){
        //         System.out.print("====== Exiting Bus Ticket Booking System ======");
        //         break;
        //     }
        // }
    }
    }


    class data{
    HashMap<String,booking_system> bus_schedules = new HashMap<>();
    HashMap<String,booking_system> routes = new HashMap<>();
    HashMap<String,booking_system> customer_details = new HashMap<>();
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
    Integer seats_i = 50;

    Integer ID_j = 2;
    String route_j = "kda - gulshan";
    String time_j= "12:00 PM";
    Integer fare_j = 700;
    Integer seats_j = 30;

    Integer ID_k = 3;
    String route_k = "ayesha manzil - bahria";
    String time_k = "05:00 PM";
    Integer fare_k = 600;
    Integer seats_k = 60;

    //  constructor ------>

    booking_system(String name, Integer seats_k,Integer seats_j
        ,Integer seats_i, Integer fare,Integer ID_i
        ,String route_i,String time_i,Integer fare_i
        ,Integer ID_j,String route_j,String time_j
        ,Integer fare_j,Integer ID_k,String route_k
        ,String time_k,Integer fare_k ){
        
        this.customer_name = name;
        
        this.ID_i = ID_i;
        this.route_i = route_i;
        this.time_i = time_i;
        this.fare_i = fare_i;
        this.seats_i = seats_i;
        
        this.ID_j = ID_j;
        this.route_j = route_j;
        this.time_j = time_j;
        this.fare_j = fare_j;
        this.seats_j = seats_j;

        this.ID_k = ID_k;
        this.route_k = route_k;
        this.time_k = time_k;
        this.fare_k = fare_k;
        this.seats_k = seats_k;
        
    }

    //  1. View Bus Schedules method

    void view_buses_Schedules(){
        System.out.println("--- Available Bus Schedules ---"
                +"ID: " + ID_i + " | Route: " + route_i + " | Time: "+ time_i +" | Fare: "+ fare_i +" | Seats Left: "+this.seats
                +"ID: "+ ID_j +" | Route: "+ route_j +" | Time: "+ time_j +" | Fare: "+ fare_j +" | Seats Left: "+this.seats
                +"ID: "+ ID_k +" | Route: "+ route_k +" | Time: "+ time_k +" | Fare: "+ fare_k +" | Seats Left: "+this.seats);
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

        if (booking_id == this.ID_i){
            sc.nextLine();
            System.out.println("Enter your name: ");
            String cus_name = sc.nextLine();
            this.customer_name = cus_name;

            System.out.println("Enter number of seats: ");
            Integer seat_num = sc.nextInt();
            
            if (seat_num <= this.seats_i){
                    this.seats_i-=seat_num;
                }
                else{
                    System.out.println("only "+this.seats_i+" seats left.");
                }
                int f1 = this.fare_i*seat_num;
                this.total_fare += f1;

        System.out.println();
        System.out.println(" ======  Your booking details  ======\n"
                +"ID: "+ booking_id
                +" | Name: "+ this.customer_name
                +" | Route: "+ this.route_i
                +" | Time: "+ this.time_i
                +" | Fare: "+ this.total_fare
                +" | Seats: "+ seat_num);

        routes.put(customer_name, new data(booking_id,route_i,time_i,total_fare,seat_num));
            }
        
            else if (booking_id == this.ID_j){
                sc.nextLine();
                System.out.println("Enter your name: ");
                String cus_name = sc.nextLine();
                this.customer_name = cus_name;

                System.out.println("Enter number of seats: ");
                Integer seat_num = sc.nextInt();
                
                if (seat_num <= this.seats_j){
                        this.seats_j-=seat_num;
                    }
                    else{
                        System.out.println("only "+this.seats_j+" seats left.");
                    }
                    int f2 = this.fare_j*seat_num;
                    this.total_fare += f2;

            System.out.println();
            System.out.println(" ======  Your booking details  ======\n"
                +"ID: "+ booking_id
                +" | Name: "+ cus_name
                +" | Route: "+ this.route_j
                +" | Time: "+ this.time_j
                +" | Fare: "+ this.total_fare
                +" | Seats: "+ seat_num);

            routes.put(cus_name, new data(booking_id,route_j,time_j,total_fare,seat_num));
            }

            else if (booking_id == this.ID_k){
                sc.nextLine();
                System.out.println("Enter your name: ");
                String cus_name = sc.nextLine();
                this.customer_name = cus_name;

                System.out.println("Enter number of seats: ");
                Integer seat_num = sc.nextInt();
                
                if (seat_num <= this.seats_k){
                        this.seats_k-=seat_num;
                    }
                    else{
                        System.out.println("only "+this.seats_k+" seats left.");
                    }
                    int f3 = this.fare_k*seat_num;
                    this.total_fare += f3;

            System.out.println();
            System.out.println(" ======  Your booking details  ======\n"
                +"ID: "+ booking_id
                +" | Name: "+ cus_name
                +" | Route: "+ this.route_k
                +" | Time: "+ this.time_k
                +" | Fare: "+ this.total_fare
                +" | Seats: "+ seat_num);

            routes.put(cus_name, new data(booking_id,route_k,time_k,total_fare,seat_num));
            }
            else{
            System.out.println("Invalid ID");
        }
    }

    //  3. Cancel Booking

    void cancel_booking(){

        // Enter your name to cancel booking: yusra
        // Booking cancelled successfully!

        data d = routes.get(customer_name);
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




