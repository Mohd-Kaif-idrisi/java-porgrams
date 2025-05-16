import java.util.*;
public class SwitchCaseWithIfelse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your button ");
        int button = sc.nextInt();
        if(button == 1){
            System.out.println("Good Morning");
        }
        else if(button == 2){
            System.out.println("Good Afternoon");
        }
        else if (button == 3) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Wrong input");
        }
        }
    }

