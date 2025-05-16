import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number ");
        int a = sc.nextInt();
        System.out.print("Enter second number ");
        int b = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int multi = a * b;
        int div = a / b;
        System.out.print("Enter your choice ");
        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println(sum);
            break;
            case 2: System.out.println(sub);
            break;
            case 3: System.out.println(multi);
            break;
            case 4: System.out.println(div);
            break;
        }
        

    }
}
