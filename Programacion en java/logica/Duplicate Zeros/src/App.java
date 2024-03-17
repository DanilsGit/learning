import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution xd = new Solution();
        int arr[] = { 1, 0, 2, 3, 0, 4, 5, 0 };
        xd.duplicateZeros(arr);
    }
}

class Solution {

    public void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {

                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
