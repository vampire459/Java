import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("Range to print : ");
        int n = input.nextInt();
        for(i = n; i > 1 ; i -- ){     //for loop just like C
            System.out.println(i+"\n");
        }   
       // int numbers[] = {1,2,3,4,5};

       // for(int num : numbers){             // in this case we are printing an array where num is the iteration varrible and      
       //     System.out.print(num+"\t");     // incrementing through the length of the numbers array
       //  }
        i = 1;
        while(i<=n){                // while loop same as C
            System.out.print(i+"\t");
            i++;
        }
        input.close();
    }
}
