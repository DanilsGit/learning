import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution xd = new Solution();
        // nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int nums2[] = { 2, 5, 6 };
        int n = 3;
        xd.merge(nums1, m, nums2, n);
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int a = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[a];
            a++;
        }

        int aux;
        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = 0; j < nums1.length - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    aux = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(nums1));
    }
}