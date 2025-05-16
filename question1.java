public class question1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};
        int n = arr.length;
        int i = 0;
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }
         while (i + 1 < n && arr[i] == arr[i + 1]) {
            i++;
        }
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        if (i == n - 1) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not Perfect");
        }
    }
}
