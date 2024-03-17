
// Given an array nums of integers, return how many of them contain an even number of digits.

public class App {
    public static void main(String[] args) throws Exception {
        Solution xd = new Solution();
        int arr[] = {12,345,2,6,7896};
        System.out.println(xd.findNumbers(arr));
    }
}

class Solution {
    public int findNumbers(int[] nums) {
        
        int even=0;

        for (int i = 0; i < nums.length; i++) {
            String num = nums[i] + "";
            int digits = num.length();
            if(digits%2==0){
                even++;
            }
        }

        return even;
    }
}