import java.util.*;
import java.util.Arrays;

public class InsertionAtGivingPoint {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = {1,2,3,4,5};
        Arrays.copyOf(arr,arr.length+1);
        for(int i = arr.length-1;i > n;i--){
            {
                arr[i] = arr.length-1;
            }
        }
        arr[n] = 18;
        System.out.println(Arrays.toString(arr));
    }
}
