import java.util.*;
public class ReplaceLetterOfString {
    public static void main(String[] args) {
        System.out.print("Enter your String ");
        Scanner sc = new Scanner(System.in);
        String orignal = sc.next();
        String result = "";
        for (int i = 0;i < orignal.length();i++){
            if (orignal.charAt(i) == 'e'){
                result = 'i'+result;
            }else {
                result =result+orignal.charAt(i);
            }
        }
        System.out.println(result);
    }
}
