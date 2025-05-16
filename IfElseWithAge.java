import java.util.*;
public class IfElseWithAge {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Teen");
                }
    }
}
