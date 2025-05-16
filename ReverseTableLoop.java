import java.util.*;
public class ReverseTableLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter table number ");
        int st = sc.nextInt();
        for(int i = 10;i >= 1;i--){
            System.out.println(st*i);
        }
    }
}
