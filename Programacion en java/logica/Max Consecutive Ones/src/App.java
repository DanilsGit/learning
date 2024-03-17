//Given a binary array nums, return the maximum number of consecutive 1's in the array.

public class App {
    public static void main(String[] args) throws Exception {
        Solution xd = new Solution();
        int arr[] = {1,1,0,1,1,1};
        System.out.println(xd.findMaxConsecutiveOnes(arr));
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int cant1=0;
        int seguidos=0;
        
        for(int i=0; i<nums.length;i++){
            if(nums[i] == 1){
                cant1++;
            }else{
                cant1=0;
            }
            if(cant1>seguidos){
                seguidos=cant1;
            }
        }
        
        return seguidos;
        
    }
}