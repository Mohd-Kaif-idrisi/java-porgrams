import java.util.Arrays;

//public class InsertionBiggner {
////    public static void main(String args[]){
////        int[] arrold = {3,6,3,5,3};
////        arrold = Arrays.copyOf(arrold,arrold.length+1);
////
////        for(int i = arrold.length-1;i > 0;i--){
////            arrold[i] = arrold[i-1];
////        }
////        arrold[0] = 786;
////        System.out.println(Arrays.toString(arrold));
////    }
////}

public class InsertionBiggner {
    public static void main(String args[]){
        int[] arrold = {4,6,3,6,2};
        arrold = Arrays.copyOf(arrold, arrold.length+1);
        arrold[arrold.length-1] = 786;
        System.out.println(Arrays.toString(arrold));
    }
}