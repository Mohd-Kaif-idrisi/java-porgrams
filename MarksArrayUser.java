import java.util.*;
public class MarksArrayUser {
    public static void main(String args[]){
        System.out.print("Enter your arrays size ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
    Arrays.sort(numbers);
        for(int i = 0;i < size;i++){
            System.out.println(numbers[i]);
        }
    }
}
