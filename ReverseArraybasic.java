import java.util.Arrays;

public class ReverseArraybasic {
    public static void main(String args[]){
        int[] arr = {5,7,4,34,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i = arr.length-1;i >= 0;i--){
            System.out.print(" "+arr[i]);
        }
    }
}
