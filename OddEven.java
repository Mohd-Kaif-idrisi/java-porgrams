import java.util.*;
public class OddEven {
    public static void main(String args[]){
        System.out.print("Enter your number ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if(no%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
