import java.util.Locale;

public class question3 {
    public static void main(String[] args) {
        String str = "abcei";
        int count=0;
        for (int i =0;i<=str.length()-1;i++){
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }

        str = str.toUpperCase();
        System.out.println(count+str);
    }
}
