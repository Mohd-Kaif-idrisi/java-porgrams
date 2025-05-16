import java.util.*;
public class ArrayMax {
    public static void main(String args[]){
        System.out.print("Enter your arrays size ");
        //take array size input
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //build a array
        int numbers[] = new int[size];
        //take input for each element
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        //sort the array
        Arrays.sort(numbers);
        for(int i = 0;i < size;i++){
            System.out.println(numbers[i]);
        }
        //find the minimum element of array
        System.out.println("Your arrays minimum number is "+numbers[0]);
        //find the maximum element of array
        System.out.println("Your arrays max number is "+numbers[size-1]);
    }
}
