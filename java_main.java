// This java file is only for practice
import java.util.*;

// Employee Payroll System       /         // Tech Company Meeting Scheduler

// Features

// Add Employee
// View Employees
// Calculate Salary
// Remove Employee


// Features

// View Meeting Rooms / Managers
// Schedule Meeting
// View My Meetings
// Cancel Meeting





// ==== Employee Payroll System ====

// 1. Add Employee
// 2. View Employees
// 3. Calculate Salary



// ===== Tech Company Meeting Scheduler =====

// 1. View Meeting Rooms
// 2. Schedule Meeting
// 3. View My Meetings
// 4. Cancel Meeting
// 5. Exit





// options ----->

// Choose option: 1
// Enter Employee ID: 501
// Enter Name: Ali
// Enter Monthly Salary: 60000
// Employee added successfully


// Salary Calculation
// Enter Employee ID: 501
// Name: Ali
// Monthly Salary: 60000
// Annual Salary: 720000




// Choose option:
// View Meeting Rooms
// Choose option: 1
// ------ Available Meeting Rooms ------
// ID: 1 | Room: Alpha | Capacity: 10
// ID: 2 | Room: Beta | Capacity: 6
// ID: 3 | Room: Gamma | Capacity: 20


// Schedule Meeting
// Choose option: 2
// Enter Room ID: 1
// Enter Employee Name: Fatima
// Enter Meeting Title: Project Discussion
// Enter Date: 20-03-2026
// Enter Time: 03:00 PM
// Meeting Scheduled Successfully!


// View My Meetings
// Choose option: 3
// Enter Employee Name: Fatima
// ------ Your Meetings ------
// Employee: Fatima
// Meeting: Project Discussion
// Room: Alpha
// Date: 20-03-2026
// Time: 03:00 PM


// Cancel Meeting
// Choose option: 4
// Enter Employee Name: Fatima
// Meeting cancelled successfully!

// === Code Execution Successful ===
class main{
    public static void main(String[]args){
        Tech_Company_Management_System obj = new Tech_Company_Management_System();
        
        // 1. Add Employee
        obj.add_employee();
        // 2. View Employees
        obj.View_Employees();
        // 3. Calculate Salary
        obj.Calculate_Salary();
        // 4. Remove_Employee
        obj.Remove_Employee();

        // 1. View Meeting Rooms
        obj.View_Meeting_Rooms();
        // 2. Schedule Meeting
        obj.Schedule_Meeting();
        // 3. View My Meetings
        obj.View_My_Meetings();
        // 4. Cancel Meeting
        obj.Cancel_Meeting();
        
    }
}

class data extends Tech_Company_Management_System{
    private Integer ID;
    private String name;
    private Integer salary;
    private Integer Capacity;
    private Integer Room_ID;
    private String title;
    private Integer date;
    private Integer time;
    
    data (Integer ID,String name,Integer salary,Integer Capacity,Integer Room_ID,String title,Integer date,Integer time){
        this.ID = ID;
        this.name = name;
        this.salary = salary;
        this.Capacity = Capacity;
        this.Room_ID = Room_ID;
        this.title = title;
        this.date = date;
        this.time = time;
    }
    // Getter ------>

    public Integer getID() {
        return ID;
    }
    public String getname(){
        return name;
    }
    public Integer getsalary() {
        return salary;
    }
    public Integer getCapacity(){
        return Capacity;
    }
    public Integer getRoom_ID() {
        return Room_ID;
    }
    public String gettitle(){
        return title;
    }
    public Integer getdate(){
        return date;
    }
    public Integer gettime(){
        return time;
    }
}

class Tech_Company_Management_System{

    HashMap<String,Tech_Company_Management_System> d1 = new HashMap<>();
    
    Integer ID_i = 1;
    String room_i = "Alpha";
    Integer Capacity_i = 500;
    
    // for room two
    Integer ID_j = 2;
    String room_j = "Beta";
    Integer Capacity_j = 6;

