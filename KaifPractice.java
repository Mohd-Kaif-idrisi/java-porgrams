
                            //arthmetic Opretor//
import java.util.*;
/*public class KaifPractice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number ");
        int a = sc.nextInt();
        System.out.print("Enter your second number ");
        int b = sc.nextInt();
        int sum = a+b;
        int sub = a-b;
        int multi = a*b;
        int div = a/b;
        int rem = a+b;
        System.out.println("A+B = "+sum);
        System.out.println("A-B = "+sub);
        System.out.println("A*B = "+multi);
        System.out.println("A/B = "+div);
        System.out.println("A%B = "+rem);
    }
}*/

                            //Sum of even number//

/*public class KaifPractice {
    public static void main(String args[]) {
        int n = 10;
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}*/

                            //Factorial Of Number//

/*public class KaifPractice{
    public static void main(String args[]){
        int n = 5;
        int fact = 1;
        for (int i = 1;i <= n;i++){
            fact = i*fact;
        }
        System.out.println(fact);
    }
}*/

                                //Find Greater,lesser and equal number//

/*public class KaifPractice {
    public static void main(String args[]){
        int a = 5;
        int b = 3;
        if (a == b){
            System.out.println("A is Equal to B");
        } else if (a > b) {
            System.out.println("A is Greater");
        }else{
            System.out.println("C is greater");
        }
    }
}*/


//                                    MAXIMUM NUMBER IN ARRAY

//public class KaifPractice {
//    public static void main(String args[]){
//        int arr[] = {5,6,3,1,8};
//        int max = Integer.MIN_VALUE;
//        for(int i = 0;i < arr.length;i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}
//                            MINIMUM NUMBER IN ARRAY

//public class KaifPractice{
//    public static void main(String args[]){
//        int[] arr = {5,7,3,7,2,9,8,1};
//        int min = Integer.MAX_VALUE;
//        for(int i = 0; i < arr.length;i++){
//            if(arr[i] < min){
//                min = arr[i];
//            }
//        }
//        System.out.println(min);
//    }
//}
//                            SORT OF ARRAYS

//public class KaifPractice{
//    public static void main(String args[]){
//        int[] arr = {5,7,3,64,2,8};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}

//                            REVERSE THE ARRAYS

//public class KaifPractice{
//    public static void main(String args[]){
//        int arr[] = {1,2,3,4,5,6,7};
//        int start = 0;
//        int end = arr.length-1;
//        while (start <= end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}

//                            INSERTION IN END IN ARRAYS

//public class KaifPractice{
//    public static void main(String args[]){
//        int[] arr = {1,2,3,4,5,6};
//        Arrays.copyOf(arr,arr.length+1);
//
//        arr[arr.length-1] = 786;
//        System.out.println(Arrays.toString(arr));
//    }
//}
//
//                            INSERTION IN STARTING IN ARRAYS

public class KaifPractice{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8};
        Arrays.copyOf(arr,arr.length+1);

        for(int i = arr.length-1;i > 0;i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = 786;
        System.out.println(Arrays.toString(arr));
    }
}