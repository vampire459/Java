import java.util.Scanner;

public class ConditionalStatement_SwitchCase {
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num_1 : ");
        double num_1 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter num_2 : ");
        double num_2 = input.nextDouble();
        input.nextLine();

        System.out.print("Sum\tSub\tMulti\tDiv\nEnter the operation to perform : ");
        String operation = input.nextLine();

        switch(operation){
            case "Sum" :
                System.out.printf("%s + %s : %s",num_1,num_2,num_1+num_2);
                break;
            case "Sub" : 
                System.out.printf("%s - %s : %s",num_1,num_2,num_1-num_2);
                break;
            case "Multi" : 
                System.out.printf("%s * %s : %s",num_1,num_2,num_1*num_2);
                break;
            case "Div" : 
                System.out.printf("%s / %s : %s",num_1,num_2,num_1/num_2);
                break;
            default : 
                System.out.println("WRONG CHOICE");
        }
        input.close();
    }    
}
