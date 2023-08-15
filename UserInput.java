import java.util.Scanner;       // to use scanner importing this is nesseary

public class UserInput {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);     //the scanner class is used to take inputs and input is a object of scanner class
        System.out.print("Enter your name : ");     //println = print + new line , print = only print
        String name = input.nextLine();               // .nextline() is used to take string inputs
        System.out.println(name);
        System.out.printf("How old are you %s ?",name); // printf or String.format ,here f is for the format where we can print like c
        int age = input.nextInt();      // .nextInt() is uses to take integer inputs , .nextDouble() for double inputs and .nextFloat() for float inputs
                                        // NOTE: always write 2 times input.nextLine() after taking any int float or double as input
                                        //          [if you wanna take a string input after taking a number input]
        //int age_2 = Integer.parseInt(input.nextLine()); //Integer.parseInt converts the string input into integer
       // Double Age = Double.parseDouble(input.nextLine()); //Double.parseDouble converts the string input into Double and same is for the float

        System.out.printf("So youre %d years old %s", age  , name);
        input.close();  // scanner allocates memoery dynamically , so we also have to close it
    }
}
