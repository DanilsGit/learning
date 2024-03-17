import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution xd = new Solution();
        int arr[] = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2 };
        System.out.println(xd.removeDuplicates(arr));
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        if (nums.length == 0)
            return 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i])
            count++;

            nums[count] = nums[i + 1];
        }

        System.out.println(Arrays.toString(nums));
        return count + 1;
    }
}