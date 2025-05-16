public class maximumWithoutSort {
    public static void main(String args[]){
        int[] number = {4,3,7,5,2};
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < number.length;i++){
            if(max < number[i]){
                max = number[i];
            }
        }
        System.out.println(max);
    }
}
