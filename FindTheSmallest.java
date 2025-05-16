import java.util.Arrays;

public class FindTheSmallest {
    public static void main(String args[]){
        int[] arr = {1,87,3,54,5,65};

        int small = Integer.MAX_VALUE;

        for (int i = 0;i <= arr.length-1;i++){
        if (arr[i] < small){
            if (arr[i+1] < arr[i+2]){
                System.out.println(small);
            }
        }

        }

    }

}


