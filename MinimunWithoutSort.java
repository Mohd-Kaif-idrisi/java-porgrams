import java.util.*;
public class MinimunWithoutSort {
    public static void main(String args[]){
        int[] number = {3,5,2,7,1};
        int mini = Integer.MAX_VALUE;
        for(int i = 0;i <= number.length-1;i++){
            if( number[i] < mini){
                mini = number[i];
            }
        }
        System.out.println(mini);
    }
}