    // for room three
    Integer ID_k = 3;
    String route_k = "Gamma";
    Integer Capacity_k = 20;

//                ==== Employee Payroll System ====

// 1. Add Employee
// 2. View Employees
// 3. Calculate Salary
// 4. Remove_Employee

// 1. Add Employee
    void add_employee(){

// Choose option: 1
// Enter Employee ID: 501
// Enter Name: Ali
// Enter Monthly Salary: 60000
// Employee added successfully
        
        while (true) {
            try {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee ID: ");
        Integer id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter Monthly Salary: ");
        Integer salary = sc.nextInt();
        
        System.out.println("=========== Employee added successfully ===========");

                break;
            }
        catch (InputMismatchException e) {
            System.out.println("invalid input");
            sc.nextLine();
        }
        }
    }
}






        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee ID: ");
        Integer id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter Monthly Salary: ");
        Integer salary = sc.nextInt();
        
        System.out.println("=========== Employee added successfully ===========");
    }

// View Employees
    void View_Employees(){

// Enter Employee ID: 501
// Name: Ali
// Monthly Salary: 60000
// Annual Salary: 720000

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Employee ID: ");
        Integer id = sc.nextInt();
    }

// Calculate Salary
    void Calculate_Salary(){

// Enter Employee ID: 501
// Name: Ali
// Monthly Salary: 60000
// Annual Salary: 720000

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Employee ID: ");
        Integer id = sc.nextInt();

    }

// Remove Employee
    void Remove_Employee(){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Employee ID: ");
        Integer id = sc.nextInt();
        System.out.println("===== Employee Removed =====");

    }




//               ===== Tech Company Meeting Scheduler =====

// 1. View Meeting Rooms
// 2. Schedule Meeting
// 3. View My Meetings
// 4. Cancel Meeting



// 1. View Meeting Rooms
    void View_Meeting_Rooms(){

        System.out.println("------ Available Meeting Rooms ------"+
        "\nID: "+ ID_i +" | Room: "+ room_i +" | Capacity: "+ Capacity_i +
        "\nID: "+ID_j+" | Room: "+ room_j +" | Capacity: "+ Capacity_j +
        "\nID: "+ ID_k +" | Room: "+ route_k +" | Capacity: "+ Capacity_k );

// ID: 1 | Room: Alpha | Capacity: 10
// ID: 2 | Room: Beta | Capacity: 6
// ID: 3 | Room: Gamma | Capacity: 20

    }

// 2. Schedule Meeting
    void Schedule_Meeting(){

// Enter Room ID: 1
// Enter Employee Name: Fatima
// Enter Meeting Title: Project Discussion
// Enter Date: 20-03-2026
// Enter Time: 03:00 PM
// Meeting Scheduled Successfully!

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Room ID: ");
        Integer id = sc.nextInt();
        sc.nextLine();



        if (id == this.ID_i){
            sc.nextLine();
            System.out.println("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Meeting Title: ");
            String title = sc.nextLine();

            System.out.println("Enter Date: ");
            Integer date = sc.nextInt();

            System.out.println("Enter Time: ");
            Integer time = sc.nextInt();

    System.out.println("Meeting Scheduled Successfully!");







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

        // for route two

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

    // for route three

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





//         System.out.println("Enter Employee Name: ");
//         String name = sc.nextLine();

//         System.out.println("Enter Meeting Title: ");
//         String title = sc.nextLine();

//         System.out.println("Enter Date: ");
//         Integer date = sc.nextInt();

//         System.out.println("Enter Time: ");
//         Integer time = sc.nextInt();

// System.out.println("Meeting Scheduled Successfully!");

    }

// 3. View My Meetings
    void View_My_Meetings(){

// Enter Employee Name: Fatima
// ------ Your Meetings ------
// Employee: Fatima
// Meeting: Project Discussion
// Room: Alpha
// Date: 20-03-2026
// Time: 03:00 PM

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.println("------ Your Meetings ------"+
            "Employee: "+
            "Meeting: "+
            "Room: "+
            "Date: "+
            "Time: ");

    }

// 4. Cancel Meeting
    void Cancel_Meeting(){

// Enter Employee Name: Fatima
// Meeting cancelled successfully!

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.println("Meeting cancelled successfully!");
        
    }
}
