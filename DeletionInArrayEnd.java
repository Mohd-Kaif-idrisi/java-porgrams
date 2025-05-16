import java.util.Arrays;

public class DeletionInArrayEnd {
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5};


        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }


        arr = Arrays.copyOf(arr, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
