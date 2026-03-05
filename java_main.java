// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





// Functions and Exception Handling
import java.util.*;

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String num(float num) throws invalid_exception{
//        if (num > 0){
//            throw new invalid_exception("Result: "+ num );
//        }
//        else {
//            return "number is negative";
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            float a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            float b = sc.nextInt();
//            float c = a - b;
//
//            System.out.println(num(c));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

//class invalid_exception extends Exception{
//    invalid_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static int check(int num) throws invalid_exception{
//        if (num < 0){
//            throw new invalid_exception("number is negative" );
//        }
//        else {
//            return num;
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Enter a number: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a number: ");
//            int b = sc.nextInt();
//            a=check(a);
//            b=check(b);
//            System.out.println("Result:"+(a+b));
//        }
//        catch (invalid_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

class e{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String a = sc.nextLine();
            Integer c = Integer.parseInt(a);
            System.out.println("Result:" + c);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }
}


//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}





