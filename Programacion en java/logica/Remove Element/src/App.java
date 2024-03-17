import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution xd = new Solution();
        int arr[] = {3,2,2,3};
        System.out.println(xd.removeElement(arr, 3));
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        
        int sobrantes = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                sobrantes++;
            }
        }

        sobrantes = nums.length-sobrantes;
        int auxrr[] = new int[sobrantes];

        int a=0;
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != val){
                auxrr[a] = nums[index];
                a++;
            }
        }

        nums = auxrr;

        System.out.println(Arrays.toString(nums));

        return sobrantes;
    }
}