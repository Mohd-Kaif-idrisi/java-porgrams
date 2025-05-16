import java.util.*;
public class SwitchCase {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your button ");
        int button = sc.nextInt();

        switch(button){
            case 1: System.out.println("Good Morning");
            break;
            case 2: System.out.println("Good Afternoon");
            break;
            case 3: System.out.println("Good Evening");
            break;
            case 4: System.out.println("Good Night");
            break;
            default: System.out.println("Wrong input");
        }
    }
}