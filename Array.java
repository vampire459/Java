import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        char arr[] = new char[5];       // declaretion of the array varriable and it's size
                                        // inserting value at index
        char Arr[] = {'a','i','e','o','u'}; // getting input like C                               
        arr[0] = 'A';                   
        arr[1] = 'r';
        arr[2] = 'n';
        arr[3] = 'a';
        arr[4] = 'b';
        System.out.println(arr);        // printing whole array
        System.out.println(arr[2]);     // only printing the index
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));      // printing the whole array as array form
        System.out.println(Arr.length);         // length of the array
        Arrays.sort(Arr,2,5);                       // sorting the array
        System.out.println(Arrays.toString(Arr));
        char varr = 'i';
        char varr_1 = 'o';
        Arrays.sort(Arr);
        int itemIndex = Arrays.binarySearch(Arr,varr);      // to use binary search in an array the array is always supposed to be sorted
        itemIndex = Arrays.binarySearch(Arr,0,4,varr);      // searchihng with start and end index
        System.out.printf("item %s found at pos : %d\n",varr,itemIndex);
        System.out.printf("item %s found at pos : %d\n",varr_1,Arrays.binarySearch(Arr,varr_1));
        Arrays.fill(arr,'A');       // filling an entire array with certain value
        System.out.println(Arrays.toString(arr));
        char newArr[] = Arrays.copyOf(Arr, Arr.length);     // copying the arrays
        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.equals(Arr, newArr));     //comparing arrays
    }
}
