// Functions and Exception Handling

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.


// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

import java.util.*;
    public class java_main{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            Integer a = sc.nextInt();
            Integer c = Integer.parseInt("9");
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}



