import java.util.*;
public class IndexValuePrint {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter your arrays element ");
        for (int i = 0;i < 5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter your number to search index value ");
        int n = sc.nextInt();
        for (int i = 0; i <= arr.length-1;i++ ){
            if (arr[i] == n){
                System.out.println("Your index value is "+i);
            }
            }
        System.out.println("error");
        }
    }



