import java.util.*;
public class PrintTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your to print table ");
        int no = sc.nextInt();

        /* PRINT N NUMBER OF TABLE USING FOR LOOP */

        /* for(int i = 1; i<=10;i++){
            System.out.println(no*i);
        } */

        /* PRINT N NUMBER OF TABLE USING WHILE LOOP */

        int i = 1;
        while(i <= 10){
            System.out.println(no*i);
            i++;
        }
    }
}
