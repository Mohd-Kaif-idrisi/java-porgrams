import java.util.*;
public class ReverseNaturalNoLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number ");
        int s = sc.nextInt();
        System.out.print("Enter ending number ");
        int e = sc.nextInt();
        while (s>=e) {
            System.out.println(s);
            s--;
        }
        }
    }

