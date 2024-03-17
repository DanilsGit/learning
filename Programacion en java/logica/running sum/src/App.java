class Solution {

    public static void main(String[] args) {

        int nums[] = {1,2,3,4};

        int running[] = new int[nums.length];

        for (int i = 0; i < running.length; i++) {
            if(i!=0){
                running[i] = nums[i]+(running[i-1]);
            }else{
                running[i] = nums[i];
            }
        }
        
    }

}