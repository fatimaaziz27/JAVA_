import java.util.*;

// 1. Add Contact
// 2. View Contacts
// 3. Search Contact
// 4. Exit

// Choose option: 1
// Enter Name: Ali
// Enter Phone: 03001234567
// Contact Added Successfully!

// 1. Add Contact
// 2. View Contacts
// 3. Search Contact
// 4. Exit
// Choose option: 1

// Enter Name: Sara
// Enter Phone: 03111234567
// Contact Added Successfully!

// 1. Add Contact
// 2. View Contacts
// 3. Search Contact
// 4. Exit
// Choose option: 2

// Saved Contacts:
// Name: Ali, Phone: 03001234567
// Name: Sara, Phone: 03111234567

// 1. Add Contact
// 2. View Contacts
// 3. Search Contact
// 4. Exit
// Choose option: 3
// Enter name to search: Ali
// Found: Ali - 03001234567

// 1. Add Contact
// 2. View Contacts
// 3. Search Contact
// 4. Exit
// Choose option: 4
// Exiting...

class contact_management_system{
    public static void main(String[] args){

        //  Enter your choice:


        // make obj

        while (true) {
            System.out.println();
            System.out.println("1. Add Contact\n2. View Contacts\n3. Search Contact");
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose an option: ");
            Integer op = sc.nextInt();
            sc.nextLine();

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
            System.out.println();
            System.out.println("Do you want to continue (yes/no)?");
            String choice = sc.nextLine().toLowerCase();
            if (choice.equals("no")){
                System.out.print("Exiting...");
                break;
            }
        }
    }
}



class data{

HashMap<String,contact_book> details = new HashMap<>();

}

class contact_book extends data{

// 1. Add Contact
    
    void Add_Contact(){

        // Enter Name: Ali
        // Enter Phone: 03001234567
        // Contact Added Successfully!

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Phone number: ");
        String sell_no = sc.nextLine();
        
        if (sell_no.length()!=11){
            System.out.println("Number must contain 11 digits");
        }

// Adding details in hashmap ----->

        details.put(name,new data(sell_no));

        System.out.println("Contact Added Successfully!");

}

// 2. View Contacts

    void ticket_booking(){

        
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Bus ID: ");
        Integer booking_id = sc.nextInt();

        if (booking_id == this.ID_i){
            sc.nextLine();
            System.out.println("Enter your name: ");
            String cus_name = sc.nextLine();
            String customer_name = cus_name;

            System.out.println("Enter number of seats: ");
            Integer seat_num = sc.nextInt();
            sc.nextLine();

            if (seat_num <= this.seats_i){
                this.seats_i-=seat_num;
            }
            else{
                System.out.println("only "+this.seats_i+" seats left.");
            }
            int f1 = this.fare_i*seat_num;
            this.total_fare += f1;

            System.out.println();
            System.out.println(" ==============  Your booking details  ==============\n"
                    +"ID: "+ this.ID_i
                    +" | Name: "+ customer_name
                    +" | Route: "+ this.route_i
                    +" | Time: "+ this.time_i
                    +" | Fare: "+ this.total_fare
                    +" | Seats: "+ seat_num);

            customer_details.put(customer_name, new data(ID_i,route_i,time_i,total_fare,seat_num));
            this.total_fare=0;
        }

        else if (booking_id == this.ID_j){
            sc.nextLine();
            System.out.println("Enter your name: ");
            String cus_name = sc.nextLine();
            String customer_name = cus_name;

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
                    +" | Name: "+ customer_name
                    +" | Route: "+ this.route_j
                    +" | Time: "+ this.time_j
                    +" | Fare: "+ this.total_fare
                    +" | Seats: "+ seat_num);

            customer_details.put(customer_name, new data(booking_id,route_j,time_j,total_fare,seat_num));
            this.total_fare=0;
        }

        else if (booking_id == this.ID_k){
            sc.nextLine();
            System.out.println("Enter your name: ");
            String cus_name = sc.nextLine();
            String customer_name = cus_name;

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
            System.out.println(" ==============  Your booking details  ==============\n"
                    +"ID: "+ booking_id
                    +" | Name: "+ customer_name
                    +" | Route: "+ this.route_k
                    +" | Time: "+ this.time_k
                    +" | Fare: "+ this.total_fare
                    +" | Seats: "+ seat_num);

            customer_details.put(customer_name, new data(booking_id,route_k,time_k,total_fare,seat_num));
            this.total_fare=0;
        }
        else{
            System.out.println("Invalid ID");
        }
    }

    //  3. Cancel Booking

    void cancel_booking(){

        // Enter your name to cancel booking: yusra
        // Booking cancelled successfully!

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String cus_name = sc.nextLine();
        if (customer_details.containsKey(cus_name)){
            customer_details.remove(cus_name);
            System.out.println("Booking cancelled successfully!");
        }
    }

    //  4. View My Bookings

    void View_My_Bookings(){

        // Name: yusra, Route: kda - gulshan, Time: 12:00 PM, Seats: 3, Total Fare: 2100
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String cus_name = sc.nextLine();
        data d1 = (data) customer_details.get(cus_name);

        if (customer_details.containsKey(cus_name)){
            System.out.println(" ======  Your booking details  ======\n"
                    +" | Name: "+ cus_name
                    +" | Route: "+ d1.route
                    +" | Time: "+ d1.time
                    +" | Seats: "+ d1.seats
                    +" | Fare: "+ d1.total_fare);
        }
        else{
            System.out.println("No booking available or wrong name");
        }
    }
}
