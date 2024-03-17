public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = {4,3,1,7,11,8};
        Solution xd = new Solution();
        System.out.println(xd.checkIfExist(arr));
    }
}

class Solution {
    public boolean checkIfExist(int[] arr) {
        
        if(arr.length == 0 || arr == null) return false;

        boolean duplicado = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i!=j){
                    if(arr[j]*2 == arr[i]){
                        duplicado=true;
                        break;
                    }
                }
            }
            if(duplicado){
                break;
            }
        }

        return duplicado;

    }
}
