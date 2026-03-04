// Functions and Exception Handling

// 1. Safe Addition
// Write a Java function `safe_add(x: float, y: float) -> float` that adds two numbers, and returns a custom
// error message if the numbers are not valid floats.

//    Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a + b;
//            System.out.println("Result:" + c);
//        }
//        catch (Exception e){
//            System.out.println("invalid input");
//        }

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

// 3. Check for Division by Zero
// Write a Java function `divide_numbers(x: float, y: float) -> float` that divides `x` by `y`. If `y` is zero, it
// should return `"Cannot divide by zero"`.

while (true) {
            try {
                System.out.println("Enter a number: ");
                float x = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter a number: ");
                float y = sc.nextInt();
                float z = x / y;
                System.out.println("Result:" + z);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Can not divide by zero"+e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("invalid input");
                sc.nextLine();
            }
        }

        //       OR

        while (true) {
            try {
                System.out.println("Enter a number: ");
                Integer x = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter a number: ");
                Integer y = sc.nextInt();
                Integer z = x / y;
                System.out.println("Result:" + z);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Can not divide by zero"+e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("invalid input");
                sc.nextLine();
            }
        }


// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

import java.util.*;
class E{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            int c = a/b;
//            System.out.println("Result:" + c);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Can not divide by zero");
//        }
//        catch(InputMismatchException e){
//            System.out.println("invalid input");
//        }
        
        while (true) {
            try {
                System.out.println("Enter a number: ");
                int a = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter a number: ");
                int b = sc.nextInt();
                int c = a / b;
                System.out.println("Result:" + c);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Can not divide by zero");
            } catch (InputMismatchException e) {
                System.out.println("invalid input");
                sc.nextLine();
            }
        }
    }
}
























import java.util.*;





abstract class payment{
    abstract void process_payment();
}
class credit_card_payment extends payment{
    void process_payment(){
        System.out.println("By Credit Card");
    }
}
class paypal_payment extends payment{
    void process_payment(){
        System.out.println("By Paypal");
    }
}
class main{
    public static void main(String[] args){
    credit_card_payment c1 = new credit_card_payment();
    c1.process_payment();
    paypal_payment p1 = new paypal_payment();
    p1.process_payment();
    }
}










import java.util.*;

abstract class shape{
    abstract void cal_area();
}
class circle extends shape{
    void cal_area(){
        System.out.println("Circle Area");
    }
}
class rectangle extends shape{
    void cal_area(){
        System.out.println("Rectangle Area");
    }
}
class main{
    public static void main(String[] args){
        circle c1 = new circle();
        c1.cal_area();
        rectangle r1 = new rectangle();
        r1.cal_area();
    }
}









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
        contact_book c1= new contact_book();

        while (true) {
            System.out.println();
            System.out.println("1. Add Contact\n2. View Contacts\n3. Search Contact");
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose an option: ");
            Integer op = sc.nextInt();
            sc.nextLine();

            switch(op){
                case 1:
                    c1.Add_Contact();
                    break;
                case 2:
                    c1.View_Contacts();
                    break;
                case 3:
                    c1.Search_Contact();
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
class contact{
    String name;
    String number;
    contact(String name, String num){
        this.name=name;
        this.number=num;
    }
}

class contact_book{
    HashMap<String,contact> details = new HashMap<>();

// 1. Add Contact

    void Add_Contact(){

        // Enter Name: Ali
        // Enter Phone: 03001234567
        // Contact Added Successfully!

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String n = sc.nextLine();

        System.out.println("Enter Phone number: ");
        String sell_no = sc.nextLine();

        if (sell_no.length()!=11){
            System.out.println("Number must contain 11 digits");
            System.out.println("Try Again");
        }
        else{
            details.put(n,new contact(n,sell_no));
            System.out.println("Contact Added Successfully!");
        }
// Adding details in hashmap ----->
//        details.put(n,sell_no);
    }

// 2. View Contacts

    void View_Contacts(){
        // Saved Contacts:
        // Name: Ali, Phone: 03001234567
        // Name: Sara, Phone: 03111234567

        for (String i : this.details.keySet() ){
            contact c = details.get(i);
            System.out.printf("Contact Name: %s \nContact Number: %s",c.name,c.number);
            System.out.println();
            System.out.println("---------------------------------------");



        }
    }
    // 3. Search Contact

    void Search_Contact(){
        // Choose option: 3
        // Enter name to search: Ali
        // Found: Ali - 03001234567
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter name to search: ");
        String name = sc.nextLine();
        if (details.containsKey(name)){
            System.out.println("Found: ");
            contact c = details.get(name);
            System.out.printf("Contact Name: %s \nContact Number: %s",c.name,c.number);
            System.out.println();
            System.out.println("---------------------------------------");
        }
        else{
            System.out.println("Not Found");
        }

    }
}

// incomplete
