import java.util.*;
public class GreaterLessOrEq {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of A ");
        int a = sc.nextInt();
        System.out.print("Enter value of B ");
        int b = sc.nextInt();
        if(a == b){
            System.out.println("Equal");
        }else{
        if(a > b) {
            System.out.println("A is Greater");
        }else{
            System.out.println("A is lesser");
        }
        }
    }
}