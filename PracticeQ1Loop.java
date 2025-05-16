/* Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. */

import java.util.*;
public class PracticeQ1Loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 ");
        int one = sc.nextInt();
        System.out.print("Enter number 2 ");
        int Two = sc.nextInt();
        int result = 1;
        for(int i = 1;i<=Two;i++){
            result = result*one;
        }
        System.out.println(result);
        }
    }