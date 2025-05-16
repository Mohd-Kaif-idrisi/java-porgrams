import java.util.*;
public class ArthmeticOp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int multi = a * b;
        int div = a / b;
        int sub = a - b;
        System.out.println("your sum is = "+sum);
        System.out.println("your multiply is = " + multi);
        System.out.println("your divide is = " + div);
        System.out.println("your subtract is = " + sub);
    }
}
