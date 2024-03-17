import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        Solution xd = new Solution();
        int arr[] = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(xd.sortedSquares(arr)));
    }
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int cuadrados[] = new int[nums.length];

        for (int i = 0; i < cuadrados.length; i++) {
            cuadrados[i] = nums[i]*nums[i];
        }

        
        int aux=0;
        for (int i = 0; i < cuadrados.length-1; i++) {
            for (int j = 0; j < cuadrados.length-1; j++) {
                if(cuadrados[j]>cuadrados[j+1]){
                   aux = cuadrados[j];
                   cuadrados[j] = cuadrados[j+1];
                   cuadrados[j+1]=aux; 
                }
            }
        }

        return cuadrados;
    }
}