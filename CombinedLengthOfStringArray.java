import java.util.*;
public class CombinedLengthOfStringArray {
    public static void main(String[] args) {
        System.out.print("enter your string length ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] str = new String[size];
        int len = 0;
        for(int i = 0;i < str.length;i++){
           str[i] = sc.nextLine();
                len = str[i].length()+len;
        }
        System.out.println(len);
    }
}
