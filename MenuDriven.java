import java.util.*;
public class MenuDriven {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.print("Enter your marks to get result ");
            int marks = sc.nextInt();
            if(marks >= 90 && marks <= 100){
                System.out.println("This is Good");
            } else if (marks >= 60 && marks <=89) {
                System.out.println("This is also Good");
            } else if (marks >= 0 && marks <= 59) {
                System.out.println("Not bad");
            } else {
                System.out.println("Invalid");
            }
            System.out.println("Do want to continue ? Yes(1) or No(0)");
             choice = sc.nextInt();
        }while(choice==1);

            }
        }

