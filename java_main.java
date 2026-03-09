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

// You can also add:

// Prevent double booking
// Room already booked at this time.
// Please choose another time slot.
// Show meeting schedule
// Room Alpha Schedule

// 10:00 AM - Team Standup
// 12:00 PM - Available
// 03:00 PM - Project Discussion

// === Code Execution Successful ===


class booking_system{

//                ==== Employee Payroll System ====

// 1. Add Employee
// 2. View Employees
// 3. Calculate Salary


// 1. Add Employee
    void add_employee(){

// Choose option: 1
// Enter Employee ID: 501
// Enter Name: Ali
// Enter Monthly Salary: 60000
// Employee added successfully

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee ID: ");
        Integer id = sc.nextInt();
        
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
// 5. Exit


// 1. View Meeting Rooms
    void View_Meeting_Rooms(){

        System.out.println("------ Available Meeting Rooms ------"+
        "\nID: 1 | Room: Alpha | Capacity: 10"+
        "\nID: 2 | Room: Beta | Capacity: 6"+
        "\nID: 3 | Room: Gamma | Capacity: 20");

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

        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Meeting Title: ");
        String title = sc.nextLine();

        System.out.println("Enter Date: ");
        Integer date = sc.nextInt();

        System.out.println("Enter Time: ");
        Integer time = sc.nextInt();

System.out.println("Meeting Scheduled Successfully!");

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

}
}
