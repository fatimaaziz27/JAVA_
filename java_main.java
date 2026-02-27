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

    void View_Contacts(){

    // Saved Contacts:
    // Name: Ali, Phone: 03001234567
    // Name: Sara, Phone: 03111234567

        
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
            details.remove(name);
            System.out.println("Found: "+);
        }
    }
}