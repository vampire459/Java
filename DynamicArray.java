import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
public class DynamicArray {

    public static void main(String[] args){

        int i,j,n;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a range : ");
        n = input.nextInt();
        for(i = 0; i<n; i++)
        {
            System.out.printf("Enter no. %d : ",i+1);
            j = input.nextInt();
            arr.add(j);
        }
        //Arrays.sort(arr);
        System.out.print(arr);
        System.out.println(arr.toString());
        System.out.print("Enter item to remove : ");
        j = input.nextInt();
        arr.remove(Integer.valueOf(j));     // to remove a particular item 
        System.out.print(arr);
        System.out.print("Enter the position to replace : ");
        i = input.nextInt();      
        System.out.print("Enter item to add : ");
        j = input.nextInt();
        arr.set(i-1,j);               // this method wil replace older value with the new value
        System.out.println(arr);
        arr.sort(Comparator.naturalOrder());    // sorting the dynamic array
        System.out.println(arr);
        arr.sort(Comparator.reverseOrder());    // sorting the dynamic array
        System.out.println(arr);
        System.out.println(arr.size());     // returns the size of the array
        System.out.print("Enter the value to search : ");
        j = input.nextInt();
        System.out.println(arr.contains(Integer.valueOf(j)));
        arr.clear();                // to remomve an entire array
        System.out.println(arr);
        input.close();
    }
}
