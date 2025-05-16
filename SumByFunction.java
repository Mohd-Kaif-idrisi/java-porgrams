import java.util.*;
public class SumByFunction {
    public static int SumOfTwoNumber(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number ");
        int a = sc.nextInt();
        System.out.print("Enter your second number ");
        int b = sc.nextInt();
        int sum = SumOfTwoNumber(a, b);
        System.out.println(sum);

    }
}
